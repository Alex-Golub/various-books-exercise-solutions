package cse_142.cs1_labs;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/labs/lab5/allDigitsOdd
 *
 * test #1:  allDigitsOdd(4822116)
 *           return:false
 *           result: pass
 *
 * test #2:  allDigitsOdd(135319)
 *           return:true
 *           result: pass
 *
 * test #3:  allDigitsOdd(8910437)
 *           return:false
 *           result: pass
 *
 * test #4:  allDigitsOdd(6022048)
 *           return:false
 *           result: pass
 *
 * test #5:  allDigitsOdd(824876248)
 *           return:false
 *           result: pass
 *
 * test #6:  allDigitsOdd(1375335)
 *           return:true
 *           result: pass
 *
 * test #7:  allDigitsOdd(42)
 *           return:false
 *           result: pass
 *
 * test #8:  allDigitsOdd(71)
 *           return:true
 *           result: pass
 *
 * test #9:  allDigitsOdd(4)
 *           return:false
 *           result: pass
 *
 * test #10: allDigitsOdd(3)
 *           return:true
 *           result: pass
 *
 * test #11: allDigitsOdd(0)
 *           return:false
 *           result: pass
 *
 * test #12: allDigitsOdd(-7513)
 *           return:true
 *           result: pass
 *
 * test #13: allDigitsOdd(-24806)
 *           return:false
 *           result: pass
 *
 * @author Alex Golub
 * @since 05-Apr-21 4:28 PM
 */
class allDigitsOdd {
  public static boolean allDigitsOdd(int n) {
    if (n == 0)
      return false;

    n = Math.abs(n);
    while (n > 0) {
      if (n % 10 % 2 == 0)
        return false;

      n /= 10;
    }

    return true;
  }
}
