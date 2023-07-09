package org.mrdrprof.solutions.chapter10_Object_Oriented_Thinking;

/**
 * 10.4 (The MyPoint class)
 *
 * @author Mr.Dr.Professor
 * @since 3/22/2021 9:15 PM
 */
/*public*/ class MyPoint {
  private final double x;
  private final double y;

  public MyPoint() {
    this(0, 0);
  }

  public MyPoint(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public double getX() {
    return x;
  }

  public double getY() {
    return y;
  }

  public double distance(MyPoint other) {
    return distance(other.getX(), other.getY());
  }

  public double distance(double x, double y) {
    double dx = getX() - x;
    double dy = getY() - y;
    return Math.sqrt(dx * dx + dy * dy);
  }

  public static double distance(MyPoint p1, MyPoint p2) {
    return p1.distance(p2);
  }

  public static void main(String[] args) {
    MyPoint p1 = new MyPoint();
    MyPoint p2 = new MyPoint(10, 30.5);
    System.out.println("p1.distance(p2) => " + p1.distance(p2));
    System.out.println("p2.distance(p1) => " + p2.distance(p1));

    System.out.println("\np1.distance(p2.getX(), p2.getY()) => " +
                       p1.distance(p2.getX(), p2.getY()));
    System.out.println("p2.distance(p1.getX(), p1.getY()) => " +
                       p2.distance(p1.getX(), p1.getY()));

    System.out.println("\nMyPoint.distance(p1, p2) => " + MyPoint.distance(p1, p2));
    System.out.println("MyPoint.distance(p2, p1) => " + MyPoint.distance(p2, p1));
  }
}
