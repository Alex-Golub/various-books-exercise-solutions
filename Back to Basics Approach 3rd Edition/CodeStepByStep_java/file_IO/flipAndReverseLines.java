package CodeStepByStep_java.file_IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * https://www.codestepbystep.com/problem/view/java/fileio/flipAndReverseLines
 *
 * 1. Successive pairs of lines (A, B) should be printed in reversed
 *    in order (B, A).
 *
 * 2. Lines should be printed with alternating capitalization.
 *    The first line printed should be entirely in uppercase;
 *    the second entirely in lowercase;
 *    the third in uppercase;
 *    the fourth in lowercase;
 *    and so on.
 *
 * 3. Every line's characters should be printed in reversed order.
 *    For example, the line "hi there" should be printed as "ereht ih".
 *    (Note that Java and our libraries do not include a built-in method to
 *    reverse a string.)
 *
 * Notice the alternation between all-uppercase and all-lowercase.
 * Also note that a line can be blank, as in the third pair.
 * An input file can have an odd number of lines, as in the one above,
 * in which case the last line is printed in its original position.
 * You should not make any assumptions about how many lines are in the file.
 *
 * Constraints:
 * Your solution should read the file only once, not make multiple passes over
 * the file data.
 * Do not use any collections (ArrayList, TreeMap, array), etc.
 * You may use strings and simple variables.
 *
 * @author Mr.Dr.Professor
 * @since 11-Mar-21 9:50 PM
 */
/*public*/ class flipAndReverseLines {
  public static void main(String[] args) throws FileNotFoundException {
    flipAndReverseLines();
  }

  public static int flipAndReverseLines() throws FileNotFoundException {
    Scanner fileReader = new Scanner(new File(promptForFile()));
    int totalLines = 0;

    System.out.println();
    while (fileReader.hasNextLine()) {
      String firstLine = fileReader.nextLine();
      String secondLine = "";
      totalLines++;

      // check if there is a 2nd line
      if (fileReader.hasNextLine()) {
        secondLine = fileReader.nextLine();
        totalLines++;
      }

      if (!secondLine.isEmpty()) {
        System.out.println(reverse(secondLine.toUpperCase()));
        System.out.println(reverse(firstLine.toLowerCase()));
      } else {
        System.out.println(reverse(firstLine.toUpperCase()));
      }
    }

    return totalLines;
  }

  private static String reverse(String s) {
    return new StringBuilder(s).reverse().toString();
  }

  private static String promptForFile() {
    String fileName;
    Scanner console = new Scanner(System.in);

    while (true) {
      System.out.print("Input file name? ");
      fileName = console.nextLine();

      if (new File(fileName).canRead()) {
        break;
      }

      System.out.println("Unable to open that file.  Try again.");
    }

    return fileName;
  }
}
