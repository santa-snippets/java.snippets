package coreservlets;

public class StringsAppearMutable {
  public static void main(String[] args) {
    String s = "Hello";
    s = s + ", World";
    System.out.println(s);
  }
}
