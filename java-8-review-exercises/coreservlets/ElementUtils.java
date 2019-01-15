package coreservlets;

import java.util.*;

public class ElementUtils {
  // The List version is not threadsafe since the size could change 
  // between the check of the size and the lookup, but merely synchronizing
  // the method would not make it threadsafe. Also, returning an Optional
  // would make sense here, but we have not yet covered that
  // Java 8 class.
  
  public static <T> T lastElement(List<T> elements) {
    int numElements = elements.size();
    if (numElements > 0) {
      return(elements.get(numElements-1));
    } else {
      return(null);
    }
  }
  
  public static <T> T lastElement(T[] elements) {
    int numElements = elements.length;
    if (numElements > 0) {
      return(elements[numElements-1]);
    } else {
      return(null);
    }
  }
  
  private ElementUtils() {} // Uninstantiatable class
}
