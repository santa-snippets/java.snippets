package coreservlets;

import java.util.*;

public class NumberMap {
  private Map<Integer,String> numberTable;
  private static String[] defaultWords =
    {"zero", "one", "two", "three", "four",
     "five", "six", "seven", "eight", "nine",
     "ten", "eleven", "twelve", "thirteen",
     "fourteen", "fifteen", "sixteen",
     "seventeen", "eighteen", "nineteen"};

  public NumberMap() {
    this(defaultWords);
  }

  public NumberMap(String[] words) {
    numberTable = new HashMap<>();
    for(int i=0; i<words.length; i++) {
      numberTable.put(i, words[i]);
    }
  }

  public String getWordForNumber(int num) {
    String word = numberTable.get(num);
    if (word == null) {
      word = "Unrecognized number";
    }
    return(word);
  }

  public int getSize() {
    return(numberTable.size());
  }
}