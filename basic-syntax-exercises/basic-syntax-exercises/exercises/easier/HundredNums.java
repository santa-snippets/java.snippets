package exercises.easier;

/** Two-step array allocation.
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on JSF 2, PrimeFaces, Ajax, JavaScript, jQuery, GWT, Android,
 *  Spring, Hibernate, JPA, RESTful Web Services, Hadoop, Spring MVC,
 *  servlets, JSP, Java 8 lambdas and streams (for those that know Java already), 
 *  and Java 8 programming (for those new to Java)</a>.
 */
public class HundredNums {
  public static void main(String[] args) {
    double[] nums = new double[100];
    for(int i=0; i<nums.length; i++) {
      nums[i] = Math.random();
    }
    double sum = 0;
    for(double num: nums) {
      sum = sum + Math.sqrt(num);
    }
    System.out.println("Sum of square roots: " + sum);
  }
}