package coreservlets.lists;

import java.util.*;

/** The first of three examples of the use of Lists. Demonstrates
 *  the use of generics, the post-Java-5 looping construct, and
 *  the use of the Java 7 diamond operator (where you omit the type
 *  on the right-hand side and Java performs type inferencing).
 *  <p>
 *  This (RandomList) is the version that is consistent with modern usage:
 *  RandomListOld uses moderately old syntax from Java 5 and 6.
 *  RandomListVeryOld uses very syntax from before Java 5. 
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on JSF 2, PrimeFaces, Ajax, JavaScript, jQuery, GWT, Android,
 *  Spring, Hibernate, JPA, RESTful Web Services, Hadoop, Spring MVC,
 *  servlets, JSP, Java 8 lambdas and streams (for those that know Java already), 
 *  and Java 8 programming (for those new to Java)</a>.
 */

public class RandomList {
  public static void main(String[] args) {
    List<String> entries = new ArrayList<>();
    double d;
    while((d = Math.random()) > 0.1) {
      entries.add("Value: " + d);
    }
    for(String entry: entries) {
      System.out.println(entry);
    }
  }
}