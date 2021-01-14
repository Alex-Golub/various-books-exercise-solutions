package chapter7_arrays;

/**
 * 19. Write a method called matrixAdd that accepts a pair of
 * two-dimensional arrays of integers as parameters, treats the arrays
 * as two-dimensional matrixes, and returns their sum.
 * The sum of two matrixes A and B is a matrix C, where for every row i
 * and column j, Cij = Aij + Bij.
 * You may assume that the arrays passed as parameters have the same dimensions.
 *
 * @author Mr.Dr.Professor
 * @since 11-Jan-21 10:05 PM
 */
class Ex7_19_matrixAdd {
  public static int[][] matrixAdd(int[][] a, int[][] b) {
    if (a == null || b == null || a.length == 0)
      return new int[][]{};

    int     m = a.length;
    int     n = a[0].length;
    int[][] c = new int[m][n];
    for (int i = 0; i < m; i++)
      for (int j = 0; j < n; j++)
        c[i][j] = a[i][j] + b[i][j];

    return c;
  }
}
