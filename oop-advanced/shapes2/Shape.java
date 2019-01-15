package shapes2;

/** Represents the parent of all shapes that have a getArea method.
 *  This (using an abstract class) is the second attempt at a design that will support 
 *  making a static method to sum the areas of a mixed set of shapes. This approach is 
 *  better than the first approach (using a regular class) in two ways: because the subclasses
 *  cannot forget to define getArea, and because you cannot directly instantiate Shape.
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on JSF 2, PrimeFaces, Ajax, JavaScript, jQuery, GWT, Android,
 *  Spring, Hibernate, JPA, RESTful Web Services, Hadoop, Spring MVC,
 *  servlets, JSP, Java 8 lambdas and streams (for those that know Java already), 
 *  and Java 8 programming (for those new to Java)</a>.
 */

public abstract class Shape {
  public abstract double getArea(); // All real shapes must define a getArea method
}