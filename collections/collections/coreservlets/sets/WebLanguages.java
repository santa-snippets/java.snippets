package coreservlets.sets;

import java.util.*;

/** A simple Set that will let you query if a potential programming language
 *  is considered to be a Web language. Does case-insensitive comparisons
 *  by converting all entries to lower case before inserting them in the Set or
 *  checking them against the Set.
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on JSF 2, PrimeFaces, Ajax, JavaScript, jQuery, GWT, Android,
 *  Spring, Hibernate, JPA, RESTful Web Services, Hadoop, Spring MVC,
 *  servlets, JSP, Java 8 lambdas and streams (for those that know Java already), 
 *  and Java 8 programming (for those new to Java)</a>.
 */

public class WebLanguages {
  private static String[] languageArray = 
    {"java", "javascript", "ruby", "c#", "python"};
  private static Set<String> webLanguages = new HashSet<>();
  
  static {
    for(String language: languageArray) {
      webLanguages.add(language);
    }
  }
  
  public static boolean isWebLanguage(String language) {
    return(webLanguages.contains(language.toLowerCase()));
  }
}
