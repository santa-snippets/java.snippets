package coreservlets;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.*;

public class ReadOneLineAtATime {
  public static void main(String[] args) throws IOException {
    Charset characterSet = Charset.defaultCharset();
    Path path = Paths.get("test-file.txt");
    try(BufferedReader reader = 
          Files.newBufferedReader(path, characterSet)) {
      String line;
      while ((line = reader.readLine()) != null) {
        if (line.contains("test")) {
          System.out.printf("First line containing 'test': '%s'%n", line);
          return;
        }
      }
    } catch (IOException ioe) {
      System.err.printf("IOException: %s%n", ioe);
    }
    System.out.println("No lines contain 'test'");
  }
}
