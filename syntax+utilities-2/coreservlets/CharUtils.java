package coreservlets;
/** Class to illustrate performance of String vs. StringBuilder 
 *  when doing repeated concatenations. The first method is O(N^2)
 *  and the second is O(N).
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on JSF 2, PrimeFaces, Ajax, JavaScript, jQuery, GWT, Android,
 *  Spring, Hibernate, JPA, RESTful Web Services, Hadoop, Spring MVC,
 *  servlets, JSP, Java 8 lambdas and streams (for those that know Java already), 
 *  and Java 8 programming (for those new to Java)</a>.
 */

public class CharUtils {
  public static String padChars1(int n, String orig) {
    String result = "";
    for(int i=0; i<n; i++) {
      result = result + orig;
    }
    return(result);
  }

  public static String padChars2(int n, String orig) {
    StringBuilder result = new StringBuilder("");
    for(int i=0; i<n; i++) {
      result = result.append(orig);
    }
    return(result.toString());
  }
  
  public static void main(String[] args) {
    System.out.println(padChars1(5, "x"));
    System.out.println(padChars2(5, "x"));
  }
}