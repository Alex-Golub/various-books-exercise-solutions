package CodeStepByStep_java.parameters_and_return;

/**
 * https://www.codestepbystep.com/problem/view/java/parameters/daysInMonth
 *
 * Write a method named daysInMonth that accepts a month
 * (an integer between 1 and 12) as a parameter and returns
 * the number of days in that month.
 * 1. Ignore leap years; assume that February always has 28 days.
 *
 * NOTE: same as getDaysInMonth exercise
 *
 * @author Mr.Dr.Professor
 * @since 24-Feb-21 5:38 PM
 */
/*public*/ class daysInMonth {
  public static int daysInMonth(int m) {
    switch (m) {
      case 4: case 6: case 9: case 11:
        return 30;
      case 2:
        return 28;
    }
    return 31;
  }
}
