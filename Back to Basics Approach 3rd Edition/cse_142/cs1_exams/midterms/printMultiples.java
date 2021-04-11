package cse_142.cs1_exams.midterms;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/exams/midterms/midterm2/printMultiples
 *
 * test #1:printMultiples(3, 5);
 * console output:
 * The first 5 multiples of 3 are 3, 6, 9, 12, 15
 * result: pass
 *
 * test #2:printMultiples(7, 3);
 * console output:
 * The first 3 multiples of 7 are 7, 14, 21
 * result: pass
 *
 * test #3:printMultiples(4, 1);
 * console output:
 * The first 1 multiples of 4 are 4
 * result: pass
 *
 * test #4:printMultiples(1, 4);
 * console output:
 * The first 4 multiples of 1 are 1, 2, 3, 4
 * result: pass
 *
 * test #5:printMultiples(8, 4);
 * console output:
 * The first 4 multiples of 8 are 8, 16, 24, 32
 * result: pass
 *
 * @author Alex Golub
 * @since 08-Apr-21 8:52 PM
 */
class printMultiples {
  public static void main(String[] args) {
    printMultiples(3, 5);
  }

  /**
   * prints a complete line of output reporting the first m multiples of n.
   * assume that the number of multiples you will be asked to generate is
   * greater than or equal to 1.
   */
  public static void printMultiples(int n, int m) {
    System.out.printf("The first %d multiples of %d are %d", m, n, n);
    for (int i = 2; i <= m; i++) {
      System.out.print(", " + n * i);
    }
  }
}
