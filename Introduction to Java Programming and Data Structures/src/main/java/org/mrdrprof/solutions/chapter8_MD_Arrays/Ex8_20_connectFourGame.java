package org.mrdrprof.solutions.chapter8_MD_Arrays;

import java.util.Arrays;
import java.util.Scanner;

import static org.mrdrprof.solutions.chapter8_MD_Arrays.Ex8_20_connectFourGame.GameStatus.CONTINUE;
import static org.mrdrprof.solutions.chapter8_MD_Arrays.Ex8_20_connectFourGame.GameStatus.DRAW;
import static org.mrdrprof.solutions.chapter8_MD_Arrays.Ex8_20_connectFourGame.GameStatus.WON;

/**
 * ***8.20 (Game: connect four)
 * The objective of the game is to connect four same-colored
 * disks in a row, a column, or a diagonal before your opponent
 * can do likewise.
 *
 * @author Mr.Dr.Professor
 * @since 16-Feb-21 12:15 PM
 */
class Ex8_20_connectFourGame {
  enum GameStatus {WON, DRAW, CONTINUE}

  static final int ROWS = 6;
  static final int COLUMNS = 7;
  static final int CONNECT_N = 4; // changed if want to win by connecting different amount consecutive elements
  static final String LINE_SEPARATOR = "-".repeat(2 * COLUMNS + 1);
  static final Scanner console = new Scanner(System.in);

  public static void main(String[] args) {
    // create grid
    char[][] grid = new char[ROWS][COLUMNS];
    for (char[] row : grid)
      Arrays.fill(row, ' ');

    play(grid);
  }

  private static void play(char[][] grid) {
    printGrid(grid);
    char currentPlayer = 'R';
    boolean gameOver = false;

    while (!gameOver) {
      playerMove(currentPlayer, grid);
      printGrid(grid);

      switch (gameStatus(grid)) {
        case WON:
          System.out.printf("The %s player won", currentPlayer == 'R' ? "red" : "yellow");
          gameOver = true;
          break;

        case DRAW:
          System.out.println("Its a draw");
          gameOver = true;
          break;

        case CONTINUE:
          currentPlayer = currentPlayer == 'R' ? 'Y' : 'R';
          break;
      }

      System.out.println();
    }
  }

  private static GameStatus gameStatus(char[][] grid) {
    return checkRows(grid) || checkColumns(grid) || checkDiagonals(grid) ?
           WON : isGridFull(grid) ?
                 DRAW : CONTINUE;
  }

  private static boolean isGridFull(char[][] grid) {
    for (char[] row : grid) {
      for (char token : row) {
        if (token == ' ')
          return false;
      }
    }

    return true;
  }

  /** check down-right and down-left diagonals */
  private static boolean checkDiagonals(char[][] grid) {
    for (int i = 0; i < grid.length - (CONNECT_N - 1); i++) {
      for (int j = 0; j < grid[i].length; j++) {
        if (grid[i][j] != ' ') {
          boolean match = true;

          // down-right
          // enter block only if there is at least CONNECT - 1 columns to the
          // right of j-th column
          if (j < grid[i].length - (CONNECT_N - 1)) {
            for (int k = 1; k < CONNECT_N; k++) {
              if (grid[i][j] != grid[i + k][j + k]) {
                match = false;
                break;
              }
            }

            if (match) { // match by down-right diagonal
              return true;
            }
          }

          // down-left
          // enter block only if there is at least CONNECT - 1 columns to the
          // left of j-th column
          if (j - (CONNECT_N - 1) >= 0) {
            match = true;

            for (int k = 1; k < CONNECT_N; k++) {
              if (grid[i][j] != grid[i + k][j - k]) {
                match = false;
                break;
              }
            }

            if (match) { // matched by down-left diagonal
              return true;
            }
          }
        }
      }
    }

    return false;
  }

  private static boolean checkColumns(char[][] grid) {
    for (int j = 0; j < grid[0].length; j++) { // fix column position and traverse rows
      for (int i = 0; i < grid.length - (CONNECT_N - 1); i++) {

        if (grid[i][j] != ' ') { // ignore empty spots
          boolean match = true;

          for (int k = 1; k < CONNECT_N; k++) {
            if (grid[i][j] != grid[i + k][j]) { // fixed column, scan rows
              match = false;
              break;
            }
          }

          if (match)
            return true;
        }
      }
    }

    return false;
  }

  private static boolean checkRows(char[][] grid) {
    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[i].length - (CONNECT_N - 1); j++) {

        // start row scan only if element at (i, j) is not empty spot
        if (grid[i][j] != ' ') {
          boolean match = true;

          for (int k = 1; k < CONNECT_N; k++) {
            if (grid[i][j] != grid[i][j + k]) { // fixed row, scan columns
              match = false;
              break;
            }
          }

          // row found with CONNECT_N elements in a row
          if (match)
            return true;
        }
      }
    }

    return false; // no consecutive CONNECT_N elements in a row
  }

  private static void playerMove(char token, char[][] grid) {
    while (true) {
      System.out.printf("Drop a %s disk at column (%d-%d): ",
                        token == 'R' ? "red" : "yellow",
                        0, COLUMNS - 1);

      int columnNumber = console.nextInt();
      if (columnNumber >= 0 && columnNumber < COLUMNS) {

        // check if token can be inserted into this column
        if (!insertTokenAtColumn(token, columnNumber, grid)) {
          System.out.println(">> Column " + columnNumber + " is full. Choose different column <<\n");
          continue;
        }

        break;
      }

      System.out.printf(">> Column %d is out of range. Try again. <<\n\n", columnNumber);
    }
  }

  /**
   * check if token can be inserted into this column
   * if there is empty space insert it and return true
   * otherwise grid is not changed return false
   */
  private static boolean insertTokenAtColumn(char token, int column, char[][] grid) {
    for (int i = grid.length - 1; i >= 0; i--) {
      if (grid[i][column] == ' ') {
        grid[i][column] = token;
        return true;
      }
    }

    return false; // column is full
  }

  private static void printGrid(char[][] grid) {
    for (char[] row : grid) {
      System.out.print("|");
      for (char token : row) {
        System.out.print(token + "|");
      }
      System.out.println();
    }

    System.out.println(LINE_SEPARATOR);

    // column number line
    System.out.print("|");
    for (int i = 0; i < grid[0].length; i++) {
      System.out.print(i + "|");
    }

    System.out.println("\n" + LINE_SEPARATOR);
  }
}
