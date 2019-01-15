import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

/** Example of using rigid areas, struts, and glue to
 *  produce the effect of invisible components.
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on JSF 2, PrimeFaces, Ajax, jQuery, GWT, Android,
 *  Spring, Hibernate, JPA, RESTful Web Services, Hadoop, 
 *  servlets, JSP, and Java 7 and Java 8 programming</a>.
 */

public class InvisibleComponentTest extends JPanel {
  Component spacer;

  public InvisibleComponentTest() {
    setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

    // Place a rigid invisible component 25 pixels wide and
    // 75 pixels tall between the two buttons
    JPanel p1= new JPanel();
    spacer = Box.createRigidArea(new Dimension(20,75));
    setUpPanel(p1, "Rigid Area - 20x75 pixels", spacer);

    // Separate two buttons by a 60-pixel horizontal strut
    JPanel p2= new JPanel();
    spacer = Box.createHorizontalStrut(60);
    setUpPanel(p2, "Horizontal Strut - 60 pixels", spacer);

    // Horizontal glue in FlowLayout - not useful
    JPanel p3= new JPanel();
    spacer = Box.createHorizontalGlue();
    setUpPanel(p3, "Horizontal Glue - FlowLayout", spacer);

    // Add glue to fill all remaining horizontal space between
    // the two buttons. Glue not supported by default FlowLayout
    // of JPanel.  Change layout of JPanel to BoxLayout.
    JPanel p4= new JPanel();
    p4.setLayout(new BoxLayout(p4,BoxLayout.X_AXIS));
    spacer = Box.createHorizontalGlue();
    setUpPanel(p4, "Horizontal Glue - BoxLayout", spacer);

    add(p1);
    add(p2);
    add(p3);
    add(p4);
  }

  // Helper to set the border and add components
  private void setUpPanel(JPanel p, String title,
                          Component spacer) {
    p.setBorder(BorderFactory.createTitledBorder(
                       BorderFactory.createEtchedBorder(),title,
                       TitledBorder.TOP,TitledBorder.CENTER));
    p.setBackground(Color.white);
    p.add(new JButton("Left"));
    p.add(spacer);
    p.add(new JButton("Right"));
  }

  public static void main(String[] args) {
    String title = "Using Invisible Components";
    //WindowUtilities.setNativeLookAndFeel();
    WindowUtilities.openInJFrame(new InvisibleComponentTest(),
                                 350, 325, title);
  }
}