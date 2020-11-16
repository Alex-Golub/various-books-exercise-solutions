package chapter4_Math_Characters_Strings;

import java.awt.geom.Point2D;

/**
 * *4.6 (Random points on a circle)
 * Write a program that generates three random points on a circle
 * centered at (0, 0) with radius 40 and displays three angles in a triangle
 * formed by these three points.
 *
 * @author Mr.Dr.Professor
 * @since 12-Nov-20 7:42 PM
 */
class Ex4_6_CircleRandomPoints {
  public static void main(String[] args) {
    final int RADIUS = 40;

    Point2D p1 = randomPoint(RADIUS);
    Point2D p2 = randomPoint(RADIUS);
    Point2D p3 = randomPoint(RADIUS);

    double a = p1.distance(p2);
    double b = p2.distance(p3);
    double c = p3.distance(p1);

    double alpha = calculateAngle(a, c, b);
    double beta  = calculateAngle(a, b, c);
    double gamma = calculateAngle(b, c, a);

    // Print summary
    System.out.printf("p1 = (%.2f, %.2f) --- p2 = (%.2f, %.2f) --- p3 = (%.2f, %.2f)\n",
            p1.getX(), p1.getY(), p2.getX(), p2.getY(), p3.getX(), p3.getY());
    System.out.printf("side_a = %.2f --- side_b = %.2f --- side_c = %.2f\n",
            a, b, c);
    System.out.printf("alpha = %.2f --- beta = %.2f --- gamma = %.2f\n",
            alpha, beta, gamma);
  }

  /**
   * Cosine theorem to calculate angles
   */
  public static double calculateAngle(double a, double b, double c) {
    double t = (a * a + b * b - c * c) / (2 * a * b);
    return Math.toDegrees(Math.acos(t));
  }

  /**
   * Calculate random point on circle with given radius
   */
  public static Point2D randomPoint(double radius) {
    double alpha = Math.random() * 2 * Math.PI; // [0, 2π) in radians
    double x     = radius * Math.cos(alpha);
    double y     = radius * Math.sin(alpha);

    return new Point2D.Double(x, y);
  }

  /**
   * Visualizing table for points on the circle
   */
  public static void printTable(double radius) {
    System.out.printf("%-10s%-10s%-10s\n", "Angle°", "X", "Y");
    for (int i = 0; i < 10; i++) {
      double alpha = Math.random() * 2 * Math.PI; // [0, 2π) in radians
      double rndX  = radius * Math.cos(alpha);
      double rndY  = radius * Math.sin(alpha);

      System.out.printf("%-10.2f%-10.2f%-10.2f\n",
              Math.toDegrees(alpha), rndX, rndY);
    }
  }
}
