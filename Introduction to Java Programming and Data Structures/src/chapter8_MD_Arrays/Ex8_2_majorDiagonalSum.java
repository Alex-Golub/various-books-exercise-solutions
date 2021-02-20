package chapter8_MD_Arrays;

/**
 * *8.2 (Sum the major diagonal in a matrix)
 * *8.2 (Average the major diagonal in a matrix)
 *
 * @author Mr.Dr.Professor
 * @since 10-Feb-21 1:54 PM
 */
class Ex8_2_majorDiagonalSum {
  public static void main(String[] args) {
    final int N = 4;
    System.out.println("Sum of the elements in the major diagonal is " +
                       sumMajorDiagonal(Ex8_1_rowAndColumnSum.getMatrix(N, N)));
  }

  public static double sumMajorDiagonal(double[][] m) {
    validMatrix(m);

    double diagonalSum = 0;
    for (int i = 0; i < m.length; i++)
      diagonalSum += m[i][i];

    return diagonalSum;
  }

  public static double averageMajorDiagonal(double[][] m) {
    validMatrix(m);

    return sumMajorDiagonal(m) / m.length;
  }

  private static void validMatrix(double[][] m) {
    if (!isSquareMatrix(m))
      throw new IllegalArgumentException("Only square matrix can have major-diagonal");
  }


  public static boolean isSquareMatrix(double[][] m) {
    int rows = m.length;
    int cols = m[0].length;

    // verify each row has same number of columns
    for (double[] row : m) {
      if (row.length != cols)
        return false;
    }

    return rows == cols;
  }
}
