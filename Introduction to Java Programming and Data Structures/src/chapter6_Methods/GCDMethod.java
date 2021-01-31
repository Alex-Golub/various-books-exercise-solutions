package chapter6_Methods;

import java.util.Scanner;

/**
 * @author Mr.Dr.Professor
 * @since 27-Jan-21 5:07 PM
 */
class GCDMethod {
  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    System.out.print("Enter first integer: ");
    int n1 = console.nextInt();
    System.out.print("Enter second integer: ");
    int n2 = console.nextInt();

    System.out.printf("gcd(%d, %d) = %d", n1, n2, gcd(n1, n2));
  }

  public static int gcd(int a, int b) {
    int gcd = 1;
    int k   = 2; // possible new gcd
    int min = Math.min(a, b);

    while (k <= min) {
      if (a % k == 0 && b % k == 0)
        gcd = k;
      k++;
    }

    return gcd;
  }
}
