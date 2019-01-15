package coreservlets;

import java.awt.event.*;

/** The listener used by CirclePanel1. Note call
 *  to getSource to obtain reference to the JPanel.
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on JSF 2, PrimeFaces, Ajax, JavaScript, jQuery, GWT, Android,
 *  Spring, Hibernate, JPA, RESTful Web Services, Hadoop, Spring MVC,
 *  servlets, JSP, Java 8 lambdas and streams (for those that know Java already), 
 *  and Java 8 programming (for those new to Java)</a>.
 */

public class CircleListener extends MouseAdapter {
  private CirclePanel window;

  public CircleListener(CirclePanel window) {
    this.window = window;
  }

  @Override
  public void mousePressed(MouseEvent event) {
    int x = event.getX();
    int y = event.getY();
    int radius = window.getRadius();
    window.getCircles().add(new Circle(x, y, radius));
    window.repaint();
  }
}
