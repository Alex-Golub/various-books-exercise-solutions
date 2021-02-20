package chapter8_MD_Arrays;

/**
 * **8.6 (Algebra: multiply two matrices)
 * let a and b be matrices of size n x m and p x q
 * a * b is defined if m == p
 * c is the product matrix of a * b and its size is n x q
 *
 * Enter matrix1: 1 2 3 4 5 6 7 8 9
 * Enter matrix2: 0 2 4 1 4.5 2.2 1.1 4.3 5.2
 *
 * The matrices are added as follows
 * 1.0     2.0     3.0        0.0     2.0     4.0        5.3     23.9    24.0
 * 4.0     5.0     6.0     *  1.0     4.5     2.2     =  11.6    56.3    58.2
 * 7.0     8.0     9.0        1.1     4.3     5.2        17.9    88.7    92.4
 *
 * @author Mr.Dr.Professor
 * @since 11-Feb-21 7:16 PM
 */
class Ex8_6_multiplyMatrices {
  public static void main(String[] args) {
    double[][] a = Ex8_5_addTwoMatrices.getMatrix(1, 3);
    double[][] b = Ex8_5_addTwoMatrices.getMatrix(2, 3);

    double[][] c = multiplyMatrix(a, b);

    Ex8_5_addTwoMatrices.printResult(a, b, c, '*');
  }

  public static double[][] multiplyMatrix(double[][] a, double[][] b) {
    if (a[0].length != b.length)
      throw new ArithmeticException("A columns: " + a[0].length + ", b rows: " + b.length);

    double[][] c = new double[a.length][b[0].length];
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < c.length; j++) {
        for (int k = 0; k < c[j].length; k++) {
          c[i][j] += a[i][k] * b[k][j];
        }
      }
    }

    return c;
  }
}
