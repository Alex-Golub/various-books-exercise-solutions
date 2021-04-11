package cse_142.cs1_exams.midterms;

import java.util.Random;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/exams/midterms/midterm5/printTwoDigit
 * https://practiceit.cs.washington.edu/problem/view/cs1/exams/midterms/midterm7/printTwoDigit
 *
 * You may assume the integer value passed to your method is greater
 * than or equal to 0.
 *
 * test #1:printTwoDigit(new Random(15, 63, 50, 69), 4);
 * console output:
 * next = 29
 * next = 63
 * next = 13
 * next = 72
 * no 42 was seen.
 * result: pass
 *
 * test #2:printTwoDigit(new Random(21, 32, 34, 87, 62, 58), 6);
 * console output:
 * next = 57
 * next = 68
 * next = 82
 * next = 12
 * next = 12
 * next = 73
 * no 42 was seen.
 * result: pass
 *
 * test #3:printTwoDigit(new Random(52, 18, 38, 0, 57, 29, 40, 5), 7);
 * console output:
 * next = 98
 * next = 80
 * next = 29
 * next = 85
 * next = 79
 * next = 21
 * next = 52
 * no 42 was seen.
 * result: pass
 *
 * @author Alex Golub
 * @since 10-Apr-21 1:59 PM
 */
class printTwoDigit {
  public static void main(String[] args) {
    printTwoDigit(new Random(), 10);
  }

  public static void printTwoDigit(Random random, int times) {
    boolean seen = false;
    for (int i = 1; i <= times; i++) {
      int next = random.nextInt(90) + 10;
      if (next == 42) {
        seen = true;
      }

      System.out.println("next = " + next);
    }

    if (seen) {
      System.out.println("we saw a 42!");
    } else {
      System.out.println("no 42 was seen.");
    }
  }
}
