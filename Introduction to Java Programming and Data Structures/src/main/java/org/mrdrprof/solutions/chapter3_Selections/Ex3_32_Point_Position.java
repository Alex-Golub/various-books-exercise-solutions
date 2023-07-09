package org.mrdrprof.solutions.chapter3_Selections;

import java.util.Scanner;

/**
 * *3.32 (Geometry: point position)
 * Decide whether a point p2(x2, y2) is on the left of the line,
 * on the right, or on the same line.
 * <p>
 * Created by ag on 29-Oct-20 7:27 PM
 */
class Ex3_32_Point_Position {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.print("Enter three points for p0, p1, and p2: ");
      double p0x = scanner.nextDouble();
      double p0y = scanner.nextDouble();
      double p1x = scanner.nextDouble();
      double p1y = scanner.nextDouble();
      double p2x = scanner.nextDouble();
      double p2y = scanner.nextDouble();

      double       position = (p1x - p0x) * (p2y - p0y) - (p2x - p0x) * (p1y - p0y);
      final double EPSILON  = 1e-14;

      if (Math.abs(position) < EPSILON) System.out.println("p2 is on the same line");
      else if (position < 0)            System.out.println("p2 is on the right side of the line");
      else                              System.out.println("p2 is on the left side of the line");

      System.out.println();
    }
  }

}
