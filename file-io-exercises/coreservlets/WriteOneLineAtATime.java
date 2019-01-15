package coreservlets;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.*;

public class WriteOneLineAtATime {
  public static void main(String[] args) throws IOException {
    Charset characterSet = Charset.defaultCharset();
    Path path = Paths.get("output-file-2.txt");
    try (BufferedWriter writer = 
           Files.newBufferedWriter(path, characterSet)) {
      int numEntries = 10;
      for(int i=0; i<numEntries; i++) {
        writer.write(String.format("Num %s: %s", i, Math.random()));
        writer.newLine();
      }
    } catch (IOException ioe) {
      System.err.printf("IOException: %s%n", ioe);
    }
  }
}
