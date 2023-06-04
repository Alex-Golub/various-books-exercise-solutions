package chapter_12_exception_handling_and_text_io;

public class CircleWithException {
  
  private static int numberOfObjects = 0;
  private double radius;

  public CircleWithException() {
    this(1.0);
  }

  public CircleWithException(double newRadius) {
    setRadius(newRadius);
    numberOfObjects++;
  }

  public static int getNumberOfObjects() {
    return numberOfObjects;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double newRadius) throws IllegalArgumentException {
    if (newRadius >= 0) {
      radius = newRadius;
    } else {
      throw new IllegalArgumentException("Radius cannot be negative");
    }
  }

  public double findArea() {
    return radius * radius * 3.14159;
  }
}
