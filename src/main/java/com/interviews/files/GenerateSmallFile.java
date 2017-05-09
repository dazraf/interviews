package com.interviews.files;

import java.io.IOException;

/**
 * This class creates a small file for the purposes of the interview question
 */
public class GenerateSmallFile {
  public static void main(String [] args) throws IOException {
    new RandomFileGenerator("small.txt", 30).generate();
  }
}
