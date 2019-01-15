package coreservlets;

import java.util.*;

/** A few more examples of various methods that List supports.
 *  Note that you can change "ArrayList" to "LinkedList" at the
 *  top without changing any of the other code and without changing
 *  the output.
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on JSF 2, PrimeFaces, Ajax, JavaScript, jQuery, GWT, Android,
 *  Spring, Hibernate, JPA, RESTful Web Services, Hadoop, Spring MVC,
 *  servlets, JSP, Java 8 lambdas and streams (for those that know Java already), 
 *  and Java 8 programming (for those new to Java)</a>.
 */

public class MoreWithLists {
  public static void main(String[] args) {
    List<String> names = new ArrayList<>();
    // or List<String> names = new LinkedList<>();
    names.add("Marty");
    names.add("Cay");
    names.add("David");
    int numEntries = names.size();
    System.out.println("Num entries: " + numEntries);
    String secondEntry = names.get(1);
    System.out.println("2nd entry: " + secondEntry);
    boolean containsJoe = names.contains("Joe");
    System.out.println("Contains Joe? " + containsJoe);
    names.remove("Marty");
    numEntries = names.size();
    System.out.println("Num entries: " + numEntries);
  }
}
