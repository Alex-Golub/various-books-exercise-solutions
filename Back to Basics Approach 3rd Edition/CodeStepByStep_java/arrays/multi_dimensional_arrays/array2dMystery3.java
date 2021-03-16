package CodeStepByStep_java.arrays.multi_dimensional_arrays;

import java.util.Arrays;

/**
 * int[][] a1 = {{3, 4, 5, 6}, {4, 2, 6, 1}, {1, 6, 7, 2}};
 *    4, 5, 6, 6, 4, 6, 7, 1, 1, 6, 7, 2
 * int[][] a2 = {{1, 2, 3, 0, 5}, {2, 4, 6, 8, 10}, {9, 5, 1, 2, 4}};
 *    2, 3, 6, 5, 5, 4, 6, 8, 10, 10, 9, 5, 1, 2, 4
 *
 * Method is shifting element to left if the right one is greater then
 * current one otherwise comparing with the element in next row bellow
 * the current element if that element is greater then current assign
 * it to current element position
 *
 * @author Mr.Dr.Professor
 * @since 20-Feb-21 4:01 PM
 */
class array2dMystery3 {
  public static void main(String[] args) {
    int[][] a1 = {{3, 4, 5, 6}, {4, 2, 6, 1}, {1, 6, 7, 2}};
    int[][] a2 = {{1, 2, 3, 0, 5}, {2, 4, 6, 8, 10}, {9, 5, 1, 2, 4}};

    array2dMystery3(a1);
    array2dMystery3(a2);

//    before running program try to answer with pen-and-paper
//    print2D(a1);
//    System.out.println();
//    print2D(a2);
  }

  private static void print2D(int[][] a) {
    for (int[] row : a) {
      System.out.println(Arrays.toString(row));
    }
  }

  public static void array2dMystery3(int[][] a) {
    for (int r = 0; r < a.length - 1; r++) {
      for (int c = 0; c < a[r].length - 1; c++) {
        if (a[r][c + 1] > a[r][c]) {
          a[r][c] = a[r][c + 1];
        } else if (a[r + 1][c] > a[r][c]) {
          a[r][c] = a[r + 1][c];
        }
      }
    }
  }
}
