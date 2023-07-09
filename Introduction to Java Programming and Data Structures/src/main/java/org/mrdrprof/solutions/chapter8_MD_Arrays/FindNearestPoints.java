package org.mrdrprof.solutions.chapter8_MD_Arrays;

import java.util.Scanner;

/**
 * Bash redirection:
 * javac FindNearestPoints.java
 * java FindNearestPoints < FindNearestPoints.txt
 *
 * @author Mr.Dr.Professor
 * @since 09-Feb-21 2:11 PM
 */
class FindNearestPoints {
  static final Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
    double[][] points = getPoints();

    int[] closestPoints = closestPoints(points);
    int   p1            = closestPoints[0];
    int   p2            = closestPoints[1];

    System.out.printf("The closest two points are (%.1f, %.1f) and (%.1f, %.1f)\n",
                      points[p1][0], points[p1][1],
                      points[p2][0], points[p2][1]);
  }

  public static int[] closestPoints(double[][] points) {
    double shortestDistance = Double.POSITIVE_INFINITY;
    int    p1               = 0;
    int    p2               = 1;

    for (int i = 0; i < points.length; i++) {
      for (int j = i + 1; j < points.length; j++) {
        double distance = distance(points[i][0], points[i][1],
                                   points[j][0], points[j][1]);

        if (distance < shortestDistance) {
          shortestDistance = distance;
          p1 = i;
          p2 = j;
        }
      }
    }

    return new int[]{p1, p2};
  }

  public static double distance(double x1, double y1, double x2, double y2) {
    double dx = (x2 - x1) * (x2 - x1);
    double dy = (y2 - y1) * (y2 - y1);

    return Math.sqrt(dx + dy);
  }

  public static double[][] getPoints() {
    System.out.print("Enter the number of points: ");
    int numberOfPoints = input.nextInt();

    double[][] points = new double[numberOfPoints][2];
    System.out.print("Enter " + numberOfPoints + " points in pairs: ");

    for (int i = 0; i < points.length; i++) {
      points[i][0] = input.nextDouble();
      points[i][1] = input.nextDouble();
    }

    return points;
  }
}
