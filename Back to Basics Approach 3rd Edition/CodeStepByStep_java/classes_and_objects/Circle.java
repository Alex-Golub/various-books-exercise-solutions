package CodeStepByStep_java.classes_and_objects;

/**
 * @author Mr.Dr.Professor
 * @since 18-Jan-21 2:05 PM
 */
class Circle {
  private double r;

  public Circle(double r) {
    if (r < 0)
      throw new IllegalArgumentException("Illegal radius value: " + r);

    this.r = r;
  }

  public double area() {
    return Math.PI * r * r;
  }

  public double circumference() {
    return 2 * Math.PI * r;
  }

  public double getRadius() {
    return r;
  }

  public String toString() {
    return getClass().getSimpleName() + "{radius=" + r + "}";
  }
}
