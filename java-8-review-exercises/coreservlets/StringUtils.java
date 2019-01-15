package coreservlets;

public class StringUtils {
  public static int eChecker(String s1, String s2) {
    int compareFlag = 0;
    if (s1.contains("e") && !s2.contains("e")) {
      compareFlag = -1;
    } else if (s2.contains("e") && !s1.contains("e")) {
      compareFlag = 1;
    }
    return (compareFlag);
  }
  
  private StringUtils() {} // Uninstantiatable class
}
