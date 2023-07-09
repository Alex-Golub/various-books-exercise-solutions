package org.mrdrprof.solutions.chapter8_MD_Arrays;

import java.util.Scanner;

/**
 * *8.15 (Geometry: same line?)
 *
 * Enter five points: 3.4 2 6.5 9.5 2.3 2.3 5.5 5 -5 4
 * The five points are not on the same line
 *
 * Enter five points: 1 1 2 2 3 3 4 4 5 5
 * The five points are on the same line
 *
 * @author Mr.Dr.Professor
 * @since 14-Feb-21 8:23 PM
 */
class Ex8_15_sameLine {
  static final int X = 0;
  static final int Y = 1;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while (true) {
      System.out.print("Enter five points: ");
      double[][] points = new double[5][2];

      for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 2; j++)
          points[i][j] = sc.nextDouble();
      }

      System.out.printf("The five points are %son the same line\n\n",
                        sameLine(points) ? "" : "not ");
    }
  }

  public static boolean sameLine(double[][] points) {
    for (int i = 0; i < points.length - 2; i++) {
      double[] p1 = points[i];
      double[] p2 = points[i + 1];
      double[] p3 = points[i + 2];

      if (!onTheSameLine(p1, p2, p3))
        return false;
    }

    return true;
  }

  public static boolean onTheSameLine(double[] p1, double[] p2, double[] p3) {
    return Math.abs((p2[X] - p1[X]) * (p3[Y] - p1[Y]) -
                    (p3[X] - p1[X]) * (p2[Y] - p1[Y])) < 1e-10;
  }
}
