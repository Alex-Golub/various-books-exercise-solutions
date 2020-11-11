package chapter2_objects;

import java.awt.*;

/**
 * •• Testing E2.15
 * Construct two points with coordinates (3, 4) and (–3, –4).
 * Find the distance between them, using the distance method.
 * Print the distance, as well as the expected value.
 *
 * Created by ag on 08-Nov-20 2:36 PM
 */
class Ex2_15_PointTester {
  public static void main(String[] args) {
    Point p1 = new Point(3, 4);
    Point p2 = new Point(-3, -4);

    System.out.println("p1: " + p1);
    System.out.println("p2: " + p2);

    double d = p1.distance(p2);
    System.out.println("\nDistance between points: " + d);

    double x1 = p1.getX();
    double y1 = p1.getY();
    double x2 = p2.getX();
    double y2 = p2.getY();
    double manualD = Math.sqrt(
            Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2)
    );
    System.out.println("Manual calc distance between points: " + manualD);

  }
}
