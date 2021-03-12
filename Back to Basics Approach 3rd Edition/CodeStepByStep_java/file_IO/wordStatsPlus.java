package CodeStepByStep_java.file_IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * https://www.codestepbystep.com/problem/view/java/fileio/wordStatsPlus
 *
 * file input: wordStatsPlus-test1-data.txt:
 * To be  or not  TO BE,
 *  THAT  IS
 *
 * really   the  question.
 *
 * console output:
 * Total lines = 4
 * Total words = 11
 * Total unique letters = 14 (53% of alphabet)
 * Average words/line = 2.75
 * Average word length = 3.5
 *
 * @author Mr.Dr.Professor
 * @since 12-Mar-21 10:28 PM
 */
/*public*/ class wordStatsPlus {
  public static void main(String[] args) throws FileNotFoundException {
    String mockData = "To be  or not  TO BE,  \n" +
                      " THAT  IS  \n" +
                      "\n" +
                      "really   the  question.";
    wordStatsPlus(mockData);
  }

  public static void wordStatsPlus(String fileName) throws FileNotFoundException {
    Scanner fileReader = new Scanner(new File(fileName));
//    Scanner fileReader = new Scanner(fileName);
    int lines = 0;
    int words = 0;
    StringBuilder fileContent = new StringBuilder();

    while (fileReader.hasNextLine()) {
      lines++;
      Scanner tokenReader = new Scanner(fileReader.nextLine());

      while (tokenReader.hasNext()) {
        words++;
        fileContent.append(tokenReader.next().toLowerCase());
      }
    }

    System.out.printf("Total lines = %d\n", lines);
    System.out.printf("Total words = %d\n", words);

    int uniqueLetters = uniqueLetters(fileContent);
    System.out.printf("Total unique letters = %d (%d%% of alphabet)\n",
                      uniqueLetters, 100 * uniqueLetters / 26);
    System.out.println("Average words/line = " + 1.0 * words / lines);
    System.out.printf("Average word length = %.1f\n",
                      1.0 * fileContent.length() / words);
  }

  private static int uniqueLetters(StringBuilder str) {
    boolean[] toggle = new boolean[26];

    for (int i = 0; i < str.length(); i++) {
      char c = str.charAt(i);
      if (c >= 'a' && c <= 'z') {
        toggle[c - 'a'] = true;
      }
    }

    int uniqueCount = 0;
    for (boolean b : toggle) {
      uniqueCount += b ? 1 : 0;
    }

    return uniqueCount;
  }
}
