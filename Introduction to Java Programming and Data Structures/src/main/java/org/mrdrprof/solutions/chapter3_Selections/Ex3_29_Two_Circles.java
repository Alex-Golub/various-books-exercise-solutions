package org.mrdrprof.solutions.chapter3_Selections;

import java.util.Scanner;

/**
 * **3.29 (Geometry: two circles) Write a program that prompts the user
 * to enter the center coordinates and radii of two circles and determines
 * whether the second circle is inside the first or overlaps with the first.
 * <p>
 * Created by ag on 29-Oct-20 6:32 PM
 */
class Ex3_29_Two_Circles {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter circle1’s center x-, y-coordinates, and radius: ");
    double c1x = scanner.nextDouble();
    double c1y = scanner.nextDouble();
    double r1  = scanner.nextDouble();
    System.out.print("Enter circle2’s center x-, y-coordinates, and radius: ");
    double c2x = scanner.nextDouble();
    double c2y = scanner.nextDouble();
    double r2  = scanner.nextDouble();

    double distanceBetweenCenters = Math.sqrt((Math.pow(c1x - c2x, 2) +
            Math.pow(c1y - c2y, 2)));

    if (distanceBetweenCenters <= r1 - r2) {
      System.out.println("Circle2 is inside Circle1");
    } else if (distanceBetweenCenters <= r1 + r2) {
      System.out.println("Circle2 overlaps Circle1");
    } else {
      System.out.println("Circle2 is outside of Circle1");
    }

  }
}
