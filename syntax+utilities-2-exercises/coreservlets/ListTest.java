package coreservlets;

import java.util.*;

public class ListTest {
  private static int listSize = 500000;
  private static int numRepeats = 1000;

  public static void main(String[] args) {
    List<String> linkedList = new LinkedList<>();
    List<String> arrayList = new ArrayList<>();
    for(int i=0; i<listSize; i++) {
      String value = "Entry " + i;
      linkedList.add(value);
      arrayList.add(value);
    }
    timeAccess("Linked list", linkedList);
    timeAccess("Array list", arrayList);
    timeAccess("Linked list", linkedList);
    timeAccess("Array list", arrayList);
    timeAccess("Linked list", linkedList);
    timeAccess("Array list", arrayList);
  }

  public static void timeAccess(String label,
                                List<String> list) {
    String entry;
    int index = list.size()/2;
    long startTime = System.currentTimeMillis();
    for(int i=0; i<numRepeats; i++) {
      entry = list.get(index);
    }
    long endTime = System.currentTimeMillis();
    double elapsedTime = ((double)(endTime - startTime))/1000;
    System.out.printf("%s access time: %.3f seconds.%n",
                      label, elapsedTime);
  }
}