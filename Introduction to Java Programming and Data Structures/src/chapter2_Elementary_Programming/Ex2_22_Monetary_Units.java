package chapter2_Elementary_Programming;

import java.util.Scanner;

/**
 * *2.22 (Financial application: monetary units)
 * Rewrite Listing 2.10, ComputeChange.java, to fix the possible loss of
 * accuracy when converting a double value to an int value.
 * Enter the input as an integer whose last two digits represent the cents
 *
 * Created by ag on 13-Oct-20 8:43 PM 
 */
class Ex2_22_Monetary_Units {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.print("Enter an amount in integer, for example " +
                           "1156(11 dollars, 56 cents): ");
      int amount = scanner.nextInt();

      int dollars = amount / 100;
      int cents   = amount % 100;
      System.out.printf("%d dollars and %d cents\n\n", dollars, cents);
    }

  }
}
