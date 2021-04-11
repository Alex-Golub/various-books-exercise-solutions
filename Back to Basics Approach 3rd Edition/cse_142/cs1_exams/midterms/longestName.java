package cse_142.cs1_exams.midterms;

import java.util.Scanner;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/exams/midterms/midterm10/longestName
 *
 * test #1:longestName(new Scanner("roy\nDANE\nErik\nsTeFaNiE\nLaurA\n"), 5);
 * console output:
 * name #1? roy
 * name #2? DANE
 * name #3? Erik
 * name #4? sTeFaNiE
 * name #5? LaurA
 * Stefanie's name is longest
 *
 * @author Alex Golub
 * @since 11-Apr-21 7:37 PM
 */
class longestName {
  public static void longestName(Scanner scanner, int n) {
    boolean tie = false;
    String longest = "";
    for (int i = 1; i <= n; i++) {
      System.out.print("name #" + i + "? ");
      String current = scanner.next();

      if (current.length() > longest.length()) {
        longest = current;
        tie = false;
      } else if (current.length() == longest.length()) {
        tie = true;
      }
    }

    System.out.println(Character.toUpperCase(longest.charAt(0)) +
                       longest.substring(1).toLowerCase() +
                       "'s name is longest");
    if (tie) {
      System.out.println("(There was a tie!)");
    }
  }
}
