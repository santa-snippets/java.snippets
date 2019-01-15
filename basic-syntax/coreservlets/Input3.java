package coreservlets;

import java.util.*;

/** Third of three ways to read input: using Scanner.
 *  Note that these examples fail to handle the case when the input is
 *  not a legal number. A preview of the correct approach, with no explanation,
 *  is given in Input1Alt, and try/catch blocks are covered in detail
 *  in the section on applets and basic drawing.
 *  <p>
 *  The funny @SuppressWarnings annotation below is to tell Eclipse not to
 *  warn me that I could use try-with-resources (since we will not cover
 *  it until the File I/O section). For details on suppressing warnings, see
 *  http://help.eclipse.org/mars/index.jsp?topic=%2Forg.eclipse.jdt.doc.user%2Ftasks%2Ftask-suppress_warnings.htm
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on JSF 2, PrimeFaces, Ajax, JavaScript, jQuery, GWT, Android,
 *  Spring, Hibernate, JPA, RESTful Web Services, Hadoop, Spring MVC,
 *  servlets, JSP, Java 8 lambdas and streams (for those that know Java already), 
 *  and Java 8 programming (for those new to Java)</a>.
 */

@SuppressWarnings("resource")
public class Input3 {
  public static void main(String[] args) {
    System.out.print("Number: ");
    Scanner inputScanner = new Scanner(System.in);
    int num = inputScanner.nextInt();
    System.out.println("Your number is " + num);
  }
}
