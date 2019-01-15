package exercises.main;

/** We didn't cover toUpperCase, so you had to look in the online API, 
 *  either in a browser or via Eclipse auto-completion (code assist).
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on JSF 2, PrimeFaces, Ajax, JavaScript, jQuery, GWT, Android,
 *  Spring, Hibernate, JPA, RESTful Web Services, Hadoop, Spring MVC,
 *  servlets, JSP, Java 8 lambdas and streams (for those that know Java already), 
 *  and Java 8 programming (for those new to Java)</a>.
 */
public class ReverseArgs {
  public static void main(String[] args) {
    for(int i=args.length; i>0; i--) {
      System.out.println(args[i-1].toUpperCase());
    }
  }
}