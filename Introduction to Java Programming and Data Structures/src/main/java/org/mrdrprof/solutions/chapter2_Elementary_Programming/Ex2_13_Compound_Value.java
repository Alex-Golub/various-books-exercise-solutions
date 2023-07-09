package org.mrdrprof.solutions.chapter2_Elementary_Programming;

import java.util.Scanner;

/**
 * **2.13 (Financial application: compound value)
 *
 * Write a program that prompts the user to enter a monthly saving amount and
 * displays the account value after the sixth month.
 * (In Exercise 5.30, you will use a loop to simplify the code and display the
 * account value for any month.)
 *
 * Created by ag on 13-Oct-20 6:40 PM 
 */
class Ex2_13_Compound_Value {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the monthly saving amount: ");
    final double AMOUNT = scanner.nextInt();

    final double MONTHLY_INTEREST_RATE = 1 + 3.75 / (100 * 12);

    double value = AMOUNT * MONTHLY_INTEREST_RATE;
    System.out.printf("After the first month, the account value is %,f\n", value);

    value = (AMOUNT + value) * MONTHLY_INTEREST_RATE;
    System.out.printf("After the second month, the account value is %,f\n", value);

    value = (AMOUNT + value) * MONTHLY_INTEREST_RATE;
    System.out.printf("After the third month, the account value is %,f\n", value);

    value = (AMOUNT + value) * MONTHLY_INTEREST_RATE;
    value = (AMOUNT + value) * MONTHLY_INTEREST_RATE;

    value = (AMOUNT + value) * MONTHLY_INTEREST_RATE;
    System.out.printf("After the sixth month, the account value is %,f\n", value);
  }
}
