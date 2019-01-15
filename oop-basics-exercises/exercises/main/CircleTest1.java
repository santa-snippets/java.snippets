package exercises.main;

public class CircleTest1 {
  public static void main(String[] args) {
    for(int i=0; i<10; i++) {
      double radius = 10*Math.random();
      Circle c = new Circle(radius);
      System.out.println("Circle " + i);
      System.out.println("Generated radius: "
                         + radius);
      System.out.println("Stored radius:    "
                         + c.radius);
      System.out.println();
    }
  }
}