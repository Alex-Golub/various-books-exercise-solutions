package chapter4_Control_Statements_Part_1._4_31_Binary_To_Decimal;

import java.util.Scanner;

/**
 * 4.31 (Printing the Decimal Equivalent of a Binary Number) Write an application that inputs an
 * integer containing only 0s and 1s (i.e., a binary integer) and prints its decimal equivalent.
 * [Hint: Use the remainder and division operators to pick off the binary number’s digits one at a time,
 * from right to left. In the decimal number system, the rightmost digit has a positional value of 1 and the next
 * digit to the left a positional value of 10, then 100, then 1000, and so on. The decimal number 234
 * can be interpreted as 4 * 1 + 3 * 10 + 2 * 100. In the binary number system, the rightmost digit has
 * a positional value of 1, the next digit to the left a positional value of 2, then 4, then 8, and so on.
 * The decimal equivalent of binary 1101 is 1 * 1 + 0 * 2 + 1 * 4 + 1 * 8, or 1 + 0 + 4 + 8 or, 13.]
 *
 * Created by ag on 29-Jun-20 3:47 PM
 */
class DeciToBinaryTest {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.print("Enter binary number (0 or 1's, -1 to exit) : ");
      int binary = Integer.parseInt(scanner.nextLine());

      if (binary == -1)
        break;

      System.out.printf("%d (2) -> %d (10)%n%n", binary, convertToDecimal(binary));

      /* Alternative way with help of Integer API */
      System.out.printf("%d (2) -> %d (10)%n%n",
              binary, Integer.parseInt(String.valueOf(binary), 2));
    }

    System.out.println("\nBye!");
  }

  private static int convertToDecimal(int binary) {
    int result = 0, exp = 0;

    while (binary > 0) {
      result += binary % 10 * (int) Math.pow(2, exp);
      binary /= 10;
      exp += 1;
    }

    return result;
  }
}
