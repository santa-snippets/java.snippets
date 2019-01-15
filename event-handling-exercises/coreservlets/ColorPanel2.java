package coreservlets;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/** Change the background color when the user clicks. This is the first of four
 *  similar exercise solutions that look at alternative ways of attaching listeners.
 *  Uses itself (which implements the MouseListener interface) as the mouse listener.
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on JSF 2, PrimeFaces, Ajax, JavaScript, jQuery, GWT, Android,
 *  Spring, Hibernate, JPA, RESTful Web Services, Hadoop, Spring MVC,
 *  servlets, JSP, Java 8 lambdas and streams (for those that know Java already), 
 *  and Java 8 programming (for those new to Java)</a>.
 */

public class ColorPanel2 extends JPanel implements MouseListener {
  public ColorPanel2() {
    setBackground(Color.RED);
    addMouseListener(this);
  }
  
  @Override
  public void mousePressed(MouseEvent e) {
    if (getBackground() == Color.RED) {
      setBackground(Color.BLUE);
    } else {
      setBackground(Color.RED);
    }
  }
  
  @Override
  public void mouseClicked(MouseEvent e) {}

  @Override
  public void mouseReleased(MouseEvent e) {}

  @Override
  public void mouseEntered(MouseEvent e) {}

  @Override
  public void mouseExited(MouseEvent e) {}
}
