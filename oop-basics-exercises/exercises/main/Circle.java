package exercises.main;

// Very simple Circle class. Need to make instance variables private and
// add JavaDoc: covered in the next lecture. From coreservlets.com Java tutorial.

public class Circle  {
  public double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  public double getArea() {
    return(Math.PI * radius * radius);
  }

  public void printInfo() {
    System.out.println("Radius: " + radius +
                       ", Area: " + getArea());
  }

  public void setArea(double area) {
    radius = Math.sqrt(area / Math.PI);
  }
}