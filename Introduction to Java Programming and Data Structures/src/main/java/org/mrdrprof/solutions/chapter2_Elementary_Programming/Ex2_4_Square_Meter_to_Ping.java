package org.mrdrprof.solutions.chapter2_Elementary_Programming;

import java.util.Scanner;

/**
 * 2.4 (Convert square meter into ping)
 *
 * Created by ag on 13-Oct-20 1:32 PM
 */
class Ex2_4_Square_Meter_to_Ping {
  public static void main(String[] args) {
    final double SQ_METER_IN_PING = 0.3025;
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a number in square meters: ");
    double squareMeters = scanner.nextDouble();

    System.out.printf("%.1f square meters is %.3f pings",
                      squareMeters, squareMeters * SQ_METER_IN_PING);
  }
}
