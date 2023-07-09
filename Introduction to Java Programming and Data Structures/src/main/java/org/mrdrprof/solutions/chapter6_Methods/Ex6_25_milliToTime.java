package org.mrdrprof.solutions.chapter6_Methods;

import java.util.Scanner;

/**
 * **6.25 (Convert milliseconds to hours, minutes, and seconds)
 *
 * @author Mr.Dr.Professor
 * @since 28-Jan-21 10:39 PM
 */
class Ex6_25_milliToTime {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.print("Enter number of milli-seconds: ");
      System.out.println(convertMillis(scanner.nextLong()));
    }
  }

  public static String convertMillis(long millis) {
    long totalSeconds = millis / 1000;
    long seconds      = totalSeconds % 60;

    long totalMinutes = totalSeconds / 60;
    long minutes      = totalMinutes % 60;

//    long totalHours = totalMinutes / 60;
    long hours = totalMinutes / 60;

    return String.format("%02d:%02d:%02d\n",
                         hours, minutes, seconds);
  }

}
