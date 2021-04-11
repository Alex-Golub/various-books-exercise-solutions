package cse_142.cs1_exams.midterms;

import java.util.Random;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/exams/midterms/midterm2/threeHeads
 *
 * test #1:test1
 * console output:
 * H H H
 * Three heads in a row!
 * result: pass
 *
 * test #2:test2
 * console output:
 * H T T H T H T T T H H T T T T T T T T T T H T T H H H
 * Three heads in a row!
 * result: pass
 *
 * test #3:test3
 * console output:
 * T T T T T T T H T H T H H H
 * Three heads in a row!
 * result: pass
 *
 * test #4:test4
 * console output:
 * H H H
 * Three heads in a row!
 * result: pass
 *
 * @author Alex Golub
 * @since 08-Apr-21 9:14 PM
 */
class threeHeads {
  public static void main(String[] args) {
    threeHeads();
  }

  public static void threeHeads() {
    Random random = new Random();
    int count = 0;

    char flip = random.nextBoolean() ? 'H' : 'T';
    System.out.print(flip);
    if (flip == 'H') {
      count++;
    }

    while (count < 3) {
      flip = random.nextBoolean() ? 'H' : 'T';

      if (flip == 'H') {
        count++;
      } else {
        count = 0;
      }

      System.out.print(" " + flip);
    }

    System.out.println("\nThree heads in a row!");
  }
}
