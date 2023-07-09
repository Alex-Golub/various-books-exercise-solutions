package org.mrdrprof.solutions.chapter10_Object_Oriented_Thinking;

/**
 * *10.11 (Geometry: the Circle2D class)
 *
 * @author Mr.Dr.Professor
 * @since 3/23/2021 9:42 PM
 */
/*public*/ class Circle2D {
  private final double x;
  private final double y;
  private final double radius;

  public Circle2D() {
    this(0, 0, 1);
  }

  public Circle2D(double x, double y, double radius) {
    this.x = x;
    this.y = y;
    this.radius = radius;
  }

  public double getX() {
    return x;
  }

  public double getY() {
    return y;
  }

  public double getRadius() {
    return radius;
  }

  public double getArea() {
    return Math.PI * getRadius() * getRadius();
  }

  public double getPerimeter() {
    return 2 * Math.PI * getRadius();
  }

  public boolean contains(double x, double y) {
    return Math.abs(distance(x, y)) < getRadius();
  }

  private double distance(double x, double y) {
    double dx = getX() - x;
    double dy = getY() - y;
    return Math.sqrt(dx * dx + dy * dy);
  }

  /**
   * other radius + distance from this Circle2D center to other
   * Circle2D center is less then this Circle2D radius
   */
  public boolean contains(Circle2D other) {
    return Math.abs(other.getRadius() + distance(other.getX(), other.getY())) < getRadius();
  }

  /**
   * Two circles overlaps if absolute distance value between centers
   * is strictly less then sum of both circles radius's
   */
  public boolean overlaps(Circle2D other) {
    return Math.abs(distance(other.getX(), other.getY())) < getRadius() + other.getRadius();
  }

  // Circle2D testing method
  public static void main(String[] args) {
    Circle2D c1 = new Circle2D(2, 2, 5.5);
    System.out.printf("Area = π * r² = %.2f * %.2f * %.2f = %.2f\n",
                      Math.PI, c1.getRadius(), c1.getRadius(), c1.getArea());
    System.out.printf("Perimeter = 2 * π * r = 2 * %.2f * %.2f = %.2f\n",
                       Math.PI, c1.getRadius(), c1.getPerimeter());

    double x = 3, y = 3;
    System.out.printf("c1.contains(%.2f, %.2f) => %b\n", x, y, c1.contains(x, y));

    Circle2D other = new Circle2D(4, 5, 10.5);
    System.out.printf("c1.contains(new Circle2D(4, 5, 10.5)) => %b\n",
                      c1.contains(other));
    System.out.printf("new Circle2D(4, 5, 10.5).contains(c1) => %b\n",
                      other.contains(c1));

    Circle2D other1 = new Circle2D(3, 5, 2.3);
    System.out.printf("c1.overlaps(new Circle2D(3, 5, 2.3)) => %b\n",
                      c1.overlaps(other1));
  }
}
