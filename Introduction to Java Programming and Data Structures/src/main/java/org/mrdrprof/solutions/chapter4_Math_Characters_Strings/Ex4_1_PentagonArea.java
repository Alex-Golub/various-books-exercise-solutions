package org.mrdrprof.solutions.chapter4_Math_Characters_Strings;

import java.util.Scanner;

/**
 * 4.1 (Geometry: area of a pentagon)
 * Round up two digits after the decimal point.
 *
 * @author Mr.Dr.Professor
 * @since 12-Nov-20 6:21 PM
 */
class Ex4_1_PentagonArea {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the length from the center to a vertex: ");
    double r = Double.parseDouble(scanner.next());

    double s = 2 * r * Math.sin(Math.PI / 5);
    double area = (5 * s * s) / (4 * Math.tan(Math.PI / 5));

    System.out.printf("The area of the pentagon is %.2f\n", area);
  }
}
