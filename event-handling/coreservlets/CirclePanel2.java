package coreservlets;

import java.awt.event.*;

/** Draw circles centered where the user clicks.
 *  Uses itself (which implements the MouseListener interface) as the mouse listener.
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on JSF 2, PrimeFaces, Ajax, JavaScript, jQuery, GWT, Android,
 *  Spring, Hibernate, JPA, RESTful Web Services, Hadoop, Spring MVC,
 *  servlets, JSP, Java 8 lambdas and streams (for those that know Java already), 
 *  and Java 8 programming (for those new to Java)</a>.
 */

public class CirclePanel2 extends CirclePanel 
                          implements MouseListener {
  public CirclePanel2() {
    radius = 20;
    addMouseListener(this);
  }

  @Override
  public void mousePressed(MouseEvent event) {
    int x = event.getX();
    int y = event.getY();
    circles.add(new Circle(x, y, radius));
    repaint();
  }
  
  @Override
  public void mouseClicked(MouseEvent event) {}

  @Override
  public void mouseReleased(MouseEvent event) {}

  @Override
  public void mouseEntered(MouseEvent event) {}

  @Override
  public void mouseExited(MouseEvent event) {}
}
