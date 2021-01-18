package chapter8_classes;

/**
 * Ex8_1 - 6
 *
 * @author Mr.Dr.Professor
 * @since 17-Jan-21 12:46 PM
 */
class Point {
  private int x;
  private int y;

  public Point() {
    this(0, 0);
  }

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public double distanceFromOrigin() {
    return Math.sqrt(x * x + y * y);
  }

  @Override
  public boolean equals(Object other) {
    if (this == other)
      return true;
    if (other == null || getClass() != other.getClass())
      return false;

    Point o = (Point) other;
    return x == o.x && y == o.y;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  @Override
  public String toString() {
    return "(" + x + ", " + y + ")";
  }

  public Point translate(int dx, int dy) {
    return new Point(x + dx, y + dy);
  }

  // Ex8_1_quadrantPoint
  // Returns which quadrant of the x/y plane the current Point object falls in
  public int quadrant() {
    if (x > 0 && y > 0) return 1;
    if (x < 0 && y > 0) return 2;
    if (x < 0 && y < 0) return 3;
    if (x > 0 && y < 0) return 4;
    return 0; // x == y == 0
  }

  // Ex8_2_flipPoint
  // Negates and swaps the x/y coordinates of the Point object
  public void flip() {
    int temp = x;
    x = -y;
    y = -temp;
  }

  // Ex8_3_manhattanDistance
  // distance between two places if one can travel between them only by
  // moving horizontally or vertically
  public int manhattanDistance(Point other) {
    return Math.abs(x - other.x) + Math.abs(y - other.y);
  }

  // Ex8_4_isVerticalPoint
  // Returns true if the given Point lines up vertically with this Point
  public boolean isVertical(Point other) {
    return x == other.x;
  }

  // Ex8_5_slope
  // Returns the slope of the line drawn between this Point and the
  // given other Point
  public double slope(Point other) {
    if (x - other.x == 0)
      throw new IllegalArgumentException("Slope is zero");
    return (1.0 * y - other.y) / (x - other.x);
  }

  // Ex8_6_isCollinearPoint
  // Points are collinear if a straight line can be
  // drawn that connects them.
  public boolean isCollinear(Point p1, Point p2) {
    if (x == p1.x && x == p2.x) // on same vertical line
      return true;

    return Math.abs(slope(p1) - slope(p2)) < 1e-4; // res < 0.0001
  }

}

