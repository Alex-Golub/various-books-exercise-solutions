package chapter5_Loops;

import java.util.Scanner;

/**
 * **5.37 (Decimal to binary)
 * Write a program that prompts the user to enter a decimal
 * integer then displays its corresponding binary value.
 * NOTE: Don’t use Java’s Integer.toBinaryString(int) in this program.
 *
 * @author Mr.Dr.Professor
 * @since 25-Jan-21 5:04 PM
 */
class Ex5_37_decimalToBinary {
  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);

    while (true) {
      System.out.print("Enter decimal number (base 10): ");
      long number = console.nextLong();

      // debugging;
      System.out.printf("(%,d)10 = (%s)2\n", number, Long.toBinaryString(number));

      System.out.printf("(%,d)10 = ", number);

      StringBuilder binary = new StringBuilder();
      if (number == 0)
        binary.append(0);

      while (number != 0) {
        binary.insert(0, number % 2);
        number /= 2;
      }

      System.out.println("(" + binary + ")2\n");
    }
  }
}
