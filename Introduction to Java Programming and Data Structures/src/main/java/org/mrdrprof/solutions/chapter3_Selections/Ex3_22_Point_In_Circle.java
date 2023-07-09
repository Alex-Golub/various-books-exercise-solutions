package org.mrdrprof.solutions.chapter3_Selections;

import java.util.Scanner;

/**
 * **3.22 (Geometry: point in a circle?)
 * NOTE: Circle center is origin base (0, 0) with fixed radius of 10
 * <p>
 * Created by ag on 28-Oct-20 12:18 AM
 */
class Ex3_22_Point_In_Circle {
  public static void main (String[] args) {
    Scanner   scanner = new Scanner(System.in);
    final int RADIUS  = 10;

    System.out.print("Enter a point with two coordinates (e.g. 5 9): ");
    int x = scanner.nextInt();
    int y = scanner.nextInt();

    // Distance from this point to center should be less then radius
    double  d        = Math.sqrt(x * x + y * y);
    boolean inCircle = d < RADIUS;
    System.out.println("Point (" + x + ", " + y + ") is "
            + (inCircle ? "" : "not ") + "in the circle");
  }
}
