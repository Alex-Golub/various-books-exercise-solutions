package cse_142.cs1_exams.midterms;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/exams/midterms/midterm7/digitsInARow
 *
 * test #1: digitsInARow(0)
 *          return:1
 *          result: pass
 *
 * test #2: digitsInARow(18)
 *          return:1
 *          result: pass
 *
 * test #3: digitsInARow(394)
 *          return:1
 *          result: pass
 *
 * test #4: digitsInARow(99)
 *          return:2
 *          result: pass
 *
 * test #5: digitsInARow(8229)
 *          return:2
 *          result: pass
 *
 * test #6: digitsInARow(8823)
 *          return:2
 *          result: pass
 *
 * test #7: digitsInARow(777)
 *          return:3
 *          result: pass
 *
 * test #8: digitsInARow(82888)
 *          return:3
 *          result: pass
 *
 * test #9: digitsInARow(7111171)
 *          return:4
 *          result: pass
 *
 * test #10: digitsInARow(233333888)
 *           return:5
 *           result: pass
 *
 * test #11: digitsInARow(999999999)
 *           return:9
 *           result: pass
 *
 * @author Alex Golub
 * @since 10-Apr-21 5:26 PM
 */
class digitsInARow {
  public static int digitsInARow(int n) {
    int currentDigit = n % 10;
    n /= 10;
    int occurrences = 1;
    int maxSoFar = 1;

    while (n != 0) {
      if (n % 10 == currentDigit) {
        occurrences++;
      } else {
        maxSoFar = Math.max(maxSoFar, occurrences);
        occurrences = 1;
        currentDigit = n % 10;
      }

      n /= 10;
    }

    return Math.max(maxSoFar, occurrences);
  }
}
