package cse_142.cs1_exams.finals;

import java.util.Scanner;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/exams/finals/final2/wordStats
 *
 * test #2:"To be or not to be, that is the question."
 * console output:
 * Total words    = 10
 * Average length = 3.2
 * result: pass
 *
 * @author Alex Golub
 * @since 12-Apr-21 7:17 PM
 */
class wordStats {
  public static void main(String[] args) {
    wordStats(new Scanner("To be or not to be, that is the question.\n"));
  }

  public static void wordStats(Scanner input) {
    int words = 0;
    int chars = 0;
    while (input.hasNext()) {
      String word = input.next();
      words++;
      chars += word.length();
    }

    System.out.println("Total words    = " + words);
    System.out.println("Average length = " + 1.0 * chars / words);
  }
}
