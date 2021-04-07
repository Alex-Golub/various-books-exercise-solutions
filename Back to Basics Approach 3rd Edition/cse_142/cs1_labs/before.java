package cse_142.cs1_labs;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/labs/lab5/before
 *
 * One date is considered to come before another if it comes earlier in the year.
 *
 * @author Alex Golub
 * @since 05-Apr-21 3:34 PM
 */
class before {
  public static void main(String[] args) {
    System.out.println(before(6, 3, 9, 20) + " => " + true);
    System.out.println(before(10, 1, 2, 25)	+ " => " + false);
    System.out.println(before(8, 15, 8, 15)	+ " => " + false);
    System.out.println(before(8, 15, 8, 16)	+ " => " + true);
  }

  public static boolean before(int m1, int d1, int m2, int d2) {
    return m1 < m2 || (m1 == m2 && d1 < d2);
  }
}
