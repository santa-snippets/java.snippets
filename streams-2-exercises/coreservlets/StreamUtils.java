package coreservlets;

import java.util.*;
import java.util.stream.*;

public class StreamUtils {
  public static Stream<Double> randomNumberStream(int size) {
    return(Stream.generate(() -> Math.random()).limit(size));
  }
  
  public static List<Double> randomNumberList(int size) {
    return(randomNumberStream(size).collect(Collectors.toList()));
  }
  
  public static Stream<Integer> orderedNumberStream(int initialNum, int stepSize, int size) {
    return(Stream.iterate(initialNum, n -> n + stepSize).limit(size));
  }
  
  public static List<Integer> orderedNumberList(int initialNum, int stepSize, int size) {
    return(orderedNumberStream(initialNum, stepSize, size).collect(Collectors.toList()));
  }
  
  private StreamUtils() {} // Uninstantiatable class
}
