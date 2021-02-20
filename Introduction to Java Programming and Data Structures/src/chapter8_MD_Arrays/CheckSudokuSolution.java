package chapter8_MD_Arrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Check each cell. Each cell must be a number from
 * 1 to 9 and the cell must be unique
 * on every row, every column, and every small box.
 */
public class CheckSudokuSolution {
  static final Scanner input = new Scanner(System.in);

  public static void main(String[] args) throws FileNotFoundException {
    // Read a Sudoku solution
    int[][] grid = readASolution();
    printGrid(grid);
    System.out.println(isValid(grid) ? "YES" : "NO");
  }

  private static void printGrid(int[][] grid) {
    for (int[] row : grid) {
      for (int value : row) {
        System.out.printf("%-3d", value);
      }
      System.out.println();
    }
  }

  /** Read a Sudoku solution from the console */
  public static int[][] readASolution() throws FileNotFoundException {
//    System.out.print("Enter Sudoku number of squares(e.g. 3 for 3x3): ");

    System.out.print("File to read solution from: ");
    Scanner reader = new Scanner(new File(input.nextLine()));

    int n = (int) Math.pow(reader.nextInt(), 2);

    int[][] grid = new int[n][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        grid[i][j] = reader.nextInt();
      }
    }

    return grid;
  }

  /** Check whether a solution is valid */
  public static boolean isValid(int[][] grid) {
    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid.length; j++) {
        if (grid[i][j] < 1 || grid[i][j] > grid.length
            || !isValid(i, j, grid)) {
          return false;
        }
      }
    }

    return true;
  }

  /** Check whether grid[i][j] is valid in the grid */
  public static boolean isValid(int i, int j, int[][] grid) {
    // Check whether grid[i][j] is valid at the i's row
    for (int column = 0; column < grid.length; column++) {
      if (column != j && grid[i][column] == grid[i][j]) {
        return false;
      }
    }

    // Check whether grid[i][j] is valid at the j's column
    for (int row = 0; row < grid.length; row++) {
      if (row != i && grid[row][j] == grid[i][j]) {
        return false;
      }
    }

    // Check whether grid[i][j] is valid in the sqrt(grid.length) by sqrt(grid.length) box
    int box = (int) Math.sqrt(grid.length);
    for (int row = (i / box) * box; row < (i / box) * box + box; row++) {
      for (int col = (j / box) * box; col < (j / box) * box + box; col++) {
        if (!(row == i && col == j) && grid[row][col] == grid[i][j]) {
          return false;
        }
      }
    }

    return true; // The current value at grid[i][j] is valid
  }
}