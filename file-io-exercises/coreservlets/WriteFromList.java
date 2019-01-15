package coreservlets;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.util.*;

public class WriteFromList {
  public static void main(String[] args) throws IOException {
    Charset characterSet = Charset.defaultCharset();
    Path path = Paths.get("output-file-1.txt");
    int numEntries = 10;
    List<String> nums = new ArrayList<>();
    for(int i=0; i<numEntries; i++) {
      nums.add(String.format("Num %s: %s", i, Math.random()));
    }
    Files.write(path, nums, characterSet);
  }
}
