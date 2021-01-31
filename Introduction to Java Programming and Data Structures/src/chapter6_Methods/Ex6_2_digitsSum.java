package chapter6_Methods;

import java.util.Scanner;

/**
 * *6.2 (Sum the digits in an integer)
 *
 * @author Mr.Dr.Professor
 * @since 28-Jan-21 11:47 AM
 */
class Ex6_2_digitsSum {
  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    System.out.print("Enter number to sum its digits: ");
    long num = console.nextLong();
    System.out.println("Digits sum of " + num + " is " + sumDigits(num));
  }

  public static int sumDigits(long n) {
    n = Math.abs(n);
    int sum = 0;

    while (n != 0) {
      sum += n % 10;
      n /= 10;
    }

    return sum;
  }
}
