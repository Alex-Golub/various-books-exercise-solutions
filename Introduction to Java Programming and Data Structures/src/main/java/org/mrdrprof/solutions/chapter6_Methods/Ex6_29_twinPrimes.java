package org.mrdrprof.solutions.chapter6_Methods;

/**
 * **6.29 (Twin primes)
 * Twin primes are a pair of prime numbers that differ by 2.
 *
 * @author Mr.Dr.Professor
 * @since 29-Jan-21 1:31 PM
 */
class Ex6_29_twinPrimes {
  public static void main(String[] args) {
    final int TWIN_PRIMES_LESS_THEN = 1200;
    int last = 2, next;

    // store last prime number found and compare with next one found
    for (int i = 3; i < TWIN_PRIMES_LESS_THEN; i++) {
      if (isPrime(i)) {
        next = i;

        if (next - last == 2)
          System.out.println("(" + last + ", " + next + ")");

        last = next;
      }
    }
  }

  public static boolean isPrime(int n) {
    if (n <= 1) return false;
    if (n == 2 || n == 3) return true;
    if (n % 2 == 0) return false;
    if (n % 6 != 1 && n % 6 != 5) return false;

    double sqrt = Math.sqrt(n);
    for (int i = 5; i <= sqrt; i += 2)
      if (n % i == 0)
        return false;

    return true;
  }
}
