package cse_142.cs1_labs;

/**
 * @author Alex Golub
 * @since 07-Apr-21 4:16 PM
 */
class Point {
  public int x;
  public int y;

  public Point() {
    setLocation(0, 0);
  }

  public Point(int x, int y) {
    setLocation(x, y);
  }

  public double distanceFromOrigin() {
    return distance(new Point());
  }

  public double distance(Point p) {
    int dx = x - p.x;
    int dy = y - p.y;
    return Math.sqrt(dx * dx + dy * dy);
  }

  public final int getX() {
    return x;
  }

  public void setX(int x) {
    this.x = x;
  }

  public final int getY() {
    return y;
  }

  public void setY(int y) {
    this.y = y;
  }

  public void setLocation(int x, int y) {
    this.x = x;
    this.y = y;
  }

//  public String toString() {
//    return "(" + x + ", " + y + ")";
//  }

  public void translate(int dx, int dy) {
    setLocation(x + dx, y + dy);
  }

  /**
   * https://practiceit.cs.washington.edu/problem/view/cs1/labs/lab8/quadrant
   */
  public int quadrant() {
    if (getX() == 0 || getY() == 0) {
      return 0;
    }

    return getX() > 0 ? (getY() > 0 ? 1 : 4) : (getY() > 0 ? 2 : 3);
  }

  /**
   * https://practiceit.cs.washington.edu/problem/view/cs1/labs/lab8/flip
   * Negates and swaps the x/y coordinates of the Point object.
   */
  public void flip() {
    int temp = getX();
    setX(-getY());
    setY(-temp);
  }

  /**
   * https://practiceit.cs.washington.edu/problem/view/cs1/labs/lab8/toStringPoint
   */
  public String toString() {
    return "Point[x=" + getX() + ",y=" + getY() + "]";
  }
}
