package org.mrdrprof.solutions.chapter6_Methods;

import java.util.Scanner;

/**
 * @author Mr.Dr.Professor
 * @since 28-Jan-21 9:03 PM
 */
class Ex6_22_approxSquareRoot {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.print("Enter a number: ");
      System.out.println("Sqrt(s) = " + sqrt(scanner.nextLong()) + "\n");
    }
  }

  // Babylonian method to calculate square root of a number
  public static double sqrt(long n) {
    if (n < 0)
      throw new IllegalStateException("Negative square root is not defined: " + n);

    if (n == 0)
      return 0;

    final double EPSILON = 1e-10;

    double next, last = 1;

    while (true) {
      next = (last * last + n) / (2 * last);

      if (Math.abs(next - last) < EPSILON)
        break;

      last = next;
    }

    return next;
  }
}
