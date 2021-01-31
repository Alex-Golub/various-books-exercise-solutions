package chapter6_Methods;

import java.util.Scanner;

/**
 * **6.3 (Palindrome integer)
 *
 * @author Mr.Dr.Professor
 * @since 28-Jan-21 11:58 AM
 */
class Ex6_3_palindromeInteger {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while (true) {
      System.out.print("Enter number to check if palindrome: ");
      int num = sc.nextInt();
      System.out.printf("%d is %spalindrome\n", num, isPalindrome(num) ? "" : "not ");
      System.out.println();
    }
  }

  public static boolean isPalindrome(int number) {
    return number == reverse(number);
  }

  public static int reverse(int number) {
    boolean isNegative = false;
    if (number < 0) {
      isNegative = true;
      number *= -1;
    }

    int reversed = 0;
    while (number != 0) {
      reversed = 10 * reversed + number % 10;
      number /= 10;
    }

    return isNegative ? -1 * reversed : reversed;
  }
}
