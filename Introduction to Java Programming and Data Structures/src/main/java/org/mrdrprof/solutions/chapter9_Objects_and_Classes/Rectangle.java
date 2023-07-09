package org.mrdrprof.solutions.chapter9_Objects_and_Classes;

/**
 * 9.1 (The Rectangle class)
 *
 * See UML-Rectangle.jpg
 *
 * @author Mr.Dr.Professor
 * @since 19/03/2021 11:40
 */
/*public*/ class Rectangle {
  private double width;
  private double height;

  public Rectangle() {
    width = height = 1;
  }

  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  public double getArea() {
    return width * height;
  }

  public double getPerimeter() {
    return 2 * (width + height);
  }

  public static void main(String[] args) {
    Rectangle r1 = new Rectangle(4, 40);
    Rectangle r2 = new Rectangle(3.5, 35.9);

    System.out.println("Expected area of r1 = 160, got " + r1.getArea());
    System.out.println("Expected area of r2 = 125.65, got " + r2.getArea());
    System.out.println("-".repeat(10));
    System.out.println("Expected perimeter of r1 = 88, got " + r1.getPerimeter());
    System.out.println("Expected perimeter of r2 = 78.8, got " + r2.getPerimeter());
  }
}
