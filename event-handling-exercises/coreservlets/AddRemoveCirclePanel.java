package coreservlets;

import java.awt.event.*;

import javax.swing.*;

/** Add or removes circles.
 *  If the user clicks the left mouse, draws a circle centered around the click.
 *  If the user clicks the right mouse (or does control-click, a common alternative
 *  on Macs) AND the click was on top of an existing circle, that circle is removed.
 *  If the click was on top of two overlapping circles, only the first (based on 
 *  the order they were originally added) is removed.
 *  
 *  Uses a named inner class as the mouse listener.
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on JSF 2, PrimeFaces, Ajax, JavaScript, jQuery, GWT, Android,
 *  Spring, Hibernate, JPA, RESTful Web Services, Hadoop, Spring MVC,
 *  servlets, JSP, Java 8 lambdas and streams (for those that know Java already), 
 *  and Java 8 programming (for those new to Java)</a>.
 */

public class AddRemoveCirclePanel extends CirclePanel {
  public AddRemoveCirclePanel() {
    radius = 30;
    addMouseListener(new CircleListener());
  }
  
  private void addCircle(int x, int y) {
    circles.add(new Circle(x, y, radius));
  }
  
  private void removeCircle(int x, int y) {
    for(Circle c: circles) {
      if(c.containsPoint(x, y)) {
        circles.remove(c);
        break;
      }
    }
  }

  private class CircleListener extends MouseAdapter {
    @Override
    public void mousePressed(MouseEvent event) {
      int x = event.getX();
      int y = event.getY();
      if (SwingUtilities.isRightMouseButton(event) || event.isControlDown()) { 
        removeCircle(x, y);
      } else {
        addCircle(x, y);
      }
      repaint();
    }
  }
}
