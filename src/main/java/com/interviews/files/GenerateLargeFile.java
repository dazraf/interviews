package com.interviews.files;

import java.io.IOException;

/**
 * run this file to generate a large text file
 */
public class GenerateLargeFile {
  public static void main(String [] args) throws IOException {
    new RandomFileGenerator("large.txt", 10_000_000).generate();
  }
}
