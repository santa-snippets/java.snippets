package coreservlets;

/** Various correct (1) and incorrect (2, 3) attempts to make an array of Circles.
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on JSF 2, PrimeFaces, Ajax, JavaScript, jQuery, GWT, Android,
 *  Spring, Hibernate, JPA, RESTful Web Services, Hadoop, Spring MVC,
 *  servlets, JSP, Java 8 lambdas and streams (for those that know Java already), 
 *  and Java 8 programming (for those new to Java)</a>.
 */

public class CircleArray {
  public static void main(String[] args) {
    // Do something with arrays
  }
  
  /** Builds an array of Circles and returns the array. After allocating space for the Circles, 
   *  it loops down, builds a Circle, and puts it into the appropriate place in the array.
   *  This is the correct approach. 
   */
  public static Circle[] makeCircles1(int numCircles) {
    Circle[] circles = new Circle[numCircles];      // Allocate space
    for(int i=0; i<circles.length; i++) {
      circles[i] = new Circle(Math.random() * 10);  // Put circles in the array
    }
    return(circles);
  }
  
  /** Attempts to build an array of Circles. Crashes with NullPointerException since after
   *  first line there are no Circle objects, just null pointers. So, trying to call setRadius
   *  on null crashes. 
   */
  public static Circle[] makeCircles2(int numCircles) {
    Circle[] circles = new Circle[numCircles];
    for(int i=0; i<circles.length; i++) {
      circles[i].setRadius(Math.random() * 10); // Crashes with NullPointerException
    }
    return(circles);
  }
  
  /** Attempts to build an array of Circles. Fails because it never puts any Circles
   *  into the array. To put something into an array, you must have the index.
   *  
   *  The funny @SuppressWarnings entry below is something we have not yet
   *  covered. It just tells Eclipse not to warn that the variable c in the loop
   *  below is never used, since I already know that the code is wrong. It is a bad habit
   *  to leave code in your projects that has warnings, because then you get in the habit
   *  of ignoring the warnings, and the vast majority of the warnings are useful.
   *  If you are deliberately doing something that will result in a warning from Eclipse, 
   *  suppress the warnings using 
   *  http://help.eclipse.org/mars/index.jsp?topic=%2Forg.eclipse.jdt.doc.user%2Ftasks%2Ftask-suppress_warnings.htm
   *  and, preferably document why you are doing things a knowingly bad way.
   */
  @SuppressWarnings("unused")
  public static Circle[] makeCircles3(int numCircles) {
    Circle[] circles = new Circle[numCircles];
    for(Circle c: circles) {
      c = new Circle(Math.random() * 10);; // Fails to store c in array
    }
    return(circles); // Array still contains only null pointers
  }
}
