package exercises.easier.part2;

public class GeomUtils {
  public static double hypotenuse(double leg1, double leg2) {
    return(Math.sqrt(leg1*leg1 + leg2*leg2));    
  }
  
  private GeomUtils() {} // Prevents anyone from calling "new" on this class
}
