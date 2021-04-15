package cse_142.cs1_exams.finals;

import java.util.Scanner;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/exams/finals/final1/printStrings
 *
 * You may assume that the input values always come in pairs with an integer
 * followed by a String (which itself could be numeric, such as "25" above).
 *
 * test #3:6 fun. 3 hello  10   <> 2      25   4 wow!
 * console output:
 * fun.fun.fun.fun.fun.fun.
 * hellohellohello
 * <><><><><><><><><><>
 * 2525
 * wow!wow!wow!wow!
 * result: pass
 *
 * @author Alex Golub
 * @since 12-Apr-21 5:34 PM
 */
class printStrings {
  public static void main(String[] args) {
    printStrings(new Scanner("6 fun. 3 hello  10   <> 2      25   4 wow!"));
  }

  public static void printStrings(Scanner data) {
    while (data.hasNext()) {
      int times = data.nextInt();
      String word = data.next();

      for (int i = 0; i < times; i++) {
        System.out.print(word);
      }

      System.out.println();
    }
  }
}
