package coreservlets;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/** Change the background color when the user clicks. This is the first of four
 *  similar exercise solutions that look at alternative ways of attaching listeners.
 *  Uses a named inner class as the mouse listener.
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on JSF 2, PrimeFaces, Ajax, JavaScript, jQuery, GWT, Android,
 *  Spring, Hibernate, JPA, RESTful Web Services, Hadoop, Spring MVC,
 *  servlets, JSP, Java 8 lambdas and streams (for those that know Java already), 
 *  and Java 8 programming (for those new to Java)</a>.
 */

public class ColorPanel3 extends JPanel {
  public ColorPanel3() {
    setBackground(Color.RED);
    addMouseListener(new ColorChanger());
  }
  
  private class ColorChanger extends MouseAdapter {
    @Override
    public void mousePressed(MouseEvent e) {
      if (getBackground() == Color.RED) {
        setBackground(Color.BLUE);
      } else {
        setBackground(Color.RED);
      }
    }
  }
}
