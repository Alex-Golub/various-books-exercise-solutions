package org.mrdrprof.solutions.chapter6_Methods;

/**
 * **6.28 (Mersenne prime)
 * A prime number is called a Mersenne prime if it can be written
 * in the form 2^p - 1 for some positive integer p.
 *
 * @author Mr.Dr.Professor
 * @since 29-Jan-21 1:12 PM
 */
class Ex6_28_mersennePrime {
  public static void main(String[] args) {
    final int UP_TO = 31;

    System.out.printf("%-10s%s\n", "p", "2^p - 1");
    System.out.println("-".repeat(20));

    for (long i = 0; i <= UP_TO; i++) {
      long mersenne = (long) (Math.pow(2, i) - 1);

      if (isPrime(mersenne)) {
        System.out.printf("%-10d%,d\n", i, mersenne);
      }
    }
  }

  public static boolean isPrime(long n) {
    if (n <= 1) return false;
    if (n == 2 || n == 3) return true;
    if (n % 2 == 0) return false;
    if (n % 6 != 1 && n % 6 != 5) return false;

    double sqrt = Math.sqrt(n);
    for (int i = 5; i <= sqrt; i += 2) {
      if (n % i == 0)
        return false;
    }

    return true;
  }
}
