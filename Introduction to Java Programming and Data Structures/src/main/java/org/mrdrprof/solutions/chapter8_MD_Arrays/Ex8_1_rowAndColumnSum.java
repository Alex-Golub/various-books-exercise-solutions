package org.mrdrprof.solutions.chapter8_MD_Arrays;

import java.util.Scanner;

/**
 * *8.1 (Sum elements column by column)
 * *8.1 (Sum elements row by row)
 *
 * > Enter a 3-by-4 matrix row by row:
 * > 1.5 2 3 4
 * > 5.5 6 7 8
 * > 9.5 1 3 1
 * >
 * > Sum of the elements at column 0 is 16.5
 * > Sum of the elements at column 1 is 9.0
 * > Sum of the elements at column 2 is 13.0
 * > Sum of the elements at column 3 is 13.0
 * >
 * > Sum of the elements at row 0 is 10.5
 * > Sum of the elements at row 1 is 26.5
 * > Sum of the elements at row 2 is 14.5
 *
 * @author Mr.Dr.Professor
 * @since 10-Feb-21 1:43 PM
 */
class Ex8_1_rowAndColumnSum {
  final static Scanner console = new Scanner(System.in);

  public static void main(String[] args) {
    final int N = 3;
    final int M = 4;

    double[][] m = getMatrix(N, M);
    for (int col = 0; col < M; col++)
      System.out.printf("\nSum of the elements at column %d is %.1f\n",
                        col, sumColumn(m, col));

    System.out.println();

    for (int row = 0; row < N; row++)
      System.out.printf("Sum of the elements at row %d is %.1f\n",
                        row, sumRow(m, row));
  }

  public static double[][] getMatrix(int n, int m) {
    double[][] mat = new double[n][m];
    System.out.printf("Enter a %d-by-%d matrix row by row:\n", n, m);
    for (int i = 0; i < n; i++)
      for (int j = 0; j < m; j++)
        mat[i][j] = console.nextDouble();

    return mat;
  }

  public static double sumColumn(double[][] m, int columnIndex) {
    double sum = 0;
    for (int row = 0; row < m.length; row++)
      sum += m[row][columnIndex];

    return sum;
  }

  public static double sumRow(double[][] m, int rowIndex) {
    double sum = 0;
    for (int col = 0; col < m[rowIndex].length; col++)
      sum += m[rowIndex][col];

    return sum;
  }
}
