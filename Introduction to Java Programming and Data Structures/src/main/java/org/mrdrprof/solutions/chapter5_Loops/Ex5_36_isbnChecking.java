package org.mrdrprof.solutions.chapter5_Loops;

import java.util.Scanner;

/**
 * **5.36 (Business application: checking ISBN)
 * Use loops to simplify Programming
 * Exercise 3.9.
 *
 * @author Mr.Dr.Professor
 * @since 25-Jan-21 5:00 PM
 */
class Ex5_36_isbnChecking {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the first 9 digits of an ISBN as integer: ");
    long isbn = scanner.nextLong();

    int  sum  = 0;
    long temp = isbn;
    for (int i = 9; i >= 1; i--) {
      sum += temp % 10 * i;
      temp /= 10;

      // Uncomment to see trace
//      System.out.println(i + " : " + sum + " : " + temp % 10);
    }

    String checksum = (sum % 11 == 10) ? "X" : Integer.toString(sum % 11);

    // printf %09d is of width 9, if isbn has less numbers or have leading
    // zeros it will be take care of.
    System.out.printf("The ISBN-10 number is %09d%s", isbn, checksum);
  }
}
