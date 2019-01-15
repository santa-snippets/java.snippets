package exercises.main;

public class RectangleTest {
  public static void main(String[] args) {
    for(int i=0; i<10; i++) {
      double width = 20*Math.random();
      double height = 10*Math.random();
      Rectangle r = new Rectangle(width, height);
      System.out.println("Rectangle " + i);
      System.out.println("Width:  " + r.width);
      System.out.println("Height: " + r.height);
      System.out.println("Area:   " + r.getArea());
      System.out.println();
    }
  }
}