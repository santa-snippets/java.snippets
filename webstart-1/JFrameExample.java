import java.awt.*;
import javax.swing.*;

/** Tiny example showing the main difference in using 
 *  JFrame instead of Frame: using the content pane
 *  and getting the Java (Metal) look and feel by default
 *  instead of the native look and feel.
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on servlets, JSP, Struts, JSF, Ajax, GWT, and Java</a>.
 */

public class JFrameExample {
  public static void main(String[] args) {
    WindowUtilities.setNativeLookAndFeel();
    JFrame f = new JFrame("This is a test");
    f.setSize(400, 150);
    Container content = f.getContentPane();
    content.setBackground(Color.white);
    content.setLayout(new FlowLayout()); 
    content.add(new JButton("Button 1"));
    content.add(new JButton("Button 2"));
    content.add(new JButton("Button 3"));
    f.addWindowListener(new ExitListener());
    f.setVisible(true);
  }
}