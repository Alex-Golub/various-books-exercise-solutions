package chapter4_conditionals;

import java.util.Scanner;

/**
 * 16. Write a method called printPalindrome that accepts a Scanner for the
 * console as a parameter, and prompts the user to enter one or more words
 * and prints whether the entered String is a palindrome
 * (i.e., reads the same forwards as it does backwards
 *
 * @author Mr.Dr.Professor
 * @since 10-Dec-20 7:55 PM
 */

class Ex4_16_printPalindrome {
  public static void printPalindrome(Scanner sc) {
    System.out.print("Type one or more words: ");
    String line = sc.nextLine();

    if (isPalindrome(line))
      System.out.println(line + " is a palindrome!");
    else
      System.out.println(line + " is not a palindrome.");
  }

  private static boolean isPalindrome(String line) {
    String temp = line.toLowerCase();
    int    n    = temp.length();

    for (int i = 0; i < n / 2; i++) {
      if (temp.charAt(i) != temp.charAt(n - i - 1))
        return false;
    }
    return true;
  }
}
