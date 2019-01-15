package coreservlets;

import java.util.*;

public class MapTest3 {
  public static void main(String[] args) {
    printStates("MD");
    printStates("MD", "DC", "VA");
    String[] someStates = { "NY", "NV", "ND", "NC", "NE" };
    printStates(someStates);
  }

  public static void printStates(String ... abbreviations) {
    StateMap2 states = new StateMap2();
    HashMap<String,String> stateAbbreviationTable =
      states.getStateMap();
    for(String abbreviation: abbreviations) {
      String state =
        stateAbbreviationTable.get(abbreviation.toUpperCase());
      if (state == null) {
        state = "Unknown";
      }
      System.out.println(state);
    }
  }
}