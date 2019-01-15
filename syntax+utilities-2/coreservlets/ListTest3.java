package coreservlets;

import java.util.*;

/** The third of three examples of the use of Lists. Demonstrates
 *  the use of generics in Java 5 and 6, which is almost the same as
 *  in Java 7 and later except that you must say ArrayList<String> instead of
 *  ArrayList<>.
 *  <p>
 *  ListTest1 uses Java 1.4 syntax, and ListTest2 uses Java 7/8 syntax.
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on JSF 2, PrimeFaces, Ajax, JavaScript, jQuery, GWT, Android,
 *  Spring, Hibernate, JPA, RESTful Web Services, Hadoop, Spring MVC,
 *  servlets, JSP, Java 8 lambdas and streams (for those that know Java already), 
 *  and Java 8 programming (for those new to Java)</a>.
 */

public class ListTest3 {
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