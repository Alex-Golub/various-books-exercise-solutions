package org.mrdrprof.solutions.chapter8_MD_Arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * *8.26 (Row sorting)
 * Sort rows in ascending order of a 2D array.
 * A new array is returned and the original array is intact.
 *
 * @author Mr.Dr.Professor
 * @since 17-Feb-21 4:31 PM
 */
class Ex8_26_rowSorting {
  static final int N = 3;
  static final Scanner console = new Scanner(System.in);

  public static void main(String[] args) {
    double[][] matrix = getMatrix();
    double[][] rowSorted = sortRows(matrix);

    System.out.println("\nThe row-sorted array is");
    displayMatrix(rowSorted);
  }

  public static void displayMatrix(double[][] m) {
    for (double[] row : m) {
      for (double value : row) {
        System.out.printf("%-8.3f", value);
      }
      System.out.println();
    }
  }

  public static double[][] sortRows(double[][] matrix) {
    double[][] copy = new double[N][N];
    for (int i = 0; i < N; i++) {
      System.arraycopy(matrix[i], 0, copy[i], 0, N);
      Arrays.sort(copy[i]);
    }

    return copy;
  }

  public static double[][] getMatrix() {
    double[][] m = new double[N][N];
    System.out.printf("Enter a %d-by-%d matrix row by row:\n", N, N);
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++) {
        m[i][j] = console.nextDouble();
      }
    }

    return m;
  }
}
