package coreservlets.maps;

import java.util.*;

public class NumberMap {
  private static Map<Integer,String> numberMap = new HashMap<>();
  
  static {
    numberMap.put(1, "uno");
    numberMap.put(2, "dos");
    numberMap.put(3, "tres");
  }

  public static void main(String[] args) {
    MapUtils.printMapEntries(numberMap);
    numberMap.replaceAll((number, word) -> word.toUpperCase());
    MapUtils.printMapEntries(numberMap);
  }
}
