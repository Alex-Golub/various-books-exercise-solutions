package chapter9_Objects_Classes._9_12_intersecting_point;

import chapter9_Objects_Classes._9_11_2by2_linear_equations.LinearEquation;

/**
 * Created by ag on 28-May-20 12:34 AM
 */
public class Line {

  private Point start;
  private Point end;

  Line(Point start, Point end) {
    if (start == null || end == null)
      throw new IllegalArgumentException("Point can't be null");

    this.start = start;
    this.end = end;
  }

  public Point getStart() {
    return start;
  }

  public Point getEnd() {
    return end;
  }

  public Point intersectionPoint(Line other) {
    int[] c = getCoefficients(other);

    LinearEquation equation = new LinearEquation(c[0], c[1], c[2], c[3], c[4], c[5]);

    Point intersection = null;

    try {
      intersection = new Point((int) equation.getX(), (int) equation.getY());
    } catch (ArithmeticException e) {
//            System.err.println("Lines are parallel - no intersection point"); // No solutions
    }

    return intersection;
  }

  private int[] getCoefficients(Line other) {
    // (y1 - y2)x + (x2 - x1)y = (y1 - y2)x1 + (x2 - x1)y1
    int a = Math.subtractExact(this.getStart().getY(), this.getEnd().getY());
    int b = Math.subtractExact(this.getEnd().getX(), this.getStart().getX());
    int e = Math.addExact(
            Math.multiplyExact(Math.subtractExact(this.getStart().getY(), this.getEnd().getY()), this.getStart().getX()),
            Math.multiplyExact(Math.subtractExact(this.getEnd().getX(), this.getStart().getX()), this.getStart().getY())
    );

    // (y3 - y4)x + (x4 - x3)y = (y3 - y4)x3 + (x4 - x3)y3
    int c = Math.subtractExact(other.getStart().getY(), other.getEnd().getY());
    int d = Math.subtractExact(other.getEnd().getX(), other.getStart().getX());
    int f = Math.addExact(
            Math.multiplyExact(Math.subtractExact(other.getStart().getY(), other.getEnd().getY()), other.getStart().getX()),
            Math.multiplyExact(Math.subtractExact(other.getEnd().getX(), other.getStart().getX()), other.getStart().getY())
    );

    return new int[]{a, b, c, d, e, f};
  }

  @Override
  public String toString() {
    return String.format("(x1, y1) = (%d, %d)%n(x2, y2) = (%d, %d)%n",
            getStart().getX(), getStart().getY(), getEnd().getX(), getEnd().getY());

  }
}
