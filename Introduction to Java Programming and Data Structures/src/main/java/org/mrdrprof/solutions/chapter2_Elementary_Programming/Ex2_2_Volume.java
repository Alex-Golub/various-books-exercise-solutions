package org.mrdrprof.solutions.chapter2_Elementary_Programming;

import java.util.Scanner;

/**
 * 2.2 (Compute the volume of a triangle)
 * Write a program that reads in the length of
 * sides of an equilateral triangle and computes the area and volume
 *
 * Created by ag on 13-Oct-20 1:18 PM 
 */
class Ex2_2_Volume {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter length of the sides and height " +
                         "of the Equilateral triangle: ");

    double side   = scanner.nextDouble();
    double area   = side * side * Math.pow(3, 0.5) / 4;
    double volume = area * side;

    System.out.printf("The area is %,.2f\n", area);
    System.out.printf("The volume of the Triangular prism is %,.2f\n", volume);
  }
}
