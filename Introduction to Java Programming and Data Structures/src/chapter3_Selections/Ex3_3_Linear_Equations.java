package chapter3_Selections;

import java.util.Scanner;

/**
 * *3.3 (Algebra: solve 2 * 2 linear equations)
 * A linear equation can be solved using Cramer’s rule.
 *
 * in  => 9.0 4.0 3.0 -5.0 -6.0 -21.0
 * out => x is -2.0 and y is 3.0
 *
 * in  => 1.0 2.0 2.0 4.0 4.0 5.0
 * out => The equation has no solution
 *
 * Created by ag on 22-Oct-20 9:17 AM
 */
class Ex3_3_Linear_Equations {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a, b, c, d, e, f: ");
    double a = scanner.nextDouble();
    double b = scanner.nextDouble();
    double c = scanner.nextDouble();
    double d = scanner.nextDouble();
    double e = scanner.nextDouble();
    double f = scanner.nextDouble();

    double denominator = a * d - b * c;
    final double EPSILON = 1e-14;

    if (Math.abs(denominator) < EPSILON) {
      System.out.println("The equation has no solution");
    } else {
      double x = (e * d - b * f) / denominator;
      double y = (a * f - e * c) / denominator;
      System.out.printf("x is %.1f and y %.1f", x, y);
    }
  }
}
