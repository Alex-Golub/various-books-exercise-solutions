package org.mrdrprof.solutions.chapter3_Selections;

import java.util.Scanner;

/**
 * *3.34 (Geometry: point on line segment)
 * Test whether a point is on a line segment.
 * Write a program that prompts the user to enter the three points for p0,
 * p1, and p2 and displays whether p2 is on the line segment from p0 to p1.
 * <p>
 * Created by ag on 29-Oct-20 7:47 PM
 */
class Ex3_34_Point_On_Line_Segment {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.print("Enter three points for p0, p1, and p2: ");
      double x0 = scanner.nextDouble();
      double y0 = scanner.nextDouble();
      double x1 = scanner.nextDouble();
      double y1 = scanner.nextDouble();
      double x2 = scanner.nextDouble();
      double y2 = scanner.nextDouble();

      double       position = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
      final double EPSILON  = 1e-14;

      // Point meet condition of formula and the range x2 ∈ |[x0, x1]|
      boolean isOnline = Math.abs(position) < EPSILON &&
              (x0 <= x2 && x2 <= x1) || (x0 >= x2 && x2 >= x1);

      System.out.printf("(%.2f, %.2f) is %son the line segment from (%.2f, %.2f) to (%.2f, %.2f)\n",
              x2, y2, isOnline ? "" : "not ", x0, y0, x1, y1);
    }
  }
}
