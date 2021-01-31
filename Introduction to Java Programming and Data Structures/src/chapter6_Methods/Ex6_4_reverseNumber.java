package chapter6_Methods;

import java.util.Scanner;

/**
 * *6.4 (Display an integer reversed)
 *
 * @author Mr.Dr.Professor
 * @since 28-Jan-21 12:18 PM
 */
class Ex6_4_reverseNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while (true) {
      System.out.print("Enter number: ");
      int number = sc.nextInt();
      System.out.print("Reverse of " + number + " is ");
      reverse(number);
      System.out.println();
    }
  }

  public static void reverse(int number) {
    if (number == 0) {
      System.out.print(0);
      return;
    }

    if (number < 0) {
      System.out.print("-");
      number *= -1;
    }

    while (number != 0) {
      System.out.print(number % 10);
      number /= 10;
    }

    System.out.println();
  }
}
