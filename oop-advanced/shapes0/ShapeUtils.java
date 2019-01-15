package shapes0;

/** ShapeUtils.sumArea(someShapeArray) attempts to return the sum of the areas of the shapes,
 *  but it fails because Java does type checking at <b>compile</b> time, and
 *  the Object class does not have a getArea method. See the commented out line.
 *  <p>
 *  The funny @SuppressWarnings entry below is something we have not yet
 *  covered. It just tells Eclipse not to warn that the variable s in the loop
 *  below is never used, since I already know that the code is wrong. It is a bad habit
 *  to leave code in your projects that has warnings, because then you get in the habit
 *  of ignoring the warnings, and the vast majority of the warnings are useful.
 *  If you are deliberately doing something that will result in a warning from Eclipse, 
 *  suppress the warnings using 
 *  http://help.eclipse.org/mars/index.jsp?topic=%2Forg.eclipse.jdt.doc.user%2Ftasks%2Ftask-suppress_warnings.htm
 *  and, preferably document why you are doing things a knowingly bad way.
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on JSF 2, PrimeFaces, Ajax, JavaScript, jQuery, GWT, Android,
 *  Spring, Hibernate, JPA, RESTful Web Services, Hadoop, Spring MVC,
 *  servlets, JSP, Java 8 lambdas and streams (for those that know Java already), 
 *  and Java 8 programming (for those new to Java)</a>.
 */

@SuppressWarnings("unused")
public class ShapeUtils {
  public static double sumAreas(Object[] shapes) {
    double sum = 0;
    for(Object s: shapes) {
     // sum = sum + s.getArea(); // Illegal! Object does not have getArea
    }
    return(sum);
  }
  
  private ShapeUtils() {} // Uninstantiable class: static methods only
}
