package chapter6_file_processing;

import java.util.Scanner;

/**
 * 7. Write a method called flipLines that accepts a Scanner
 * for an input file and writes to the console the same file’s
 * contents with each pair of lines reversed in order.
 * If the file contains an odd number of lines, leave the last line
 * unmodified.
 *
 * @author Mr.Dr.Professor
 * @since 29-Dec-20 11:42 PM
 */
class Ex6_7_flipLines {
  public static void main(String[] args) {
    String test  = "1\n2\n3\n4\n";
    String test2 = "1\n2\n3\n4\n5\n";
    flipLines(new Scanner(test2));
  }

  public static void flipLines(Scanner input) {
    while (input.hasNextLine()) {
      String line1 = input.nextLine();
      if (input.hasNextLine())
        System.out.println(input.nextLine());

      System.out.println(line1);
    }
  }

}
