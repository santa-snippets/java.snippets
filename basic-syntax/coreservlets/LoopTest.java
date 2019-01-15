package coreservlets;

/** Shows a few simple ways to loop.
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on JSF 2, PrimeFaces, Ajax, JavaScript, jQuery, GWT, Android,
 *  Spring, Hibernate, JPA, RESTful Web Services, Hadoop, Spring MVC,
 *  servlets, JSP, Java 8 lambdas and streams (for those that know Java already), 
 *  and Java 8 programming (for those new to Java)</a>.
 */

public class LoopTest {
  public static void main(String[] args) {
    String[] test = { "This", "is", "a", "test"};
    listEntries(test);
    listNums1(5);
    listNums2(6);
    listNums3(7);
  }

  public static void listEntries(String[] entries) {
    for(String entry: entries) {
      System.out.println(entry);
    }
  }

  public static void listNums1(int max) {
    for(int i=0; i<max; i++) {
      System.out.println("Number: " + i);
    }
  }

  public static void listNums2(int max) {
    int i = 0;
    while (i < max) {
      System.out.println("Number: " + i);
      i++; // "++" means "add one"
    }
  }

  public static void listNums3(int max) {
    int i = 0;
    do {
      System.out.println("Number: " + i);
      i++;
    } while (i < max);
                   // ^ Don’t forget semicolon
  }
}
