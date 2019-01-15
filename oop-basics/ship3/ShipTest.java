package ship3;

public class ShipTest {
  public static void main(String[] args) {
    Ship s1 = new Ship(0.0, 0.0, 1.0,   0.0, "Ship1");
    Ship s2 = new Ship(0.0, 0.0, 2.0, 135.0, "Ship2");
    s1.move();
    s2.move();
    s1.printLocation();
    s2.printLocation();
  }
}