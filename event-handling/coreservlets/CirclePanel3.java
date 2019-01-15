package coreservlets;

import java.awt.event.*;

/** Draw circles centered where the user clicks.
 *  Uses a named inner class as the mouse listener.
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on JSF 2, PrimeFaces, Ajax, JavaScript, jQuery, GWT, Android,
 *  Spring, Hibernate, JPA, RESTful Web Services, Hadoop, Spring MVC,
 *  servlets, JSP, Java 8 lambdas and streams (for those that know Java already), 
 *  and Java 8 programming (for those new to Java)</a>.
 */

public class CirclePanel3 extends CirclePanel {
  public CirclePanel3() {
    radius = 30;
    addMouseListener(new CircleListener());
  }

  private class CircleListener extends MouseAdapter {
    @Override
    public void mousePressed(MouseEvent event) {
      int x = event.getX();
      int y = event.getY();
      circles.add(new Circle(x, y, radius));
      repaint();
    }
  }
}
