package cse_142.cs1_exams.midterms;

import java.util.Random;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/exams/midterms/midterm11/lucky
 *
 * test #5:lucky(1);
 * console output:
 * 5 2 4 5 1 3 2 1 1 6 5 6 2 3 1 1 1 4 3 6 1 1 1 1
 * Finished after 24 rolls.
 *
 * @author Alex Golub
 * @since 11-Apr-21 8:07 PM
 */
class lucky {
  public static void main(String[] args) {
    lucky(3);
  }

  /** four consecutive rolls in a row that have values of min or less. */
  public static void lucky(int min) {
    Random random = new Random();
    int rolls = 0;
    int count = 0;

    while (count < 4) {
      int roll = random.nextInt(6) + 1;
      rolls++;

      if (roll <= min) {
        count++;
      } else {
        count = 0;
      }

      System.out.print(roll + " "); // fencepost not considered
    }

    System.out.println("\nFinished after " + rolls + " rolls.");
  }
}
