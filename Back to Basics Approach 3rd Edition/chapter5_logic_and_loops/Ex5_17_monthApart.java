package chapter5_logic_and_loops;

/**
 * 17. Write a method called monthApart that accepts four integer parameters,
 * m1, d1, m2, and d2, representing two calendar dates.
 * Each date consists of a month (1 through 12) and a day
 * (1 through the number of days in that month [28–31]).
 * Assume that all parameter values passed are valid.
 * The method should return true if the dates are at least
 * a month apart and false otherwise.
 * <p>
 * Assume that all the dates in this problem occur during the same year.
 * Note that the first date could come before or after the second date.
 *
 * @author Mr.Dr.Professor
 * @since 21-Dec-20 3:05 PM
 */
class Ex5_17_monthApart {
  public static void main(String[] args) {
    System.out.println(monthApart(6, 14, 9, 21) + " => " + true);
    System.out.println(monthApart(4, 5, 5, 15) + " => " + true);
    System.out.println(monthApart(4, 15, 5, 15) + " => " + true);
    System.out.println(monthApart(4, 16, 5, 15) + " => " + false);
    System.out.println(monthApart(6, 14, 6, 8) + " => " + false);
    System.out.println(monthApart(7, 7, 6, 8) + " => " + false);
    System.out.println(monthApart(7, 8, 6, 8) + " => " + true);
    System.out.println(monthApart(10, 14, 7, 15) + " => " + true);
  }

  public static boolean monthApart(int m1, int d1, int m2, int d2) {
    if (Math.abs(m1 - m2) > 1) return true;       // more then one month apart
    if (m1 - m2 == 0) return false;               // same month

    return m1 > m2 ? d1 - d2 >= 0 : d2 - d1 >= 0; // |m1 - m2| == 1, check days apart
  }

  // 1,3,5,7,8,10,12 -> 31
  // 4,6,9,11        -> 30
  // 2               -> 28
}
