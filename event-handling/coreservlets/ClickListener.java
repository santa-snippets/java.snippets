package coreservlets;
import java.awt.event.*;

/** The listener used by ClickPanel.
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on JSF 2, PrimeFaces, Ajax, JavaScript, jQuery, GWT, Android,
 *  Spring, Hibernate, JPA, RESTful Web Services, Hadoop, Spring MVC,
 *  servlets, JSP, Java 8 lambdas and streams (for those that know Java already), 
 *  and Java 8 programming (for those new to Java)</a>.
 */
public class ClickListener extends MouseAdapter {
  @Override
  public void mousePressed(MouseEvent event) {
    int x = event.getX();
    int y = event.getY();
    System.out.printf("Mouse pressed at (%s, %s).%n", x, y);
  }
}
