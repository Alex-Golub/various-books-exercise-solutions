package cse_142.cs1_sections.section06_file_processing;

import java.util.Scanner;

/**
 * https://practiceit.cs.washington.edu/problem/view/3854?categoryid=119
 *
 * Determine whether the sum starting from the first number is ever negative.
 * The method should print a message indicating whether a negative sum is
 * possible and should return true if a negative sum can be reached and
 * false if not.
 *
 * 38 4 19 -27 -15 -3 4 19 38
 * console output:
 * no negative sum
 * return:false
 *
 * 14 7 -10 9 -18 -10 17 42 98
 * console output:
 * -8 after 6 steps
 * return:true
 *
 * -1
 * console output:
 * -1 after 1 steps
 * return:true
 *
 * @author Alex Golub
 * @since 04-Apr-21 11:08 AM
 */
class negativeSum {
  public static boolean negativeSum(Scanner input) {
    int sum = 0;
    for (int step = 1; input.hasNextInt(); step++) {
      sum += input.nextInt();
      if (sum < 0) {
        System.out.printf("%d after %d steps\n", sum, step);
        return true;
      }
    }
    System.out.println("no negative sum");
    return false;
  }
}
