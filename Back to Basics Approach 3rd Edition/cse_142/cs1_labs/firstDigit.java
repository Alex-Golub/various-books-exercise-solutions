package cse_142.cs1_labs;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/labs/lab5/firstDigit
 *
 * test #1:firstDigit(3572)
 *         return:3
 *         result: pass
 *
 * test #2:firstDigit(-947)
 *         return:9
 *         result: pass
 *
 * test #3:firstDigit(6)
 *         return:6
 *         result: pass
 *
 * test #4:firstDigit(35)
 *         return:3
 *         result: pass
 *
 * test #5:firstDigit(123456)
 *         return:1
 *         result: pass
 *
 * test #6:firstDigit(10765)
 *         return:1
 *         result: pass
 *
 * test #7:firstDigit(-20)
 *         return:2
 *         result: pass
 *
 * test #8:firstDigit(-10)
 *         return:1
 *         result: pass
 *
 * @author Alex Golub
 * @since 05-Apr-21 4:07 PM
 */
class firstDigit {
  public static int firstDigit(int n) {
    n = Math.abs(n);
    while (n > 9) {
      n /= 10;
    }

    return n;
  }
}
