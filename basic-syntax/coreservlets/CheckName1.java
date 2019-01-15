package coreservlets;

/** The WRONG way to check if two different Strings have the same characters.
 *  You should use the equals method (as in CheckName2), not the == operator (as here).
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on JSF 2, PrimeFaces, Ajax, JavaScript, jQuery, GWT, Android,
 *  Spring, Hibernate, JPA, RESTful Web Services, Hadoop, Spring MVC,
 *  servlets, JSP, Java 8 lambdas and streams (for those that know Java already), 
 *  and Java 8 programming (for those new to Java)</a>.
 */

public class CheckName1 {
  public static void main(String[] args) {
    if (args.length == 0) {
      System.out.println("Nobody");
    } else if (args[0] == "Marty") {
      System.out.println("Hi, Marty");
    } else {
      System.out.println("Hi, stranger");
    }
  }
}
