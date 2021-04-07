package cse_142.cs1_labs;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/labs/lab5/lastDigit
 *
 * test #1:lastDigit(3572)
 *         return:2
 *         result: pass
 *
 * test #2:lastDigit(-947)
 *         return:7
 *         result: pass
 *
 * test #3:lastDigit(6)
 *         return:6
 *         result: pass
 *
 * test #4:lastDigit(35)
 *         return:5
 *         result: pass
 *
 * test #5:lastDigit(123456)
 *         return:6
 *         result: pass
 *
 * @author Alex Golub
 * @since 05-Apr-21 4:06 PM
 */
class lastDigit {
  public static int lastDigit(int n) {
    return Math.abs(n) % 10;
  }
}
