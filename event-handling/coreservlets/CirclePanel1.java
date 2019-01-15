package coreservlets;

/** Draws circles centered where the user clicks. This is the first of four
 *  similar examples that look at alternative ways of attaching listeners.
 *  This version uses a separate class as the mouse listener.
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on JSF 2, PrimeFaces, Ajax, JavaScript, jQuery, GWT, Android,
 *  Spring, Hibernate, JPA, RESTful Web Services, Hadoop, Spring MVC,
 *  servlets, JSP, Java 8 lambdas and streams (for those that know Java already), 
 *  and Java 8 programming (for those new to Java)</a>.
 */

public class CirclePanel1 extends CirclePanel {
  public CirclePanel1() {
    radius = 10;
    addMouseListener(new CircleListener(this));
  }
}
