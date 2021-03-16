package CodeStepByStep_java.arrays.multi_dimensional_arrays;

import java.util.Arrays;

/**
 * int[][] a1 = {{2, 1, 6}, {5, 8, 9}, {1, -5, -4}};
 *    2, 8, 6, 5, 14, 9, 1, -3, -4
 * int[][] a2 = {{1, 2, 3, 4, 5}, {2, 4, 6, 8, 10}, {0, 1, 2, 3, 4}};
 *    1, 11, 10, 8, 5, 2, 22, 20, 16, 10, 0, 7, 7, 6, 4
 *
 * Sum two adjacent elements from left and right and assign sum into
 * middle element starting from one before the end till one after start
 *
 * @author Mr.Dr.Professor
 * @since 20-Feb-21 3:50 PM
 */
class array2dMystery2 {
  public static void main(String[] args) {
    int[][] a1 = {{2, 1, 6}, {5, 8, 9}, {1, -5, -4}};
    int[][] a2 = {{1, 2, 3, 4, 5}, {2, 4, 6, 8, 10}, {0, 1, 2, 3, 4}};

    array2dMystery2(a1);
    array2dMystery2(a2);

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

  public static void array2dMystery2(int[][] a) {
    for (int r = 0; r < a.length; r++) {
      for (int c = a[0].length - 2; c > 0; c--) {
        a[r][c] = a[r][c - 1] + a[r][c + 1];
      }
    }
  }
}
