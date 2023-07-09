package org.mrdrprof.solutions.chapter3_Selections;

import java.util.Scanner;

/**
 * **3.9 (Business: check ISBN-10)
 * An ISBN-10 (International Standard Book Number) consists of
 * 10 digits: d1d2d3d4d5d6d7d8d9d10.
 * The last digit, d10, is a checksum, which is calculated from the other
 * 9 digits using the following formula:
 * (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11
 * If the checksum is 10, the last digit is denoted as X according to the ISBN-10
 * convention.
 *
 * Write a program that prompts the user to enter the first 9 digits and
 * displays the 10-digit ISBN (including leading zeros).
 * Your program should read the input as an integer.
 *
 * Created by ag on 22-Oct-20 10:50 AM
 */
class Ex3_9_ISBN {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the first 9 digits of an ISBN as integer: ");
    long isbn = scanner.nextLong();

    int sum = 0;
    long temp = isbn;
    for (int i = 9; i >= 1; i--) {
      sum += temp % 10 * i;
      temp /= 10;

      // Uncomment to see trace
//      System.out.println(i + " : " + sum + " : " + temp % 10);
    }

    String checksum = sum % 11 == 10 ? "X" : Integer.toString(sum % 11);

    // printf %09d is of width 9, if isbn has less numbers or have leading
    // zeros it will be take care of.
    System.out.printf("The ISBN-10 number is %09d%s", isbn, checksum);
  }
}
