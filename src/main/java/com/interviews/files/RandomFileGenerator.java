package com.interviews.files;

import org.kohsuke.randname.RandomNameGenerator;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

class RandomFileGenerator {
  private static  File root = new File("./data");
  private final String fileName;
  private final int lines;

  RandomFileGenerator(String fileName, int lineCount) {
    this.fileName = fileName;
    this.lines = lineCount;
  }

  void generate() throws IOException {
    Path fullPath = new File(root, fileName).toPath();

    RandomNameGenerator rng = new RandomNameGenerator(0);

    try (BufferedWriter bw = Files.newBufferedWriter(fullPath)) {
      for (int i = 0; i < lines; ++i) {
        String line = String.format("%s %s%n", rng.next(), rng.next());
        bw.write(line);
      }
    }
  }
}
