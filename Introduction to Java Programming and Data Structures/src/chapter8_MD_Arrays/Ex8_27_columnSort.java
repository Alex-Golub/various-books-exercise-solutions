package chapter8_MD_Arrays;

/**
 * *8.27 (Column sorting)
 * Sort columns in ascending order of a 2D array.
 * A new array is returned and the original array is intact.
 *
 * Enter a 3-by-3 matrix row by row:
 * 0.15 0.875 0.375
 * 0.55 0.005 0.225
 * 0.30 0.12 0.4
 * After copy column-by-column:
 * 0.150   0.550   0.300
 * 0.875   0.005   0.120
 * 0.375   0.225   0.400
 *
 * After row sorting:
 * 0.150   0.300   0.550
 * 0.005   0.120   0.875
 * 0.225   0.375   0.400
 *
 * Transposing:
 * 0.150   0.005   0.225
 * 0.300   0.120   0.375
 * 0.550   0.875   0.400
 *
 * The column-sorted array is
 * 0.150   0.005   0.225
 * 0.300   0.120   0.375
 * 0.550   0.875   0.400
 *
 * @author Mr.Dr.Professor
 * @since 17-Feb-21 4:52 PM
 */
class Ex8_27_columnSort {
  public static void main(String[] args) {
    double[][] matrix = Ex8_26_rowSorting.getMatrix();
    double[][] columnSorted = sortColumns(matrix);

    System.out.println("\nThe column-sorted array is");
    Ex8_26_rowSorting.displayMatrix(columnSorted);
  }

  // copy original array column-by-column
  // sort rows of copy array
  // transpose copy array
  // print sorted by column array
  public static double[][] sortColumns(double[][] m) {
    int n = m.length;
    double[][] copy = new double[n][n];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        copy[i][j] = m[j][i]; // copy column-by-column
      }
    }

    System.out.println("After copy column-by-column:");
    Ex8_26_rowSorting.displayMatrix(copy);

    copy = Ex8_26_rowSorting.sortRows(copy);

    System.out.println("\nAfter row sorting:");
    Ex8_26_rowSorting.displayMatrix(copy);

    System.out.print("\nTransposing:");
    for (int t = 0; t < n; t++) {
      for (int i = t + 1; i < n; i++) {
        double temp = copy[t][i];
        copy[t][i] = copy[i][t];
        copy[i][t] = temp;
      }
    }

    System.out.println();
    Ex8_26_rowSorting.displayMatrix(copy);

    return copy;
  }
}