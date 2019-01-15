package enums3;

public class DayTest {
  public static void main(String[] args) {
    Day day1 = Day.MONDAY;
    System.out.println(day1);  // toString is automatic with enums
    System.out.println(day1.getAbbreviation() + 
                       " is weekend? " + 
                       day1.isWeekend());
    Day day2 = Day.SATURDAY;
    System.out.println(day2.getAbbreviation() + 
                       " is weekend? " + 
                       day2.isWeekend());
  }
}
