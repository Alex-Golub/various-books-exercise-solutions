package cse_142.cs1_exams.midterms;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/exams/midterms/midterm2/monthApart
 *
 * @author Alex Golub
 * @since 08-Apr-21 8:57 PM
 */
class monthApart {
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

  /**
   * The method returns whether the dates are at least a month apart.
   * Assume that all dates in this problem occur during the same year.
   * Assume that all parameter values passed are valid.
   */
//  public static boolean monthApart(int m1, int d1, int m2, int d2) {
//    return Math.abs(m1 - m2) > 1 || m1 > m2 && d1 >= d2 || m2 > m1 && d2 >= d1;
//  }

  /**
   * Alternative solution, calculating difference between absolute day of
   * the months
   */
  public static boolean monthApart(int m1, int d1, int m2, int d2) {
    return Math.abs((m1 * 31 + d1) - (m2 * 31 + d2)) >= 31;
  }
}
