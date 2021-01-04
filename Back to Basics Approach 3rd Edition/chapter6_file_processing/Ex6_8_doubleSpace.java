package chapter6_file_processing;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * 8. Write a method called doubleSpace that accepts a Scanner
 * for an input file and a PrintStream for an output file
 * as its parameters, writing into the output file a
 * double-spaced version of the text in the input file.
 * You can achieve this task by inserting a blank line
 * between each line of output.
 *
 * f("a b c") => "a  b  c"
 *
 * @author Mr.Dr.Professor
 * @since 29-Dec-20 11:52 PM
 */
class Ex6_8_doubleSpace {
  public static void main(String[] args) throws FileNotFoundException {
    String test = "hello there\nhow are you\n\nI am fine";
    doubleSpace(new Scanner(test),
            new PrintStream("double_spaced.txt"));
  }

  public static void doubleSpace(Scanner input, PrintStream output) {
    while (input.hasNextLine())
      output.println(input.nextLine() + "\n");
  }
}
