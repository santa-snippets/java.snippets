package exercises.main;

public class CircleTest2 {
  public static void main(String[] args) {
    for(int i=0; i<10; i++) {
      double radius = 10*Math.random();
      Circle c = new Circle(radius);
      System.out.println("Circle " + i);
      System.out.println("Generated radius:    "
                         + radius);
      System.out.print("Stored info: ");
      c.printInfo();
      System.out.println();
    }
  }
}