import java.applet.Applet;
import java.awt.*;

/** Layout managers are intended to help you, but there
 *  is no law saying you <B>have</B> to use them.
 *  Set the layout to null to turn them off.
 *
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on servlets, JSP, Struts, JSF, Ajax, GWT, and Java</a>.
 */

public class NullTest extends Applet {
  @Override
  public void init() {
    setLayout(null);
    Button b1 = new Button("Button 1");
    Button b2 = new Button("Button 2");
    Button b3 = new Button("Button 3");
    Button b4 = new Button("Button 4");
    Button b5 = new Button("Button 5");
    b1.setBounds(0, 0, 150, 50);
    b2.setBounds(150, 0, 75, 50);
    b3.setBounds(225, 0, 75, 50);
    b4.setBounds(25, 60, 100, 40);
    b5.setBounds(175, 60, 100, 40);
    add(b1);
    add(b2);
    add(b3);
    add(b4);
    add(b5);
  }
}