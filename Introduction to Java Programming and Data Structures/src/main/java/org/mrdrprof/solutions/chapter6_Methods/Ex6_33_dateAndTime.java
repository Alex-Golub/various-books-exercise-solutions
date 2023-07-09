package org.mrdrprof.solutions.chapter6_Methods;

import java.time.LocalDate;

/**
 * **6.33 (Current date and time)
 *
 * @author Mr.Dr.Professor
 * @since 31-Jan-21 10:26 PM
 */
class Ex6_33_dateAndTime {
  public static void main(String[] args) {
    System.out.println("Current date and time is " + getDate() + " " + getTime());
  }

  public static String getTime() {
    long totalSeconds = System.currentTimeMillis() / 1000;
    long seconds      = totalSeconds % 60;

    long totalMinutes = totalSeconds / 60;
    long minuets      = totalMinutes % 60;

    long totalHours = 2 + totalMinutes / 60; // Israel Time
    long hours      = totalHours % 24;

    return String.format("%02d:%02d:%02d", hours, minuets, seconds);
  }

  public static String getDate() {
    LocalDate localDate = LocalDate.now();

    return localDate.getMonth().toString() + " " +
           localDate.getDayOfMonth() + ", " +
           localDate.getYear();
  }


}
