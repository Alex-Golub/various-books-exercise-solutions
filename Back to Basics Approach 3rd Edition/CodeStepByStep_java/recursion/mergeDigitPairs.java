package CodeStepByStep.java.recursion;

/**
 * https://www.codestepbystep.com/problem/view/java/recursion/mergeDigitPairs
 *
 * mergeDigitPairs(1234)     37
 * mergeDigitPairs(3186507)  3927
 * mergeDigitPairs(-52874)   -512
 * mergeDigitPairs(88888888) 7777
 * mergeDigitPairs(20581974) 2412
 * mergeDigitPairs(0)        0
 * mergeDigitPairs(6)        6
 * mergeDigitPairs(-5)       -5
 *
 * 1. If adding a given pair of digits produces a two-digit number,
 * repeat the process until you have a single-digit number to replace the original pair.
 * 2. If passed a number with an odd number of digits, the first (most significant)
 * digit is left untouched.
 * 3. If passed a negative number, perform the same process as usual but return
 * a negative result.
 *
 * @author Alex Golub
 * @since 12-May-21, 3:02 PM
 */
class mergeDigitPairs {
  public static void main(String[] args) {
    System.out.println(mergeDigitPairs(1234) == 37);
    System.out.println(mergeDigitPairs(3186507) == 3927);
    System.out.println(mergeDigitPairs(-52874) == -512);
    System.out.println(mergeDigitPairs(88888888) == 7777);
    System.out.println(mergeDigitPairs(20581974) == 2412);
    System.out.println(mergeDigitPairs(0) == 0);
    System.out.println(mergeDigitPairs(6) == 6);
    System.out.println(mergeDigitPairs(-5) == -5);
  }
  
  public static int mergeDigitPairs(int n) {
    if (n < 0) {
      return -mergeDigitPairs(-n);
    } else if (n < 10) {
      return n;
    } else {
      int sum = n % 10 + n / 10 % 10;
      if (sum > 9) {
        sum = mergeDigitPairs(sum); // merge number to single digit
      }
      return mergeDigitPairs(n / 100) * 10 + sum;
    }
  }
}
