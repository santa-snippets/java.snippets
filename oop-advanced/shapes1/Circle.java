package shapes1;
/** Represents a simplistic Circle. Used to illustrate encapsulation (private instance vars),
 *  JavaDoc (these comments), and inheritance (extending Shape so that we can make an array
 *  of mixed shapes and sum their areas).
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on JSF 2, PrimeFaces, Ajax, jQuery, GWT, Android,
 *  Spring, Hibernate, JPA, RESTful Web Services, Hadoop, 
 *  servlets, JSP, and Java 7 and Java 8 programming</a>.
 */

public class Circle extends Shape {
  private double radius;

  /** Builds a Circle with the given radius. */
  
  public Circle(double radius) {
    this.radius = radius;
  }

  /** Returns the current radius. */
  
  public double getRadius() {
    return(radius);
  }

  /** Sets the current radius. */
  
  public void setRadius(double radius) {
    this.radius = radius;
  }

  /** Calculates the area from the radius. */
  @Override
  public double getArea() {
    return(Math.PI * radius * radius);
  }

  /** Indirectly sets the area by working backward to the radius.
   *  The resultant area may not be EXACTLY what you set, due to roundoff
   *  error when working with doubles.
    */
  public void setArea(double area) {
    radius = Math.sqrt(area / Math.PI);
  }
}