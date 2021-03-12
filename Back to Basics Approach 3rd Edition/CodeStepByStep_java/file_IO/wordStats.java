package CodeStepByStep_java.file_IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * https://www.codestepbystep.com/problem/view/java/fileio/wordStats
 *
 * You should report the total number of words (as an integer),
 * the average word length (as an un-rounded real number),
 * and the number of unique letters used from A-Z, case-insensitively.
 *
 * Assumptions: You may assume that the input file exists and is readable.
 * Constraints: Your solution should read the file only once, not make multiple
 * passes over the file data.
 *
 * file input: wordStats-test2-data.txt:
 * Teenage Mutant Ninja Turtles,
 * Teenage Mutant Ninja Turtles,
 * Teenage Mutant Ninja Turtles,
 * Heroes in a half shell: turtle power!
 * END
 *
 * console output:
 * Total words    = 20
 * Average length = 5.6
 * Unique letters = 18
 *
 * @author Mr.Dr.Professor
 * @since 12-Mar-21 10:08 PM
 */
/*public*/ class wordStats {
  public static void main(String[] args) throws FileNotFoundException {
    String mockData = "To be  or not  TO BE,    THAT IS   the question.";
    wordStats(mockData);
  }

  public static void wordStats(String fileName) throws FileNotFoundException {
    Scanner fileReader = new Scanner(new File(fileName));
//    Scanner fileReader = new Scanner(fileName);
    int words = 0;
    StringBuilder allContent = new StringBuilder();

    while (fileReader.hasNext()) {
      String word = fileReader.next().toLowerCase();
      allContent.append(word);
      words++;
    }

    System.out.printf("Total words    = %d\n", words);
    System.out.printf("Average length = %.1f\n", 1.0 * allContent.length() / words);
    System.out.printf("Unique letters = %d\n", uniqueLetters(allContent));
  }

  private static int uniqueLetters(StringBuilder content) {
    boolean[] toggles = new boolean[26];
    for (int i = 0; i < content.length(); i++) {
      char c = content.charAt(i);
      if (c >= 'a' && c <= 'z') {
        toggles[c - 'a'] = true;
      }
    }

    int uniqueLetters = 0;
    for (boolean b : toggles) {
      uniqueLetters += b ? 1 : 0;
    }

    return uniqueLetters;
  }
}
