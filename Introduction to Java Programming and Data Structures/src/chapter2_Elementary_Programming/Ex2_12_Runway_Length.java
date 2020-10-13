package chapter2_Elementary_Programming;

import java.util.Scanner;

/**
 * 2.12 (Physics: finding runway length)
 * Given an airplane’s acceleration a and take-off speed v.
 * Write a program that prompts the user to enter v in meters/second (m/s)
 * and the acceleration a in meters/second squared (m/s2),
 * then, displays the minimum runway length.
 *
 * Created by ag on 13-Oct-20 6:13 PM 
 */
class Ex2_12_Runway_Length {
  public static void main(String[] args) {
    System.out.print("Enter speed (m/s) and acceleration (m^2/s): ");
    Scanner scanner = new Scanner(System.in);
    double  v       = scanner.nextDouble();
    double  a       = scanner.nextDouble();

    // Length calculated with 3 digits after decimal point
    double length = (int) (0.5 + ((v * v) / (2 * a)) * 1e3) / 1e3;
    System.out.println("The minimum runway length for this airplane is " + length);
  }
}
