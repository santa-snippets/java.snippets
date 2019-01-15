package coreservlets;

import java.util.*;

import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

/** A simple class used to practice JUnit testing.
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on JSF 2, PrimeFaces, Ajax, JavaScript, jQuery, GWT, Android,
 *  Spring, Hibernate, JPA, RESTful Web Services, Hadoop, Spring MVC,
 *  servlets, JSP, Java 8 lambdas and streams (for those that know Java already), 
 *  and Java 8 programming (for those new to Java)</a>.
 */
public class UtilsTest {
  /** Verifies the operation of Utils.calmString.  */
  
  @Test
  public void testCalmString() {
    assertThat(Utils.calmString("foo"), is(equalTo("foo")));
    assertThat(Utils.calmString("foo!"), is(equalTo("foo")));
    assertThat(Utils.calmString("!f!!o!!!o!"), is(equalTo("foo")));
    assertThat(Utils.calmString(null), is(nullValue()));
  }
  
  /** Verifies the operation of Utils.calmAttendees. */
  
  @Test
  public void calmAttendees() {
    // Note that the Java Hackers Party is a new and very powerful political force.
    List<String> attendees = new ArrayList<>(Arrays.asList("Republican", "Democrat", "Java Hackers", "COBOL Coders"));
    Utils.calmAttendees(attendees);
    assertThat(attendees, not(allOf(hasItem("Republican"), hasItem("Democrat"))));
    assertThat(attendees, anyOf(hasItem("Republican"), hasItem("Democrat")));
    assertThat(attendees, allOf(hasItem("Java Hackers"), hasItem("COBOL Coders")));
    
    // This assertion will fail. Try it to note the readable error messages.
    // assertThat(attendees, allOf(hasItem("Java Hackers"), hasItem("Python Programmers")));
  }
}
