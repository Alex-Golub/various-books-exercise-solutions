package chapter8_MD_Arrays;

import java.util.Scanner;

/**
 * *8.23 (Game: find the flipped cell)
 * Redirect flipped_cell.txt file or type in manually
 * the matrix
 *
 * @author Mr.Dr.Professor
 * @since 17-Feb-21 12:12 PM
 */
class Ex8_23_findTheFlippedCellGame {
  static final int ROWS = 6;
  static final int COLUMNS = 6;
  static final Scanner console = new Scanner(System.in);

  public static void main(String[] args) {
    int[][] matrix = getMatrix();
    Ex8_22_evenNumberOf1s.displayMatrix(matrix);
    int[] indices = findFlippedCell(matrix);

    if (indices == null) {
      System.out.println("There are no flipped cells");
    } else {
      System.out.printf("The flipped cell is at (%d, %d)\n",
                        indices[0], indices[1]);
    }
  }

  private static int[] findFlippedCell(int[][] m) {
    int i; // store row index where cell is flipped
    for (i = 0; i < m.length; i++) {
      int rowOneCount = 0;

      for (int j = 0; j < m[i].length; j++) {
        rowOneCount += m[i][j];
      }

      if (rowOneCount % 2 != 0) {
        break; // row with odd number of ones detected as row i
      }
    }

    if (i == m.length) { // no row with odd number of 1's
      return null;
    }

    // find column intersection with row i where cell should have
    // been zero
    int j;
    for (j = 0; j < m[i].length; j++) {
      int columnOneCount = 0;

      for (int k = 0; k < m.length; k++) {
        columnOneCount += m[k][j];
      }

      if (columnOneCount % 2 != 0) {
        break;
      }
    }

    return new int[] {i, j};
  }

  // get matrix from user using redirection (< flipped_cell.txt)
  private static int[][] getMatrix() {
    System.out.printf("Enter a %d-by-%d matrix row by row:\n", ROWS, COLUMNS);
    int[][] mat = new int[ROWS][COLUMNS];
    for (int i = 0; i < ROWS; i++)
      for (int j = 0; j < COLUMNS; j++)
        mat[i][j] = console.nextInt();

    return mat;
  }
}
