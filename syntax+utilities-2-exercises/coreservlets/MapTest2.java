package coreservlets;

import java.util.*;

public class MapTest2 {
  public static void main(String[] args) {
    StateMap2 states = new StateMap2();
    HashMap<String,String> stateAbbreviationTable =
      states.getStateMap();
    Scanner inputScanner = new Scanner(System.in);
    System.out.println("Enter abbreviations. RETURN to quit");
    String abbreviation;
    String state;
    while(true) {
      System.out.print("Abbreviation: ");
      abbreviation = inputScanner.nextLine().toUpperCase();
      if (abbreviation.equals("")) {
        System.out.println("Come again soon.");
        break;
      }
      state =
        stateAbbreviationTable.get(abbreviation);
      if (state == null) {
        state = "Unknown";
      }
      System.out.println(state);
    }
    inputScanner.close();
  }
}