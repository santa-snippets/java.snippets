package coreservlets;

import java.util.*;
/** Solutions to the basic non-lambda sorting exercises.
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on JSF 2, PrimeFaces, Ajax, jQuery, GWT, Android,
 *  Spring, Hibernate, JPA, RESTful Web Services, Hadoop, 
 *  servlets, JSP, and Java 7 and Java 8 programming</a>.
 */
public class SortingExamples {
  public static void main(String[] args) {
    String[] words = { "hi", "hello", "hola", "bye", "goodbye", "adios" };
    System.out.println("Original array: " + Arrays.asList(words));
    Arrays.sort(words, new Comparator<String>() {
      @Override
      public int compare(String s1, String s2) {
        return(s1.length() - s2.length());
      }
    }); 
    System.out.println("Sorted by length ascending: " + Arrays.asList(words));
    Arrays.sort(words, new Comparator<String>() {
      @Override
      public int compare(String s1, String s2) {
        return(s2.length() - s1.length());
      }
    }); 
    System.out.println("Sorted by length descending : " + Arrays.asList(words));
    Arrays.sort(words, new Comparator<String>() {
      @Override
      public int compare(String s1, String s2) {
        return(s1.charAt(0) - s2.charAt(0));
      }
    }); 
    System.out.println("Sorted by first letter : " + Arrays.asList(words));
    Arrays.sort(words, new Comparator<String>() {
      @Override
      public int compare(String s1, String s2) {
        int compareFlag = 0;
        if(s1.contains("e") && !s2.contains("e")) {
          compareFlag = -1;
        } else if(s2.contains("e") && !s1.contains("e")) {
          compareFlag = 1;
        }
        return(compareFlag);
      }
    }); 
    System.out.println("Sorted by whether it contains 'e' [v1] : "
                       + Arrays.asList(words));
    Arrays.sort(words, new Comparator<String>() {
      @Override
      public int compare(String s1, String s2) {
        return(StringUtils.eChecker(s1,s2));
      }
    }); 
    System.out.println("Sorted by whether it contains 'e' [v2] : "
                       + Arrays.asList(words));
  }
}
