package org.mrdrprof.solutions.chapter8_MD_Arrays;

import java.util.Scanner;

/**
 * *8.30 (Algebra: solve linear equations)
 *
 * Enter a_00, a_01, a_10, a_11, b_0 and b_1: -1 -2 -3 -4 -5 -6
 * -1.00x - 2.00y = -3.00
 * -4.00x - 5.00y = -6.00
 * x = -1.00, y = 2.00
 *
 * Enter a_00, a_01, a_10, a_11, b_0 and b_1: 0 0 1 2 3 0
 * 0.00x + 0.00y = 1.00
 * 2.00x + 3.00y = 0.00
 * The equation has no solution
 *
 * @author Mr.Dr.Professor
 * @since 19-Feb-21 3:44 PM
 */
class Ex8_30_linearEquations {
  static final Scanner console = new Scanner(System.in);
  static final int VARIABLES = 3;
  static final int EQUATIONS = 2;
  static final int X = 0, Y = 1, B = 2;
  static final double EPSILON = 1e-10; // floating point threshold when comparing to zero

  public static void main(String[] args) {
    double[][] coefficients = getCoefficients();
    displayEquations(coefficients);

    double[] result = linearEquation(coefficients, new double[VARIABLES - 1]);
    if (result == null) {
      System.out.println("The equation has no solution");
    } else {
      System.out.printf("x = %3.2f, y = %3.2f\n", result[X], result[Y]);
    }
  }

  public static void displayEquations(double[][] coefficients) {
    for (int i = 0; i < EQUATIONS; i++) {
      System.out.printf("%3.2fx %s %3.2fy = %3.2f\n",
                        coefficients[i][X],
                        coefficients[i][Y] < 0 ? "-" : "+",
                        Math.abs(coefficients[i][Y]),
                        coefficients[i][B]
      );
    }
  }

  public static double[][] getCoefficients() {
    System.out.print("Enter a_00, a_01, a_10, a_11, b_0 and b_1: ");
    double[][] coefficients = new double[EQUATIONS][VARIABLES];
    for (int i = 0; i < EQUATIONS; i++) {
      for (int j = 0; j < VARIABLES; j++) {
        coefficients[i][j] = console.nextDouble();
      }
    }

    return coefficients;
  }

  public static double[] linearEquation(double[][] a, double[] b) {
    double a00 = a[0][X], a01 = a[0][Y], b0 = a[0][B];
    double a10 = a[1][X], a11 = a[1][Y], b1 = a[1][B];

    double denominator = a00 * a11 - a01 * a10;
    if (Math.abs(denominator) < EPSILON) {
      return null; // no solution (division by zero)
    }

    b[0] = (b0 * a11 - b1 * a01) / denominator;
    b[1] = (b1 * a00 - b0 * a10) / denominator;

    return b;
  }

}
