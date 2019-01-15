package coreservlets;

/** First of three ways to read input: using a command-line argument.
 *  Note that these examples fail to handle the case when the input is
 *  not a legal number. A preview of the correct approach, with no explanation,
 *  is given in Input1Alt, and try/catch blocks are covered in detail
 *  in the section on applets and basic drawing.
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on JSF 2, PrimeFaces, Ajax, JavaScript, jQuery, GWT, Android,
 *  Spring, Hibernate, JPA, RESTful Web Services, Hadoop, Spring MVC,
 *  servlets, JSP, Java 8 lambdas and streams (for those that know Java already), 
 *  and Java 8 programming (for those new to Java)</a>.
 */

public class Input1Alt {
  public static void main(String[] args) {
    if (args.length > 1) {
      try {
        int num = Integer.parseInt(args[0]);
        System.out.println("Your number is " + num);
      } catch(NumberFormatException e) {
        System.out.println("Input is not a number");
      }
    } else {
      System.out.println("No command-line arguments");
    }
  }
}
