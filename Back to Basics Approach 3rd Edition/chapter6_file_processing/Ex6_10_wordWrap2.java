package chapter6_file_processing;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * 10. Modify the preceding wordWrap method so that it outputs
 * the newly wrapped text back into the original file.
 * (Be careful—don’t output into a file while you are reading it!)
 * Also, modify it to use a class constant for the maximum
 * line length rather than hard-coding 60.
 *
 * @author Mr.Dr.Professor
 * @since 30-Dec-20 12:01 PM
 */
class Ex6_10_wordWrap2 {
  public static void main(String[] args) throws FileNotFoundException {
    Scanner     input  = new Scanner(new File("input.txt"));
    PrintStream output = new PrintStream("wrapped_text.txt");
    wordWrap2(input, output);
  }

  public static void wordWrap2(Scanner input, PrintStream output) {
    final int     WRAP_AT = 60;
    StringBuilder wrapped = new StringBuilder();

    while (input.hasNextLine()) {
      String line = input.nextLine();
      while (line.length() > WRAP_AT) {
        wrapped.append(line, 0, WRAP_AT).append("\n");
        line = line.substring(WRAP_AT);
      }
      wrapped.append(line).append("\n");
    }

    output.print(wrapped);
  }
}
