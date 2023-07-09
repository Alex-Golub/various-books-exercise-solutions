package org.mrdrprof.solutions.chapter10_Object_Oriented_Thinking;

/**
 * ***10.12 (Geometry: the Triangle2D class)
 * NB: See Triangle test cases image in package
 * along with UML diagram
 *
 * @author Mr.Dr.Professor
 * @since 24-Mar-21 7:15 PM
 */
/*public*/ class Triangle2D {
  private static final double EPSILON = 1e-10;
  private final MyPoint p1;
  private final MyPoint p2;
  private final MyPoint p3;

  public Triangle2D() {
    this(new MyPoint(0, 0), new MyPoint(1, 1), new MyPoint(2, 5));
  }

  public Triangle2D(MyPoint p1, MyPoint p2, MyPoint p3) {
    this.p1 = p1;
    this.p2 = p2;
    this.p3 = p3;
  }

  public MyPoint getP1() {
    return p1;
  }

  public MyPoint getP2() {
    return p2;
  }

  public MyPoint getP3() {
    return p3;
  }

  /** Herons formula */
  public double getArea() {
    double s1 = Math.hypot(p1.getX() - p2.getX(), p1.getY() - p2.getY());
    double s2 = Math.hypot(p2.getX() - p3.getX(), p2.getY() - p3.getY());
    double s3 = Math.hypot(p3.getX() - p1.getX(), p3.getY() - p1.getY());
    double s = (s1 + s2 + s3) / 2;
    return s < EPSILON ? 0 : Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));
  }

  public double getPerimeter() {
    return p1.distance(p2) + p2.distance(p3) + p3.distance(p1);
  }

  /**
   * Let Δ denote the area of a triangle.
   * If ΔABp + ΔACp + ΔBCp == ΔABC,
   * the point p is inside the triangle
   * NB: this triangle contains it self
   */
  public boolean contains(MyPoint point) {
    Triangle2D apb = new Triangle2D(p1, point, p2);
    Triangle2D bpc = new Triangle2D(p2, point, p3);
    Triangle2D cpa = new Triangle2D(p3, point, p1);
    return (apb.getArea() + bpc.getArea() + cpa.getArea() - getArea()) < EPSILON;
  }

  public boolean contains(Triangle2D other) {
    return contains(other.getP1()) &&
           contains(other.getP2()) &&
           contains(other.getP3());
  }

  public boolean overlap(Triangle2D other) {
    return contains(other.getP1()) ||
           contains(other.getP2()) ||
           contains(other.getP3()) ||
           other.contains(getP1()) ||
           other.contains(getP2()) ||
           other.contains(getP3());
  }

  public static void main(String[] args) {
    MyPoint p1 = new MyPoint(2, 1);
    MyPoint p2 = new MyPoint(3, 5);
    MyPoint p3 = new MyPoint(4, 1);
    Triangle2D triangle2D = new Triangle2D(p1, p2, p3);
    System.out.println("triangle2D.getArea() => " + triangle2D.getArea());
    System.out.println("triangle2D.getPerimeter() => " + triangle2D.getPerimeter());

    MyPoint inTriangle = new MyPoint(2.5, 2);
    System.out.println("triangle2D.contains(new MyPoint(2.5, 2)) => " + triangle2D.contains(inTriangle));

    MyPoint outOfTriangle = new MyPoint(4, 3);
    System.out.println("triangle2D.contains(new MyPoint(4, 3)) => " + triangle2D.contains(outOfTriangle));

    MyPoint otherP1 = new MyPoint(2.5, 1.5); // contained
//    MyPoint otherP1 = new MyPoint(1, 1); // not contained
    MyPoint otherP2 = new MyPoint(3, 2.5);
    MyPoint otherP3 = new MyPoint(3.5, 1.5);
    Triangle2D other = new Triangle2D(otherP1, otherP2, otherP3);
    System.out.println("triangle2D.contains(other)" + " => " + triangle2D.contains(other));

    System.out.println("triangle2D.contains(triangle2D) => " + triangle2D.contains(triangle2D));

    // overlapping test
    Triangle2D tri1 = new Triangle2D(new MyPoint(2, 5),
                                     new MyPoint(4, 5.5),
                                     new MyPoint(4, 4));
    System.out.println("\ntriangle2D.overlap(tri1) => " + triangle2D.overlap(tri1));

    Triangle2D tri2 = new Triangle2D(new MyPoint(3, 3),
                                     new MyPoint(3, 4),
                                     new MyPoint(5, 3));
    System.out.println("triangle2D.overlap(tri2) => " + triangle2D.overlap(tri2));

    Triangle2D tri3 = new Triangle2D(new MyPoint(1, 2),
                                     new MyPoint(1, 1),
                                     new MyPoint(3.5, 1.5));
    System.out.println("triangle2D.overlap(tri3) => " + triangle2D.overlap(tri3));

    Triangle2D noOverlap = new Triangle2D(new MyPoint(1, 4),
                                          new MyPoint(2, 3),
                                          new MyPoint(2, 4));
    System.out.println("triangle2D.overlap(noOverlap) => " + triangle2D.overlap(noOverlap));
  }

}
