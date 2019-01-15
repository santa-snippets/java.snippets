package coreservlets;

import java.util.*;

/** The first of three examples of the use of Lists. This
 *  example uses the now-obsolete syntax from Java 1.4 and earlier,
 *  withOUT generics. This version is given for comparison only;
 *  modern programs should NOT use unparameterized Lists.
 *  <p>
 *  ListTest2 uses Java 7/8 syntax, and ListTest3 uses Java 5/6 syntax.
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on JSF 2, PrimeFaces, Ajax, JavaScript, jQuery, GWT, Android,
 *  Spring, Hibernate, JPA, RESTful Web Services, Hadoop, Spring MVC,
 *  servlets, JSP, Java 8 lambdas and streams (for those that know Java already), 
 *  and Java 8 programming (for those new to Java)</a>.
 */

public class ListTest1 {
  public static void main(String[] args) {
    List entries = new ArrayList();
    double d;
    while((d = Math.random()) > 0.1) {
      entries.add("Value: " + d);
    }
    String entry;
    for(int i=0; i<entries.size(); i++) {
      entry = (String)entries.get(i);
      System.out.println(entry);
    }
  }
}