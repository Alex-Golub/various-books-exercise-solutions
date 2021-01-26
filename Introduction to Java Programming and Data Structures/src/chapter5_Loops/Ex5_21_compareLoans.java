package chapter5_Loops;

import java.util.Scanner;

/**
 * **5.21 (Financial application: compare loans with various interest rates)
 * Write a program that lets the user enter the loan amount and loan period
 * in number of years and displays the monthly and total payments for each
 * interest rate starting from 5% to 10%, with an increment of 1/4.
 *
 * @author Mr.Dr.Professor
 * @since 22-Jan-21 4:35 PM
 */
class Ex5_21_compareLoans {
  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    System.out.print("Loan Amount: ");
    int loan = console.nextInt();
    System.out.print("Number of Years: ");
    int years = console.nextInt();

    System.out.printf("\n%-18s%-22s%-20s\n",
                      "Interest Rate", "Monthly Payment", "Total Payment");

    for (double annualRate = 5; annualRate <= 10.000; annualRate += 0.250) {
      double monthlyPayment = loan * annualRate / (12 * 100)
                              / (1 - 1 / Math.pow(1 + annualRate / (12 * 100), years * 12));
      double totalPayment = monthlyPayment * years * 12;
      System.out.printf("%,-5.3f%% %,20.2f%,20.2f\n",
                        annualRate, monthlyPayment, totalPayment);
    }
  }
}
