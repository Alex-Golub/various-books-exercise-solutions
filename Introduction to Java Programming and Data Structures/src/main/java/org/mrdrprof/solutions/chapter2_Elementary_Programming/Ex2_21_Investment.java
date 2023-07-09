package org.mrdrprof.solutions.chapter2_Elementary_Programming;

import java.util.Scanner;

/**
 * *2.21 (Financial application: calculate future investment value)
 * Write a program that reads in investment amount, annual interest rate,
 * and number of years and displays the future investment value.
 *
 * Created by ag on 13-Oct-20 8:35 PM 
 */
class Ex2_21_Investment {
  public static void main(String[] args) {
    System.out.print("Enter investment amount: ");
    Scanner scanner = new Scanner(System.in);
    double investment = scanner.nextDouble();

    System.out.print("Enter annual interest rate in percentage(e.g. 5 for 5%): ");
    double annualRate = scanner.nextDouble();

    System.out.print("Enter number of years: ");
    int years = scanner.nextInt();

    double monthlyRate = annualRate / 1200; // 12 months
    double futureValue = investment * Math.pow((1 + monthlyRate), years * 12);
    System.out.println("Future value is $" + (int) (0.5 + futureValue * 100) / 100.0);
  }
}
