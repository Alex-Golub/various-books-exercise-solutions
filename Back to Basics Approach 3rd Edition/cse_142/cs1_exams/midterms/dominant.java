package cse_142.cs1_exams.midterms;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/exams/midterms/midterm11/dominant
 *
 * You may assume that none of the numbers is negative.
 *
 * @author Alex Golub
 * @since 11-Apr-21 7:56 PM
 */
class dominant {
  public static boolean dominant(int a, int b, int c) {
    return a > (b + c) || b > (a + c) || c > (a + b);
  }
}
