package chapter4_Control_Statements_Part_1._4_30_Palindromes;

import java.util.Scanner;

/**
 * 4.30 (Palindromes) A palindrome is a sequence of characters that reads the same backward as forward.
 * For example, each of the following five-digit integers is a palindrome: 12321, 55555, 45554
 * and 11611. Write an application that reads in a five-digit integer and determines whether it’s a palindrome.
 * If the number is not five digits long, display an error message and allow the user to enter
 * a new value.
 *
 * Created by ag on 29-Jun-20 3:16 PM
 */
class PalindromesTest {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.print("Enter 5 digit number to check whether its a palindrome (-1 to exit): ");
      String number = scanner.nextLine();

      if ("-1".equals(number))
        break;

      if (number.length() > 5) {
        System.out.println("Error: please enter exactly 5 digit number, try again\n");
        continue;
      }

      System.out.println(isPalindrome(Integer.parseInt(number)));
    }

    System.out.println("\nBye!");
  }

  private static boolean isPalindrome(int n) {
    int reverseNumber = 0;
    int temp = n;

    while (temp > 0) {
      reverseNumber = reverseNumber * 10 + temp % 10;
      temp /= 10;
    }

    return reverseNumber == n;

    /* Alternative way is to use StringBuilder covered in latter chapters */
//    return new StringBuilder(Integer.toString(n))
//            .reverse()
//            .toString()
//            .equals(Integer.toString(n));
  }
}
