package coreservlets;

/** The right way to check if two different Strings have the same characters.
 *  You should use the equals method (as here), not the == operator (as in CheckName1).
*   <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on JSF 2, PrimeFaces, Ajax, JavaScript, jQuery, GWT, Android,
 *  Spring, Hibernate, JPA, RESTful Web Services, Hadoop, Spring MVC,
 *  servlets, JSP, Java 8 lambdas and streams (for those that know Java already), 
 *  and Java 8 programming (for those new to Java)</a>.
 */

public class CheckName2 {
  public static void main(String[] args) {
    if (args.length == 0) {
      System.out.println("Nobody");
    } else if (args[0].equals("Marty")) {
      System.out.println("Hi, Marty");
    } else {
      System.out.println("Hi, stranger");
    }
  }
}
