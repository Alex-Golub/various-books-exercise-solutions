package chapter4_Control_Statements_Part_1._4_18_Credit_Limit;

/**
 * Created by ag on 26-Jun-20 1:03 PM
 */
public class Customer {

  private String accountNumber;
  private int monthlyBalance;
  private int monthlyCharge;
  private int monthlyCredits;
  private int creditLimit;

  public Customer(String accountNumber, int beginningBalance, int monthlyCharge, int monthlyCredits, int creditLimit) {
    this.accountNumber = accountNumber;
    this.monthlyCharge = monthlyCharge;
    this.monthlyCredits = monthlyCredits;
    this.creditLimit = creditLimit;

    this.monthlyBalance = beginningBalance + monthlyCharge - monthlyCredits;
  }

  public int getMonthlyBalance() {
    return monthlyBalance;
  }

  /** determine whether the new balance exceeds the customer’s credit limit. */
  public boolean exceedsCreditLimit() {
    return getMonthlyBalance() > creditLimit;
  }
}
