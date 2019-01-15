package coreservlets;

import static org.junit.Assert.*;
import org.junit.*;

/** Some unit tests using the traditional assertEquals, assertTrue,
 *  and assertFalse methods. See StringUtilsTester2 for the newer
 *  style using assertThat.
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on JSF 2, PrimeFaces, Ajax, JavaScript, jQuery, GWT, Android,
 *  Spring, Hibernate, JPA, RESTful Web Services, Hadoop, Spring MVC,
 *  servlets, JSP, Java 8 lambdas and streams (for those that know Java already), 
 *  and Java 8 programming (for those new to Java)</a>.
 */

// Note that under some Eclipse settings, Eclipse will make
// a warning that the methods can potentially be declared static.
// In this case, you should ignore the warning, since JUnit methods
// should NOT be static.

public class StringUtilsTester2 {
  @Test
  public void testReverse() {
    assertEquals("oof", StringUtils.reverseString("foo"));
    assertEquals("rab", StringUtils.reverseString("bar"));
    assertEquals("!zaB", StringUtils.reverseString("Baz!"));
  }
  
  @Test
  public void testPalindromes() {
    String[] matches = 
      { "a", "aba", "Aba", "abba", "AbBa", "abcdeffedcba", "abcdEffedcba" };
    String[] misMatches = 
      { "ax", "axba", "Axba", "abbax", "xAbBa", "abcdeffedcdax", "axbcdEffedcda" };
    for(String s: matches) {
      assertTrue(StringUtils.isPalindrome(s));
    }
    for(String s: misMatches) {
      assertFalse(StringUtils.isPalindrome(s));
    }
  }
}
