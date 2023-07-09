package org.mrdrprof.solutions.chapter5_Loops;

import java.util.Scanner;

/**
 * @author Mr.Dr.Professor
 * @since 20-Jan-21 10:29 PM
 */
class Palindrome {
  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String in = console.nextLine();
    boolean isPalindrome = true;
    for (int l = 0, r = in.length() - 1; l < r; l++, r--) {
      if (in.charAt(l) != in.charAt(r)) {
        isPalindrome = false;
        break;
      }
    }

    System.out.printf("%s is %sa palindrome\n", in, isPalindrome ? "" : "not ");
  }
}
