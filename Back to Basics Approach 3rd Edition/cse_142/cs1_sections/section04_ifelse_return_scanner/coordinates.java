package cse_142.cs1_sections.section04_ifelse_return_scanner;

import java.util.Scanner;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/sections/section4/coordinates
 *
 * @author Alex Golub
 * @since 01-Apr-21 6:29 PM
 */
class coordinates {
  public static double getCoordinates(Scanner console) {
    System.out.print("x coordinate? ");
    double x = console.nextDouble();
    System.out.print("y coordinate? ");
    double y = console.nextDouble();

    int neg = 0;
    if (x < 0.0) neg++;
    if (y < 0.0) neg++;

    System.out.println("negatives = " + neg);
    return x + y + neg;
  }
}
