package CodeStepByStep_java.arrays.multi_dimensional_arrays;

/**
 * int[][] a1 = {...}:
 *    3, 4, 5, 6, 2, 4, 10, 13, 6, 3, 5, 14, 12, 21, 1, 1, 6, 7, 2, 8
 * int[][] a2 = {...}:
 *    0, 1, 0, 1, 0, 1, 2, 0, 6, 0, 6, 1, 0, 9, 2, 9, 3, 5, 3, 3, 13, 4, 13, 2, 1, 4, 1, 4, 1, 4
 *
 * Method assign to a[r][c] max sum from two element at main diagonal
 * and sum of secondary diagonal
 *
 * @author Mr.Dr.Professor
 * @since 20-Feb-21 4:09 PM
 */
class array2dMystery4 {
  public static void main(String[] args) {
    int[][] a1 = {
            {3, 4, 5, 6, 2},
            {4, 2, 6, 1, 3},
            {5, 7, 4, 9, 1},
            {1, 6, 7, 2, 8}
    };
    int[][] a2 = {
            {0, 1, 0, 1, 0, 1},
            {2, 1, 2, 1, 2, 1},
            {0, 5, 0, 5, 0, 5},
            {3, 2, 3, 2, 3, 2},
            {1, 4, 1, 4, 1, 4}
    };

    array2dMystery4(a1);
    array2dMystery4(a2);

//    before running program try to answer with pen-and-paper
//    print2D(a1);
//    System.out.println();
//    print2D(a2);
  }

  private static void print2D(int[][] a) {
    for (int r = 0; r < a.length; r++) {
      System.out.print(a[r][0]);

      for (int c = 1; c < a[r].length; c++) {
        System.out.print(", " + a[r][c]);
      }

      if (r + 1 < a.length) {
        System.out.print(", ");
      }
    }
  }

  public static void array2dMystery4(int[][] a) {
    for (int r = 1; r < a.length - 1; r++) {
      for (int c = 1; c < a[0].length - 1; c++) {
        int sum1 = a[r - 1][c - 1] + a[r + 1][c + 1]; // \ sum
        int sum2 = a[r - 1][c + 1] + a[r + 1][c - 1]; // / sum

        a[r][c] = Math.max(sum1, sum2);
      }
    }
  }
}
