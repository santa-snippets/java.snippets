package coreservlets;
/** Represents the parent of all shapes that have a getArea method.
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on JSF 2, PrimeFaces, Ajax, jQuery, GWT, Android,
 *  Spring, Hibernate, JPA, RESTful Web Services, Hadoop, 
 *  servlets, JSP, and Java 7 and Java 8 programming</a>.
 */

// If you didn't want a concrete implementation of printInfo here,
// you could use an interface instead of an abstract class:
// public interface Ship { public double getArea(); }
// Then, for Circle and Rectangle, do something like this:
// public class Circle implements Shape {...}
// We will cover more on interfaces later in the course,
// starting with the lecture on event handling.

public abstract class Shape {
  public abstract double getArea();
  
  public void printInfo() {
    System.out.println(getClass().getSimpleName() + 
                       " has area " + getArea());
  }
}