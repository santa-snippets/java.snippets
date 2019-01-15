import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import java.util.*;
import javax.swing.*;

/** A graphical client that lets you interactively connect to
 *  Web servers and send custom URLs, request headers, and
 *  query data. The user can optionally select a GET or POST
 *  request and HTTP version 1.0 or 1.1.
 *  <P>
 *  For an HTTPS connection, you can specify a nondefault
 *  keystore through system properties on the command line,
 *  i.e.,
 *  <P>
 *  java -Djavax.net.ssl.trustStore=server.ks
 *       -Djavax.net.ssl.trustStoreType=JKS
 *  <P>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on servlets, JSP, Struts, JSF 1.x, JSF 2.0, 
 *  Ajax, GWT, Spring, Hibernate/JPA, and Java programming</a>. Originally
 *  written for "Core Servlets and JavaServer Pages", which was pre-Java-5,
 *  and not yet updated.
 */

public class WebClient extends JPanel implements Runnable {
  public static void main(String[] args) {
    if (args.length > 0) {
      usage();
    } else {
      try {
        UIManager.setLookAndFeel(
          UIManager.getSystemLookAndFeelClassName());
      } catch(Exception e) {
        System.out.println("Error setting native LAF: " + e);
      }
      Container content = new WebClient();
      content.setBackground(SystemColor.control);
      JFrame frame = new JFrame("Web Client");
      frame.setContentPane(content);
      frame.setBackground(SystemColor.control);
      frame.setSize(600, 700);
      frame.setLocationRelativeTo(null);
      frame.setDefaultCloseOperation(
              WindowConstants.EXIT_ON_CLOSE);
      frame.setVisible(true);
    }
  }
  private static JFrame frame;
  private LabeledTextField urlField;
  private JComboBox methodCombo, versionCombo;
  private LabeledTextField proxyHostField, proxyPortField;
  private JTextArea requestHeadersArea, queryDataArea;
  private JTextArea resultArea;
  private JButton encodeButton, submitButton, interruptButton;
  private Font labelFont, headingFont, textFont;
  private HttpClient client;

  public WebClient() {
    int fontSize = 14;
    labelFont = new Font("Serif", Font.BOLD, fontSize);
    headingFont = new Font("SansSerif", Font.BOLD, fontSize+4);
    textFont = new Font("Monospaced", Font.BOLD, fontSize-2);
    setLayout(new BorderLayout(5, 30));
    // Set up URL, Request Method, and Proxy.
    JPanel topPanel = new JPanel(new GridLayout(3,1));
    topPanel.add(getURLPanel());
    topPanel.add(getRequestMethodPanel());
    topPanel.add(getProxyPanel());
    // Set up Request Header and Query Data.
    JPanel inputPanel = new JPanel(new GridLayout(3,1));
    inputPanel.add(topPanel);
    inputPanel.add(getRequestHeaderPanel());
    inputPanel.add(getQueryDataPanel());
    add(inputPanel, BorderLayout.NORTH);
    add(getResultPanel(), BorderLayout.CENTER);
  }

  private JPanel getURLPanel() {
    JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
    urlField =
      new LabeledTextField("URL:", labelFont, 75, textFont);
    panel.add(urlField);
    return(panel);
  }

  private JPanel getRequestMethodPanel() {
    JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
    JLabel methodLabel = new JLabel(" Request Method:");
    methodLabel.setFont(labelFont);
    panel.add(methodLabel);
    methodCombo = new JComboBox();
    methodCombo.addItem("GET");
    methodCombo.addItem("POST");
    panel.add(methodCombo);
    JLabel versionlabel = new JLabel(" HTTP Version:");
    versionlabel.setFont(labelFont);
    panel.add(versionlabel);
    versionCombo = new JComboBox();
    versionCombo.addItem("HTTP/1.0");
    versionCombo.addItem("HTTP/1.1");
    panel.add(versionCombo);
    return(panel);
  }

  private JPanel getProxyPanel() {
    JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
    proxyHostField =
      new LabeledTextField("Proxy Host:", labelFont,
                           35, textFont);
    proxyPortField =
      new LabeledTextField("Proxy Port:", labelFont,
                           5, textFont);
    panel.add(proxyHostField);
    panel.add(proxyPortField);
    // Check to see if command-line system properties are set
    // for proxy.
    String proxyHost = System.getProperty("http.proxyHost");
    String sslProxyHost = System.getProperty("https.proxyHost");
    String proxyPort = System.getProperty("http.proxyPort");
    String sslProxyPort = System.getProperty("https.proxyPort");
    if (proxyHost != null) {
      proxyHostField.setText(proxyHost);
      if (proxyPort != null) {
        proxyPortField.setText(proxyPort);
      }
    } else if (sslProxyHost != null) {
      proxyHostField.setText(sslProxyHost);
      if (sslProxyPort != null) {
        proxyPortField.setText(sslProxyPort);
      }
    }
    return(panel);
  }

  private JPanel getRequestHeaderPanel() {
    JPanel panel = new JPanel();
    panel.setLayout(new BorderLayout());
    JLabel requestLabel = new JLabel("Request Headers:");
    requestLabel.setFont(labelFont);
    panel.add(requestLabel, BorderLayout.NORTH);
    requestHeadersArea = new JTextArea(5, 80);
    requestHeadersArea.setFont(textFont);
    JScrollPane headerScrollArea =
      new JScrollPane(requestHeadersArea);
    panel.add(headerScrollArea, BorderLayout.CENTER);
    return(panel);
  }

  private JPanel getQueryDataPanel() {
    JPanel panel = new JPanel();
    panel.setLayout(new BorderLayout());
    JLabel formLabel = new JLabel("Query Data:");
    formLabel.setFont(labelFont);
    panel.add(formLabel, BorderLayout.NORTH);
    queryDataArea = new JTextArea(3, 80);
    queryDataArea.setFont(textFont);
    JScrollPane formScrollArea =
      new JScrollPane(queryDataArea);
    panel.add(formScrollArea, BorderLayout.CENTER);
    panel.add(getButtonPanel(), BorderLayout.SOUTH);
    return(panel);
  }

  private JPanel getButtonPanel() {
    JPanel panel = new JPanel();
    encodeButton = new JButton("Encode Data");
    encodeButton.addActionListener(new EncodeListener());
    encodeButton.setFont(labelFont);
    panel.add(encodeButton);
    submitButton = new JButton("Submit Request");
    submitButton.addActionListener(new SubmitListener());
    submitButton.setFont(labelFont);
    panel.add(submitButton);
    return(panel);
  }

  private JPanel getResultPanel() {
    JPanel resultPanel = new JPanel();
    resultPanel.setLayout(new BorderLayout());
    JLabel resultLabel =
      new JLabel("Results", JLabel.CENTER);
    resultLabel.setFont(headingFont);
    resultPanel.add(resultLabel, BorderLayout.NORTH);
    resultArea = new JTextArea();
    resultArea.setFont(textFont);
    JScrollPane resultScrollArea =
      new JScrollPane(resultArea);
    resultPanel.add(resultScrollArea, BorderLayout.CENTER);
    JPanel interruptPanel = new JPanel();
    interruptButton = new JButton("Interrupt Download");
    interruptButton.setFont(labelFont);
    interruptButton.addActionListener(new InterruptListener());
    interruptPanel.add(interruptButton);
    resultPanel.add(interruptPanel, BorderLayout.SOUTH);
    return(resultPanel);
  }

  /** Create all inputs and then process the request either
   *  directly (HttpClient) or through a proxy server
   *  (HttpProxyClient).
   */

  public void run() {
    if (hasLegalValues()) {
      URL url = getRequestURL();
      String requestMethod = getRequestMethod();
      String httpVersion = getHttpVersion();
      ArrayList requestHeaders = getRequestHeaders();
      String queryData = getQueryData();
      resultArea.setText("");
      if (usingProxy()) {
        URL proxyURL = getProxyURL();
        client = new HttpProxyClient(url, proxyURL,
                                     requestMethod, httpVersion,
                                     requestHeaders, queryData,
                                     resultArea);
      } else {
        client = new HttpClient(url,
                                requestMethod, httpVersion,
                                requestHeaders, queryData,
                                resultArea);
      }
      client.connect();
    }
  }

  public boolean usingProxy() {
    String proxyHost = getProxyHost();
    return(proxyHost != null && proxyHost.length() > 0);
  }

  private boolean hasLegalValues() {
    if (getRequestURL() == null) {
      report("Malformed URL");
      return(false);
    }
    if (usingProxy() && getProxyURL() == null) {
      report("Proxy invalid");
      return(false);
    }
    return(true);
  }

  // Turn proxy host and port into a URL.

  private URL getProxyURL() {
    URL requestURL = getRequestURL();
    if (requestURL == null) {
      return(null);
    }
    String proxyURLStr = requestURL.getProtocol() +
                         "://" + getProxyHost();
    String proxyPort = getProxyPort();
    if (proxyPort != null && proxyPort.length() > 0) {
      proxyURLStr += ":" + proxyPort + "/";
    }
    return(getURL(proxyURLStr));
  }

  public URL getRequestURL() {
    return(getURL(urlField.getTextField().getText().trim()));
  }

  public URL getURL(String str) {
    try {
      URL url = new URL(str);
      return(url);
    } catch(MalformedURLException mue) {
      return(null);
    }
  }

  private String getRequestMethod() {
    return((String)methodCombo.getSelectedItem());
  }

  private String getHttpVersion() {
    return((String)versionCombo.getSelectedItem());
  }

  private String getProxyHost() {
    return(proxyHostField.getTextField().getText().trim());
  }

  private String getProxyPort() {
   return(proxyPortField.getTextField().getText().trim());
  }

  private ArrayList getRequestHeaders() {
    ArrayList requestHeaders = new ArrayList();
    int headerNum = 0;
    String header =
      requestHeadersArea.getText().trim();
    StringTokenizer tok =
      new StringTokenizer(header, "\r\n");
    while (tok.hasMoreTokens()) {
      requestHeaders.add(tok.nextToken());
    }
    return(requestHeaders);
  }

  private String getQueryData() {
    return(queryDataArea.getText());
  }

  private void report(String s) {
    resultArea.setText(s);
  }

  private static void usage() {
    System.out.println(
      "Usage: java [-Djavax.net.ssl.trustStore=value] \n" +
      "            [-Djavax.net.ssl.trustStoreType=value] \n" +
      "            [-Dhttp.proxyHost=value] \n" +
      "            [-Dhttp.proxyPort=value] \n" +
      "            [-Dhttps.proxyHost=value] \n" +
      "            [-Dhttps.proxyPort=value] WebClient");
  }

  /** Listener for Submit button. Performs HTTP request on
   *  separate thread.
   */

  class SubmitListener implements ActionListener {
    public void actionPerformed(ActionEvent event) {
      Thread downloader = new Thread(WebClient.this);
      downloader.start();
    }
  }

  /** Listener for Encode Data button. Open dialog to
   *  determine how to encode the data (name/value pairs
   *  or raw text).
   */

  class EncodeListener implements ActionListener {
    public void actionPerformed(ActionEvent event) {
      String queryData = getQueryData();
      if (queryData.length() == 0) {
        return;
      }
      JDialog dialog = new JDialog(frame, "Encode", true);
      dialog.setDefaultCloseOperation(
        WindowConstants.DISPOSE_ON_CLOSE);
      dialog.setLocationRelativeTo(frame);
      EncodeQueryPanel panel = new EncodeQueryPanel(dialog);
      dialog.getContentPane().add(panel);
      dialog.pack();
      dialog.setVisible(true);
      switch(panel.getValue()) {
        case JOptionPane.OK_OPTION:
               try {
                 queryData = panel.encode(queryData);
                 queryDataArea.setText(queryData);
               } catch(UnsupportedEncodingException uee) {
                 report("Encoding problem: " + uee.getMessage());
               }
             break;
        case JOptionPane.CANCEL_OPTION: ;
        default: ;
      }
    }
  }

  /** Listener for Interrupt button. Stops download of
   *  Web page.
   */

  class InterruptListener implements ActionListener {
    public void actionPerformed(ActionEvent event) {
      client.setInterrupted(true);
    }
  }
}