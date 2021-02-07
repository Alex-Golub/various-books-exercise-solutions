package chapter7_SD_Arrays;

import java.util.Arrays;

/**
 * 7.6 (The Sieve of Eratosthenes)
 * display all the prime numbers up to 50.
 *
 * Naive- Ex6_10_primeUpToN:
 * Primes up to 10000000 => 664579
 * Time: 20 seconds
 *
 * Sieve:
 * Prime up to 10000000 => 664579
 * Time: 3 seconds
 *
 * @author Mr.Dr.Professor
 * @since 01-Feb-21 3:14 PM
 */
class Ex7_6_sieve {
  public static void main(String[] args) {
    final int UP_TO = 100;

    long start = System.currentTimeMillis();

    boolean[] flags = new boolean[UP_TO + 1]; // [0, 50]
    Arrays.fill(flags, true); // assume all number are prime

    // i <= n/i instead of the naive i <= n because any
    // number with no factor less than n/i has no factor
    // greater than n/i, so we do not have to look for such factors.
    for (int i = 2; i <= UP_TO / i; i++) {
      if (flags[i]) {

        // flag all multiples of i as false
        for (int j = i; j <= UP_TO / i; j++) {
          flags[i * j] = false;
        }
      }
    }

    // print all prime number i.e. what is flagged as true
    final int PER_LINE = 10;
    int       count    = 0;

    for (int i = 2; i < flags.length; i++) {
      if (flags[i]) {
        System.out.printf("%-5d", i);
        count++;

        if (count % PER_LINE == 0)
          System.out.println();
        else
          System.out.print(" ");
      }
    }

    long time = (System.currentTimeMillis() - start) / 1000;
    System.out.println("\n\nPrime up to " + UP_TO + " => " + count);
    System.out.println("Time: " + time + " seconds");
  }
}
