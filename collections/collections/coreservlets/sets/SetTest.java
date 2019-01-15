package coreservlets.sets;

/** Testing the Set from the WebLanguages class by supplying names that
 *  are known to match as well as ones known to fail.
 *  <p>
 *  Although printf is not covered until the next tutorial section, its
 *  use here can mostly be figured out from context: the two %s values
 *  are placeholders that get replaced at runtime by the final two
 *  arguments to printf. %n means end of line.
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on JSF 2, PrimeFaces, Ajax, JavaScript, jQuery, GWT, Android,
 *  Spring, Hibernate, JPA, RESTful Web Services, Hadoop, Spring MVC,
 *  servlets, JSP, Java 8 lambdas and streams (for those that know Java already), 
 *  and Java 8 programming (for those new to Java)</a>.
 */

public class SetTest {
  public static void main(String[] args) {
    String[] testNames = {
      "Java", "JavaScript", "C#",
      "COBOL", "FORTRAN", "Assembly"
    };
    for(String name: testNames) {
      System.out.printf("%s is a Web language? %s.%n",
                        name, WebLanguages.isWebLanguage(name));
    }
  }
}
