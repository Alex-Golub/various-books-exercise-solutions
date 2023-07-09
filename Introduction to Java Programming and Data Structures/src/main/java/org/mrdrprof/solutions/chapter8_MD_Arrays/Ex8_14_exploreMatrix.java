package org.mrdrprof.solutions.chapter8_MD_Arrays;

import java.util.Scanner;

/**
 * **8.14 (Explore matrix)
 * 1. Randomly fills in 0s and 1s into the matrix
 * 2. prints the matrix, and
 * 3. finds the rows, columns, and diagonals with all 0s or 1s.
 *
 * @author Mr.Dr.Professor
 * @since 14-Feb-21 6:37 PM
 */
class Ex8_14_exploreMatrix {
  static final Scanner console = new Scanner(System.in);

  public static void main(String[] args) {
    while (true) {
      int[][] board = getMatrix();
      printMatrix(board);

      if (!isSameOnARow(board))
        System.out.println("No same numbers on a row");

      if (!isSameOnAColumn(board))
        System.out.println("No same numbers on a column");

      if (!isSameOnADiagonal(board))
        System.out.println("No same numbers on the major diagonal");

      if (!isSameOnASubdiagonal(board)) {
        System.out.println("No same numbers on the sub-diagonal");
      }

      System.out.println();
    }
  }

  private static boolean isSameOnASubdiagonal(int[][] board) {
    boolean isSameOnASubDiagonal = true;

    for (int i = 1; i < board.length; i++) {
      if (board[0][board.length - 1] != board[i][board.length - 1 - i]) {
        isSameOnASubDiagonal = false;
        break;
      }
    }

    if (isSameOnASubDiagonal) {
      System.out.println("All " + board[0][board.length - 1] + "'s on sub-diagonal");
    }

    return isSameOnASubDiagonal;
  }

  private static boolean isSameOnADiagonal(int[][] board) {
    boolean isSameOnADiagonal = true;

    for (int i = 1; i < board.length; i++) {
      if (board[0][0] != board[i][i]) {
        isSameOnADiagonal = false;
        break;
      }
    }

    if (isSameOnADiagonal) {
      System.out.println("All " + board[0][0] + "'s on major diagonal");
      isSameOnADiagonal = true;
    }

    return isSameOnADiagonal;
  }

  private static boolean isSameOnAColumn(int[][] board) {
    boolean isSameOnAColumn = false;

    for (int j = 0; j < board[0].length; j++) {
      boolean same = true;

      for (int i = 1; i < board.length; i++) {
        if (board[0][j] != board[i][j]) {
          same = false;
          break;
        }

      }

      if (same) {
        System.out.println("All " + board[0][j] + "'s on column " + j);
        isSameOnAColumn = true;
      }
    }

    return isSameOnAColumn;
  }

  private static boolean isSameOnARow(int[][] board) {
    boolean isSameOnARow = false;

    for (int i = 0; i < board.length; i++) {
      boolean same = true;

      for (int j = 1; j < board[0].length; j++) {
        if (board[i][0] != board[i][j]) {
          same = false;
          break;
        }
      }

      if (same) {
        System.out.println("All " + board[i][0] + "'s on row " + i);
        isSameOnARow = true;
      }
    }

    return isSameOnARow;
  }

  public static void printMatrix(int[][] m) {
    for (int[] row : m) {
      for (int val : row) {
        System.out.printf("%-3d", val);
      }
      System.out.println();
    }
  }

  public static int[][] getMatrix() {
    int size = -1;
    while (size <= 0) {
      System.out.print("Enter the size of the matrix: ");
      size = console.nextInt();
      if (size <= 0)
        System.out.println("Invalid size: " + size + ", Try again.");
    }

    int[][] m = new int[size][size];
    for (int i = 0; i < size; i++)
      for (int j = 0; j < size; j++)
        m[i][j] = (int) (Math.random() * 2);

    return m;
  }


}
