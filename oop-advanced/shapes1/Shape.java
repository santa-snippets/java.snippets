package shapes1;

/** Represents the parent of all shapes that have a getArea method.
 *  This (using a normal class) is the first attempt at a design that will support 
 *  making a static method to sum the areas of a mixed set of shapes.
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on JSF 2, PrimeFaces, Ajax, JavaScript, jQuery, GWT, Android,
 *  Spring, Hibernate, JPA, RESTful Web Services, Hadoop, Spring MVC,
 *  servlets, JSP, Java 8 lambdas and streams (for those that know Java already), 
 *  and Java 8 programming (for those new to Java)</a>.
 */

public class Shape {
  public double getArea() {
    return(-1); // No real shape can have negative area 
  }
}