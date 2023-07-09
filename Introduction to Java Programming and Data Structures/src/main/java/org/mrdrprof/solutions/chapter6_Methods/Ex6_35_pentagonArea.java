package org.mrdrprof.solutions.chapter6_Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * 6.35 (Geometry: area of a pentagon)
 *
 * @author Mr.Dr.Professor
 * @since 31-Jan-21 10:55 PM
 */
class Ex6_35_pentagonArea {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.print("Enter the side: ");
      double side = scanner.nextDouble();
      System.out.println("The area of the pentagon is " +
                         DecimalFormat.getInstance().format(area(side)) + "\n");
    }

  }

  public static double area(double side) {
    if (side < 0)
      throw new IllegalArgumentException("Side can't be negative value: " + side);

    return (5 * side * side) / (4 * Math.tan(Math.PI / 5));
  }
}
