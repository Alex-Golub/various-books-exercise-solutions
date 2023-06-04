package chapter_12_exception_handling_and_text_io;

import java.io.PrintWriter;

public class WriteDataWithAutoClose {
  public static void main(String[] args) throws Exception {
    var file = new java.io.File("scores.txt");
    if (file.exists()) {
      System.out.println("File already exists");
      System.exit(0);
    }

    try (PrintWriter output = new java.io.PrintWriter(file)) {
      // Write formatted output to the file
      output.print("John T Smith ");
      output.println(90);
      output.print("Eric K Jones ");
      output.println(85);
    }
  }
}
