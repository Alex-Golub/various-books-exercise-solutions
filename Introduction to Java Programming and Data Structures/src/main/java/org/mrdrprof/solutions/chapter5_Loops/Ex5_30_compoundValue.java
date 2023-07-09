package org.mrdrprof.solutions.chapter5_Loops;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

/**
 * * 5.30 (Financial application: compound value)
 * Write a program that prompts the user to enter an amount
 * (e.g., 100), the annual interest rate (e.g., 3.75),
 * and the number of months (e.g., 6) and displays the
 * amount in the savings account after the given month.
 *
 * @author Mr.Dr.Professor
 * @since 25-Jan-21 2:04 PM
 */
class Ex5_30_compoundValue {
  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);

    System.out.print("Enter amount (e.g. 100): ");
    int amount = console.nextInt();
    System.out.print("Annual interest rate (e.g. 3.75): ");
    double annualRate = console.nextDouble();
    System.out.print("Number of months (e.g. 6): ");
    int months = console.nextInt();

    System.out.printf("\n%s%10s\n", "Month", "Savings");
    double       compoundRate     = 1 + annualRate / 1200;
    double       savings          = amount * compoundRate;
    NumberFormat currencyInstance = DecimalFormat.getCurrencyInstance();

    for (int i = 1; i <= months; i++) {
      System.out.printf("%d%14s\n", i, currencyInstance.format(savings));
      savings = (amount + savings) * compoundRate;
    }

    System.out.println("\nSavings in account after " + months + " months is "
                       + currencyInstance.format(savings));
  }
}
