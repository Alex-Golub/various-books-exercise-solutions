package CodeStepByStep_java.loops;

/**
 * https://www.codestepbystep.com/problem/view/java/loops/nthDigit
 *
 * For example, the call of nthDigit(21) would return 5 because the
 * 21st digit is as follows: 12345678910111213141516...
 *                                               ^
 *
 * Part of the challenge of solving this problem is coming up with an
 * efficient algorithm. You should not use a string to solve the problem.
 * Try to come up with an algorithm that will still work even for very large
 * values of N in a reasonable runtime.
 *
 * @author Mr.Dr.Professor
 * @since 03-Mar-21 11:15 PM
 */
/*public*/ class nthDigit {
  public static void main(String[] args) {
    for (int i = 1; i < 21; i++) {
      System.out.println(nthDigit(i));
    }
  }

  // 1 - 9 there is 1 (digit length number) * 9 * 10^0 = 9 digits
  // 10 - 99 there are 2 (digits length numbers) * 9 * 10^1 = 2 * 9 * 100 = 180 digits
  // 100 - 999 there are 3 * 9 * 10^3 = 27 * 1000 = 2700 digits
  public static int nthDigit(int n) {
    int digitsLen = 1;
    while (n > digitsLen * 9 * Math.pow(10, digitsLen - 1)) {
      n -= digitsLen * 9 * Math.pow(10, digitsLen - 1);
      digitsLen++;
    }

    // the number from which we will extract the digit
    int number = (int) Math.pow(10, digitsLen - 1) + (n - 1) / digitsLen;
    int nthDigit = number / (int) Math.pow(10, (digitsLen - 1) - ((n - 1) % digitsLen));

    return nthDigit % 10;
  }
}
