package CodeStepByStep_java.parameters_and_return;

/**
 * https://www.codestepbystep.com/problem/view/java/parameters/countDigits
 *
 * Write a method named countDigits that accepts an integer parameter and
 * returns the number of digits in that integer.
 * For example, countDigits(38015) returns 5.
 * For negative numbers, return the same value as if the number were positive.
 * For example, countDigits(-72) returns 2.
 *
 * @author Mr.Dr.Professor
 * @since 24-Feb-21 4:41 PM
 */
/*public*/ class countDigits {
  public static int countDigits(int n) {
    if (n == 0) {
      return 0;
    }

    n = Math.abs(n);
    int digits = 0;

    while (n > 0) {
      digits++;
      n /= 10;
    }

    return digits;
  }
}
