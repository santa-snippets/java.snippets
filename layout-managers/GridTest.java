import java.applet.Applet;
import java.awt.*;

/** An example of GridLayout.
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on JSF 2, PrimeFaces, Ajax, jQuery, GWT, Android,
 *  Spring, Hibernate, JPA, RESTful Web Services, Hadoop, 
 *  servlets, JSP, and Java 7 and Java 8 programming</a>.
 */

public class GridTest extends Applet {
  @Override
  public void init() {
    setLayout(new GridLayout(2,3)); // 2 rows, 3 cols
    add(new Button("Button One"));
    add(new Button("Button Two"));
    add(new Button("Button Three"));
    add(new Button("Button Four"));
    add(new Button("Button Five"));
    add(new Button("Button Six"));
  }
}