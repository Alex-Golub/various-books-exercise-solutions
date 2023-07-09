package org.mrdrprof.solutions.chapter3_Selections;

import java.util.Scanner;

/**
 * *3.31 (Financials: currency exchange)
 * Enter 0 to convert from U.S. dollars to Chinese RMB and 1 to convert from
 * Chinese RMB to U.S. dollars.
 *
 * Created by ag on 29-Oct-20 7:18 PM
 */
class Ex3_31_Exchange {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.print("Enter the exchange rate from dollars to RMB: ");
      final double USD_TO_RMB = scanner.nextDouble();
      System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
      String choice = scanner.next();

      switch (choice) {
        case "0":
          System.out.print("Enter the dollar amount: ");
          double dollars = scanner.nextDouble();
          System.out.printf("$%.1f is %.1f yuan", dollars, dollars * USD_TO_RMB);
          break;
        case "1":
          System.out.print("Enter the RMB amount: ");
          double rmb = scanner.nextDouble();
          System.out.printf("%.1f yuan is $%.2f", rmb, rmb / USD_TO_RMB);
          break;
        default:
          System.out.println("There is not such conversion type, try again");
          break;
      }

      System.out.println("\n");
    }
  }
}
