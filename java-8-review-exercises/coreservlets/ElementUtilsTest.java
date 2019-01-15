package coreservlets;

import java.util.*;

public class ElementUtilsTest {
  public static void main(String[] args) {
    String[] names1 = {"John", "Juan", "Jane"};
    List<String> names2 = Arrays.asList(names1);
    System.out.printf("Using List method, last element is %s.%n",
                      ElementUtils.lastElement(names2));
    System.out.printf("Using array method, last element is %s.%n",
                      ElementUtils.lastElement(names1));
    Integer[] nums = { 1, 2, 3};
    System.out.println("Last element of the nums is " +
                       ElementUtils.lastElement(nums));
  }

}
