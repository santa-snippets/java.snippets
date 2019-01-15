package coreservlets;

public class RandomOperations {
  public static void main(String[] args) {
    for(int i=0; i<10; i++) {
      if (Math.random() > 0.5) {
        doFirstOperation();   // 50% chance
      } else {
        doSecondOperation();  // 50% chance
      }
    }
  }
  
  private static void doFirstOperation() {
    System.out.println("Doing first 'operation'");
  }
  
  private static void doSecondOperation() {
    System.out.println("Doing second 'operation'");
  }
}
