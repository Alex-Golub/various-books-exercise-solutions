package chapter8_MD_Arrays;

/**
 * *8.10 (Largest row and column)
 *
 * 1 0 0 0 1 1 → 3
 * 1 0 1 1 1 1 → 5
 * 0 1 1 0 0 1 → 3
 * 1 1 0 1 0 1 → 4
 * 0 1 1 0 0 1 → 3
 * 1 1 1 1 0 0 → 4
 * ↓ ↓ ↓ ↓ ↓ ↓
 * 4 4 4 3 2 5
 *
 * The largest row index: 1
 * The largest column index: 5
 *
 * @author Mr.Dr.Professor
 * @since 12-Feb-21 8:22 PM
 */
class Ex8_10_largestRowAndColumn {
  public static void main(String[] args) {
    int[][] matrix = randomFill(6);
    printMatrix(matrix);

    int[] rowColumn = largestRowColumn(matrix);
    System.out.println("\n\nThe largest row index: " + rowColumn[0]);
    System.out.println("The largest column index: " + rowColumn[1]);
  }

  private static int[] largestRowColumn(int[][] m) {
    int rowIndex = 0;
    int colIndex = 0;

    int maxOneSoFarByRow = 0;
    int maxOneSoFarByColumn = 0;

    for (int i = 0; i < m.length; i++) {
      int rowOneCount = 0;
      int columnOneCount = 0;

      int j;
      for (j = 0; j < m.length; j++) {
        if (m[i][j] == 1)
          rowOneCount++;

        if (m[j][i] == 1)
          columnOneCount++;
      }

      // if current count of ones in this row is greater then so far
      // update so far with the new sum and save the current row index
      if (rowOneCount > maxOneSoFarByRow) {
        rowIndex = i;
        maxOneSoFarByRow = rowOneCount;
      }

      // if current count of ones in this column is greater then so far
      // update so far with the new sum and save the current column index
      if (columnOneCount > maxOneSoFarByColumn) {
        colIndex = i;
        maxOneSoFarByColumn = columnOneCount;
      }
    }

    return new int[]{rowIndex, colIndex};
  }

  private static int[][] randomFill(int size) {
    int[][] m = new int[size][size];
    for (int i = 0; i < size; i++)
      for (int j = 0; j < size; j++)
        m[i][j] = (int) (Math.random() * 2);

    return m;
  }

  public static void printMatrix(int[][] m) {
    // collect each column number of ones
    int[] columnOneCount = new int[m.length];

    for (int i = 0; i < m.length; i++) {
      int row1Count = 0;
      int column1Count = 0;

      for (int j = 0; j < m.length; j++) {
        System.out.printf("%-2d", m[i][j]);

        if (m[i][j] == 1)
          row1Count++;
        if (m[j][i] == 1)
          column1Count++;
      }

      // print number of ones in current row
      System.out.println("→ " + row1Count);
      columnOneCount[i] = column1Count;
    }

    for (int i = 0; i < m.length; i++) {
      System.out.printf("%-2s", "↓");
    }

    System.out.println();

    for (int value : columnOneCount) {
      System.out.printf("%-2s", value);
    }
  }
}
