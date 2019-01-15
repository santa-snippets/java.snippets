package coreservlets.lists;

import java.util.*;

public class SimpleList {
  public static void main(String[] args) {
    List<String> words = new ArrayList<>();
    words.add("hi");
    words.add("hello");
    words.add("hola");
    System.out.println("First word: " + words.get(0));
    System.out.println("All words: " + words);
  }
}
