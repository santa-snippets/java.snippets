package coreservlets;

/** CORRECT version of code to print first two command-line 
 *  arguments: it checks that args.length is > 1. 
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on JSF 2, PrimeFaces, Ajax, JavaScript, jQuery, GWT, Android,
 *  Spring, Hibernate, JPA, RESTful Web Services, Hadoop, Spring MVC,
 *  servlets, JSP, Java 8 lambdas and streams (for those that know Java already), 
 *  and Java 8 programming (for those new to Java)</a>.
 */

public class ShowTwoArgsFixed {
  public static void main(String[] args) {
    if (args.length >= 2) {
      System.out.println("First arg: " + args[0]);
      System.out.println("Second arg: " + args[1]);
    } else {
      System.out.println("Sorry, less than two args");
    }
  }
}
