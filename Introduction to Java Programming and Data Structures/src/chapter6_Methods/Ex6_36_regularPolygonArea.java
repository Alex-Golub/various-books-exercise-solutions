package chapter6_Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * *6.36 (Geometry: area of a regular polygon)
 * A regular polygon is an n-sided polygon
 * in which all sides are of the same length and all
 * angles have the same degree (i.e., the polygon is both
 * equilateral and equiangular).
 *
 * @author Mr.Dr.Professor
 * @since 31-Jan-21 10:58 PM
 */
class Ex6_36_regularPolygonArea {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.print("Enter the number of sides: ");
      int n = scanner.nextInt();
      System.out.print("Enter the side: ");
      double side = scanner.nextDouble();

      System.out.println("The area of the polygon is " +
                         DecimalFormat.getInstance().format(area(n, side)) +
                         "\n");

    }
  }

  public static double area(int n, double side) {
    if (n <= 2)
      throw new IllegalArgumentException("Polygon must have 3 or more sides: " + n);
    if (side < 0)
      throw new IllegalArgumentException("Polygon side can't be -ve value: " + side);

    return n * side * (side / (4 * Math.tan(Math.PI / n)));
  }

}
