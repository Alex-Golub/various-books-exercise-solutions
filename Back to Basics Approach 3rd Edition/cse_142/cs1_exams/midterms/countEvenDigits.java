package cse_142.cs1_exams.midterms;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/exams/midterms/midterm3/countEvenDigits
 *
 * test #1: countEvenDigits(8546587)
 *          return:4
 *          result: pass
 *
 * test #2: countEvenDigits(7542)
 *          return:2
 *          result: pass
 *
 * test #3: countEvenDigits(2886442)
 *          return:7
 *          result: pass
 *
 * test #4: countEvenDigits(1939537)
 *          return:0
 *          result: pass
 *
 * test #5: countEvenDigits(4)
 *          return:1
 *          result: pass
 *
 * test #6: countEvenDigits(5)
 *          return:0
 *          result: pass
 *
 * @author Alex Golub
 * @since 10-Apr-21 12:14 PM
 */
class countEvenDigits {
  // pre: n > 0
  public static int countEvenDigits(int n) {
    int evens = 0;

    while (n != 0) {
      evens += n % 10 % 2 == 0 ? 1 : 0;
      n /= 10;
    }

    return evens;
  }
}
