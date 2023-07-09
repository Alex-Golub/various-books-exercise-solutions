package org.mrdrprof.solutions.chapter5_Loops;

/**
 * **5.27 (Display leap years)
 * Write a program that displays all the leap years, ten per line,
 * from 2014 to 2114, separated by exactly one space.
 * Also display the number of leap years in this period.
 *
 * @author Mr.Dr.Professor
 * @since 22-Jan-21 7:42 PM
 */
class Ex5_27_leapYears {
  public static void main(String[] args) {
    final int LEAP_PER_LINE = 10;
    final int FROM          = 2014;
    final int TO            = 2114;
    int       leapCount     = 0;

    for (int year = FROM; year <= TO; year++) {
      if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
        System.out.print(year);
        leapCount++;

        if (leapCount % LEAP_PER_LINE == 0) {
          System.out.println();
        } else {
          System.out.print(" ");
        }
      }
    }

    System.out.println("\n\nTotal leap years from " + FROM + " to " + TO + " is " + leapCount);
  }
}
