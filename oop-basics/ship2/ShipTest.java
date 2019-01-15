package ship2;

public class ShipTest {
  public static void main(String[] args) {
    Ship s1 = new Ship();
    s1.name = "Ship1";
    Ship s2 = new Ship();
    s2.direction = 135.0; // Northwest
    s2.speed = 2.0;
    s2.name = "Ship2";
    s1.move();
    s2.move();
    s1.printLocation();
    s2.printLocation();
  }
}