package org.mrdrprof.solutions.chapter7_SD_Arrays;

/**
 * ***7.36 (Game: Eight Queens)
 * place eight queens on a chessboard such that no two queens
 * can attack each other (i.e., no two queens
 * are on the same row, same column, or same diagonal).
 * There are many possible solutions.
 * Write a program that displays one such solution.
 *
 * |Q| | | | | | | |
 * | | | | |Q| | | |
 * | | | | | | | |Q|
 * | | | | | |Q| | |
 * | | |Q| | | | | |
 * | | | | | | |Q| |
 * | |Q| | | | | | |
 * | | | |Q| | | | |
 *
 * @author Mr.Dr.Professor
 * @since 07-Feb-21 11:02 PM
 */
class Ex7_36_eightQueens {
  public static void main(String[] args) {
    // Queen positions
    int[] queens = new int[8]; // queens are placed at (i, queens[i])

    for (int i = 0; i < 8; i++)
      queens[i] = -1; // -1 indicates that no queen is currently placed in the ith row
    queens[0] = 0;    // Initially, place a queen at (0, 0) in the 0th row

    // k - 1 indicates the number of queens placed so far
    // We are looking for a position in the kth row to place a queen
    int k = 1;
    while (k >= 0 && k <= 7) {
      // Find a position to place a queen in the kth row
      int j = findPosition(k, queens);
      if (j < 0) {
        queens[k] = -1;
        k--; // back track to the previous row
      } else {
        queens[k] = j;
        k++;
      }
    }

    printResult(queens);
  }

  public static int findPosition(int k, int[] queens) {
    int start = queens[k] == -1 ? 0 : queens[k] + 1;

    for (int j = start; j < 8; j++) {
      if (isValid(k, j, queens))
        return j; // (k, j) is the place to put the queen now
    }

    return -1;
  }

  /**
   * Return true if you a queen can be placed at (k, j)
   */
  public static boolean isValid(int k, int j, int[] queens) {
    // See if (k, j) is a possible position
    // Check jth column
    for (int i = 0; i < k; i++)
      if (queens[i] == j)
        return false;

    // Check major diagnol
    for (int row = k - 1, column = j - 1; row >= 0 && column >= 0; row--, column--)
      if (queens[row] == column)
        return false;

    // Check minor diagnol
    for (int row = k - 1, column = j + 1; row >= 0 && column <= 7; row--, column++)
      if (queens[row] == column)
        return false;

    return true;
  }

  /**
   * Print a two-dimensional board to display the queens
   */
  public static void printResult(int[] queens) {
    for (int i = 0; i < 8; i++) {

      for (int j = 0; j < queens[i]; j++)
        System.out.print("| ");
      System.out.print("|Q|");

      for (int j = queens[i] + 1; j < 8; j++)
        System.out.print(" |");
      System.out.println();
    }
  }
}
