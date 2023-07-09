package org.mrdrprof.solutions.chapter5_Loops;

import java.util.Scanner;

/**
 * @author Mr.Dr.Professor
 * @since 20-Jan-21 7:55 PM
 */
class GreatestCommonDivisor {
  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    System.out.print("Enter first number: ");
    int a = console.nextInt();
    System.out.print("Enter second number: ");
    int b = console.nextInt();

    int gcd = 1;
    for (int k = 2; k <= a && k <= b; k++) {
      if (a % k == 0 && b % k == 0)
        gcd = k;
    }

    System.out.printf("gcd(%d, %d) = %d\n", a, b, gcd);
  }
}
