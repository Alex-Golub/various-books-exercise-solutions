package org.mrdrprof.solutions.chapter6_Methods;

import java.util.Scanner;

/**
 * @author Mr.Dr.Professor
 * @since 28-Jan-21 7:57 PM
 */
class Ex6_19_triangles {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while (true) {
      System.out.print("Enter triplet of a triangle (e.g. 1 2 3): ");
      double a = sc.nextDouble();
      double b = sc.nextDouble();
      double c = sc.nextDouble();

      System.out.println("Area of triangle is " + area(a, b, c) + "\n");
    }
  }

  public static double area(double a, double b, double c) {
    if (!isValid(a, b, c))
      throw new IllegalStateException(
              String.format("(%.2f, %.2f, %.2f) is no a valid triangle",
                            a, b, c));

    double s = (a + b + c) / 2;
    return Math.sqrt(s * (s - a) * (s - b) * (s - c));
  }

  public static boolean isValid(double a, double b, double c) {
    return a + b > c && a + c > b && b + c > a;
  }
}
