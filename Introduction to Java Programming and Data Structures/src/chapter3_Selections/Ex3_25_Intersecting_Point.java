package chapter3_Selections;

import java.util.Scanner;

/**
 * *3.25 (Geometry: intersecting point)
 * Write a program that prompts the user to enter four
 * points and displays the intersecting point.
 * <p>
 * Created by ag on 28-Oct-20 12:35 PM
 */
class Ex3_25_Intersecting_Point {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print(" Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
    double x1 = scanner.nextDouble();
    double y1 = scanner.nextDouble();
    double x2 = scanner.nextDouble();
    double y2 = scanner.nextDouble();
    double x3 = scanner.nextDouble();
    double y3 = scanner.nextDouble();
    double x4 = scanner.nextDouble();
    double y4 = scanner.nextDouble();

    // Equations coefficients
    double a = y1 - y2;
    double b = x2 - x1;
    double e = a * x1 + b * y1;
    double c = y3 - y4;
    double d = x4 - x3;
    double f = c * x3 + d * y3;

    // Solving 2x2 equation using Cramer's rule
    final double EPSILON     = 1e-14;
    double       denominator = a * d - b * c;
    if (Math.abs(denominator) < EPSILON) {
      System.out.println("The two lines are parallel");
    } else {
      double x = (e * d - b * f) / denominator;
      double y = (a * f - e * c) / denominator;
      System.out.printf("The intersecting point is at (%.5f, %.5f)\n", x, y);
    }
  }
}
