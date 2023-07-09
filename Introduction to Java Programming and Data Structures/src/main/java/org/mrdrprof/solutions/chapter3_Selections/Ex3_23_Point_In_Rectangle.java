package org.mrdrprof.solutions.chapter3_Selections;

import java.util.Scanner;

/**
 * **3.23 (Geometry: point in a rectangle?)
 * Checks whether the point is within the rectangle centred
 * <p>
 * Created by ag on 28-Oct-20 11:36 AM
 */
class Ex3_23_Point_In_Rectangle {
  public static void main (String[] args) {
    final int WIDTH   = 10;
    final int HEIGHT  = 5;
    final int CX      = 1, CY = 1; // square is centered in (1, 1)
    Scanner   scanner = new Scanner(System.in);

    System.out.print("Enter a point with two coordinates: ");
    double x = scanner.nextDouble();
    double y = scanner.nextDouble();

    // Horizontal and vertical distance to axis
    double dx = Math.abs(x - CX);
    double dy = Math.abs(y - CY);

    boolean inRectangle = dx <= WIDTH / 2.0 && dy <= HEIGHT / 2.0;
    System.out.println("Point (" + x + ", " + y + ") is "
            + (inRectangle ? "" : "not ") + "in the rectangle");

  }
}
