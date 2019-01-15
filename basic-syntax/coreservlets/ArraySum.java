package coreservlets;

/** Four different ways to sum the entries in arrays, using each of the four
 *  looping constructs.
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on JSF 2, PrimeFaces, Ajax, JavaScript, jQuery, GWT, Android,
 *  Spring, Hibernate, JPA, RESTful Web Services, Hadoop, Spring MVC,
 *  servlets, JSP, Java 8 lambdas and streams (for those that know Java already), 
 *  and Java 8 programming (for those new to Java)</a>.
 */

public class ArraySum {
  public static void main(String[] args) {
    double[] numbers = { 1.1, 2.2, 3.3 };
    System.out.println("[v1] Sum of {1.1,2.2,3.3}=" + arraySum1(numbers));
    System.out.println("[v2] Sum of {1.1,2.2,3.3}=" + arraySum2(numbers));
    System.out.println("[v3] Sum of {1.1,2.2,3.3}=" + arraySum3(numbers));
    System.out.println("[v4] Sum of {1.1,2.2,3.3}=" + arraySum4(numbers));
  }
  
  public static double arraySum1(double[] nums) {
    double sum = 0;
    for(double num: nums) {
      sum = sum + num; // Or sum += num
    }
    return(sum);
  }
  
  public static double arraySum2(double[] nums) {
    double sum = 0;
    for(int i=0; i<nums.length; i++) {
      sum = sum + nums[i]; 
    }
    return(sum);
  }
  
  public static double arraySum3(double[] nums) {
    double sum = 0;
    int i=0;
    while(i<nums.length) {
      sum = sum + nums[i]; 
      i++; // Or i = i + 1, or i += 1
    }
    return(sum);
  }
  
  // Unlike the other three versions, this one fails for a 0-length array
  
  public static double arraySum4(double[] nums) {
    double sum = 0;
    int i=0;
    do {
      sum = sum + nums[i]; 
      i++; 
    } while(i<nums.length);
    return(sum);
  }
}
