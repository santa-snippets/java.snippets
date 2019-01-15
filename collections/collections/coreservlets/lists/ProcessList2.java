package coreservlets.lists;

import java.util.*;

/** A newer way to iterate over list elements: by passing each element
 *  to a function. The pros and cons of this second approach (vs. regular looping
 *  as in ProcessList1) are discussed in the first of the tutorial sections on streams.
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on JSF 2, PrimeFaces, Ajax, JavaScript, jQuery, GWT, Android,
 *  Spring, Hibernate, JPA, RESTful Web Services, Hadoop, Spring MVC,
 *  servlets, JSP, Java 8 lambdas and streams (for those that know Java already), 
 *  and Java 8 programming (for those new to Java)</a>.
 */

public class ProcessList2 {
  public static void main(String[] args) {
    List<String> words = Arrays.asList("hi", "hello", "hola");
    words.forEach(System.out::println);
    // Another way to do the line above:
    // words.forEach(word -> System.out.println(word));
  }
}
