package chapter8_classes;

import java.awt.Point;

/**
 * Ex8_18_classRectangle
 *
 * @author Mr.Dr.Professor
 * @since 17-Jan-21 3:48 PM
 */
class Rectangle {
  private final int x;
  private final int y;
  private final int width;
  private final int height;

  public Rectangle(int x, int y, int width, int height) {
    if (width < 0 || height < 0)
      throw new IllegalArgumentException("Illegal width or height");

    this.x = x;
    this.y = y;
    this.width = width;
    this.height = height;
  }

  // Ex8_19_constructorRectangle
  public Rectangle(Point p, int width, int height) {
    this(p.x, p.y, width, height);
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public int getWidth() {
    return width;
  }

  public int getHeight() {
    return height;
  }

  public String toString() {
    return String.format("%s[x=%d,y=%d,width=%d,height=%d]",
            getClass().getSimpleName(), x, y, width, height);
  }

  // Ex8_20_containsRectangle
  // Returns whether the given Point lie inside the bounds of
  // this Rectangle. The edges are included;
  public boolean contains(int x, int y) {
    return (getX() <= x && x <= getWidth() + getX()) &&
           (getY() <= y && y <= getHeight() + getY());
  }

  // Ex8_20_containsRectangle
  // Returns whether the given coordinates lie inside the bounds of
  // this Rectangle. The edges are included;
  public boolean contains(Point p) {
    return contains(p.x, p.y);
  }

  // Ex8_21_unionRectangle
  // Returns a new Rectangle that represents the area occupied by the
  // tightest bounding box that contains both this Rectangle and the
  // given other Rectangle.
  public Rectangle union(Rectangle rect) {
    if (rect == null)
      return this;

    int newX      = Math.min(x, rect.x);
    int newY      = Math.min(y, rect.y);
    int newWidth  = Math.max(x + width - newX, rect.x + rect.width - newX);
    int newHeight = Math.max(y + height - newY, rect.y + rect.height - newY);

    return new Rectangle(newX, newY, newWidth, newHeight);
  }

  // Ex8_22_intersectionRectangle
  // Returns a new rectangle that represents the largest rectangular
  // region completely contained within both this rectangle and the
  // given other rectangle.
  // If the rectangles do not intersect at all, returns null.
  public Rectangle intersection(Rectangle rect) {
    int newX      = Math.max(x, rect.x);
    int newY      = Math.max(y, rect.y);
    int newWidth  = Math.min(x + width - newX, rect.x + rect.width - newX);
    int newHeight = Math.min(y + height - newY, rect.y + rect.height - newY);

    if (newWidth <= 0 || newHeight <= 0)
      return null;

    return new Rectangle(newX, newY, newWidth, newHeight);
  }

  // Ex8_23_containsOtherRectangle
  // Returns whether the given other rectangle lies entirely within
  // the bounds of this rectangle.
  public boolean contains(Rectangle rect) {
    return x < rect.x && rect.x < x + width &&
           y < rect.y && rect.y < y + height;
  }
}
