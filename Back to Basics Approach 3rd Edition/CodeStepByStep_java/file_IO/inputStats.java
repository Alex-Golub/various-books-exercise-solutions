package CodeStepByStep_java.file_IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * https://www.codestepbystep.com/problem/view/java/fileio/inputStats
 *
 * If the input file does not exist or is not readable,
 * your method should print no output.
 * If the file does exist, you may assume that the file contains at
 * least 1 line of input.
 *
 * Beware the Jabberwock, my son,
 * the jaws that bite, the claws that catch,
 *
 * Beware the JubJub bird and shun
 * the frumious bandersnatch.
 *
 * Line 1 has 30 chars
 * Line 2 has 41 chars
 * Line 3 has 0 chars
 * Line 4 has 31 chars
 * Line 5 has 26 chars
 * 5 lines; longest = 41, average = 25.6
 *
 * @author Mr.Dr.Professor
 * @since 11-Mar-21 10:47 PM
 */
/*public*/ class inputStats {
  public static void main(String[] args) throws FileNotFoundException {
    String mockData = "Beware the Jabberwock, my son,\n" +
                      "the jaws that bite, the claws that catch,\n" +
                      "\n" +
                      "Beware the JubJub bird and shun\n" +
                      "the frumious bandersnatch.";
    inputStats(mockData);
  }

  public static void inputStats(String fileName) throws FileNotFoundException {
    File file = new File(fileName);
    if (!file.exists() || !file.canRead()) {
      return;
    }

    Scanner lineReader = new Scanner(file);
//    Scanner lineReader = new Scanner(fileName);
    int lines = 0;
    int longest = 0;
    int totalNumberOfCharacters = 0;

    while (lineReader.hasNextLine()) {
      lines++;
      int numberOfCharacters = lineReader.nextLine().length();
      longest = Math.max(longest, numberOfCharacters);
      totalNumberOfCharacters += numberOfCharacters;

      System.out.printf("Line %d has %d chars\n",
                        lines, numberOfCharacters);
    }

    System.out.printf("%d lines; longest = %d, average = %.1f",
                      lines, longest,
                      1.0 * totalNumberOfCharacters / lines);
  }
}
