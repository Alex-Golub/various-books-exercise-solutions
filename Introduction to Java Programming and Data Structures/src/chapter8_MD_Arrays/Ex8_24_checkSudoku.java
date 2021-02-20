package chapter8_MD_Arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * *8.24 (Check Sudoku solution)
 * Rewrite the program by checking whether every
 * row, every column, and every small box has the numbers 1 to 9.
 *
 * redirect: < sudoku_test.txt
 *
 * @author Mr.Dr.Professor
 * @since 17-Feb-21 1:09 PM
 */
class Ex8_24_checkSudoku {
  static final int ROWS = 9;
  static final int COLUMNS = 9;
  static final String LINE_SEPARATOR = "-".repeat(ROWS * 3 - 2);
  static final Scanner reader = new Scanner(System.in);

  public static void main(String[] args) {
    int[][] grid = readSudokuSolution();
    displayGrid(grid);

    if (isValid(grid)) {
      System.out.println("Sudoku is valid");
    } else {
      System.out.println("Invalid sudoku");
    }
  }

  private static boolean isValid(int[][] grid) {
    return validBySmallBox(grid) &&
           validByColumns(grid) &&
           validByRows(grid);
  }

  // box numeration
  // | 0 | 1 | 2 |
  // | 3 | 4 | 5 |
  // | 6 | 7 | 8 |
  private static boolean validBySmallBox(int[][] grid) {
    boolean[] smallBoxTrigger = new boolean[ROWS + 1];
    for (int i = 0; i < ROWS / 3; i++) {
      for (int j = 0; j < COLUMNS / 3; j++) {

        // scan small box
        for (int row = 3 * i; row < 3 * i + 3; row++) {
          for (int col = 3 * j; col < 3 * j + 3; col++) {
            int valueAtRowCol = grid[row][col];

            if (valueAtRowCol < 1 || valueAtRowCol > 9) {
              System.out.printf("Value %d at box %d at position (%d, %d) " +
                                "is not in range of (1-%d)\n",
                                valueAtRowCol, 3 * i + j, row, col, ROWS);
              return false;
            }

            if (smallBoxTrigger[valueAtRowCol]) {
              System.out.printf("Value %d at box %d at position (%d, %d) " +
                                "has already seen in this box\n",
                                valueAtRowCol, 3 * i + j, row, col);
              return false;
            }

            smallBoxTrigger[valueAtRowCol] = true; // mark value as seen
          }
        }

        Arrays.fill(smallBoxTrigger, false); // reset
      }
    }

    return true;
  }

  private static boolean validByRows(int[][] grid) {
    boolean[] rowTrigger = new boolean[ROWS + 1];

    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[i].length; j++) {
        int rowValue = grid[i][j];

        if (rowValue < 1 || rowValue > 9) {
          System.out.printf("Value %d at (%d, %d) is out of valid range (1-%d)\n",
                            rowValue, i, j, ROWS);
          return false;
        }

        if (rowTrigger[rowValue]) {
          System.out.printf("Value %d at (%d, %d) has already seen in current row\n",
                            rowValue, i, j);
          return false;
        }

        rowTrigger[rowValue] = true; // mark as already seen
      }

      Arrays.fill(rowTrigger, false); // reset triggers and check next row
    }

    return true;
  }

  private static boolean validByColumns(int[][] grid) {
    boolean[] columnTrigger = new boolean[COLUMNS + 1];

    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[i].length; j++) {
        int columnValue = grid[j][i];

        if (columnValue < 1 || columnValue > 9) {
          System.out.printf("Value %d at (%d, %d) is out of valid range (1-%d)\n",
                            columnValue, i, j, COLUMNS);
          return false;
        }

        if (columnTrigger[columnValue]) {
          System.out.printf("Value %d at (%d, %d) has already seen in current column\n",
                            columnValue, j, i);
          return false;
        }

        columnTrigger[columnValue] = true; // mark as already seen
      }

      Arrays.fill(columnTrigger, false); // reset triggers and check next row
    }

    return true;
  }

  private static void displayGrid(int[][] grid) {
    System.out.println(LINE_SEPARATOR);
    for (int i = 0; i < ROWS; i++) {
      System.out.print("|");

      for (int j = 0; j < COLUMNS; j++) {
        System.out.print(" " + grid[i][j]);

        if ((j + 1) % 3 == 0) {
          System.out.print(" |");
        }
      }

      if ((i + 1) % 3 == 0) {
        System.out.println("\n" + LINE_SEPARATOR);
      } else {
        System.out.println();
      }

    }
  }

  private static int[][] readSudokuSolution() {
    int[][] grid = new int[ROWS][COLUMNS];
    for (int i = 0; i < ROWS; i++) {
      for (int j = 0; j < COLUMNS; j++) {
        grid[i][j] = reader.nextInt();
      }
    }

    return grid;
  }
}
