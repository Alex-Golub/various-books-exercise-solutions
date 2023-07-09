package org.mrdrprof.solutions.chapter7_SD_Arrays;

import java.util.Scanner;

/**
 * 7.25 (Algebra: solve quadratic equations)
 *
 * @author Mr.Dr.Professor
 * @since 06-Feb-21 9:28 PM
 */
class Ex7_25_solveQuadratic {
  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);

    double[] eqn = getCoefficients(console);
    printEquation(eqn);
    double[] roots = new double[2];
    printResult(roots, solveQuadratic(eqn, roots));
  }

  private static void printResult(double[] roots, int numberOfRoots) {
    if (numberOfRoots == 0) {
      System.out.println("Quadratic equation has no real roots");
    } else if (numberOfRoots == 1) {
      System.out.printf("One real root: %.2f\n", roots[0]);
    } else {
      System.out.printf("Two real roots: r1 = %.2f, r2 = %.2f\n",
                        roots[0], roots[1]);
    }
  }

  private static double[] getCoefficients(Scanner console) {
    System.out.print("Enter coefficients a, b, c: ");
    double[] eqn = new double[3];
    for (int i = 0; i < eqn.length; i++)
      eqn[i] = console.nextDouble();
    return eqn;
  }

  private static void printEquation(double[] eqn) {
    System.out.printf("%.2fx**2 %s %.2fx %s %.2f = 0\n",
                      eqn[0],
                      eqn[1] < 0 ? "-" : "+",
                      Math.abs(eqn[1]),
                      eqn[2] < 0 ? "-" : "+",
                      Math.abs(eqn[2]));
  }

  // ax**2 + bx + c => eqn[a, b, c]
  // The method returns the number of real roots
  public static int solveQuadratic(double[] eqn, double[] roots) {
    if (eqn.length != 3 || eqn[0] == 0)
      throw new IllegalArgumentException("Coefficients array is not 3 or a = 0: " + eqn.length);

    double a = eqn[0];
    double b = eqn[1];
    double c = eqn[2];

    double discriminant  = b * b - 4 * a * c;
    int    numberOfRoots = 0;

    if (discriminant < 0) {
      roots[0] = Double.NaN;
      roots[1] = Double.NaN;
    } else if (Math.abs(discriminant) < 1e-10) {
      double root = -b / 2 * a;
      roots[0] = root;
      roots[1] = root;
      numberOfRoots = 1;
    } else {
      roots[0] = (-b + Math.sqrt(discriminant)) / (2 * a);
      roots[1] = (-b - Math.sqrt(discriminant)) / (2 * a);
      numberOfRoots = 2;
    }

    return numberOfRoots;
  }

}
