package exercises.easier;

public class LoopTest {
  public static void main(String[] args) {
    printNums1(3);
    printNums2(7);
    printNums3(5);
  }
  
  public static void printNums1(int upperLimit) {
    for(int i=0; i<=upperLimit; i++) {
      System.out.println(i);
    }
  }
  
  public static void printNums2(int upperLimit) {
    for(int i=0; i<=upperLimit; i=i+2) {
      System.out.println(i);
    }
  }
  
  public static void printNums3(int upperLimit) {
    for(int i=upperLimit; i>=0; i--) {
      System.out.println(i);
    }
  }
  
}
