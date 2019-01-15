package exercises.easier;

/** One-step array allocation.
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on JSF 2, PrimeFaces, Ajax, JavaScript, jQuery, GWT, Android,
 *  Spring, Hibernate, JPA, RESTful Web Services, Hadoop, Spring MVC,
 *  servlets, JSP, Java 8 lambdas and streams (for those that know Java already), 
 *  and Java 8 programming (for those new to Java)</a>.
 */
public class FourNums {
  public static void main(String[] args) {
    double[] nums = { Math.random(), Math.random(),
                      Math.random(), Math.random() };
    for(double num: nums) {
      System.out.println(num);
    }
  }
}