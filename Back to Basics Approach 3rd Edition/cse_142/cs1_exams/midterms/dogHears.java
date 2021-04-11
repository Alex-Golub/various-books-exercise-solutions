package cse_142.cs1_exams.midterms;

import java.util.Random;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/exams/midterms/midterm12/dogHears
 *
 * @author Alex Golub
 * @since 11-Apr-21 8:22 PM
 */
class dogHears {
  public static void main(String[] args) {
    dogHears("MrDr", 7);
  }

  public static void dogHears(String name, int lines) {
    if (lines <= 0)
      return;

    Random random = new Random();
    for (int i = 0; i < lines; i++) {
      int words = random.nextInt(9) + 2;

      System.out.print(random.nextDouble() <= 0.25 ? name : "blah");
      for (int j = 1; j < words; j++) {
        System.out.print(" " + (random.nextDouble() <= 0.25 ? name : "blah"));
      }
      System.out.println();
    }
  }
}
