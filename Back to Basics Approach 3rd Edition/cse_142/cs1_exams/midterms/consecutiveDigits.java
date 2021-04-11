package cse_142.cs1_exams.midterms;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/exams/midterms/midterm5/consecutiveDigits
 *
 * test #1: consecutiveDigits(0)
 *          return:1
 *          result: pass
 *
 * test #2: consecutiveDigits(18)
 *          return:1
 *          result: pass
 *
 * test #3: consecutiveDigits(394)
 *          return:1
 *          result: pass
 *
 * test #4: consecutiveDigits(99)
 *          return:2
 *          result: pass
 *
 * test #5: consecutiveDigits(8229)
 *          return:2
 *          result: pass
 *
 * test #6: consecutiveDigits(8823)
 *          return:2
 *          result: pass
 *
 * test #7: consecutiveDigits(777)
 *          return:3
 *          result: pass
 *
 * test #8: consecutiveDigits(82888)
 *          return:3
 *          result: pass
 *
 * test #9: consecutiveDigits(7111171)
 *          return:4
 *          result: pass
 *
 * test #10: consecutiveDigits(233333888)
 *           return:5
 *           result: pass
 *
 * test #11: consecutiveDigits(999999999)
 *           return:9
 *           result: pass
 *
 * @author Alex Golub
 * @since 10-Apr-21 2:42 PM
 */
class consecutiveDigits {
  public static void main(String[] args) {
    System.out.println(consecutiveDigits(333555585));
  }

  public static int consecutiveDigits(int n) {
    int currentDigit = n % 10;
    n /= 10;
    int count = 1;
    int maxSoFar = 1; // max count occurred so far

    while (n != 0) {
      if (n % 10 == currentDigit) {
        count++;
      } else {
        maxSoFar = Math.max(maxSoFar, count);
        count = 1;
        currentDigit = n % 10;
      }

      n /= 10;
    }

    return Math.max(count, maxSoFar);
  }
}
