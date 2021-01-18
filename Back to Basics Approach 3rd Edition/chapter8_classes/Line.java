package chapter8_classes;

import java.awt.Point;

/**
 * 14. Write a class called Line that represents a line segment
 * between two Points.
 *
 * @author Mr.Dr.Professor
 * @since 17-Jan-21 3:12 PM
 */
class Line {
  private Point p1;
  private Point p2;

  public Line(Point p1, Point p2) {
    this.p1 = p1;
    this.p2 = p2;
  }

  // Ex8_16_constructorLine
  // Constructs a new Line that contains the given two Points
  public Line(int x1, int y1, int x2, int y2) {
    this(new Point(x1, y1), new Point(x2, y2));
  }


  public Point getP1() {
    return p1;
  }

  public Point getP2() {
    return p2;
  }

  @Override
  public String toString() {
    return String.format("[(%d, %d), (%d, %d)]",
            p1.x, p1.y, p2.x, p2.y);
  }

  // Ex8_15_getSlopeLine
  public double getSlope() {
    double dx = p2.getX() - p1.getX();
    if (Math.abs(dx) < 1e-10)
      throw new IllegalStateException("/ by zero");

    double dy = p2.getY() - p1.getY();
    return dy / dx;
  }

  // Ex8_17_isCollinearLine
  // Returns true if the given point is collinear with the points of this line;
  // that is, if, when this Line is stretched infinitely, it would eventually
  // hit the given point
  public boolean isCollinear(Point p) {
    return Math.abs(getSlope() - new Line(p1, p).getSlope()) < 1e-4;
  }

}
