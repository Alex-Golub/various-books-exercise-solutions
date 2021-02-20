package chapter8_MD_Arrays;

import java.util.Arrays;

import static chapter8_MD_Arrays.FindNearestPoints.getPoints;

/**
 * *8.31 (Geometry: intersecting point)
 * Assume that (x1, y1) and (x2, y2) are the two points on line 1
 * and (x3, y3) and (x4, y4) are on line 2.
 *
 * The method returns the intersecting point or null if the two lines are parallel.
 *
 * =========================================
 * Enter the number of points: 4
 * Enter 4 points in pairs: 8 6 2 5 -4 2 3 4
 *
 * Points entered:
 * P1: [8.0, 6.0]
 * P2: [2.0, 5.0]
 * P3: [-4.0, 2.0]
 * P4: [3.0, 4.0]
 *
 * Line are intersecting at (12.80, 6.80)
 * =========================================
 * Enter the number of points: 4
 * Enter 4 points in pairs: 1 2 3 4 5 6 7 8
 *
 * Points entered:
 * P1: [1.0, 2.0]
 * P2: [3.0, 4.0]
 * P3: [5.0, 6.0]
 * P4: [7.0, 8.0]
 *
 * Lines formed by the points are parallel
 * =========================================
 *
 * @author Mr.Dr.Professor
 * @since 19-Feb-21 4:37 PM
 */
class Ex8_31_intersectingPoints {
  static final int X = 0, Y = 1;
  static final double EPSILON = 1e-10;

  public static void main(String[] args) {
    double[][] points = getPoints();

    System.out.println("\nPoints entered:");
    for (int i = 0; i < points.length; i++) {
      System.out.println("P" + (i + 1) + ": " + Arrays.toString(points[i]));
    }

    double[] result = getIntersectingPoint(points);
    if (result == null) {
      System.out.println("\nLines formed by the points are parallel");
    } else {
      System.out.printf("\nLine are intersecting at (%.2f, %.2f)\n",
                        result[0], result[1]);
    }
  }

  // 1. one solution => x, y is the intersection point
  // 2. no solution => lines are parallel
  // 3. infinite solutions => lines converge
  public static double[] getIntersectingPoint(double[][] points) {
    // Equations coefficients
    double a = points[0][Y] - points[1][Y]; // y1 - y2
    double b = points[1][X] - points[0][X]; // x2 - x1;
    double e = a * points[0][X] + b * points[0][Y];
    double c = points[2][Y] - points[3][Y]; // y3 - y4;
    double d = points[3][X] - points[2][X]; // x4 - x3;
    double f = c * points[2][X] + d * points[2][Y];

    double denominator = a * d - b * c;
    return Math.abs(denominator) < EPSILON ? null :
           new double[]{(e * d - b * f) / denominator, (a * f - e * c) / denominator};
  }
}
