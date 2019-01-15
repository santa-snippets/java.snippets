import java.awt.*;
import javax.swing.*;

/** An example demonstrating the use of nested containers
 *  to lay out the components. See GridBagTest.java for
 *  implementation by a single layout manager, GridBagLayout.
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on JSF 2, PrimeFaces, Ajax, jQuery, GWT, Android,
 *  Spring, Hibernate, JPA, RESTful Web Services, Hadoop, 
 *  servlets, JSP, and Java 7 and Java 8 programming</a>.
 */

public class NestedLayout extends JPanel {

  private JTextArea textArea;
  private JButton bSaveAs, bOk, bExit;
  private JTextField fileField;

  public NestedLayout() {

    setLayout(new BorderLayout(2,2));
    setBorder(BorderFactory.createEtchedBorder());

    textArea = new JTextArea(12,40);  // 12 rows, 40 cols
    bSaveAs = new JButton("Save As");
    fileField = new JTextField("C:\\Document.txt");
    bOk = new JButton("OK");
    bExit = new JButton("Exit");

    add(textArea,BorderLayout.CENTER);

    // Set up buttons and textfield in bottom panel.
    JPanel bottomPanel = new JPanel();
    bottomPanel.setLayout(new GridLayout(2,1));

    JPanel subPanel1 = new JPanel();
    JPanel subPanel2 = new JPanel();
    subPanel1.setLayout(new BorderLayout());
    subPanel2.setLayout(new FlowLayout(FlowLayout.RIGHT,2,2));

    subPanel1.add(bSaveAs,BorderLayout.WEST);
    subPanel1.add(fileField,BorderLayout.CENTER);
    subPanel2.add(bOk);
    subPanel2.add(bExit);

    bottomPanel.add(subPanel1);
    bottomPanel.add(subPanel2);

    add(bottomPanel,BorderLayout.SOUTH);
  }

  public static void main(String[] args) {
    //WindowUtilities.setNativeLookAndFeel();
    JFrame frame = new JFrame("Nested Containers");
    frame.setContentPane(new NestedLayout());
    frame.addWindowListener(new ExitListener());
    frame.pack();
    frame.setVisible(true);
  }
}