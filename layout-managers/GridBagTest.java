import java.awt.*;
import javax.swing.*;

/** An example demonstrating a GridBagLayout GUI with
 *  input text area and multiple buttons.
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on JSF 2, PrimeFaces, Ajax, jQuery, GWT, Android,
 *  Spring, Hibernate, JPA, RESTful Web Services, Hadoop, 
 *  servlets, JSP, and Java 7 and Java 8 programming</a>.
 */

public class GridBagTest extends JPanel {
  private JTextArea textArea;
  private JButton bSaveAs, bOk, bExit;
  private JTextField fileField;
  private GridBagConstraints c;

  public GridBagTest() {
    setLayout(new GridBagLayout());
    setBorder(BorderFactory.createEtchedBorder());

    textArea = new JTextArea(12,40);  // 12 rows, 40 cols
    bSaveAs = new JButton("Save As");
    fileField = new JTextField("C:\\Document.txt");
    bOk = new JButton("OK");
    bExit = new JButton("Exit");

    c = new GridBagConstraints();

    // Text Area.
    c.gridx      = 0;
    c.gridy      = 0;
    c.gridwidth  = GridBagConstraints.REMAINDER;
    c.gridheight = 1;
    c.weightx    = 1.0;
    c.weighty    = 1.0;
    c.fill       = GridBagConstraints.BOTH;
    c.insets     = new Insets(2,2,2,2); //t,l,b,r
    add(textArea,c);

    // Save As Button.
    c.gridx      = 0;
    c.gridy      = 1;
    c.gridwidth  = 1;
    c.gridheight = 1;
    c.weightx    = 0.0;
    c.weighty    = 0.0;
    c.fill       = GridBagConstraints.VERTICAL;
    add(bSaveAs,c);

    // Filename Input (Textfield).
    c.gridx      = 1;
    c.gridwidth  = GridBagConstraints.REMAINDER;
    c.gridheight = 1;
    c.weightx    = 1.0;
    c.weighty    = 0.0;
    c.fill       = GridBagConstraints.BOTH;
    add(fileField,c);

    // OK Button.
    c.gridx      = 2;
    c.gridy++;
    c.gridwidth  = 1;
    c.gridheight = 1;
    c.weightx    = 0.0;
    c.weighty    = 0.0;
    c.fill       = GridBagConstraints.NONE;
    add(bOk,c);

    // Exit Button.
    c.gridx      = 3;
    c.gridwidth  = 1;
    c.gridheight = 1;
    c.weightx    = 0.0;
    c.weighty    = 0.0;
    c.fill       = GridBagConstraints.NONE;
    add(bExit,c);

    // Filler so Column 1 has nonzero width.
    Component filler = Box.createRigidArea(new Dimension(1,1));
    c.gridx      = 1;
    c.weightx    = 1.0;
    add(filler,c);
  }

  public static void main(String[] args) {
    //WindowUtilities.setNativeLookAndFeel();
    JFrame frame = new JFrame("GrigBagLayout Test");
    frame.setContentPane(new GridBagTest());
    frame.addWindowListener(new ExitListener());
    frame.pack();
    frame.setVisible(true);
  }
}