package cse_142.cs1_exams.finals;

import java.util.Scanner;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/exams/finals/final3/findFirstMatch
 *
 * @author Alex Golub
 * @since 12-Apr-21 9:13 PM
 */
class findFirstMatch {
  public static int findFirstMatch(Scanner file, String[] keywords) {
    int row = 0;
    while (file.hasNextLine()) {
      row++;
      String[] words = file.nextLine().split(" ");
      for (String word : words) {
        for (String keyword : keywords) {
          if (word.equalsIgnoreCase(keyword)) {
            return row;
          }
        }
      }

    }

    return -1;
  }
}
