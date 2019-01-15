package enums1;

public class DayTest {
  public static boolean isWeekend(Day d) {
    return(d == Day.SATURDAY || d == Day.SUNDAY);
  }
  
  public static void main(String[] args) {
    System.out.println("Monday is weekend? " + 
                       isWeekend(Day.MONDAY));
    System.out.println("Saturday is weekend? " + 
                       isWeekend(Day.SATURDAY));
  }
}
