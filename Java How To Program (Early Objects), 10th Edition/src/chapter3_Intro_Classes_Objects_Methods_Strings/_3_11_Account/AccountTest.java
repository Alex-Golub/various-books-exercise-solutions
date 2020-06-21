package chapter3_Intro_Classes_Objects_Methods_Strings._3_11_Account;

import java.util.Scanner;

/**
 * 3.11 (Modified Account Class) Modify class Account (Fig. 3.8) to provide a method called
 * withdraw that withdraws money from an Account.
 * Ensure that the withdrawal amount does not exceed
 * the Account’s balance.
 * If it does, the balance should be left unchanged and the method should print
 * a message indicating "Withdrawal amount exceeded account balance."
 * Modify class AccountTest (Fig. 3.9) to test method withdraw.
 *
 * Created by ag on 18-Jun-20 3:34 PM
 */
class AccountTest {
  public static void main(String[] args) {
    Account account1 = new Account("Jane Green", 50.00);

    // display initial balance of each object
    System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());

    // create a Scanner to obtain input from the command window
    Scanner input = new Scanner(System.in);

    System.out.print("Enter amount to withdraw: ");
    account1.withdraw(input.nextDouble());

    // display balances
    System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());

  }
}
