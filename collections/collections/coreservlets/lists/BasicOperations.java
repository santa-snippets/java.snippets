package coreservlets.lists;

import java.util.*;

/** A few examples of the most basic methods that List supports.
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

public class BasicOperations {
  public static void main(String[] args) {
    List<String> words = new ArrayList<>();
    // List<String> words = new LinkedList<>();
    words.add("hi");
    words.add("hello");
    words.add("hola");
    System.out.println("List: " + words);
    System.out.println("Num words: " + words.size());
    String secondWord = words.get(1);
    System.out.println("2nd word: " + secondWord);
    System.out.println("Contains 'hi'? " + words.contains("hi"));
    System.out.println("Contains 'bye'? " + words.contains("bye"));
    words.remove("hello");
    System.out.println("List: " + words);
    System.out.println("Num words: " + words.size());
  }
}
