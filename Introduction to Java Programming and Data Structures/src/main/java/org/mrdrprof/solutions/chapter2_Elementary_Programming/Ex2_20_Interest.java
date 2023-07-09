package org.mrdrprof.solutions.chapter2_Elementary_Programming;

import java.util.Scanner;

/**
 * *2.20 (Financial application: calculate interest)
 * Write a program that reads the balance and the annual percentage
 * interest rate and displays the interest for the next month.
 *
 * Created by ag on 13-Oct-20 8:29 PM 
 */
class Ex2_20_Interest {
  public static void main(String[] args) {
    System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");
    Scanner scanner = new Scanner(System.in);
    double balance = scanner.nextDouble();
    double rate = scanner.nextDouble();
    double annualRate = rate / 1200;

    double interest = balance * annualRate;
    System.out.printf("The interest is %.4f", interest);
  }
}
