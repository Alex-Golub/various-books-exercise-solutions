package cse_142.cs1_labs;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/labs/lab5/hasAnOddDigit
 *
 * test #1:  hasAnOddDigit(4822116)
 *           return:true
 *           result: pass
 *
 * test #2:  hasAnOddDigit(2448)
 *           return:false
 *           result: pass
 *
 * test #3:  hasAnOddDigit(8910437)
 *           return:true
 *           result: pass
 *
 * test #4:  hasAnOddDigit(6022048)
 *           return:false
 *           result: pass
 *
 * test #5:  hasAnOddDigit(824876248)
 *           return:true
 *           result: pass
 *
 * test #6:  hasAnOddDigit(1375335)
 *           return:true
 *           result: pass
 *
 * test #7:  hasAnOddDigit(42)
 *           return:false
 *           result: pass
 *
 * test #8:  hasAnOddDigit(70)
 *           return:true
 *           result: pass
 *
 * test #9:  hasAnOddDigit(4)
 *           return:false
 *           result: pass
 *
 * test #10: hasAnOddDigit(3)
 *           return:true
 *           result: pass
 *
 * test #11: hasAnOddDigit(0)
 *           return:false
 *           result: pass
 *
 * test #12: hasAnOddDigit(-7004)
 *           return:true
 *           result: pass
 *
 * test #13: hasAnOddDigit(-24806)
 *           return:false
 *           result: pass
 *
 * test #14: hasAnOddDigit(-5)
 *           return:true
 *           result: pass
 *
 * test #15: hasAnOddDigit(-2)
 *           return:false
 *           result: pass
 *
 * @author Alex Golub
 * @since 05-Apr-21 4:25 PM
 */
class hasAnOddDigit {
  /**
   * return true if the number has at least one odd digit and false
   * if none of its digits are odd.
   */
  public static boolean hasAnOddDigit(int n) {
    n = Math.abs(n);
    while (n > 0) {
      if (n % 10 % 2 == 1)
        return true;

      n /= 10;
    }

    return false;
  }
}
