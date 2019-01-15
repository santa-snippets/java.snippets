package coreservlets;
import java.awt.event.*;

/** The listener used by ColorPanel1. Calls back to public method in main panel.
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on JSF 2, PrimeFaces, Ajax, JavaScript, jQuery, GWT, Android,
 *  Spring, Hibernate, JPA, RESTful Web Services, Hadoop, Spring MVC,
 *  servlets, JSP, Java 8 lambdas and streams (for those that know Java already), 
 *  and Java 8 programming (for those new to Java)</a>.
 */

public class ColorListener extends MouseAdapter {
  private ColorPanel1 window;
  
  public ColorListener(ColorPanel1 window) {
    this.window = window;
  }

  @Override
  public void mousePressed(MouseEvent event) {
    window.swapColors();
  }
}
