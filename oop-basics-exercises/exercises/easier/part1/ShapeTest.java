package exercises.easier.part1;

public class ShapeTest {
  public static void main(String[] args) {
    // Test some Circles
    Circle c1 = new Circle();
    c1.radius = 10;
    System.out.println("Radius of c1 is " + c1.radius);
    System.out.println("Area of c1 is " + c1.getArea());
    Circle c2 = new Circle();
    c2.radius = 1.001;
    System.out.println("Radius of c2 is " + c2.radius);
    System.out.println("Area of c2 is " + c2.getArea());
    
    // Make array of Circles
    Circle[] circles = new Circle[100];
    for(int i=0; i<circles.length; i++) {
      Circle c = new Circle();
      c.radius = Math.random() * 10;
      circles[i] = c;
    }
    
    // Sum up the areas of the Circles
    double sum = 0;
    for(Circle c: circles) {
      sum = sum + c.getArea();
    }
    System.out.println("Sum of areas of 100 circles is " + sum);
    
    // Test some Rectangles
    Rectangle r1 = new Rectangle();
    r1.width = 5;
    r1.height = 10;
    System.out.println("Width of r1 is " + r1.width);
    System.out.println("Height of r1 is " + r1.height);
    System.out.println("Area of r1 is " + r1.getArea());
    Rectangle r2 = new Rectangle();
    r2.width = 2.5;
    r2.height = 3.5;
    System.out.println("Width of r2 is " + r2.width);
    System.out.println("Height of r2 is " + r2.height);
    System.out.println("Area of r2 is " + r2.getArea());
    
    // Make array of mixed Circles and Rectangles
    // Object[] shapes = { c1, r1, c2, r2 };
    // But how to sum up the areas?
  }
}
