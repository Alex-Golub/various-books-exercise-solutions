package chapter8_MD_Arrays;

import java.util.Arrays;

/**
 * *8.34 (Geometry: rightmost lowest point)
 *
 * ====================================================
 * Enter x1, y1, x2, y2, x3, y3, x4, y4, x5, y5, x6, y6: 1.5 2.5 -3 4.5 5.6 -7 6.5 -7 8 1 10 2.5
 * [1.5, 2.5]
 * [-3.0, 4.5]
 * [5.6, -7.0]
 * [6.5, -7.0]
 * [8.0, 1.0]
 * [10.0, 2.5]
 * The rightmost lowest point is (6.50, -7.00)
 * ====================================================
 *
 * @author Mr.Dr.Professor
 * @since 19-Feb-21 7:29 PM
 */
class Ex8_34_rightmostLowestPoint {
  static final int NUMBER_OF_POINTS = 6;
  static final int X = 0, Y = 1;

  public static void main(String[] args) {
    double[][] points = Ex8_32_areaOfTriangle.getPoints(NUMBER_OF_POINTS);
    for (double[] row : points) {
      System.out.println(Arrays.toString(row));
    }

    double[] rightmostLowestPoint = getRightmostLowestPoint(points);

    System.out.printf("The rightmost lowest point is (%.2f, %.2f)\n\n",
                      rightmostLowestPoint[X], rightmostLowestPoint[Y]);
  }

  // right most i.e. has the largest x value
  // lowest most i.e. has the smallest y value
  public static double[] getRightmostLowestPoint(double[][] points) {
    double[] rightmostLowest = {Double.MIN_VALUE, Double.MAX_VALUE};

    for (double[] point : points) {
      double x = point[X];
      double y = point[Y];

      if (x >= rightmostLowest[X] && y <= rightmostLowest[Y]) {
        rightmostLowest[X] = x;
        rightmostLowest[Y] = y;
      }
    }

    return rightmostLowest;
  }
}
