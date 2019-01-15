package coreservlets.lists;

import java.util.*;

public class Autoboxing {
  public static void main(String[] args) {
    List<Integer> nums = new ArrayList<>();
    int[] values = { 2, 4, 6 };
    for(int value: values) {
      nums.add(value);
    }
    System.out.println("List: " + nums);
    int secondNum = nums.get(1);
    System.out.println("Second number: " + secondNum);
  }
}
