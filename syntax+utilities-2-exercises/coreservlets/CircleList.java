package coreservlets;

import java.util.*;

public class CircleList {
  public static void main(String[] args) {
    List<Circle> circles = new ArrayList<>();
    while (Math.random() > 0.01) {
      circles.add(new Circle(10*Math.random()));
    }
    for(Circle c: circles) {
      System.out.printf("Area: %8.3f%n", c.getArea());
    }
  }
}