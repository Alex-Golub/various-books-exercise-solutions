package org.mrdrprof.solutions.chapter4_Math_Characters_Strings;

import java.util.Scanner;

/**
 * *4.11 (Binary to decimal)
 * Write a program that prompts the user to enter binary digits
 * and displays its corresponding decimal value.
 *
 * @author Mr.Dr.Professor
 * @since 16-Nov-20 2:39 PM
 */
class Ex4_11_BinaryToDecimal {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.print("Enter binary digits (0000 to 1111): ");
      int binary = scanner.nextInt();

      // Shortest code using Integer.parseInt(string, radix)
      System.out.println(Integer.parseInt("" + binary, 2));

      // Using iterations to convert binary number to decimal.
      // (1101)2 => (?)10
      // 1 * 2^0 = 1 * 1 = 1
      // 0 * 2^1 = 0 * 2 = 0
      // 0 * 2^2 = 0 * 4 = 0
      // 1 * 2^3 = 1 * 8 = 8
      // 1 + 0 + 0 + 8 = 9
      // (1101)2 => (9)10
      System.out.printf("The decimal value of %d is ", binary);
      int decimal = 0;
      for (int exp = 0; binary > 0; exp++) {
        decimal += (binary % 10) * Math.pow(2, exp);
        binary /= 10;
      }

      System.out.printf("%d\n\n", decimal);
    }
  }
}
