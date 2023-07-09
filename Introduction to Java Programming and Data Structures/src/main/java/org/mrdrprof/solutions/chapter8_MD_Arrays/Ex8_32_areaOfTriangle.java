package org.mrdrprof.solutions.chapter8_MD_Arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * *8.32 (Geometry: area of a triangle)
 * The method returns 0 if the three points are on the same line.
 *
 * ===================================================
 * Enter x1, y1, x2, y2, x3, y3: 2.5 2 5 -1.0 4.0 2.0
 *
 * Points list:
 * Point #1: [2.5, 2.0]
 * Point #2: [5.0, -1.0]
 * Point #3: [4.0, 2.0]
 *
 * Triangle area formed by entered points is 2.25
 * ===================================================
 *
 * @author Mr.Dr.Professor
 * @since 19-Feb-21 5:30 PM
 */
class Ex8_32_areaOfTriangle {
  final static int NUM_OF_POINTS = 3;
  final static Scanner console = new Scanner(System.in);
  final static int X = 0, Y = 1;
  final static double EPSILON = 1e-10;

  public static void main(String[] args) {
    double[][] points = getPoints(NUM_OF_POINTS);
    displayPoints(points);

    double area = getTriangleArea(points);
    if (area < EPSILON) {
      System.out.println("The points entered are on the same line");
    } else {
      System.out.printf("Triangle area formed by entered points is %.2f\n", area);
    }
  }

  private static void displayPoints(double[][] points) {
    System.out.println("\nPoints list:");
    for (int i = 0; i < points.length; i++) {
      System.out.println("Point #" + (i + 1) + ": " + Arrays.toString(points[i]));
    }
    System.out.println();
  }

  public static double[][] getPoints(int n) {
    double[][] points = new double[n][2];
    System.out.print("Enter");
    for (int i = 0; i < n; i++) {
      System.out.printf(" x%d, y%d", i + 1, i + 1);

      if (i + 1 < n) {
        System.out.print(",");
      }
    }
    System.out.print(": ");

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < points[i].length; j++) {
        points[i][j] = console.nextDouble();
      }
    }

    return points;
  }

  // Heron's formula
  // s = (side1 + side2 + side3) / 2
  // area = s * (s - side1) * (s - side2) * (s - side3)
  public static double getTriangleArea(double[][] points) {
    double s1 = distance(points[0], points[1]);
    double s2 = distance(points[1], points[2]);
    double s3 = distance(points[0], points[2]);

    double s = (s1 + s2 + s3) / 2;
    return s < EPSILON ? 0 : Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));
  }

  public static double distance(double[] p1, double[] p2) {
    return Math.sqrt((p1[X] - p2[X]) * (p1[X] - p2[X]) +
                     (p1[Y] - p2[Y]) * (p1[Y] - p2[Y]));
  }
}
