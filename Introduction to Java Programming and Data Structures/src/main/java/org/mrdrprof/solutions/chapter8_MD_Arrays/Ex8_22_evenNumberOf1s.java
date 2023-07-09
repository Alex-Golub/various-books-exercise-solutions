package org.mrdrprof.solutions.chapter8_MD_Arrays;

/**
 * *8.22 (Even number of 1s)
 * Checks if every row and every column have an even number of 1s.
 *
 * @author Mr.Dr.Professor
 * @since 17-Feb-21 11:28 AM
 */
class Ex8_22_evenNumberOf1s {
  static final int ROWS = 2;
  static final int COLUMNS = 2;

  public static void main(String[] args) {
    for (int i = 0; i <= 1000; i++) {
      int[][] matrix = getMatrix();
      displayMatrix(matrix);
      System.out.printf("%s row and columns are even\n\n",
                        hasEvenNumberOfOnes(matrix) ? "All" : "Not");
    }
  }

  private static boolean hasEvenNumberOfOnes(int[][] m) {
    for (int i = 0; i < m.length; i++) {
      int rowOneCount = 0;
      int columnOneCount = 0;

      for (int j = 0; j < m[i].length; j++) {
        rowOneCount += m[i][j];
        columnOneCount += m[j][i];
      }

      // zero number of 1's considered even number
      if (rowOneCount % 2 != 0 || columnOneCount % 2 != 0)
        return false;
    }

    return true;
  }

  private static int[][] getMatrix() {
    int[][] matrix = new int[ROWS][COLUMNS];
    for (int i = 0; i < ROWS; i++)
      for (int j = 0; j < COLUMNS; j++)
        matrix[i][j] = (int) (Math.random() * 2);

    return matrix;
  }

  public static void displayMatrix(int[][] m) {
    for (int[] row : m) {
      for (int ele : row) {
        System.out.printf("%-2d", ele);
      }
      System.out.println();
    }
  }
}
