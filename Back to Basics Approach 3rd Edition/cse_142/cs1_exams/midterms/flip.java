package cse_142.cs1_exams.midterms;

import java.util.Random;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/exams/midterms/midterm14/flip
 * method should stop flipping when you see three heads in a row.
 *
 * @author Alex Golub
 * @since 11-Apr-21 9:19 PM
 */
class flip {
  public static void flip(Random random) {
    int flips = 0;
    int headsCount = 0;

    while (headsCount < 3) {
      char outcome = random.nextBoolean() ? 'H' : 'T';

      if (outcome == 'H') {
        headsCount++;
      } else {
        headsCount = 0;
      }

      System.out.println(outcome == 'H' ? "heads" : "tails");
      flips++;
    }

    System.out.println(3 + " heads in a row after " + flips + " flips");
  }
}
