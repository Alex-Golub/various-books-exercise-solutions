package org.mrdrprof.solutions.chapter8_MD_Arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * ***8.9 (Game: play a tic-tac-toe game)
 *
 * @author Mr.Dr.Professor
 * @since 11-Feb-21 9:09 PM
 */
class Ex8_9_ticTacToeGame {
  static final int GRID_SIZE = 3;
  static final String LINE = "-".repeat(4 * (GRID_SIZE + 1) + 1);
  static final Scanner console = new Scanner(System.in);

  public static void main(String[] args) {
    play(createGrid());
  }

  public static void play(char[][] grid) {
    char currentPlay = 'X';

    while (true) {
      printBoard(grid);
      int[] position = prompt(currentPlay); // get position from user
      System.out.println();

      if (!isPositionValid(position, grid)) {
        System.out.printf("Position (%d, %d) is already occupied, %s choose again\n",
                          position[0], position[1], currentPlay);
        continue;
      }

      // currentPlayer played at this position
      grid[position[0]][position[1]] = currentPlay;

      // check if current play is the winner
      if (won(grid, currentPlay)) {
        System.out.println(currentPlay + " player won");
        break;
      }

      if (draw(grid)) {
        System.out.println("Its a DRAW!");
        break;
      }

      // swap turns
      currentPlay = currentPlay == 'X' ? 'O' : 'X';
    }

    printBoard(grid);
  }

  /**
   * checks if game drawn
   */
  private static boolean draw(char[][] grid) {
    for (char[] row : grid)
      for (char token : row)
        if (token == ' ')
          return false;

    return true;
  }

  /**
   * game is won if current player has won either by diagonal/row/column
   */
  private static boolean won(char[][] grid, char player) {
    return checkDiagonals(grid, player) ||
           checkRows(grid, player) ||
           checkColumns(grid, player);
  }

  private static boolean checkColumns(char[][] grid, char token) {
    for (int i = 0; i < grid.length; i++) {
      boolean wonByColumn = true;

      for (int j = 0; j < grid[i].length; j++) {
        if (grid[j][i] != token) {
          wonByColumn = false;
          break;
        }
      }

      if (wonByColumn)
        return true;
    }

    return false;
  }

  private static boolean checkRows(char[][] grid, char player) {
    for (char[] row : grid) {
      boolean wonByRow = true;

      for (char token : row) {
        if (token != player) {
          wonByRow = false;
          break;
        }
      }

      if (wonByRow)
        return true;
    }

    return false;
  }

  private static boolean checkDiagonals(char[][] grid, char token) {
    boolean main = true;
    boolean secondary = true;

    for (int i = 0; i < grid.length; i++) {
      if (grid[i][i] != token)
        main = false;

      if (grid[i][grid[i].length - i - 1] != token)
        secondary = false;
    }

    return main || secondary;
  }

  public static boolean isPositionValid(int[] position, char[][] grid) {
    int x = position[0];
    int y = position[1];

    // check if positions are in range of grid dimensions
    if (x < 0 || x > grid.length || y < 0 || y > grid[0].length)
      return false;

    return grid[x][y] == ' ';
  }

  private static int[] prompt(char player) {
    int row = getPosition("row", player);
    int column = getPosition("column", player);

    return new int[]{row, column};
  }

  private static int getPosition(String s, char player) {
    int position;

    while (true) {
      System.out.print("Enter a " + s + " (");

      for (int i = 0; i < GRID_SIZE - 1; i++)
        System.out.print(i + ", ");
      System.out.print("or " + (GRID_SIZE - 1) + ") for player " + player + ": ");

      position = console.nextInt();
      if (position >= 0 && position < GRID_SIZE) {
        break;
      }

      System.out.println("\n" + (char) (s.charAt(0) - ('a' - 'A')) + s.substring(1) + " " + position +
                         " is not in valid range [" + 0 + ", " + (GRID_SIZE - 1) + "], try again");
    }

    return position;
  }

  private static char[][] createGrid() {
    char[][] grid = new char[GRID_SIZE][GRID_SIZE];
    for (char[] row : grid)
      Arrays.fill(row, ' ');

    return grid;
  }

  private static void printBoard(char[][] grid) {
    System.out.println(LINE);
    printRow(grid[0], true, 0);
    System.out.println(LINE);

    for (int i = 0; i < grid.length; i++) {
      printRow(grid[i], false, i);
      System.out.println(LINE);
    }
  }

  private static void printRow(char[] grid, boolean headers, int rowNumber) {
    if (headers) {
      System.out.print("    |");

      for (int i = 0; i < grid.length; i++) {
        System.out.print(" " + i);

        if (i + 1 < grid.length)
          System.out.print(" |");
      }
    } else {
      System.out.print("| " + rowNumber + " |");

      for (int i = 0; i < grid.length; i++) {
        System.out.print(" " + grid[i]);

        if (i + 1 < grid.length)
          System.out.print(" |");
      }

    }

    System.out.println(" |");
  }
}
