package cse_142.cs1_labs;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/labs/lab5/digitSum
 *
 * test #1:digitSum(29107)
 *          return:19
 *          result: pass
 *
 * test #2:digitSum(456)
 *          return:15
 *          result: pass
 *
 * test #3:digitSum(9999999)
 *          return:63
 *          result: pass
 *
 * test #4:digitSum(48)
 *          return:12
 *          result: pass
 *
 * test #5:digitSum(120011021)
 *          return:8
 *          result: pass
 *
 * test #6:digitSum(2000000000)
 *          return:2
 *          result: pass
 *
 * test #7:digitSum(5)
 *          return:5
 *          result: pass
 *
 * test #8:digitSum(0)
 *          return:0
 *          result: pass
 *
 * test #9:digitSum(-3)
 *          return:3
 *          result: pass
 *
 * test #10:digitSum(-15)
 *          return:6
 *          result: pass
 *
 * test #11:digitSum(-29107)
 *          return:19
 *          result: pass
 *
 * @author Alex Golub
 * @since 05-Apr-21 4:09 PM
 */
class digitSum {
  public static int digitSum(int n) {
    n = Math.abs(n);
    int sum = 0;

    while (n != 0) {
      sum += n % 10;
      n /= 10;
    }

    return sum;
  }
}
