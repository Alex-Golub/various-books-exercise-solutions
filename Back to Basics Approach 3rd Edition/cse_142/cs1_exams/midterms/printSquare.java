package cse_142.cs1_exams.midterms;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/exams/midterms/midterm9/printSquare
 *
 * You may assume the caller of the method will pass a min and a max
 * parameter such that min is less than or equal to max.
 *
 * test #2:printSquare(3, 9);
 * console output:
 * 3456789
 * 4567893
 * 5678934
 * 6789345
 * 7893456
 * 8934567
 * 9345678
 *
 * @author Alex Golub
 * @since 11-Apr-21 6:30 PM
 */
class printSquare {
  public static void printSquare(int min, int max) {
    for (int i = 0; i < max - min + 1; i++) {
      for (int j = min + i; j <= max; j++)
        System.out.print(j);

      for (int j = min; j < min + i; j++)
        System.out.print(j);

      System.out.println();
    }
  }
}