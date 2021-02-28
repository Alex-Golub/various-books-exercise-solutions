package CodeStepByStep_java.parameters_and_return;

/**
 * https://www.codestepbystep.com/problem/view/java/parameters/isPrimeNumber
 *
 * Write a method named isPrimeNumber that accepts an integer as a
 * parameter and returns true if that integer is a prime number.
 * A prime number is an integer that has no factors other than 1 and itself.
 * The number 2 is defined as the smallest prime number.
 *
 * @author Mr.Dr.Professor
 * @since 26-Feb-21 10:31 PM
 */
/*public*/ class isPrimeNumber {
  static final int PER_LINE = 20;
  static final int TO = 500_000;

  public static void main(String[] args) {
    int primeCount = 0;
    for (int i = 0; i < TO; i++) {
      if (isPrimeNumber(i)) {
        primeCount++;
      }
    }

    System.out.printf("There are %d prime numbers from 2 to %d\n",
                      primeCount, TO);
  }

  public static boolean isPrimeNumber(int n) {
    if (n <= 1) {
      return false;
    }

    if (n == 2 || n == 3) {
      return true;
    }

    if (n % 6 != 1 && n % 6 != 5) {
      return false;
    }

    for (int i = 5; i < n; i += 2) {
      if (n % i == 0) {
        return false;
      }
    }

    return true;
  }
}
