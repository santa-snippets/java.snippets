package coreservlets.lists;

import java.util.*;

/** The second of three examples of the use of Lists, this one using
 *  the syntax of Java 5 and 6, which is almost the same as
 *  in Java 7 and later except that you must say ArrayList<String> instead of
 *  ArrayList<>.
 *  <p>
 *  The funny @SuppressWarnings annotation below is to tell Eclipse not to
 *  warn me that I do not need to say ArrayList<String> instead of ArrayList<>,
 *  since I am making this example specifically to illustrate that point.
 *  Sadly, however, Eclipse does not have a token specific to that warning, so I am 
 *  somewhat dangerously suppressing all warnings. Still, this is better than getting in the habit
 *  of leaving warnings in code, and thus getting in the habit of ignoring them.
 *  For details on suppressing warnings, see
 *  http://help.eclipse.org/mars/index.jsp?topic=%2Forg.eclipse.jdt.doc.user%2Ftasks%2Ftask-suppress_warnings.htm
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on JSF 2, PrimeFaces, Ajax, JavaScript, jQuery, GWT, Android,
 *  Spring, Hibernate, JPA, RESTful Web Services, Hadoop, Spring MVC,
 *  servlets, JSP, Java 8 lambdas and streams (for those that know Java already), 
 *  and Java 8 programming (for those new to Java)</a>.
 */

@SuppressWarnings("all")
public class RandomListOld {
  public static void main(String[] args) {
    List<String> entries = new ArrayList<String>();
    double d;
    while((d = Math.random()) > 0.1) {
      entries.add("Value: " + d);
    }
    for(String entry: entries) {
      System.out.println(entry);
    }
  }
}