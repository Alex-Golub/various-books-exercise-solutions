package chapter4_conditionals;

import java.time.LocalDate;
import java.time.Year;
import java.util.Scanner;

/**
 * 2. Write a program that prompts for a date (month, day, year)
 * and reports the day of the week for that date. It might be
 * helpful to know that January 1, 1601, was a Monday.
 *
 * @author Mr.Dr.Professor
 * @since 13-Dec-20 8:56 PM
 */
class PP4_2_dayOfWeek {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter month, day, year: ");
    int month = sc.nextInt();
    int day = sc.nextInt();
    int year = sc.nextInt();

    isValid(month, day, year);

    // Using Java 8 LocalDate library
    System.out.println(LocalDate.of(year,month,day).getDayOfWeek().toString());
  }

  private static void isValid(int m, int d, int y) {
    if (m <= 0 || m > 12)
      throw new IllegalArgumentException("Month " + m + " is out of range [1,12]");

    if (y <= 0)
      throw new IllegalArgumentException("Year " + y + " is out of range year > 0");

    if (d <= 0)
      throw new IllegalArgumentException("Day " + d + " is out of range [day is negative]");

    if (m == 2 && (Year.isLeap(y) && d > 29))
      throw new IllegalArgumentException(y + " is leap year and " + d + " is grater then 29");

    if ((m == 4 || m == 6 || m == 9 || m == 11) && d > 30)
      throw new IllegalArgumentException("There are only 30 days in " + m);

    if (d > 31)
      throw new IllegalArgumentException("There are only 31 days in " + m);
  }
}
