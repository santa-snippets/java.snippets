package coreservlets;

import javax.swing.*;

/** Second of three ways to read input: using JOptionPane.showInputDialog
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

public class Input2 {
  public static void main(String[] args) {
    String input = JOptionPane.showInputDialog("Number:");
    int num = Integer.parseInt(input);
    System.out.println("Your number is " + num);
  }
}
