package coreservlets;

/** An example of what happens when you pass arrays of boxed (Integer)
 *  and unboxed (int) number to a method that has Object varargs for the parameter list.
 *  <p>
 *  The funny @SuppressWarnings annotation below is to tell Eclipse not to
 *  warn me some of the calls to printAll seem ambiguous,
 *  since I am making this example specifically to illustrate that point.
 *  Sadly, however, Eclipse does not have a token specific to that warning, so I am 
 *  somewhat dangerously suppressing all warnings. Still, this is better than getting in the habit
 *  of leaving warnings in code, and thus getting in the habit of ignoring them.
 *  For details on suppressing warnings, see
 *  http://help.eclipse.org/mars/index.jsp?topic=%2Forg.eclipse.jdt.doc.user%2Ftasks%2Ftask-suppress_warnings.htm
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on JSF 2, PrimeFaces, Ajax, JavaScript, jQuery, GWT, Android,
 *  Spring, Hibernate, JPA, RESTful Web Services, Hadoop, Spring MVC,
 *  servlets, JSP, Java 8 lambdas and streams (for those that know Java already), 
 *  and Java 8 programming (for those new to Java)</a>.
 */

@SuppressWarnings("all")
public class VarArgsTest {
  public static void main(String[] args) {
    PrintUtilities.printAll(1, 2, 3);
    Integer[] nums1 = { 1, 2, 3 };
    PrintUtilities.printAll(nums1);
    int[] nums2 = { 1, 2, 3 };
    PrintUtilities.printAll(nums2);
  }
}
