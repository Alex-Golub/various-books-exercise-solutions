package org.mrdrprof.solutions.chapter4_Math_Characters_Strings;

import java.util.Scanner;

/**
 * 4.19 (Business: check ISBN-10)
 * Rewrite Programming Exercise 3.9 by entering the
 * ISBN number as a string
 *
 * @author Mr.Dr.Professor
 * @since 16-Nov-20 5:49 PM
 */
class Ex4_19_ISBN {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the first 9 digits of an ISBN: ");
    String isbn = scanner.next();

    int sum = 0;
    long temp = Long.parseLong(isbn);
    for (int i = 9; i >= 1; i--) {
      sum += temp % 10 * i;
      temp /= 10;
    }

    isbn += sum % 11 == 10 ? "X" : Integer.toString(sum % 11);

    // printf %09d is of width 9, if isbn has less numbers or have leading
    // zeros it will be take care of.
    System.out.printf("The ISBN-10 number is %s", isbn);
  }
}
