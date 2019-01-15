package exercises.easier;

import javax.swing.*;

/** A class whose main method will flip coins a user-specified number of times.
 *  It is incomplete because it does not check for illegal data, but doing so
 *  requires try/catch blocks, which have not yet been covered in the lectures.
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on JSF 2, PrimeFaces, Ajax, JavaScript, jQuery, GWT, Android,
 *  Spring, Hibernate, JPA, RESTful Web Services, Hadoop, Spring MVC,
 *  servlets, JSP, Java 8 lambdas and streams (for those that know Java already), 
 *  and Java 8 programming (for those new to Java)</a>.
 */
public class FlipCoins2 {
  public static void main(String[] args) {
    String numString =
      JOptionPane.showInputDialog("Number of coin flips:");
    int num = Integer.parseInt(numString); // WARNING: no check for illegal values!
    String coin;
    for(int i=0; i<num; i++) {
      if (Math.random() < 0.5) {
        coin = "Heads";
      } else {
        coin = "Tails";
      }
      System.out.println(coin);
    }
  }
}