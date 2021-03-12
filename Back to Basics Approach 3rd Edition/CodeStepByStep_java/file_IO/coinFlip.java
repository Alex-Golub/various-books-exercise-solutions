package CodeStepByStep_java.file_IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * https://www.codestepbystep.com/problem/view/java/fileio/coinFlip
 *
 * You should read the sequence of coin flips and output to the console the
 * number of heads and the percentage of heads in that line, rounded to the
 * nearest whole number.
 *
 * If this percentage is 50% or greater, you should print a "You win!" message;
 * otherwise, print "You lose!".
 *
 * You may assume that the file contains at least 1 token of input,
 * and that no tokens other than heads/tails or H/T will be in the lines.
 * You may assume that the input file exists and is readable.
 *
 * Constraints:
 * Your solution should read the file only once, not make multiple passes over the file data.
 *
 * input:
 * H  T H  H    T
 * Tails taIlS   tAILs TailS heads   HEAds
 *    hEadS
 *
 * output:
 * 6 heads (50%)
 * You win!
 *
 * @author Mr.Dr.Professor
 * @since 10-Mar-21 11:52 PM
 */
/*public*/ class coinFlip {
  public static void coinFlip(String fileName) throws FileNotFoundException {
    File file = new File(fileName);
    if (!file.canRead()) {
      return;
    }

    int totalFlipCount = 0, headsCount = 0;
    Scanner fileReader = new Scanner(file);

    while (fileReader.hasNextLine()) {
      Scanner tokenReader = new Scanner(fileReader.nextLine());

      while (tokenReader.hasNext()) {
        char token = tokenReader.next().charAt(0);
        if (token == 'H' || token == 'h') {
          headsCount++;
        }

        totalFlipCount++;
      }
    }

    double headsAverage = 100.0 * headsCount / totalFlipCount;
    System.out.printf("%d heads (%d%%)\n", headsCount, Math.round(headsAverage));
    System.out.printf("You %s!\n", headsAverage >= 50 ? "win" : "lose");
  }
}
