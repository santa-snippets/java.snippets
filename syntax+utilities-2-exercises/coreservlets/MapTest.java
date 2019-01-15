package coreservlets;

import java.util.*;

public class MapTest {
  public static void main(String[] args) {
    StateMap states = new StateMap();
    HashMap<String,String> stateAbbreviationTable =
      states.getStateMap();
    Scanner inputScanner = new Scanner(System.in);
    System.out.println("Enter state names. Hit RETURN to quit");
    String stateName;
    String abbreviation;
    while(true) {
      System.out.print("State: ");
      stateName = inputScanner.nextLine().toUpperCase();
      if (stateName.equals("")) {
        System.out.println("Come again soon.");
        break;
      }
      abbreviation =
        stateAbbreviationTable.get(stateName);
      if (abbreviation == null) {
        abbreviation = "Unknown";
      }
      System.out.println(abbreviation);
    }
    inputScanner.close();
  }
}