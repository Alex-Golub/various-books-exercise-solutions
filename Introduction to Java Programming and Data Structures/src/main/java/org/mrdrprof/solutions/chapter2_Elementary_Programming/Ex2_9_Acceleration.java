package org.mrdrprof.solutions.chapter2_Elementary_Programming;

import java.util.Scanner;

/**
 * 2.9 (Physics: acceleration)
 * Average acceleration is defined as the change of velocity
 * divided by the time taken to make the change.
 * Write a program that prompts the user to enter the starting velocity
 * v0 in meters/second, the ending velocity v1 in meters/second,
 * and the time span t in seconds,
 * then displays the average acceleration.
 *
 * Created by ag on 13-Oct-20 3:35 PM 
 */
class Ex2_9_Acceleration {
  public static void main(String[] args) {
    System.out.print("Enter v0, v1, and t: ");
    Scanner scanner = new Scanner(System.in);
    double  v0      = scanner.nextDouble();
    double  v1      = scanner.nextDouble();
    double  t       = scanner.nextDouble();

    double avgAcceleration = (v1 - v0) / t;

    // Round forth decimal digits
    System.out.println("The average acceleration is " + (int) (avgAcceleration * 1e4 + 0.5) / 1e4);

    // Rounding using printf
    System.out.printf("The average acceleration is %.4f\n", avgAcceleration);
  }
}
