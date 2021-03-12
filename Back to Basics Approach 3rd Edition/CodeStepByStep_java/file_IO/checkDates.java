package CodeStepByStep_java.file_IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * https://www.codestepbystep.com/problem/view/java/fileio/checkDates
 *
 * Your method should read the contents of this file and check to see which
 * pairs of dates are at least one month apart from each other.
 *
 * Assume that all parameters passed are valid (i.e., the month will be between
 * 1 and 12, and the day will be between 1 and the number of days in that month).
 *
 * Assume that this is a non-leap year and do not worry about leap years
 * for this problem.
 *
 * Note that the first date could come before or after (or be the same as)
 * the second date.
 *
 * file input:
 * dates1.txt:
 * 6 14 9 21
 * 4 5 5 15
 * 4 15 5 15
 * 4 16 5 15
 * 6 14 6 8
 * 7 7 6 8
 * 7 8 6 8
 * 10 14 7 15
 * 2 14 3 15
 * 1 1 12 31
 *
 * console output:
 * 6/14 and 9/21 differ by one full month or more!
 * 4/5 and 5/15 differ by one full month or more!
 * 4/15 and 5/15 differ by one full month or more!
 * 4/16 and 5/15 are within one month of each other.
 * 6/14 and 6/8 are within one month of each other.
 * 7/7 and 6/8 are within one month of each other.
 * 7/8 and 6/8 differ by one full month or more!
 * 10/14 and 7/15 differ by one full month or more!
 * 2/14 and 3/15 differ by one full month or more!
 * 1/1 and 12/31 differ by one full month or more!
 *
 * @author Mr.Dr.Professor
 * @since 10-Mar-21 9:46 PM
 */
/*public*/ class checkDates {
  public static void main(String[] args) throws FileNotFoundException {
    String dates = "6 14 9 21\n" +
                   "4 5 5 15\n" +
                   "4 15 5 15\n" +
                   "4 16 5 15\n" +
                   "6 14 6 8 \n" +
                   "7 7 6 8 \n" +
                   "7 8 6 8 \n" +
                   "10 14 7 15 \n" +
                   "2 14 3 15 \n" +
                   "1 1 12 31";
    checkDates(dates);
  }

  public static void checkDates(String fileName) throws FileNotFoundException {
    File file = new File(fileName);
    if (!file.exists()) {
      return;
    }

    Scanner lineReader = new Scanner(file);
    while (lineReader.hasNextLine()) {
      String line = lineReader.nextLine();

      Scanner tokenReader = new Scanner(line);
      int m1 = tokenReader.nextInt();
      int d1 = tokenReader.nextInt();
      int m2 = tokenReader.nextInt();
      int d2 = tokenReader.nextInt();

      if (Math.abs(m1 - m2) < 1 ||
          (m2 - m1 == 1 && d2 < d1) ||
          (m1 - m2 == 1 && d2 > d1)) {
        System.out.printf("%d/%d and %d/%d are within one month of each other.\n",
                          m1, d1, m2, d2);
      } else {
        System.out.printf("%d/%d and %d/%d differ by one full month or more!\n",
                          m1, d1, m2, d2);
      }
    }
  }
}
