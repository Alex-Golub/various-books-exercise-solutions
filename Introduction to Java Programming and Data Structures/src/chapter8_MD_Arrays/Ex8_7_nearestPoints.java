package chapter8_MD_Arrays;

import java.util.Scanner;

/**
 * *8.7 (Points nearest to each other)
 *
 * @author Mr.Dr.Professor
 * @since 11-Feb-21 7:55 PM
 */
class Ex8_7_nearestPoints {
  static final Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
    double[][] points = {{-1, 0, 3}, {-1, -1, -1},
                         {4, 1, 1}, {2, 0.5, 9},
                         {3.5, 2, -1}, {3, 1.5, 3},
                         {-1.5, 4, 2}, {5.5, 4, -0.5}}; // [8][3]

    int[] closestPoints = closestPoints(points);
    int   p1            = closestPoints[0];
    int   p2            = closestPoints[1];

    System.out.printf("The closest two points are (%.1f, %.1f, %.1f) and (%.1f, %.1f, %.1f)\n",
                      points[p1][0], points[p1][1], points[p1][2],
                      points[p2][0], points[p2][1], points[p2][2]);
  }

  public static int[] closestPoints(double[][] points) {
    double shortestDistance = Double.POSITIVE_INFINITY;
    int    p1               = 0;
    int    p2               = 1;

    for (int i = 0; i < points.length; i++) {
      for (int j = i + 1; j < points.length; j++) {
        double distance = distance(points[i], points[j]);

        if (distance < shortestDistance) {
          shortestDistance = distance;
          p1 = i;
          p2 = j;
        }
      }
    }

    return new int[]{p1, p2};
  }

  private static double distance(double[] p1, double[] p2) {
    double dx = (p1[0] - p2[0]) * (p1[0] - p2[0]);
    double dy = (p1[1] - p2[1]) * (p1[1] - p2[1]);
    double dz = (p1[2] - p2[2]) * (p1[2] - p2[2]);

    return Math.sqrt(dx + dy + dz);
  }
}
