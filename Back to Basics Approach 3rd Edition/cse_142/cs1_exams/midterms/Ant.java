package cse_142.cs1_exams.midterms;

import java.util.Random;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/exams/midterms/midterm8/Ant
 *
 * test #2:test2
 * console output:
 * number of falls: 0
 * result: pass
 *
 * @author Alex Golub
 * @since 11-Apr-21 5:27 PM
 */
class Ant {
  public static void main(String[] args) {
    ant();
  }

  public static void ant() {
    Random random = new Random();
    int falls = 0;
    int steps = 0;
    while (steps < 6) {
      if (random.nextInt(2) == 0) {
        falls++;
        steps = 0;
      } else {
        steps++;
      }
    }

    System.out.println("number of falls: " + falls);
  }
}
