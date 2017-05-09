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

  void writeRandomFile(String fileName, int lines) throws IOException {
    // root.mkdirs();
    Path fullPath = Paths.get("./data", fileName);

    RandomNameGenerator rng = new RandomNameGenerator(0);

    try (BufferedWriter bw = Files.newBufferedWriter(fullPath)) {
      for (int i = 0; i < lines; ++i) {
        String line = String.format("%s %s%n", rng.next(), rng.next());
        bw.write(line);
      }
    }
  }
}
