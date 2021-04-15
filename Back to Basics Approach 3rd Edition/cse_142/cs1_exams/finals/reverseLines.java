package cse_142.cs1_exams.finals;

import java.util.Scanner;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/exams/finals/final1/reverseLines
 *
 * @author Alex Golub
 * @since 12-Apr-21 5:39 PM
 */
class reverseLines {
  public static void main(String[] args) {
    String data = "If this method works properly,\n" +
                  "the lines of text in this file\n" +
                  "will be reversed.\n" +
                  "\n" +
                  "Remember that some lines might be blank.";
    reverseLines(new Scanner(data));
  }

  public static void reverseLines(Scanner lines) {
    StringBuilder sb = new StringBuilder();
    while (lines.hasNextLine()) {
      System.out.println(sb.replace(0, sb.length(),
                                    lines.nextLine()).reverse());
    }
  }
}
