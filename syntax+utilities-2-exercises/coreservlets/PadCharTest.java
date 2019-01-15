package coreservlets;

public class PadCharTest {
  public static void main(String[] args) {
    int size = 30000;
    if (args.length > 0) {
      size = Integer.parseInt(args[0]);
    }
    long startTime = System.currentTimeMillis();
    String temp = CharUtils.padChars1(size, "x");
    long endTime = System.currentTimeMillis();
    double elapsedTime = ((double)(endTime - startTime))/1000;
    System.out.printf("padChars1 access time: %9.5f seconds.%n",
                      elapsedTime);
    startTime = System.currentTimeMillis();
    temp = CharUtils.padChars2(size, "x");
    endTime = System.currentTimeMillis();
    elapsedTime = ((double)(endTime - startTime))/1000;
    System.out.printf("padChars2 access time: %9.5f seconds.%n",
                      elapsedTime);
  }
}