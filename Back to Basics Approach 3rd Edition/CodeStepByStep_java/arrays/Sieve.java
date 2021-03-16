package CodeStepByStep_java.arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Write a complete console program named Sieve that uses the
 * "Sieve of Eratosthenes" algorithm to print a list of prime
 * numbers between 2 and a given maximum.
 *
 * @author Mr.Dr.Professor
 * @since 14-Feb-21 10:49 PM
 */
public class Sieve {
  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    System.out.print("Max value N? ");
    int n = console.nextInt();

    boolean[] primes = sieve(n);

    System.out.print("Primes:");
    for (int i = 2; i < primes.length; i++) {
      if (primes[i])
        System.out.print(" " + i);
    }
  }

  public static boolean[] sieve(int n) {
    boolean[] primes = new boolean[n + 1];
    Arrays.fill(primes, true);

    for (int i = 2; i <= n / i; i++) {
      if (primes[i]) {
        for (int j = i; j <= n / i; j++) {
          primes[i * j] = false;
        }
      }
    }

    return primes;
  }
}
