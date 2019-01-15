package coreservlets;

import java.io.*;

public class CopyFileTest {
  public static void main(String[] args) {
    String inputFile = "test-file.txt";
    String outputFile = "output-file-3.txt";
   try {
     FileUtils.copyTextFile(inputFile, outputFile);
     System.out.printf("Successfully copied %s to %s.%n", inputFile, outputFile);
   } catch(IOException ioe) {
     System.out.printf("Error when trying to copy %s to %s: %s.%n", inputFile, outputFile, ioe);
   }
  }
}
