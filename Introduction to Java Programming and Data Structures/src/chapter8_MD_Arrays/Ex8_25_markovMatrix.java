package chapter8_MD_Arrays;

import java.util.Scanner;

/**
 * *8.25 (Markov matrix)
 * An n * n matrix is called a positive Markov matrix if each
 * element is positive and the sum of the elements in each column is 1.
 *
 * Enter a 3-by-3 matrix row by row:
 * 0.15 0.875 0.375
 * 0.55 0.005 0.225
 * 0.30 0.12 0.4
 * It is a Markov matrix
 *
 * Enter a 3-by-3 matrix row by row:
 * 0.95 -0.875 0.375
 * 0.65 0.005 0.225
 * 0.30 0.22 -0.4
 * It is NOT a Markov matrix
 *
 * @author Mr.Dr.Professor
 * @since 17-Feb-21 4:16 PM
 */
class Ex8_25_markovMatrix {
  static final int N = 3;
  static final Scanner console = new Scanner(System.in);
  static final double EPSILON = 1e-10; // threshold to check floating number

  public static void main(String[] args) {
    double[][] matrix = getMatrix();
    System.out.printf("It is %sa Markov matrix\n",
                      isMarkovMatrix(matrix) ? "" : "NOT ");
  }

  public static boolean isMarkovMatrix(double[][] m) {
    double columnSum = 0.0;

    for (int j = 0; j < N; j++) {
      for (int i = 0; i < N; i++) {
        if (m[i][j] < 0) {
          return false; // -ve no. detected
        }

        columnSum += m[i][j];
      }

      if (Math.abs(columnSum - 1.0) > EPSILON) {
        return false;
      }

      columnSum = 0;
    }

    return true;
  }

  public static double[][] getMatrix() {
    double[][] m = new double[N][N];
    System.out.printf("Enter a %d-by-%d matrix row by row:\n", N, N);
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++) {
        m[i][j] = console.nextDouble();
      }
    }

    return m;
  }
}
