import java.applet.Applet;
import java.awt.*;

/** FlowLayout puts components in rows.
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on JSF 2, PrimeFaces, Ajax, jQuery, GWT, Android,
 *  Spring, Hibernate, JPA, RESTful Web Services, Hadoop, 
 *  servlets, JSP, and Java 7 and Java 8 programming</a>.
 */

public class FlowTest extends Applet {
  @Override
  public void init() {
    for(int i=1; i<6; i++) {
      add(new Button("Button " + i));
    }
  }
}