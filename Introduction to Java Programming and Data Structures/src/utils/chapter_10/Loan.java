package utils.chapter_10;

import lombok.ToString;

import java.util.Date;

@ToString
public class Loan {
  private final Date loanDate;
  private double annualInterestRate;
  private int numberOfYears;
  private double loanAmount;

  /**
   * Default constructor
   */
  public Loan() {
    this(2.5, 1, 1000);
  }

  /**
   * Construct a loan with specified annual interest rate,
   * number of years, and loan amount
   */
  public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
    this.annualInterestRate = annualInterestRate;
    this.numberOfYears = numberOfYears;
    this.loanAmount = loanAmount;
    this.loanDate = new Date();
  }

  /**
   * Return annualInterestRate
   */
  public double getAnnualInterestRate() {
    return annualInterestRate;
  }

  /**
   * Set a new annualInterestRate
   */
  public void setAnnualInterestRate(double annualInterestRate) {
    this.annualInterestRate = annualInterestRate;
  }

  /**
   * Return numberOfYears
   */
  public int getNumberOfYears() {
    return numberOfYears;
  }

  /**
   * Set a new numberOfYears
   */
  public void setNumberOfYears(int numberOfYears) {
    this.numberOfYears = numberOfYears;
  }

  /**
   * Return loanAmount
   */
  public double getLoanAmount() {
    return loanAmount;
  }

  /**
   * Set a newLoanAmount
   */
  public void setLoanAmount(double loanAmount) {
    this.loanAmount = loanAmount;
  }

  /**
   * Find monthly payment
   */
  public double getMonthlyPayment() {
    double monthlyInterestRate = annualInterestRate / 1200;
    return loanAmount * monthlyInterestRate /
           (1 - (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
  }

  /**
   * Find total payment
   */
  public double getTotalPayment() {
    return getMonthlyPayment() * numberOfYears * 12;
  }

  /**
   * Return loan date copy
   */
  public Date getLoanDate() {
    return new Date(loanDate.getTime());
  }
}
