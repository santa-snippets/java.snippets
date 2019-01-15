package coreservlets;

/** A simplistic Circle class, to demonstrate making arrays. More details
 *  on this Circle class in the OOP sections.
*   <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on JSF 2, PrimeFaces, Ajax, JavaScript, jQuery, GWT, Android,
 *  Spring, Hibernate, JPA, RESTful Web Services, Hadoop, Spring MVC,
 *  servlets, JSP, Java 8 lambdas and streams (for those that know Java already), 
 *  and Java 8 programming (for those new to Java)</a>.
 */

public class Circle {
  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  public double getRadius() {
    return(radius);
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public double getArea() {
    return(Math.PI * radius * radius);
  }
}