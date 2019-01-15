package coreservlets;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.util.List;

/** Reads from file into a List<String> in one fell swoop. Uses
 *  the Java-7 NIO package. 
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on JSF 2, PrimeFaces, Ajax, jQuery, GWT, Android,
 *  Spring, Hibernate, JPA, RESTful Web Services, Hadoop, 
 *  servlets, JSP, and Java 7 and Java 8 programming</a>.
 */

public class ReadAllIntoList {
  public static void main(String[] args) throws IOException {
    Charset characterSet = Charset.defaultCharset();
    Path path = Paths.get("test-file.txt");
    List<String> lines = Files.readAllLines(path, characterSet);
    for (String line: lines) {
      if (line.contains("test")) {
        System.out.printf("First line containing 'test': '%s'%n", line);
        return;
      }
    }
    System.out.println("No lines contain 'test'");
  }
}
