package org.mrdrprof.solutions.chapter2_Elementary_Programming;

import java.util.Scanner;

/**
 * *2.7 (Find the number of years)
 * Write a program that prompts the user to enter the
 * minutes (e.g., 1 billion), and displays the number of years and
 * remaining days for the minutes.
 *
 * Created by ag on 13-Oct-20 2:24 PM 
 */
class Ex2_7_Number_of_Years {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the number of minutes: ");
    long minutes = scanner.nextLong();

    final int MIN_PER_YEAR = 60 * 24 * 365;
    final int MIN_PER_DAY  = 24 * 60;
    long      years        = minutes / MIN_PER_YEAR;
    long      days         = minutes / MIN_PER_DAY % 365;

    System.out.printf("%,d minutes is approximately %,d years and %d days",
                      minutes, years, days);
  }
}
