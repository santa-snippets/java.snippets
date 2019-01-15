package coreservlets;

import java.awt.*;

public class RandomUtilsTest {
  public static void main(String[] args) {
    String[] names = { "Joe", "John", "Jane" };
    String name = RandomUtils.randomElement(names);
    System.out.println("Name is " + name);
    Color[] colors = { Color.RED, Color.GREEN, Color.BLUE };
    Color color = RandomUtils.randomElement(colors);
    System.out.println("Color is " + color);
    Person[] people = 
      { new Person("Larry", "Page"), new Person("Larry", "Ellison"),
        new Person("Larry", "Bird"), new Person("Larry", "King") };
    Person person = RandomUtils.randomElement(people);
    System.out.println("Person is " + person);
    Integer[] nums = { 1, 2, 3, 4 };  // Integer[], *not* int[]
    int num = RandomUtils.randomElement(nums);
    System.out.println("Number is " + num);
  }
}
