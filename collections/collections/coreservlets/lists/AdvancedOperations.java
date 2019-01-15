package coreservlets.lists;

import java.util.*;

/** A few examples of more advanced methods that List supports.
 *  The use of lambda expressions is not explained until a later 
 *  tutorial section, but eager readers can pick up the basic idea
 *  by looking at these examples.
 *  <p>
 *  Again, you can change "ArrayList" to "LinkedList" at the
 *  top without changing any of the other code and without changing
 *  the output.
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on JSF 2, PrimeFaces, Ajax, JavaScript, jQuery, GWT, Android,
 *  Spring, Hibernate, JPA, RESTful Web Services, Hadoop, Spring MVC,
 *  servlets, JSP, Java 8 lambdas and streams (for those that know Java already), 
 *  and Java 8 programming (for those new to Java)</a>.
 */

public class AdvancedOperations {
  public static void main(String[] args) {
    List<String> words = new ArrayList<>();
    // List<String> words = new LinkedList<>();
    words.add("hi");
    words.add("hello");
    words.add("hola");
    System.out.println("List: " + words);
    words.sort((word1,word2) -> word1.length() - word2.length());
    System.out.println("List: " + words);
    words.replaceAll(word -> word.toUpperCase() + "!");
    System.out.println("List: " + words);
    words.removeIf(word -> word.contains("E"));
    System.out.println("List: " + words);
    words.forEach(word -> System.out.println("Word: " + word));
    String[] wordArray = words.toArray(new String[0]);
    for(String word: wordArray) {
      System.out.println("Word: " + word);
    }
  }
}
