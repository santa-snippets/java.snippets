package enums2;

/** The second of several variations of a Day enum, to
 *  show that enums are mostly like normal classes except
 *  that you have a predetermined number of named instances.
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on JSF 2, PrimeFaces, Ajax, JavaScript, jQuery, GWT, Android,
 *  Spring, Hibernate, JPA, RESTful Web Services, Hadoop, Spring MVC,
 *  servlets, JSP, Java 8 lambdas and streams (for those that know Java already), 
 *  and Java 8 programming (for those new to Java)</a>.
 */

public enum Day {
  SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
  THURSDAY, FRIDAY, SATURDAY;
  
  public boolean isWeekend() {
    return(this == SATURDAY || this == SUNDAY);
  }
  
  public boolean isWeekday() {
    return(!isWeekend());
  }
}
