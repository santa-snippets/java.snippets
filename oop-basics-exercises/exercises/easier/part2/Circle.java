package exercises.easier.part2;

// Very simple Circle class. Need to add constructor, make instance variables private and
// add JavaDoc: covered in the upcoming lecture. From coreservlets.com Java tutorial.

public class Circle  {
  public double radius;
  
  public Circle(double radius) {
    this.radius = radius;
  }

  public double getArea() {
    return(Math.PI * radius * radius);
  }
}