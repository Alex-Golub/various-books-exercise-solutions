package chapter5_Loops;

import java.time.Month;
import java.time.Year;
import java.util.Scanner;

/**
 * **5.28 (Display the first days of each month)
 * Write a program that prompts the user to
 * enter the year and first day of the year,
 * then displays the first day of each month in
 * the year.
 *
 * @author Mr.Dr.Professor
 * @since 22-Jan-21 7:52 PM
 */
class Ex5_28_firstDayOfMonth {
  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    System.out.print("Enter Year => ");
    int year = console.nextInt();

    System.out.print("First day of year (0-6) => ");
    int firstDayOfMonth = console.nextInt();

    System.out.printf("\n%-10s %d, %d is %s\n",
                      Month.of(1), 1, year, getDayName(firstDayOfMonth));

    for (int month = 2; month <= 12; month++) {
      firstDayOfMonth = (firstDayOfMonth + getDaysInMonth(year, month - 1)) % 7;
      System.out.printf("%-10s %d, %d is %s\n",
                        Month.of(month), 1, year, getDayName(firstDayOfMonth));
    }
  }

  private static String getDayName(int day) {
    if (day < 0 || day > 6)
      throw new IllegalStateException("Invalid day: " + day);

    String name;
    switch (day) {
      case 0:
        name = "Sunday";
        break;
      case 1:
        name = "Monday";
        break;
      case 2:
        name = "Tuesday";
        break;
      case 3:
        name = "Wednesday";
        break;
      case 4:
        name = "Thursday";
        break;
      case 5:
        name = "Friday";
        break;
      default:
        name = "Saturday";
        break;
    }

    return name;
  }

  private static int getDaysInMonth(int year, int month) {
    int daysInMonth;

    switch (month) {
      case 4:
      case 6:
      case 9:
      case 11:
        daysInMonth = 30;
        break;

      case 2:
        daysInMonth = Year.isLeap(year) ? 29 : 28;
        break;

      default:
        daysInMonth = 31;
        break;
    }

    return daysInMonth;
  }
}
