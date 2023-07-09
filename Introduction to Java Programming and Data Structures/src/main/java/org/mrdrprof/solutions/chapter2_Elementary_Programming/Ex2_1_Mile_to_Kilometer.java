package org.mrdrprof.solutions.chapter2_Elementary_Programming;

import java.util.Scanner;

/**
 * 2.1 (Convert mile to kilometer)
 * Write a program that reads a mile in a double value
 * from the console, converts it to kilometers, and displays the result.
 * The formula for the conversion is as follows:
 * 1 mile = 1.6 kilometers
 *
 * Created by ag on 13-Oct-20 12:55 PM 
 */
class Ex2_1_Mile_to_Kilometer {
  public static void main(String[] args) {
    Scanner      scanner    = new Scanner(System.in);
    final double KM_IN_MILE = 1.6;

    System.out.print("Enter miles: ");
    double miles = scanner.nextDouble();

    System.out.printf("%,.2f miles is %,.1f kilometers",
                      miles, miles * KM_IN_MILE);
  }
}
