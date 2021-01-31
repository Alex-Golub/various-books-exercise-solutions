package chapter6_Methods;

/**
 * **6.26 (Palindromic prime)
 *
 * @author Mr.Dr.Professor
 * @since 28-Jan-21 10:47 PM
 */
class Ex6_26_palindromicPrime {
  public static void main(String[] args) {
    final int FIRST_N_PRIME_AND_PALINDROME = 120;
    final int NUMBERS_PER_LINE             = 10;

    int count = 0;
    for (int i = 2; count < FIRST_N_PRIME_AND_PALINDROME; i++) {
      if (isPrime(i) && isPalindrome(i)) {
        System.out.printf("%,-10d", i);
        count++;

        if (count % NUMBERS_PER_LINE == 0)
          System.out.println();
        else
          System.out.print(" ");
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

    double sqrt = sqrt(n);
    for (int i = 5; i <= sqrt; i += 2) {
      if (n % i == 0)
        return false;
    }

    return true;
  }

  private static double sqrt(int n) {
    if (n < 0)
      throw new IllegalStateException("Negative square root is not defined: " + n);

    if (n == 0)
      return 0;

    double       nextGuess;
    double       lastGuess = 1;
    final double EPSILON   = 1e-12;

    while (true) {
      nextGuess = (lastGuess * lastGuess + n) / (2 * lastGuess);

      if (Math.abs(nextGuess - lastGuess) < EPSILON)
        break;

      lastGuess = nextGuess;
    }

    return nextGuess;
  }

  public static boolean isPalindrome(int n) {
    return n == reverse(n);
  }

  // prime numbers are natural number i.e. p >= 2
  // thus reverse not checking for -ve values of n
  public static int reverse(int n) {
    int reversed = 0;

    while (n != 0) {
      reversed = reversed * 10 + n % 10;
      n /= 10;
    }

    return reversed;
  }
}
