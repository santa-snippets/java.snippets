package shapes1;

/** ShapeUtils.sumArea(someShapeArray) returns the sum of the areas of the shapes.
 *  It might also be reasonable to put this static method in the Shape class, but if so,
 *  it should be called via Shape.sumAreas(...), not someShapeInstance.sumAreas(...).
 *  Interfaces in Java 8 are the perfect solution, since they allow static methods, but
 *  enforce that the static methods are called via the class name, not using an
 *  instance.
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on JSF 2, PrimeFaces, Ajax, JavaScript, jQuery, GWT, Android,
 *  Spring, Hibernate, JPA, RESTful Web Services, Hadoop, Spring MVC,
 *  servlets, JSP, Java 8 lambdas and streams (for those that know Java already), 
 *  and Java 8 programming (for those new to Java)</a>.
 */

public class ShapeUtils {
  public static double sumAreas(Shape[] shapes) {
    double sum = 0;
    for(Shape s: shapes) {
      sum = sum + s.getArea();
    }
    return(sum);
  }
  
  private ShapeUtils() {} // Uninstantiable class: static methods only
}
