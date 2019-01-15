package coreservlets;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.util.List;

public class FileUtils {
  public static List<String> getLines(String file) throws IOException {
    Path path = Paths.get(file);
    return(Files.readAllLines(path, Charset.defaultCharset()));
  }
  
  public static Path writeLines(String file, List<String> lines) throws IOException {
    Path path = Paths.get(file);
    return(Files.write(path, lines, Charset.defaultCharset()));
  }
  
  public static void copyTextFile(String inputFile, String outputFile) throws IOException {
    FileUtils.writeLines(outputFile, FileUtils.getLines(inputFile));
  }
  
  private FileUtils() {} // Uninstantiatable class
}
