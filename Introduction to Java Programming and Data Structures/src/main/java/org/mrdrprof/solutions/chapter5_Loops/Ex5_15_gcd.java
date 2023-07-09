package org.mrdrprof.solutions.chapter5_Loops;

import java.util.Scanner;

/**
 * *5.14 (Compute the greatest common divisor)
 * Another solution for Listing 5.9 to find the greatest common divisor of two
 * integers n1 and n2 is as follows:
 * First find d to be the minimum of n1 and n2,
 * then check whether d, d–1, d–2, …, 2, or 1 is a divisor for both n1 and n2
 * in this order.
 * The first such common divisor is the greatest common divisor for n1 and n2.
 * Write a program that prompts the user to enter two
 * positive integers and displays the gcd.
 *
 * @author Mr.Dr.Professor
 * @since 21-Jan-21 8:35 PM
 */
class Ex5_15_gcd {
  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    System.out.print("Enter first number (+ve) -> ");
    int n1 = console.nextInt();
    System.out.print("Enter second number (+ve) -> ");
    int n2 = console.nextInt();

    if (n1 < 0 || n2 < 0) {
      throw new IllegalStateException("Numbers are not positive: " + n1 + ", " + n2);
    }

    int gcd = Math.min(n1, n2);
    while (gcd > 1) {
      if (n1 % gcd == 0 && n2 % gcd == 0)
        break;
      gcd--;
    }

    System.out.printf("gcd(%d, %d) = %d\n", n1, n2, gcd);
  }
}
