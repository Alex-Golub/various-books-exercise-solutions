package chapter7_arrays;

import java.util.Arrays;

/**
 * 20. Write a method called isMagicSquare that accepts a two-dimensional
 * array of integers as a parameter and returns true if it is a magic square.
 * A square matrix is a magic square if all of its row, column,
 * and diagonal sums are equal.
 *
 * @author Mr.Dr.Professor
 * @since 11-Jan-21 10:10 PM
 */
class Ex7_20_isMagicSquare {
  public static void main(String[] args) {
    int[][] square = {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}};
    System.out.println(isMagicSquare(square)); // true
  }

  public static boolean isMagicSquare(int[][] square) {
    if (square == null || square.length == 0)
      return true;

    if (!isSquare(square))
      return false;

    int n = square.length;
    int sum = Arrays.stream(square[0]).sum();

    return checkRows(square, sum, n) &&
           checkCols(square, sum, n) &&
           checkDiagonals(square, sum, n);
  }

  private static boolean isSquare(int[][] square) {
    int rows = square.length;
    for (int i = 0; i < square.length; i++) {
      if (square[i].length != rows)
        return false;
    }

    return true;
  }

  private static boolean checkDiagonals(int[][] square, int sum, int n) {
    int mainDiagonal = 0;
    int secDiagonal  = 0;

    for (int i = 0; i < n; i++) {
      mainDiagonal += square[i][i];
      secDiagonal += square[n - 1 - i][i];
    }

    return mainDiagonal == sum && secDiagonal == sum;
  }

  private static boolean checkCols(int[][] square, int sum, int n) {
    int currSum = 0;

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        currSum += square[j][i];
      }

      if (currSum != sum)
        return false;

      currSum = 0;
    }

    return true;
  }

  private static boolean checkRows(int[][] square, int sum, int n) {
    for (int[] row : square) {
      if (sum != Arrays.stream(row).sum())
        return false;
    }
    return true;
  }
}
