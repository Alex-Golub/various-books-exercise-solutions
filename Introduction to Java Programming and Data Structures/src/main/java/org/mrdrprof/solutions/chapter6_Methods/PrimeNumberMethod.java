package org.mrdrprof.solutions.chapter6_Methods;

/**
 * @author Mr.Dr.Professor
 * @since 27-Jan-21 5:11 PM
 */
class PrimeNumberMethod {
  public static void main(String[] args) {
    final int N_PRIME = 50;

    System.out.println("The first " + N_PRIME + " number are:");
    printPrimeNumbers(N_PRIME);
  }

  private static void printPrimeNumbers(int n) {
    final int PRIME_PER_LINE = 10;
    int       primeCount     = 0;
    int       p              = 2; // probable prime

    while (primeCount < n) {
      if (isPrime(p)) {
        primeCount++;

        if (primeCount % PRIME_PER_LINE == 0) {
          System.out.printf("%-5d\n", p);
        } else {
          System.out.printf("%-5d", p);
        }
      }

      p++;
    }
  }

  private static boolean isPrime(int p) {
    int sqrtFloor = (int) Math.sqrt(p); // search factors up to floor of number

    for (int divisor = 2; divisor <= sqrtFloor; divisor++) {
      if (p % divisor == 0)
        return false;
    }

    return true;
  }
}
