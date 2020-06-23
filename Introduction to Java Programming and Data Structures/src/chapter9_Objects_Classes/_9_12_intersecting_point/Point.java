package chapter9_Objects_Classes._9_12_intersecting_point;

/**
 * Created by ag on 28-May-20 12:39 AM
 */
public class Point {

  private int x;
  private int y;

  Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Point point = (Point) o;
    return x == point.x && y == point.y;
  }

  @Override
  public String toString() {
    return String.format("(x, y) = (%d, %d)", getX(), getY());
  }
}
