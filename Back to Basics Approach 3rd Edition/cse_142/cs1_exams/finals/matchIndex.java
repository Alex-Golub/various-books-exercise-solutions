package cse_142.cs1_exams.finals;

import java.util.Scanner;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/exams/finals/final9/matchIndex
 *
 * @author Alex Golub
 * @since 15-Apr-21 2:24 PM
 */
class matchIndex {
  public static void main(String[] args) {
    String data = "The quick brown fox\n" +
                  "Those achy down socks\n" +
                  "Wheels on the school bus go round\n" +
                  "The wipers go swish swish swish\n" +
                  "His name is Robert Paulson\n" +
                  "So long 'n thanks for all the fish\n" +
                  "Humpty Dumpty sat on a wall\n" +
                  "And then he also had a great fall\n" +
                  "booyakasha\n" +
                  "Bruno Ali G Borat";
    matchIndex(new Scanner(data));
  }

  // assert: file contains an even number of lines.
  public static void matchIndex(Scanner data) {
    int line = 1;
    while (data.hasNextLine()) {
      String firstLine = data.nextLine();
      String secondLine = data.nextLine();

      System.out.print("lines " + line + " and " + (line + 1) + ":");
      line += 2;
      boolean matched = false;

      for (int i = 0; i < Math.min(firstLine.length(), secondLine.length()); i++) {
        if (firstLine.charAt(i) == secondLine.charAt(i)) {
          System.out.print(" " + i);
          matched = true;
        }
      }

      if (!matched) {
        System.out.print(" none");
      }

      System.out.println();
    }
  }
}
