package org.mrdrprof.solutions.chapter6_Methods;

/**
 * **6.27 (Emirp)
 * An emirp (prime spelled backward)
 * is a non-palindromic prime number whose reversal is also a prime.
 *
 * @author Mr.Dr.Professor
 * @since 29-Jan-21 12:52 PM
 */
class Ex6_27_emirp {
  public static void main(String[] args) {
    final int NUMBERS_PER_LINE = 10;
    final int TOTAL_NUMBERS    = 1200;

    for (int i = 0, count = 0; count < TOTAL_NUMBERS; i++) {
      if (isPrime(i) && !isPalindrome(i) && isPrime(reverse(i))) {
        System.out.printf("%-8d", i);
        count++;

        if (count % NUMBERS_PER_LINE == 0)
          System.out.println();
      }
    }
  }

  public static boolean isPrime(int n) {
    if (n <= 1)
      return false;
    if (n == 2 || n == 3)
      return true;
    if (n % 2 == 0)
      return false;
    if (n % 6 != 1 && n % 6 != 5)
      return false;

    double sqrt = Math.sqrt(n);
    for (int i = 5; i <= sqrt; i += 2)
      if (n % i == 0)
        return false;

    return true;
  }

  public static boolean isPalindrome(int n) {
    return n == reverse(n);
  }

  public static int reverse(int n) {
    int reversed = 0;

    while (n != 0) {
      reversed = reversed * 10 + n % 10;
      n /= 10;
    }

    return reversed;
  }
}
