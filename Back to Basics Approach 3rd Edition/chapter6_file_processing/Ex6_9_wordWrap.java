package chapter6_file_processing;

import java.util.Scanner;

/**
 * 9. Write a method called wordWrap that accepts a Scanner
 * representing an input file as its parameter and outputs each
 * line of the file to the console, word-wrapping all lines that
 * are longer than 60 characters.
 *
 * @author Mr.Dr.Professor
 * @since 30-Dec-20 11:17 AM
 */
class Ex6_9_wordWrap {
  public static void main(String[] args) {
    String test = "This line is exactly sixty characters long; how interesting!";
    wordWrap(new Scanner(test));
  }

  public static void wordWrap(Scanner input) {
    final int WRAP_AT = 60;

    while (input.hasNextLine()) {
      String line = input.nextLine();
      while (line.length() > WRAP_AT) {
        System.out.println(line.substring(0, WRAP_AT));
        line = line.substring(WRAP_AT);
      }

      // print reminder characters
      System.out.println(line);
    }
  }
}
