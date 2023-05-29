package chapter10_Object_Oriented_Thinking;

import java.util.Scanner;

class Loan {
  public static void main(String[] args) {
    // Create a Scanner
    Scanner input = new Scanner(System.in);

    // Enter yearly interest rate
    System.out.print("Enter annual interest rate, for example, 8.25: ");
    double annualInterestRate = input.nextDouble();

    // Enter number of years
    System.out.print("Enter number of years as an integer: ");
    int numberOfYears = input.nextInt();

    // Enter loan amount
    System.out.print("Enter loan amount, for example, 120000.95: ");
    double loanAmount = input.nextDouble();

    // Create Loan object
    utils.chapter_10.Loan loan = new utils.chapter_10.Loan(annualInterestRate, numberOfYears, loanAmount);

    // Display loan date, monthly payment, and total payment
    System.out.printf("The loan was created on %s\n" +
                      "The monthly payment is %.2f\n" +
                      "The total payment is %.2f\n",
                      loan.getLoanDate().toString(),
                      loan.getMonthlyPayment(),
                      loan.getTotalPayment());
  }
}
