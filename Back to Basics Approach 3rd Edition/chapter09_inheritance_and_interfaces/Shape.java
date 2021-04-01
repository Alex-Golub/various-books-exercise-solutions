package chapter09_inheritance_and_interfaces;

import java.util.Arrays;

/**
 * 14. Add an equals method to each of the Rectangle, Circle, and Triangle
 * classes introduced in this chapter.
 * Two shapes are considered equal if their fields have equivalent values.
 *
 * Project #5
 *
 * @author Alex Golub
 * @since 30-Mar-21 5:15 PM
 */
class ShapeTest {
  public static void main(String[] args) {
    Shape rectangle = new Rectangle(1, 2, 5, 10);
    System.out.println(Arrays.toString(rectangle.getCoordinates()));
    rectangle.showCoordinates();
    System.out.println("Width = " + ((Rectangle)rectangle).getWidth());
    System.out.println("Height = " + ((Rectangle)rectangle).getHeight());
  }
}

// A general interface for shape classes.
public abstract class Shape {
  private double x;
  private double y;

  public Shape(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public double[] getCoordinates() {
    return new double[] {x, y};
  }

  public void showCoordinates() {
    System.out.printf("[x = %.2f, y = %.2f\n", x, y);
  }

  abstract double getArea();
  abstract double getPerimeter();
}

abstract class RegularPolygon extends Shape {
  private final int sides;
  private final double sideLength;

  RegularPolygon(int sides, double sideLength, double x, double y) {
    super(x, y);

    if (sides < 5 || Double.compare(sideLength, 0.0) <= 0) {
      throw new IllegalArgumentException("Polygon has at least 5 sides, got: "  + sides +
                                         ", and each side length must be +ve value, got: " + sideLength);
    }

    this.sides = sides;
    this.sideLength = sideLength;
  }

  public int getSides() {
    return sides;
  }

  public double getSideLength() {
    return sideLength;
  }

  @Override
  public double getArea() {
    return (getSides() * getSideLength() * getSideLength()) /
           (4 * Math.tan(Math.PI / getSides()));
  }

  @Override
  public double getPerimeter() {
    return getSides() * getSideLength();
  }
}

/**
 * 15. Write a class named Octagon whose objects represent
 * regular octagons (eight-sided polygons).
 */
class Octagon extends RegularPolygon {
  public Octagon(double sideLength, double x, double y) {
    super(8, sideLength, x, y);
  }
}

/**
 * 16. Write a class named Hexagon whose objects represent
 * regular hexagons (6-sided polygons). Your class should
 * implement the Shape interface defined in this chapter.
 */
class Hexagon extends RegularPolygon {
  public Hexagon(double sideLength, double x, double y) {
    super(6, sideLength, x, y);
  }
}

class Triangle extends Shape {
  private final double a;
  private final double b;
  private final double c;

  Triangle(double x, double y, double a, double b, double c) {
    super(x, y);
    this.a = a;
    this.b = b;
    this.c = c;
  }

  // Returns this triangle's area using Heron's formula.
  public double getArea() {
    double s = (a + b + c) / 2.0;
    return Math.sqrt(s * (s - a) * (s - b) * (s - c));
  }

  public double getPerimeter() {
    return a + b + c;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Triangle triangle = (Triangle) o;
    return Double.compare(triangle.a, a) == 0 &&
           Double.compare(triangle.b, b) == 0 &&
           Double.compare(triangle.c, c) == 0;
  }
}

class Rectangle extends Shape {
  private final double width;
  private final double height;

  Rectangle(double x, double y, double width, double height) {
    super(x, y);

    this.width = width;
    this.height = height;
  }

  public double getWidth() {
    return width;
  }

  public double getHeight() {
    return height;
  }

  public double getArea() {
    return width * height;
  }

  public double getPerimeter() {
    return 2.0 * (width + height);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Rectangle rectangle = (Rectangle) o;
    return Double.compare(rectangle.width, width) == 0 &&
           Double.compare(rectangle.height, height) == 0;
  }
}

class Circle extends Shape {
  private final double radius;

  public Circle(double x, double y, double radius) {
    super(x, y);
    this.radius = radius;
  }

  public double getArea() {
    return Math.PI * radius * radius;
  }

  public double getPerimeter() {
    return 2.0 * Math.PI * radius;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Circle circle = (Circle) o;
    return Double.compare(circle.radius, radius) == 0;
  }
}



