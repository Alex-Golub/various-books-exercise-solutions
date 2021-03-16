package CodeStepByStep_java.arrays.multi_dimensional_arrays;

/**
 * Write a method named matrixSum that accepts as parameters
 * two 2D arrays of integers, treats the arrays as 2D matrices
 * and adds them, returning the result.
 *
 * @author Mr.Dr.Professor
 * @since 21-Feb-21 6:13 PM
 */
class matrixSum {
  public static int[][] matrixSum(int[][] a, int[][] b) {
    if (a == null || b == null || a.length == 0 || b.length == 0)
      return a;

    int rows = a.length;
    int columns = a[0].length;

    int[][] c = new int[rows][columns];

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        c[i][j] = a[i][j] + b[i][j];
      }
    }

    return c;
  }
}
