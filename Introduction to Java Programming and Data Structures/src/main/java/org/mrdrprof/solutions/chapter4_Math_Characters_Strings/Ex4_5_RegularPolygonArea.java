package org.mrdrprof.solutions.chapter4_Math_Characters_Strings;

import java.util.Scanner;

import static java.lang.Math.PI;
import static java.lang.Math.tan;

/**
 * *4.5 (Geometry: area of a regular polygon)
 * A regular polygon is an n-sided polygon in which all sides are of
 * the same length and all angles have the same degree
 * (i.e., the polygon is both equilateral and equiangular).
 *
 * @author Mr.Dr.Professor
 * @since 12-Nov-20 7:33 PM
 */
class Ex4_5_RegularPolygonArea {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the number of sides: ");
    int n = scanner.nextInt();

    System.out.print("Enter the side: ");
    double s = scanner.nextDouble();

    if (n <= 0 || s <= 0) {
      System.err.printf("Sides (n = %d) nor side-length (s = %.2f) " +
              "can be negative or zero!", n, s);
      return;
    }

    double area = (n * s * s) / (4 * tan(PI / n));
    System.out.println("The area of the polygon is " + area);
  }
}
