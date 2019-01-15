import java.applet.Applet;
import java.awt.*;

/** An example of a layout performed manually. The top-level
 *  panels are positioned by hand, after you determine the size
 *  of the applet. Since applets can't be resized in most
 *  browsers, setting the size once when the applet is created
 *  is sufficient.
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on JSF 2, PrimeFaces, Ajax, jQuery, GWT, Android,
 *  Spring, Hibernate, JPA, RESTful Web Services, Hadoop, 
 *  servlets, JSP, and Java 7 and Java 8 programming</a>.
 */

public class ButtonCol extends Applet {
  @Override
  public void init() {
    setLayout(null);
    int width1 = getSize().width*4/10,
        width2 = getSize().width - width1,
        height = getSize().height;
    Panel buttonPanel = new Panel();
    buttonPanel.setBounds(0, 0, width1, height);
    buttonPanel.setLayout(new GridLayout(6, 1));
    buttonPanel.add(new Label("Buttons", Label.CENTER));
    buttonPanel.add(new Button("Button One"));
    buttonPanel.add(new Button("Button Two"));
    buttonPanel.add(new Button("Button Three"));
    buttonPanel.add(new Button("Button Four"));
    buttonPanel.add(new Button("Button Five"));
    add(buttonPanel);
    Panel everythingElse = new Panel();
    everythingElse.setBounds(width1+1, 0, width2, height);
    everythingElse.add(new Label("Everything Else"));
    add(everythingElse);
  }
}