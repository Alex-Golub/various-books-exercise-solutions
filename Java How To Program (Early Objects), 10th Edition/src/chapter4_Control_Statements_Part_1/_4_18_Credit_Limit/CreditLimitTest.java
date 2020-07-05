package chapter4_Control_Statements_Part_1._4_18_Credit_Limit;

import java.util.Scanner;

/**
 * 4.18 (Credit Limit Calculator) Develop a Java application that determines whether any of several
 * department-store customers has exceeded the credit limit on a charge account. For each customer,
 * the following facts are available:
 *      a) account number
 *      b) balance at the beginning of the month
 *      c) total of all items charged by the customer this month
 *      d) total of all credits applied to the customer’s account this month
 *      e) allowed credit limit.
 * The program should input all these facts as integers, calculate the new balance (= beginning balance
 * + charges – credits), display the new balance and determine whether the new balance exceeds the
 * customer’s credit limit.
 * For those customers whose credit limit is exceeded, the program should display the message "Credit limit exceeded".
 *
 * Created by ag on 26-Jun-20 1:01 PM
 */
class CreditLimitTest {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("=== Credit Limit Calculator ===");
    while (true) {
      System.out.print("Enter account number (enter to exit): ");
      String accountNumber = scanner.nextLine();
      if ("".equals(accountNumber))
        break;

      System.out.print("Enter balance at the beginning of the month: ");
      String input = scanner.nextLine();
      if ("".equals(input))
        break;
      int monthBalance = Integer.parseInt(input);

      System.out.print("Enter total of all items charged by the customer this month: ");
      input = scanner.nextLine();
      if ("".equals(input))
        break;
      int charged = Integer.parseInt(input);

      System.out.print("Enter total of all credits applied to the customer’s account this month: ");
      input = scanner.nextLine();
      if ("".equals(input))
        break;
      int credits = Integer.parseInt(input);

      System.out.print("Enter allowed credit limit.: ");
      input = scanner.nextLine();
      if ("".equals(input))
        break;
      int limit = Integer.parseInt(input);

      Customer customer = new Customer(accountNumber, monthBalance, charged, credits, limit);
      System.out.println("\nNew balance is: $" + customer.getMonthlyBalance());
      System.out.println("New balance exceeds the customer’s credit limit? " +
              (customer.exceedsCreditLimit() ? "You can purchase more" : "Credit limit exceeded") + "\n");

    }

    System.out.println("\nBye");
  }
}
