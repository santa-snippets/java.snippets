package exercises.easier;

public class StringMatching {
  public static void main(String[] args) {
    String[] testStrings = { "Hello", "Hi", "Hola", "Howdy" };
    if (isStringInArray(testStrings, "Hola")) {
      System.out.println("Hola is in array");
    } else {
      System.out.println("Hola is not in array");
    }
    if (isStringInArray(testStrings, "Hey")) {
      System.out.println("Hey is in array");
    } else {
      System.out.println("Hey is not in array");
    }
  }
  
  public static boolean isStringInArray(String[] strings, String potentialMatch) {
    for(String s: strings) {
      if (s.equals(potentialMatch)) {
        return(true);
      }
    }
    return(false);
  }
}
