package enums2;

public class DayTest {
  public static void main(String[] args) {
    System.out.println("Monday is weekend? " + 
                       Day.MONDAY.isWeekend());
    System.out.println("Saturday is weekend? " + 
                       Day.SATURDAY.isWeekend());
  }
}
