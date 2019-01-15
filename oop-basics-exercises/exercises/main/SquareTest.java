package exercises.main;

public class SquareTest {
  public static void main(String[] args) {
    for(int i=0; i<10; i++) {
      double width = 10*Math.random();
      Square s = new Square(width);
      System.out.println("Square " + i);
      System.out.println("Width:  " + s.width);
      System.out.println("Area:   " + s.getArea());
      System.out.println();
    }
    for(int i=0; i<5; i++) {
      double area = 100*Math.random();
      Square s = new Square(0.0);
      s.setArea(area);
      System.out.println("Square " + i);
      System.out.println("Width:          " + s.width);
      System.out.println("Requested area: " + area);
      System.out.println("Actual Area:    " + s.getArea());
      System.out.println();
    }
  }
}