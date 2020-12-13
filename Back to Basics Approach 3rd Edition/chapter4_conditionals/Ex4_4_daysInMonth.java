package chapter4_conditionals;

/**
 * 4. Write a method called daysInMonth that takes a month
 * (an integer between 1 and 12) as a parameter and returns
 * the number of days in that month in this year.
 * For example, the call daysInMonth(9) would return 30 because
 * September has 30 days.
 * Assume that the code is not being run during a leap year
 * (that February always has 28 days).
 *
 * @author Mr.Dr.Professor
 * @since 10-Dec-20 1:37 PM
 */
class Ex4_4_daysInMonth {
  public static int daysInMonth(int m) {
    if (m == 2)
      return 28;
    if (m == 4 || m == 6 || m == 9 || m == 11)
      return 30;
    return 31;
  }
}
