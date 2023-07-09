package org.mrdrprof.solutions.chapter2_Elementary_Programming;

import java.util.Scanner;

/**
 * The program lets the user enter an amount as a double value representing a
 * total in dollars and cents, and outputs a report listing the monetary
 * equivalent in the maximum number of
 * dollars (100 cents),
 * quarters (25 cents),
 * dimes (10 cents),
 * nickels (5 cents), and pennies (1 cent), in this order,
 * to result in the minimum number of coins.
 *
 * Created by ag on 07-Oct-20 10:09 PM 
 */
class ComputeChange {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter an amount in double, for example 11.56: ");
    double amount = scanner.nextDouble();

    int remainingAmount = (int) (amount * 100);

    int numberOfOneDollars = remainingAmount / 100;
    remainingAmount = remainingAmount % 100;

    int numberOfQuarters = remainingAmount / 25;
    remainingAmount = remainingAmount % 25;

    int numberOfDimes = remainingAmount / 10;
    remainingAmount = remainingAmount % 10;

    int numberOfNickels = remainingAmount / 5;
    remainingAmount = remainingAmount % 5;

    int numberOfPennies = remainingAmount;

    // Display results
    System.out.println("Your amount " + amount + " consists of");
    System.out.println(" " + numberOfOneDollars + " dollars");
    System.out.println(" " + numberOfQuarters + " quarters ");
    System.out.println(" " + numberOfDimes + " dimes");
    System.out.println(" " + numberOfNickels + " nickels");
    System.out.println(" " + numberOfPennies + " pennies");
  }
}
