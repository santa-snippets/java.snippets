package coreservlets;

public class NumberMapTest {
  public static void main(String[] args) {
    NumberMap mapper = new NumberMap();
    printNumbers(mapper, 20);
    String[] spanishNums =
      {"cero", "uno", "dos", "tres", "cuatro", "cinco",
       "seis", "siete", "ocho", "nueve", "diez", "once",
       "doce", "trece", "catorce"};
    mapper = new NumberMap(spanishNums);
    printNumbers(mapper, 15);
  }

  private static void printNumbers(NumberMap mapper, int n) {
    int max = mapper.getSize();
    for(int i=0; i<n; i++) {
      int random = (int)(Math.random() * max);
      System.out.printf("The value of %s is %s.%n",
                        random, mapper.getWordForNumber(random));
    }
  }
}