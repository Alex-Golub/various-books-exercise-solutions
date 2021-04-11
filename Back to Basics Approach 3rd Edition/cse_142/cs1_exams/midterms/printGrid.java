package cse_142.cs1_exams.midterms;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/exams/midterms/midterm3/printGrid
 *
 * test #1:printGrid(3, 6);
 * console output:
 * 1, 4, 7, 10, 13, 16
 * 2, 5, 8, 11, 14, 17
 * 3, 6, 9, 12, 15, 18
 * result: pass
 *
 * test #2:printGrid(5, 3);
 * console output:
 * 1, 6, 11
 * 2, 7, 12
 * 3, 8, 13
 * 4, 9, 14
 * 5, 10, 15
 * result: pass
 *
 * test #3:printGrid(4, 1);
 * console output:
 * 1
 * 2
 * 3
 * 4
 * result: pass
 *
 * test #4:printGrid(1, 3);
 * console output:
 * 1, 2, 3
 * result: pass
 *
 * @author Alex Golub
 * @since 10-Apr-21 12:05 PM
 */
class printGrid {
  public static void main(String[] args) {
    printGrid(3, 6);
  }

  public static void printGrid(int rows, int cols) {
    for (int i = 1; i <= rows; i++) {
      System.out.print(i);

      for (int j = i + rows; j <= rows * cols; j += rows) {
        System.out.print(", " + j);
      }

      System.out.println();
    }
  }
}
