package org.mrdrprof.solutions.chapter8_MD_Arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * **8.35 (Largest block)
 * Find a maximum square submatrix whose elements are all 1s.
 *
 * Return value is an array that consists of three values.
 * The first two values are the row and column indices for
 * the first element in the submatrix, and the third
 * value is the number of the rows in the submatrix.
 *
 * https://liveexample.pearsoncmg.com/dsanimation/LargestBlockeBook.html
 *
 * =======================================================
 * Enter the number of rows in the matrix: 5
 * 1  1  0  1  1
 * 1  1  1  1  1
 * 1  1  1  1  1
 * 1  1  1  1  1
 * 0  1  1  1  1
 *
 * Memoization Matrix:
 * [1, 1, 0, 1, 1]
 * [1, 2, 1, 1, 2]
 * [1, 2, 2, 2, 2]
 * [1, 2, 3, 3, 3]
 * [0, 1, 2, 3, 4]
 *
 * The maximum square sub-matrix is at (1, 1) with size 4
 * =======================================================
 *
 * @author Mr.Dr.Professor
 * @since 19-Feb-21 11:07 PM
 */
class Ex8_35_largestBlock {
  static final Scanner console = new Scanner(System.in);

  public static void main(String[] args) {
    int[][] matrix = getMatrix();

    printMatrix(matrix);

    int[] result = findLargestBlock(matrix);
    System.out.printf("The maximum square sub-matrix is at (%d, %d) with size %d\n",
                      result[0], result[1], result[2]);
  }

  private static void printMatrix(int[][] matrix) {
    for (int[] row : matrix) {
      for (int value : row) {
        System.out.printf("%-3d", value);
      }
      System.out.println();
    }
  }

  private static int[][] getMatrix() {
    System.out.print("Enter the number of rows in the matrix: ");
    int rows = console.nextInt();

    // uncomment to manually enter matrix values
//    System.out.println("Enter the matrix row by row:");
    int[][] m = new int[rows][rows];
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < rows; j++) {
//        m[i][j] = console.nextInt();

        // percent of the time to pick 1 or 0
        m[i][j] = Math.random() < 0.10 ? 0 : 1;
      }
    }

    return m;
  }

  public static int[] findLargestBlock(int[][] m) {
    int n = m.length;
    int[][] memory = new int[n][n];

    // copy first row and first column into memory
    for (int i = 0; i < n; i++) {
      memory[0][i] = m[0][i];
      memory[i][0] = m[i][0];
    }

    // scan each element of m and if it will be 1 then assign to
    // memory at corresponding indices the min from the 2x2 square.
    // This value is representing the maximal sub-matrix of 1's found
    for (int i = 1; i < n; i++) {
      for (int j = 1; j < n; j++) {
        if (m[i][j] == 1) {
          memory[i][j] = 1 + Math.min(memory[i - 1][j - 1],
                                      Math.min(memory[i - 1][j], memory[i][j - 1]));
        } else {
          memory[i][j] = 0;
        }
      }
    }

    System.out.println("\nMemoization Matrix:");
    for (int[] row : memory) {
      System.out.println(Arrays.toString(row));
    }
    System.out.println();

    // find max value and locate the row and column indices
    int maxSubmatrixSize = -1, row = 0, column = 0;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (memory[i][j] > maxSubmatrixSize) {
          maxSubmatrixSize = memory[i][j];
          row = i;
          column = j;
        }
      }
    }

    return new int[]{row - maxSubmatrixSize + 1,
                     column - maxSubmatrixSize + 1,
                     maxSubmatrixSize};
  }
}
