package chapter8_MD_Arrays;

import java.util.Scanner;

/**
 * 8.5 (Algebra: add two matrices)
 *
 * Enter matrix1: 1 2 3 4 5 6 7 8 9
 * Enter matrix2: 0 2 4 1 4.5 2.2 1.1 4.3 5.2
 *
 * The matrices are added as follows
 * 1.0     2.0     3.0        0.0     2.0     4.0        1.0     4.0     7.0
 * 4.0     5.0     6.0     +  1.0     4.5     2.2     =  5.0     9.5     8.2
 * 7.0     8.0     9.0        1.1     4.3     5.2        8.1     12.3    14.2
 *
 * @author Mr.Dr.Professor
 * @since 10-Feb-21 4:25 PM
 */
class Ex8_5_addTwoMatrices {
  static final Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    final int size = 3;

    double[][] m1 = getMatrix(1, size);
    double[][] m2 = getMatrix(2, size);

    double[][] matrixSum = addMatrix(m1, m2);

    printResult(m1, m2, matrixSum, '+');
  }

  public static void printResult(double[][] a, double[][] b, double[][] c, char op) {
    System.out.println("\nThe matrices are added as follows");

    for (int i = 0; i < a.length; i++) {


      for (int j = 0; j < a[i].length; j++)
        System.out.printf("%-8.1f", a[i][j]);

      if (i == a.length / 2)
        System.out.print(op + "  ");
      else
        System.out.print("   ");

      for (int j = 0; j < b[i].length; j++)
        System.out.printf("%-8.1f", b[i][j]);

      if (i == a.length / 2)
        System.out.print("=  ");
      else
        System.out.print("   ");

      for (int j = 0; j < c[i].length; j++) {
        System.out.printf("%-8.1f", c[i][j]);
      }

      System.out.println();
    }
  }

  public static double[][] getMatrix(int id, int size) {
    System.out.printf("Enter matrix%d: ", id);
    double[][] m = new double[size][size];

    for (int i = 0; i < size; i++)
      for (int j = 0; j < size; j++)
        m[i][j] = sc.nextDouble();

    return m;
  }

  // matrices must have the same dimensions and
  // the same or compatible types of elements.
  public static double[][] addMatrix(double[][] a, double[][] b) {
    double[][] result = new double[a.length][a[0].length];
    for (int i = 0; i < a.length; i++)
      for (int j = 0; j < a[i].length; j++)
        result[i][j] = a[i][j] + b[i][j];

    return result;
  }

}
