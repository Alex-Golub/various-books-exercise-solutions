package chapter9_Objects_and_Classes;

import java.awt.geom.Point2D;
import java.util.Scanner;

/*public*/ class TestPoint2D {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter point1's x-, y-coordinates: ");
    double x1 = input.nextDouble();
    double y1 = input.nextDouble();
    System.out.print("Enter point2's x-, y-coordinates: ");
    double x2 = input.nextDouble();
    double y2 = input.nextDouble();

    Point2D.Double p1 = new Point2D.Double(x1, y1); // Create a Point2D for (x1, y1)
    Point2D.Double p2 = new Point2D.Double(x2, y2);
    System.out.println("p1 is " + p1.toString());
    System.out.println("p2 is " + p2.toString());
    System.out.println("The distance between p1 and p2 is " +
                       p1.distance(p2));
    System.out.println("The midpoint between p1 and p2 is " +
                       "x = " + (p1.getX() + p2.getX()) / 2 + ", " +
                       "y = " + (p1.getY() + p2.getY()) / 2);

  }
}