package org.mrdrprof.solutions.chapter9_Objects_and_Classes;

import java.util.Scanner;

/**
 * **9.12 (Geometry: intersecting point)
 *
 * Enter first line coordinates (e.g. 1 2 3 4): 2 2 5 -1
 * Enter second line coordinates (e.g. 5 6 7 8): 4 2 -1 -2
 * Lines are intersecting at (2.888888888888889, 1.1111111111111112)
 *
 * Enter first line coordinates (e.g. 1 2 3 4): 2 2 7 6
 * Enter second line coordinates (e.g. 5 6 7 8): 4 2 -1 -2
 * No intersection point
 *
 * @author Mr.Dr.Professor
 * @since 19/03/2021 15:48
 */
/*public*/ class Ex9_12_intersecting_point {
  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    System.out.print("Enter first line coordinates (e.g. 1 2 3 4): ");
    double x1 = console.nextDouble();
    double y1 = console.nextDouble();
    double x2 = console.nextDouble();
    double y2 = console.nextDouble();

    System.out.print("Enter second line coordinates (e.g. 5 6 7 8): ");
    double x3 = console.nextDouble();
    double y3 = console.nextDouble();
    double x4 = console.nextDouble();
    double y4 = console.nextDouble();

    // 1st line equation
    double a = y1 - y2;
    double b = x2 - x1;
    double e = a * x1 + b * y1;

    // 2nd line equation
    double c = y3 - y4;
    double d = x4 - x3;
    double f = c * x3 + d * y3;

    LinearEquation equation = new LinearEquation(a, b, c, d, e, f);
    if (equation.isSolvable()) {
      System.out.println("Lines are intersecting at " +
                         "(" + equation.getX() + ", " + equation.getY() + ")");
    } else {
      System.out.println("Lines do not cross each other");
    }
  }
}
