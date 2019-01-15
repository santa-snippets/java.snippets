package coreservlets;

import java.util.*;

/** Some static methods to smooth the operation of government. Used 
 *  as sample methods for some simple JUnit tests.
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on JSF 2, PrimeFaces, Ajax, JavaScript, jQuery, GWT, Android,
 *  Spring, Hibernate, JPA, RESTful Web Services, Hadoop, Spring MVC,
 *  servlets, JSP, Java 8 lambdas and streams (for those that know Java already), 
 *  and Java 8 programming (for those new to Java)</a>.
 */

public class Utils {
  /** Takes a String and returns a new String with all the exclamation points
   *  removed. For example, Utils.calmString("!foo!!") should return "foo".
   */
  public static String calmString(String speech) {
    if (speech != null) {
      speech = speech.replaceAll("!", "");
    }
    return(speech);
  }
  
  /** Takes a List of political parties and potentially modifies it so
   *  that it never contains both "Republican" and "Democrat". If it contains
   *  both, it flips a coin to decide which to remove. If it contains neither,
   *  or is null, it does nothing.
   */
  public static void calmAttendees(List<String> attendingParties) {
    if (attendingParties != null) {
      if (attendingParties.contains("Republican") && attendingParties.contains("Democrat")) {
        if (Math.random() < 0.5) {
          attendingParties.remove("Republican");
        } else {
          attendingParties.remove("Democrat");
        }
      }
    }
  }
  
  private Utils() {} // Class cannot be instantiated: only static methods
}
