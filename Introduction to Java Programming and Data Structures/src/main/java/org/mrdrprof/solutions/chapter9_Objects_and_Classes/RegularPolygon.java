package org.mrdrprof.solutions.chapter9_Objects_and_Classes;

/**
 * **9.9 (Geometry: n-sided regular polygon)
 *
 * In an n-sided regular polygon, all sides have
 * the same length and all angles have the same degree
 * (i.e., the polygon is both equilateral and equiangular).
 *
 * @author Mr.Dr.Professor
 * @since 19/03/2021 14:11
 */
/*public*/ class RegularPolygon {
  private final int n;
  private final double sideLength;
  private final double cX;
  private final double cY;

  public RegularPolygon() {
    this(3, 1, 0, 0);
  }

  public RegularPolygon(int n, double sideLength) {
    this(n, sideLength, 0, 0);
  }

  public RegularPolygon(int n, double sideLength, double cX, double cY) {
    if (n < 3) {
      throw new IllegalArgumentException("Polygon must have at least 3 sides, got: " + n);
    }

    if (sideLength <= 0) {
      throw new IllegalArgumentException("Invalid polygon side length, got: " + sideLength);
    }

    this.n = n;
    this.sideLength = sideLength;
    this.cX = cX;
    this.cY = cY;
  }

  public int getN() {
    return n;
  }

  public double getSideLength() {
    return sideLength;
  }

  public double getPerimeter() {
    return getN() * getSideLength();
  }

  public double getArea() {
    double s = getSideLength();
    int n = getN();

    return (n * s * s) / (4 * Math.tan(Math.PI / n));
  }

  @Override
  public String toString() {
    return "RegularPolygon{" +
           "n=" + n +
           ", sideLength=" + sideLength +
           ", cX=" + cX +
           ", cY=" + cY +
           '}';
  }

  public static void main(String[] args) {
    RegularPolygon polygon = new RegularPolygon();
    System.out.println(polygon);
    polygon = new RegularPolygon(7, 15);
    System.out.println(polygon);
    polygon = new RegularPolygon(3, 5, 2, 2);
    System.out.println(polygon);
    System.out.println("Area: " + polygon.getArea());
    System.out.println("Perimeter: " + polygon.getPerimeter());
  }
}
