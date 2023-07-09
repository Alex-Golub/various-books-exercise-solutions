package org.mrdrprof.solutions.chapter6_Methods;

import java.util.Scanner;

/**
 * **6.34 (Print calendar)
 *
 * @author Mr.Dr.Professor
 * @since 31-Jan-21 10:45 PM
 */
class Ex6_34_printCalendarZeller {

  /**
   * Main method
   */
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter year
    System.out.print("Enter full year (e.g., 2001): ");
    int year = input.nextInt();

    // Prompt the user to enter month
    System.out.print("Enter month in number between 1 and 12: ");
    int month = input.nextInt();

    // Print calendar for the month of the year
    printMonth(year, month);
  }

  /**
   * Print the calendar for a month in a year
   */
  public static void printMonth(int year, int month) {
    // Print the headings of the calendar
    printMonthTitle(year, month);

    // Print the body of the calendar
    printMonthBody(year, month);
  }

  /**
   * Print the month title, e.g., May, 1999
   */
  public static void printMonthTitle(int year, int month) {
    System.out.println("         " + getMonthName(month) + " " + year);
    System.out.println("-----------------------------");
    System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
  }

  /**
   * Get the English name for the month
   */
  public static String getMonthName(int month) {
    return switch (month) {
      case 1 -> "January";
      case 2 -> "February";
      case 3 -> "March";
      case 4 -> "April";
      case 5 -> "May";
      case 6 -> "June";
      case 7 -> "July";
      case 8 -> "August";
      case 9 -> "September";
      case 10 -> "October";
      case 11 -> "November";
      case 12 -> "December";
      default -> "";
    };
  }

  /**
   * Print month body
   */
  public static void printMonthBody(int year, int month) {
    // Get start day of the week for the first date in the month
    int startDay = getStartDay(year, month);

    // Get number of days in the month
    int numberOfDaysInMonth = getNumberOfDaysInMonth(year, month);

    // Pad space before the first day of the month
    int i = 0;
    for (i = 0; i < startDay; i++)
      System.out.print("    ");

    for (i = 1; i <= numberOfDaysInMonth; i++) {
      System.out.printf("%4d", i);

      if ((i + startDay) % 7 == 0)
        System.out.println();
    }

    System.out.println();
  }

  /**
   * Get the start day of month/1/year
   * This time using Zeller's algorithm
   */
  public static int getStartDay(int year, int month) {
    if (month == 1 || month == 2) {
      month = month == 1 ? 13 : 14;
      year--;
    }

    int k = year % 100; // year of the century
    int j = year / 100;
    return (26 * (month + 1) / 10 + k + k / 4 + j / 4 + 5 * j) % 7; // day of week
  }

  /**
   * Get the total number of days since January 1, 1800
   */
  public static int getTotalNumberOfDays(int year, int month) {
    int total = 0;

    // Get the total days from 1800 to 1/1/year
    for (int i = 1800; i < year; i++)
      if (isLeapYear(i))
        total = total + 366;
      else
        total = total + 365;

    // Add days from Jan to the month prior to the calendar month
    for (int i = 1; i < month; i++)
      total = total + getNumberOfDaysInMonth(year, i);

    return total;
  }

  /**
   * Get the number of days in a month
   */
  public static int getNumberOfDaysInMonth(int year, int month) {
    if (month == 1 || month == 3 || month == 5 || month == 7 ||
        month == 8 || month == 10 || month == 12)
      return 31;

    if (month == 4 || month == 6 || month == 9 || month == 11)
      return 30;

    if (month == 2) return isLeapYear(year) ? 29 : 28;

    return 0; // If month is incorrect
  }

  /**
   * Determine if it is a leap year
   */
  public static boolean isLeapYear(int year) {
    return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
  }
}
