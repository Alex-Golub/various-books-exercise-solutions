package chapter10_arrayLists;

/**
 * https://practiceit.cs.washington.edu/problem/view/bjp4/chapter10/e18-ComparablePoint
 *
 * @author Mr.Dr.Professor
 * @since 19-Apr-21 18:31 PM
 */
class Point implements Comparable<Point> {
  private double x;
  private double y;

  public Point() {
    this(0, 0);
  }

  public Point(double x, double y) {
    setLocations(x, y);
  }

  public void setLocations(double x, double y) {
    this.x = x;
    this.y = y;
  }

  /**
   * Points should be compared relative to their distance
   * from the origin, with points closer to the origin considered
   * "less" than points farther from it.
   *
   * NB: Change to Point2D to pass tests
   */
  @Override
  public int compareTo(Point o) {
    Point origin = new Point(0, 0);
    double diff = distance(origin) - o.distance(origin);
    return diff < 0 ? -1 : diff > 0 ? 1 : 0;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other)
      return true;
    if (other == null || getClass() != other.getClass())
      return false;

    Point o = (Point) other;
    return Double.compare(this.x, o.x) == 0 &&
           Double.compare(this.y, o.y) == 0;
  }

  public double getX() {
    return x;
  }

  public double getY() {
    return y;
  }

  @Override
  public String toString() {
    return "(" + x + ", " + y + ")";
  }

  public double distance(Point other) {
    double dx = this.x - other.x;
    double dy = this.y - other.y;

    return Math.sqrt(dx * dx - dy * dy);
  }
}

