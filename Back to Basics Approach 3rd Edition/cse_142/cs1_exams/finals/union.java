package cse_142.cs1_exams.finals;

import java.awt.*;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/exams/finals/final2/union
 *
 * @author Alex Golub
 * @since 12-Apr-21 7:51 PM
 */
class Rectangle {
  private int x;
  private int y;
  private int width;
  private int height;

  // Constructs a new rectangle
  public Rectangle(int x, int y, int w, int h) {
    this.x = x;
    this.y = y;
    this.width = w;
    this.height = h;
  }

  /**
   * represent the smallest rectangular region that completely
   * contains both this rectangle and r .
   */
  public void union(Rectangle r) {
    int left = Math.min(x, r.x);
    int top = Math.min(y, r.y);
    int right = Math.max(x + width, r.x + r.width);
    int bottom = Math.max(y + height, r.y + r.height);

    x = left;
    y = top;
    width = right - left;
    height = bottom - top;
  }

  // Returns this rectangle's leftmost x coordinate.
  public int getX() {
    return x;
  }

  // Returns this rectangle's topmost y coordinate.
  public int getY() {
    return y;
  }

  // Returns this rectangle's width.
  public int getWidth() {
    return width;
  }

  // Returns this rectangle's height.
  public int getHeight() {
    return height;
  }

  // Returns a text representation of this rectangle.
  public String toString() {
    return "{(" + x + ", " + y + "), " + width + "x" + height + "}";
  }

  // Returns whether the given point is contained within this rectangle.
  public boolean contains(Point p) {
    return getX() <= p.getX() && p.getX() < (getX() + width) &&
           getY() <= p.getY() && p.getY() < (getY() + height);
  }

  // Returns whether the given rectangle is entirely contained in this rectangle.
  public boolean contains(Rectangle r) {
    return getX() <= r.getX() && r.getX() + r.getWidth() < (getX() + width) &&
           getY() <= r.getY() && r.getY() + r.getHeight() < (getY() + height);
  }
}