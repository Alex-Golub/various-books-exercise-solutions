package cse_142.cs1_exams.midterms;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/exams/midterms/midterm6/containsBothDigits
 *
 * test #1: containsBothDigits(12345, 2, 5)
 *          return:true
 *          result: pass
 *
 * test #2: containsBothDigits(3004955, 3, 0)
 *          return:true
 *          result: pass
 *
 * test #3: containsBothDigits(1650, 6, 6)
 *          return:true
 *          result: pass
 *
 * test #4: containsBothDigits(12345, 1, 7)
 *          return:false
 *          result: pass
 *
 * test #5: containsBothDigits(55555, 5, 9)
 *          return:false
 *          result: pass
 *
 * test #6: containsBothDigits(55035, 9, 5)
 *          return:false
 *          result: pass
 *
 * test #7: containsBothDigits(42, 4, 7)
 *          return:false
 *          result: pass
 *
 * test #8: containsBothDigits(11, 1, 1)
 *          return:true
 *          result: pass
 *
 * test #9: containsBothDigits(1, 1, 1)
 *          return:true
 *          result: pass
 *
 * @author Alex Golub
 * @since 10-Apr-21 5:14 PM
 */
class containsBothDigits {
  // a > 0, b and c in range [1, 9]
  public static boolean containsBothDigits(int a, int b, int c) {
    boolean bFound = false, cFound = false;

    while (a != 0 && !(bFound && cFound)) {
      int digit = a % 10;
      if (digit == b) bFound = true;
      if (digit == c) cFound = true;

      a /= 10;
    }

    return bFound && cFound;
  }
}
