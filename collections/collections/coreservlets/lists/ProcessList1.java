package coreservlets.lists;

import java.util.*;

/** The more traditional way to iterate over list elements: by using the
 *  same style of for/each loop that we used earlier for arrays. 
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on JSF 2, PrimeFaces, Ajax, JavaScript, jQuery, GWT, Android,
 *  Spring, Hibernate, JPA, RESTful Web Services, Hadoop, Spring MVC,
 *  servlets, JSP, Java 8 lambdas and streams (for those that know Java already), 
 *  and Java 8 programming (for those new to Java)</a>.
 */

public class ProcessList1 {
  public static void main(String[] args) {
    List<String> words = Arrays.asList("hi", "hello", "hola");
    for(String word: words) {
      System.out.println(word);
    }
  }
}
