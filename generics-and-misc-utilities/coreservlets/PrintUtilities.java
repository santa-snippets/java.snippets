package coreservlets;

public class PrintUtilities {
  public static void printAll(Object... entries) {
    for(Object o: entries) {
      System.out.println(o);
    }
  }
}
