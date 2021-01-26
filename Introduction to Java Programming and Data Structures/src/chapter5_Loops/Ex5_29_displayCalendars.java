package chapter5_Loops;

import java.util.Scanner;

/**
 * **5.29 (Display calendars)
 * Write a program that prompts the user to enter the year and
 * first day of the year and displays the calendar table for
 * the year on the console.
 * <p>
 * January 2013
 * ----------------------------
 * Sun Mon Tue Wed Thu Fri Sat
 * 1   2   3   4   5
 * 6   7   8   9  10  11  12
 * 13  14  15  16  17  18  19
 * 20  21  22  23  24  25  26
 * 27  28  29  30  31
 *
 * @author Mr.Dr.Professor
 * @since 25-Jan-21 12:51 PM
 */
class Ex5_29_displayCalendars {
  static final String[] months = {"", "January", "February", "March", "April", "May",
                                  "June", "July", "August", "September", "October", "November", "December"};

  public static void main(String[] args) {
    // prompt
    Scanner console = new Scanner(System.in);
    System.out.print("Enter year: ");
    int year = console.nextInt();
    System.out.print("Enter first day of year (0-Sunday, 1-Monday,...): ");
    int firstDay = console.nextInt();


    for (int i = 1; i <= 12; i++) {
      // headers
      System.out.printf("\n%15s %d\n", months[i], year);
      System.out.println("-".repeat(29));
      System.out.printf("%4s%4s%4s%4s%4s%4s%4s%n",
                        "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat");

      // offset of first day of the month
      for (int j = 0; j < firstDay; j++)
        System.out.print(" ".repeat(4));

      int daysInMonth = getDaysInMonth(i, year);
      for (int k = 1; k <= daysInMonth; k++) {
        System.out.printf("%4d", k);

        // wrap to next line at end of week
        if ((k + firstDay) % 7 == 0)
          System.out.println();
      }

      // update first day to first day of the next month
      firstDay = (firstDay + daysInMonth) % 7;

      System.out.println();
    }
  }

  private static int getDaysInMonth(int month, int year) {
    switch (month) {
      case 4:
      case 6:
      case 8:
      case 10:
        return 30;
      case 2:
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0) ?
               29 : 28;
      default:
        return 31;
    }
  }
}
