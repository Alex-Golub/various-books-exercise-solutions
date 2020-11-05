package chapter3_Selections;

import java.util.Scanner;

/**
 * *3.30 (Current time)
 * Revise Programming Exercise 2.8 to display the hour using a 12-hour clock.
 * <p>
 * Created by ag on 29-Oct-20 6:56 PM
 */
class Ex3_30_Current_Time {
  public static void main(String[] args) {
    while (true) {
      long totalSeconds = System.currentTimeMillis() / 1000;

      final int SECONDS_IN_HOUR = 60 * 60;
      final int MINUTES_IN_HOUR = 60;
      final int HOURS_IN_DAY    = 24;

      int h = (int) totalSeconds / SECONDS_IN_HOUR % HOURS_IN_DAY;
      int m = (int) totalSeconds / MINUTES_IN_HOUR % MINUTES_IN_HOUR;
      int s = (int) totalSeconds % MINUTES_IN_HOUR;

      String amPm = h < 12 ? "AM" : "PM";

      System.out.printf("Current GMT: %02d:%02d:%02d %s\n", h % 12, m, s, amPm);

      System.out.print("Enter the time zone offset to GMT: ");
      Scanner scanner = new Scanner(System.in);
      int     offset  = scanner.nextInt();

      h = (h + offset) % HOURS_IN_DAY;
      amPm = h < 12 ? "AM" : "PM";
      System.out.printf("GMT offset by %d hours: %02d:%02d:%02d %s\n\n",
              offset, h % 12, m, s, amPm);
    }
  }
}
