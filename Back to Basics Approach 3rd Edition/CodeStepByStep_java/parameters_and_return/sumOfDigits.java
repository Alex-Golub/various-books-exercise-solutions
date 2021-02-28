package CodeStepByStep_java.parameters_and_return;

/**
 * https://www.codestepbystep.com/problem/view/java/parameters/sumOfDigits
 *
 * Write a method named sumOfDigits that accepts an integer parameter and
 * computes and returns the sum of all the digits of that number.
 * NOTE: For negative numbers, return the same value as if the number
 * were positive.
 *
 * @author Mr.Dr.Professor
 * @since 28-Feb-21 10:28 PM
 */
/*public*/ class sumOfDigits {
  public static void main(String[] args) {
    System.out.println(sumOfDigits(-72));
    System.out.println(sumOfDigits(38015));
  }

  public static int sumOfDigits(int n) {
    n = Math.abs(n);
    int digitsSum = 0;

    while (n != 0) {
      digitsSum += n % 10;
      n /= 10;
    }

    return digitsSum;
  }
}
