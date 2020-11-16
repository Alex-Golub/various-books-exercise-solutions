package chapter4_Math_Characters_Strings;

import java.time.Year;
import java.util.Scanner;

/**
 * *4.17 (Days of a month)
 * Write a program that prompts the user to enter the year and the
 * first three letters of a month name
 * (with the first letter in uppercase) and displays
 * the number of days in the month. If the input for month is
 * incorrect, display a message.
 *
 * @author Mr.Dr.Professor
 * @since 16-Nov-20 4:58 PM
 */
class Ex4_17_DaysOfMonth {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.print("Enter a year: ");
      int year = scanner.nextInt();
      System.out.print("Enter a month (Jan, Feb, Mar etc.): ");
      String month = scanner.next();

      if (!isValidMonth(month) || year <= 0) {
        System.out.printf("Month(=%s) or Year(=%d) are not correct\n\n",
                month, year);
        continue;
      }

      int days = 31;
      switch (month) {
        case "Apr":
        case "Jun":
        case "Sep":
        case "Nov":
          days = 30;
          break;
        case "Feb":
          days = Year.isLeap(year) ? 29 : 28;
          break;
      }

      System.out.println(month + " " + year + " has " + days + " days\n");

    }
  }

  public static boolean isValidMonth(String month) {
    return month.length() == 3 &&
            Character.isUpperCase(month.charAt(0)) &&
            month.substring(1).toLowerCase().equals(month.substring(1));
  }
}
