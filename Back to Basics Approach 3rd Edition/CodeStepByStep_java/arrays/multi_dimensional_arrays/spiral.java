package CodeStepByStep_java.arrays.multi_dimensional_arrays;

import java.util.Arrays;

/**
 * Write a method named spiral that accepts a 2-D array of
 * integers as a parameter and that returns a 1-D array with
 * the contents of the original 2-D array in the order they
 * would appear if visited in a "spiral" order, clockwise
 * starting from top-left.
 *
 * Assumptions:
 * 1. You may assume that the 2-D array is rectangular,
 * that is, that each row of the 2-D array contains the same
 * number of columns.
 *
 * 2. You may also assume that the 2-D array contains at least
 * one row and column.
 *
 * 3. Your method should not modify the array that is passed in.
 *
 * @author Mr.Dr.Professor
 * @since 21-Feb-21 6:19 PM
 */
class spiral {
  public static void main(String[] args) {
    int[][] matrix = {{7, 3, 5, 2}};

    System.out.println(Arrays.toString(spiral(matrix)));
  }

  public static int[] spiral(int[][] matrix) {
    int rows = matrix.length;
    int cols = matrix[0].length;

    int[] res = new int[rows * cols];

    int rightBorder = cols;
    int bottomBorder = rows;
    int leftBorder = 0;
    int upperBorder = 0;

    int k = 0;
    while (leftBorder < rightBorder && upperBorder < bottomBorder) {

      // top row
      for (int i = upperBorder; i < rightBorder; i++) {
        res[k++] = matrix[upperBorder][i];
      }
      upperBorder++;

      // right side
      for (int i = upperBorder; i < bottomBorder; i++) {
        res[k++] = matrix[i][rightBorder - 1];
      }
      rightBorder--;

      if (upperBorder < bottomBorder) {
        // bottom row
        for (int i = rightBorder - 1; i >= leftBorder; i--) {
          res[k++] = matrix[bottomBorder - 1][i];
        }
        bottomBorder--;
      }

      if (leftBorder < rightBorder) {
        // left side
        for (int i = bottomBorder - 1; i >= upperBorder; i--) {
          res[k++] = matrix[i][leftBorder];
        }
        leftBorder++;
      }

    }

    return res;
  }
}
