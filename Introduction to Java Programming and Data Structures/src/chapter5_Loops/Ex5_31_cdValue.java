package chapter5_Loops;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

/**
 * *5.31 (Financial application: compute CD value)
 * Write a program that prompts the user to enter an amount
 * (e.g., 10000), the annual percentage yield (e.g., 6.15),
 * and the number of months (e.g., 18) and displays a
 * table as shown in the sample run
 *
 * @author Mr.Dr.Professor
 * @since 25-Jan-21 2:23 PM
 */
class Ex5_31_cdValue {
  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);

    System.out.print("Enter the initial deposit amount (e.g. 10000): ");
    int amount = console.nextInt();
    System.out.print("Enter annual percentage yield (e.g. 6.15): ");
    double yield = console.nextDouble();
    System.out.print("Enter maturity period (number of months e.g. 18): ");
    double months = console.nextDouble();

    System.out.printf("%-7s%14s\n", "Month", "CD Value");
    double       monthlyRate      = yield / 1200;
    double       cdValue          = amount * (1 + monthlyRate);
    NumberFormat currencyInstance = DecimalFormat.getCurrencyInstance();

    for (int i = 1; i <= months; i++) {
      System.out.printf("%-7d%14s\n", i, currencyInstance.format(cdValue));
      cdValue += cdValue * monthlyRate;
    }

  }
}
