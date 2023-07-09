package org.mrdrprof.solutions.chapter6_Methods;

import java.util.Scanner;

/**
 * 6.39 (Geometry: point position)
 *
 * @author Mr.Dr.Professor
 * @since 31-Jan-21 11:34 PM
 */
class Ex3_39_pointPosition {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while (true) {
      System.out.print("Enter three points for p0, p1, and p2: ");
      double x0 = sc.nextDouble();
      double y0 = sc.nextDouble();
      double x1 = sc.nextDouble();
      double y1 = sc.nextDouble();
      double x2 = sc.nextDouble();
      double y2 = sc.nextDouble();

      boolean lineSegment = onTheLineSegment(x0, y0, x1, y1, x2, y2);
      boolean sameLine    = onTheSameLine(x0, y0, x1, y1, x2, y2);
      boolean leftSide    = leftOfTheLine(x0, y0, x1, y1, x2, y2);

      System.out.printf("(%.1f, %.1f) is on the %s from (%.1f, %.1f) to (%.1f, %.1f)\n",
                        x2, y2,
                        lineSegment ? "line segment" :
                        sameLine ? "same line" :
                        (leftSide ? "left" : "right") + " side of the line",
                        x0, y0,
                        x1, y1
      );
    }
  }

  /**
   * Return true if point (x2, y2) is on the left side of the
   * directed line from (x0, y0) to (x1, y1)
   */
  public static boolean leftOfTheLine(double x0, double y0,
                                      double x1, double y1,
                                      double x2, double y2) {
    ;
    return (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0) > 0;
  }

  /**
   * Return true if point (x2, y2) is on the same
   * line from (x0, y0) to (x1, y1)
   */
  public static boolean onTheSameLine(double x0, double y0,
                                      double x1, double y1,
                                      double x2, double y2) {
    return Math.abs((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0)) < 1e-10;
  }

  /**
   * Return true if point (x2, y2) is on the
   * line segment from (x0, y0) to (x1, y1)
   */
  public static boolean onTheLineSegment(double x0, double y0,
                                         double x1, double y1,
                                         double x2, double y2) {

    return onTheSameLine(x0, y0, x1, y1, x2, y2) &&
           (x0 <= x2 && x2 <= x1) && (y0 <= y2 && y2 <= y1);
  }

}
