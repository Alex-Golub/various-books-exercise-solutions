package org.mrdrprof.solutions.chapter10_Object_Oriented_Thinking;

/**
 * *10.13 (Geometry: the MyRectangle2D class)
 * NB: See UML-MyRectangle.jpg
 *
 * @author Mr.Dr.Professor
 * @since 24-Mar-21 8:34 PM
 */
/*public*/ class MyRectangle2D {
  private final static int UPPER_LEFT = 0;
  private final static int UPPER_RIGHT = 1;
  private final static int LOWER_RIGHT = 2;
  private final static int LOWER_LEFT = 3;

  private final double x;
  private final double y;
  private final double width;
  private final double height;

  public MyRectangle2D() {
    this(0, 0, 1, 1);
  }

  public MyRectangle2D(double x, double y, double width, double height) {
    this.x = x;
    this.y = y;
    this.width = width;
    this.height = height;
  }

  public double getX() {
    return x;
  }

  public double getY() {
    return y;
  }

  public double getWidth() {
    return width;
  }

  public double getHeight() {
    return height;
  }

  public double getArea() {
    return getHeight() * getWidth();
  }

  public double getPerimeter() {
    return 2 * (getHeight() + getWidth());
  }

  public boolean contains(double x, double y) {
    double halfWidth = getWidth() / 2;
    double halfHeight = getHeight() / 2;

    double maxX = getX() + halfWidth;
    double minX = getX() - halfWidth;
    double maxY = getY() + halfHeight;
    double minY = getY() - halfHeight;

    return minX < x && x < maxX && minY < y && y < maxY;
  }

  /**
   * this rectangle contains other if all vertices of other
   * rectangle are within this rectangle
   */
  public boolean contains(MyRectangle2D other) {
    MyPoint[] vertices = other.getVertices();
    return contains(vertices[UPPER_LEFT].getX(), vertices[UPPER_LEFT].getY()) &&
           contains(vertices[UPPER_RIGHT].getX(), vertices[UPPER_RIGHT].getY()) &&
           contains(vertices[LOWER_RIGHT].getX(), vertices[LOWER_RIGHT].getY()) &&
           contains(vertices[LOWER_LEFT].getX(), vertices[LOWER_LEFT].getY());
  }

  /**
   * rectangles overlap if their x or y coordinate in same range
   */
  public boolean overlap(MyRectangle2D other) {
    if (other.contains(this)) {
      return true;
    }

    MyPoint[] thisVertices = getVertices();
    MyPoint[] otherVertices = other.getVertices();

    MyPoint thisLeftUpper = thisVertices[UPPER_LEFT];
    MyPoint thisLowerRight = thisVertices[LOWER_RIGHT];
    MyPoint otherLeftUpper = otherVertices[UPPER_LEFT];
    MyPoint otherLowerRight = otherVertices[LOWER_RIGHT];

    if (thisLeftUpper.getX() == thisLowerRight.getX() ||
        thisLeftUpper.getY() == otherLowerRight.getX() ||
        otherLeftUpper.getX() == otherLowerRight.getX() ||
        otherLeftUpper.getY() == otherLowerRight.getX()) {
      return false;
    }

    if (thisLeftUpper.getX() >= otherLowerRight.getX() ||
        otherLeftUpper.getX() >= thisLowerRight.getX()) {
      return false;
    }

    return !(thisLeftUpper.getX() <= otherLowerRight.getX()) &&
           !(otherLeftUpper.getY() <= thisLowerRight.getY());
  }

  /**
   * Convince method to calculate vertices of this rectangle
   */
  private MyPoint[] getVertices() {
    double halfWidth = getWidth() / 2;
    double halfHeight = getHeight() / 2;

    // upper-left point
    double p1X = getX() - halfWidth;
    double p1Y = getY() + halfHeight;

    // upper-right point
    double p2X = getX() + halfWidth;
    double p2Y = getY() + halfHeight;

    // lower-right point
    double p3X = getX() + halfWidth;
    double p3Y = getY() - halfHeight;

    // lower-left point
    double p4X = getX() - halfWidth;
    double p4Y = getY() - halfHeight;



    return new MyPoint[]{new MyPoint(p1X, p1Y), new MyPoint(p2X, p2Y),
                         new MyPoint(p3X, p3Y), new MyPoint(p4X, p4Y)};
  }

  /** minimum rectangle that encloses a set of points in a two-dimensional plane */
  public static MyRectangle2D getRectangle(double[][] points) {
    final int X = 0, Y = 1;
    double minX = Double.MAX_VALUE, maxX = Double.MIN_VALUE;
    double minY = Double.MAX_VALUE, maxY = Double.MIN_VALUE;

    for (double[] point : points) {
      minX = Math.min(minX, point[X]);
      maxX = Math.max(maxX, point[X]);

      minY = Math.min(minY, point[Y]);
      maxY = Math.max(maxY, point[Y]);
    }

    double cX = (maxX + minX) / 2;
    double cY = (maxY + minY) / 2;
    double width = maxX - minX;
    double height = maxY - minY;

    return new MyRectangle2D(cX, cY, width, height);
  }

  @Override
  public String toString() {
    return "MyRectangle2D{" +
           "x=" + x +
           ", y=" + y +
           ", width=" + width +
           ", height=" + height +
           '}';
  }

  public static void main(String[] args) {
    MyRectangle2D rectangle = new MyRectangle2D(3, 2.5, 4, 3);
    System.out.println("rectangle.getArea() => " + rectangle.getArea());
    System.out.println("rectangle.getPerimeter() => " + rectangle.getPerimeter());

    // contained point
    System.out.println("rectangle.contains(.5, .5) => " + rectangle.contains(.5, .5) + ", expected => false");
    System.out.println("rectangle.contains(3, .5) => " + rectangle.contains(3, .5) + ", expected => false");
    System.out.println("rectangle.contains(5.5, .5) => " + rectangle.contains(5.5, .5) + ", expected => false");
    System.out.println("rectangle.contains(2, 2) => " + rectangle.contains(2, 2) + ", expected => true");

    // contained rectangles
    MyRectangle2D contained = new MyRectangle2D(3.5, 2.5, 1, 1);
    System.out.println("\nrectangle.contains(contained) => " + rectangle.contains(contained) + ", expected => true");
    MyRectangle2D notContained = new MyRectangle2D(5, 4, 1, 1);
    System.out.println("rectangle.contains(notContained) => " + rectangle.contains(notContained) + ", expected => false");
    System.out.println("rectangle.contains(rectangle) => " + rectangle.contains(rectangle) + ", expected => false");
  }
}
