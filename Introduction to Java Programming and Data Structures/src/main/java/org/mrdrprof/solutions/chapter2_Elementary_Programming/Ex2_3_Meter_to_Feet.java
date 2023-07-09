package org.mrdrprof.solutions.chapter2_Elementary_Programming;

import java.util.Scanner;

/**
 * 2.3 (Convert meters into feet)
 * One meter is 3.2786 feet.
 *
 * Created by ag on 13-Oct-20 1:28 PM 
 */
class Ex2_3_Meter_to_Feet {
  public static void main(String[] args) {
    final double METER_IN_FEET = 3.2786;
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a value for meter: ");
    double meter = scanner.nextDouble();

    System.out.printf("%,.1f meters is %,.3f feet", meter, meter * METER_IN_FEET);
  }
}
