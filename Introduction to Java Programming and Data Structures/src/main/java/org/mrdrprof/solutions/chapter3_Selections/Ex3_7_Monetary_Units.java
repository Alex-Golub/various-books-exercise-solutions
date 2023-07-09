package org.mrdrprof.solutions.chapter3_Selections;

import java.util.Scanner;

/**
 * 3.7 (Financial application: monetary units)
 * Display the nonzero denominations only, using singular words for single
 * units such as 1 dollar and 1 penny, and plural words for more than one
 * unit such as 2 dollars and 3 pennies.
 *
 * Created by ag on 22-Oct-20 10:22 AM
 */
class Ex3_7_Monetary_Units {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter an amount in double, for example 11.56: ");
    double amount = scanner.nextDouble();

    int remaining = (int) (amount * 100); // 11.56 => 1156

    int dollars = remaining / 100;
    remaining %= 100;

    int dimes = remaining / 10;
    remaining %= 10;

    int nickels = remaining / 5;
    remaining %= 5;

    int pennies = remaining;

    System.out.println(dollars + " dollar" + (dollars > 1 ? "s" : ""));
    System.out.println(dimes + " dime" + (dimes > 1 ? "s" : ""));
    System.out.println(nickels + " nickel"); // nickels can only be 0 or 1
    System.out.println(pennies + " pennie" + (pennies > 1 ? "s" : ""));
  }
}
