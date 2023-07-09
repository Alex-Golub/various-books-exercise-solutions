package org.mrdrprof.solutions.chapter5_Loops;

import java.util.Scanner;

/**
 * **5.38 (Decimal to octal)
 * Write a program that prompts the user to enter a decimal
 * integer and displays its corresponding octal value.
 * Don’t use Java’s Integer.toOctalString(int) in this program.
 *
 * @author Mr.Dr.Professor
 * @since 25-Jan-21 6:35 PM
 */
class Ex5_38_decimalToOctal {
  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);

    while (true) {
      System.out.print("Enter decimal number (base 10): ");
      long number = console.nextLong();

      // debugging;
      System.out.printf("(%,d)10 = (%s)8\n", number, Long.toOctalString(number));

      System.out.printf("(%,d)10 = ", number);

      StringBuilder octal = new StringBuilder();
      if (number == 0)
        octal.append(0);

      while (number != 0) {
        octal.insert(0, number % 8);
        number /= 8;
      }

      System.out.println("(" + octal + ")8\n");
    }
  }
}
