package chapter2_objects;

import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

/**
 * ••• Testing P2.11
 * Write a program LineDistanceTester that constructs a line joining
 * the points (100, 100) and (200, 200), then constructs points
 * (100, 200), (150, 150), and (250, 50).
 * Print the distance from the line to each of the three points,
 * using the ptSegDist method of the Line2D class.
 * Also print the expected values.
 * (Draw a sketch on graph paper to find what values you expect.)
 *
 * @author Mr.Dr.Professor
 * @since 11-Nov-20 1:52 PM
 */
class PP2_11_LineDistanceTester {
  public static void main(String[] args) {
    Line2D  line = new Line2D.Double(100, 100, 200, 200);
    Point2D p1   = new Point2D.Double(100, 200);
    Point2D p2   = new Point2D.Double(150, 150);
    Point2D p3   = new Point2D.Double(250, 50);

    System.out.printf("line: (%.2f, %.2f); (%.2f, %.2f)\n",
            line.getX1(), line.getY1(), line.getX2(), line.getY2());

    double dToP1 = line.ptSegDist(p1);
    double dToP2 = line.ptSegDist(p2);
    double dToP3 = line.ptSegDist(p3);

    System.out.printf("\nDistance to p1=(%.2f, %.2f) => %.2f\n", p1.getX(), p1.getY(), dToP1);
    System.out.println("Expected: 70.71");

    System.out.printf("Distance to p2=(%.2f, %.2f) => %.2f\n", p2.getX(), p2.getY(), dToP2);
    System.out.println("Expected: 0");

    System.out.printf("Distance to p3=(%.2f, %.2f) => %.2f\n", p3.getX(), p3.getY(), dToP3);
    System.out.println("Expected: 141.42");
  }
}
