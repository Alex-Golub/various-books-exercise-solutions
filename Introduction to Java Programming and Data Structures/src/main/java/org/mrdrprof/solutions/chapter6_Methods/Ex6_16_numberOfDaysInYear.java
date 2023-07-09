package org.mrdrprof.solutions.chapter6_Methods;

/**
 * *6.16 (Number of days in a year)
 *
 * @author Mr.Dr.Professor
 * @since 28-Jan-21 6:27 PM
 */
class Ex6_16_numberOfDaysInYear {

  public static void main(String[] args) {
    final int FROM = 2021;
    final int TO   = 2034;
    System.out.printf("Total number of days from %d to %d is %,d\n",
                      FROM, TO, numberOfDaysInYearsRange(FROM, TO));
  }

  private static long numberOfDaysInYearsRange(int from, int to) {
    long total = 0;
    while (from <= to) {
      total += numberOfDaysInAYear(from);
      from++;
    }
    return total;
  }

  public static int numberOfDaysInAYear(int year) {
    return 365 + (isLeap(year) ? 1 : 0);
  }

  private static boolean isLeap(int year) {
    return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
  }
}
