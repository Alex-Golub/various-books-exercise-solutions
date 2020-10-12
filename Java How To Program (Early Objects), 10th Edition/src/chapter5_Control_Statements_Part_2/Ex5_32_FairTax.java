package chapter5_Control_Statements_Part_2;

import java.util.Scanner;

/**
 * 5.32 (Tax Plan Alternatives; The “FairTax”)
 * Write a program that prompts the user to enter expenses
 * in various expense categories they have (e.g., housing, food, clothing,
 * transportation, education, health care, vacations),
 * then prints the estimated FairTax that person would pay.
 *
 * Created by ag on 12-Oct-20 3:34 PM 
 */
class Ex5_32_FairTax {
  public static void main(String[] args) {
    System.out.println("==========================");
    System.out.println("=== FairTax Calculator ===");
    System.out.println("==========================");

    double  totalExpenses = 0;
    double  fairTax       = 0;
    Scanner scanner       = new Scanner(System.in);
    boolean quit          = false;

    while (!quit) {
      System.out.print("Enter expenses:");
      double price = scanner.nextDouble();
      totalExpenses += price;
      fairTax += price * 0.23; // 23% consumption tax on all products and services that you buy.

      System.out.print("Has more expenses? (Y/N): ");
      quit = scanner.next().equalsIgnoreCase("n");
    }

    System.out.println("\nTotal price (without tax) $" + (int) (totalExpenses * 100) / 100.0);
    System.out.println("Total taxes (FairTax) $" + (int) (fairTax * 100) / 100.0);
    System.out.println("Total price (Base price + FairTax) $" + (int) ((totalExpenses + fairTax) * 100) / 100.0);
  }
}
