package chapter6_Methods;

/**
 * 6.10 (Use the isPrime Method)
 *
 * @author Mr.Dr.Professor
 * @since 28-Jan-21 2:09 PM
 */
class Ex6_10_primeUpToN {
  public static void main(String[] args) {
    final int UP_TO    = 100;
    final int PER_LINE = 10;

    int  count = 0;
    long start = System.currentTimeMillis();
    for (int i = 2; i <= UP_TO; i++) {
      if (isPrime(i)) {
        System.out.printf("%5d", i);

        if ((count + 1) % PER_LINE == 0)
          System.out.println();
        else
          System.out.print(" ");

        count++;
      }
    }

    long end = System.currentTimeMillis() - start;
    System.out.println("\n\nPrimes up to " + UP_TO + " => " + count);
    System.out.println("Time: " + end / 1_000 + " seconds");
  }

  // prime number properties:
  // 1. p > 1
  // 2. Has only two divisors 1 and self
  // 3. Only even prime number is 2
  // 4. If prime must be divisible by 6 and leave remainders 1 or 5 (-1)
  public static boolean isPrime(long n) {
    if (n <= 1) return false;
    if (n == 2 || n == 3) return true;
    if (n % 2 == 0) return false;
    if (n % 6 != 1 && n % 6 != 5) return false;

    double sqrt = Math.sqrt(n);
    for (int divisor = 2; divisor <= sqrt; divisor++) {
      if (n % divisor == 0)
        return false;
    }

    return true;
  }
}
