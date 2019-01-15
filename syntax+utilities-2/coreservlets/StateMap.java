package coreservlets;

import java.util.*;

/** Maps state names (keys) to state abbreviations (the associated value).
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on JSF 2, PrimeFaces, Ajax, JavaScript, jQuery, GWT, Android,
 *  Spring, Hibernate, JPA, RESTful Web Services, Hadoop, Spring MVC,
 *  servlets, JSP, Java 8 lambdas and streams (for those that know Java already), 
 *  and Java 8 programming (for those new to Java)</a>.
 */

public class StateMap {
  private Map<String,String> stateMap;

  public StateMap() {
    stateMap = new HashMap<>();
    for(String[] state: stateArray) {
      stateMap.put(state[0], state[1]);
    }
  }

  public Map<String,String> getStateMap() {
    return(stateMap);
  }

  public String[][] getStateArray() {
    return(stateArray);
  }

  private String[][] stateArray =
    { { "Alabama", "AL" },
      { "Alaska", "AK" },
      { "Arizona", "AZ" },
      { "Arkansas", "AR" },
      { "California", "CA" },
      { "Colorado", "CO" },
      { "Connecticut", "CT" },
      { "Delaware", "DE" },
      { "District of Columbia", "DC" },
      { "Florida", "FL" },
      { "Georgia", "GA" },
      { "Hawaii", "HI" },
      { "Idaha", "ID" },
      { "Illinois", "IL" },
      { "Indiana", "IN" },
      { "Iowa", "IA" },
      { "Kansas", "KS" },
      { "Kentucky", "KY" },
      { "Louisiana", "LA" },
      { "Maine", "ME" },
      { "Maryland", "MD" },
      { "Massachusetts", "MA" },
      { "Michigan", "MI" },
      { "Minnesota", "MN" },
      { "Mississippi", "MS" },
      { "Missouri", "MO" },
      { "Montana", "MT" },
      { "Nebraska", "NE" },
      { "Nevada", "NV" },
      { "New Hampshire", "NH" },
      { "New Jersey", "NJ" },
      { "New Mexico", "NM" },
      { "New York", "NY" },
      { "North Carolina", "NC" },
      { "North Dakota", "ND" },
      { "Ohio", "OH" },
      { "Oklahoma", "OK" },
      { "Oregon", "OR" },
      { "Pennsylvania", "PA" },
      { "Rhode Island", "RI" },
      { "South Carolina", "SC" },
      { "South Dakota", "SD" },
      { "Tennessee", "TN" },
      { "Texas", "TX" },
      { "Utah", "UT" },
      { "Vermont", "VT" },
      { "Virginia", "VA" },
      { "Washington", "WA" },
      { "West Virginia", "WV" },
      { "Wisconsin", "WI" },
      { "Wyoming", "WY" }
    };
}
