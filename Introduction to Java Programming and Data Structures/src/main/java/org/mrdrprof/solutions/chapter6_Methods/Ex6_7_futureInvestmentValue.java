package org.mrdrprof.solutions.chapter6_Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * *6.7 (Financial application: compute the future investment value)
 * futureValue = investment * (1 + monthlyRate)^(years * 12);
 *
 * @author Mr.Dr.Professor
 * @since 28-Jan-21 1:19 PM
 */
class Ex6_7_futureInvestmentValue {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("The amount invested: ");
    int amount = sc.nextInt();
    System.out.print("Annual interest rate: ");
    double annualRate          = sc.nextDouble();
    double monthlyInterestRate = annualRate / 1200;

    System.out.printf("%-10s%10s\n", "Years", "Future Value");
    for (int i = 1; i <= 30; i++) {
      System.out.printf("%-10d%10s\n",
                        i, DecimalFormat
                                .getCurrencyInstance()
                                .format(futureInvestmentValue(amount, monthlyInterestRate, i))
      );
    }
  }

  public static double futureInvestmentValue(
          double investmentAmount, double monthlyInterestRate, int years) {
    return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
  }
}
