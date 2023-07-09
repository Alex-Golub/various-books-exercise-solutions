package org.mrdrprof.solutions.chapter4_Math_Characters_Strings;

import java.util.Scanner;

/**
 * 4.12 (Hex to binary)
 * Write a program that prompts the user to enter a hex digit and
 * displays its corresponding binary number.
 * For an incorrect input, display invalid input.
 *
 * @author Mr.Dr.Professor
 * @since 16-Nov-20 3:00 PM
 */
class Ex4_12_HexToBinary {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.print("Enter a hex digit: ");
      char hex = scanner.next().toLowerCase().charAt(0);

      if (Character.isDigit(hex)) {
        // Convert hex to number in radix 2 (i.e. binary)
        System.out.println(Integer.toString(hex - '0', 2));
      } else if (hex >= 'a' && hex <= 'f') {
        // hex is a letter between [a, f]
        System.out.println(Integer.toString(hex - 'a' + 10, 2));
      } else {
        System.out.println(hex + " is an invalid input");
      }

      System.out.println();
    }
  }
}
