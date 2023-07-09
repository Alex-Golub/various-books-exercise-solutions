package org.mrdrprof.solutions.chapter2_Elementary_Programming;

import java.util.Scanner;

/**
 * *2.8 (Current time)
 * Listing 2.7, ShowCurrentTime.java, gives a program that displays
 * the current time in GMT. Revise the program so it prompts the user to enter the
 * time zone offset to GMT and displays the time in the specified time zone.
 *
 * Created by ag on 13-Oct-20 3:09 PM 
 */
class Ex2_8_Time {
  public static void main(String[] args) {

    long totalSeconds = System.currentTimeMillis() / 1000; // 1e-3 / 1e3 => 1e0 = 1

    final int SECONDS_PER_HOUR = 60 * 60;
    final int MINUTES_PER_HOUR = 60;
    final int HOURS_PER_DAY    = 24;

    int h = (int) totalSeconds / SECONDS_PER_HOUR % HOURS_PER_DAY;
    int m = (int) totalSeconds / MINUTES_PER_HOUR % MINUTES_PER_HOUR;
    int s = (int) totalSeconds % MINUTES_PER_HOUR;

    System.out.printf("Current GMT: %02d:%02d:%02d\n", h, m, s);

    System.out.print("Enter the time zone offset to GMT: ");
    Scanner scanner = new Scanner(System.in);
    int     offset  = scanner.nextInt();

    h = (h + offset) % HOURS_PER_DAY;
    System.out.printf("GMT offset by %d hours: %02d:%02d:%02d\n",
                      offset, h, m, s);
  }
}
