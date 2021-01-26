package chapter5_Loops;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * **5.22 (Financial application: loan amortization schedule)
 * The monthly payment for a given loan pays the principal and the interest.
 * The monthly interest is computed by multiplying the monthly interest rate
 * and the balance (the remaining principal).
 * The principal paid for the month is therefore the monthly payment minus
 * the monthly interest.
 * Write a program that lets the user enter the loan amount,
 * number of years, and interest rate then displays the amortization
 * schedule for the loan.
 *
 * @author Mr.Dr.Professor
 * @since 22-Jan-21 5:09 PM
 */
class Ex5_22_loanAmortization {
  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    System.out.print("Loan Amount: ");
    double balance = console.nextDouble();
    System.out.print("Number of Years: ");
    int years = console.nextInt();
    System.out.print("Annual Interest Rate: ");
    int annualRate = console.nextInt();

    System.out.println();

    double monthlyRate = annualRate / 1200.0; // 100 to percent 12 months
    double monthlyPayment = (balance * monthlyRate) /
                            (1 - 1 / Math.pow(1 + monthlyRate, years * 12));
    double totalPayment = monthlyPayment * years * 12;

    System.out.printf("Monthly Payment: %s\n",
                      DecimalFormat.getCurrencyInstance().format(monthlyPayment));
    System.out.printf("Total Payment: %s\n",
                      DecimalFormat.getCurrencyInstance().format(totalPayment));

    System.out.printf("\n%-15s%-15s%-15s%-15s\n",
                      "Payment#", "Interest", "Principal", "Balance");

    for (int payment = 1; payment <= years * 12; payment++) {
      double interest  = monthlyRate * balance;
      double principal = monthlyPayment - interest;
      balance -= principal;

      System.out.printf("%-15d%,-15.2f%,-15.2f%,-15.2f\n",
                        payment, interest, principal, balance);
    }


  }
}
