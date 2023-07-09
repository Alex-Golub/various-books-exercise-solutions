package org.mrdrprof.solutions.chapter10_Object_Oriented_Thinking;

import org.mrdrprof.solutions.utils.chapter_11.Account;

import java.util.Scanner;

/**
 * **10.7 (Game: ATM machine)
 *
 * @author Mr.Dr.Professor
 * @since 3/22/2021 10:00 PM
 */
/*public*/ class Ex10_7_atmMachine {
  static final Scanner console = new Scanner(System.in);
  static final double DEFAULT_INITIAL_AMOUNT = 100;
  static final int NUMBER_OF_ACCOUNTS = 9;

  public static void main(String[] args) {
    Account[] accounts = createAccounts(NUMBER_OF_ACCOUNTS, DEFAULT_INITIAL_AMOUNT);

    while (true) {
      System.out.print("Enter an id: ");
      int id = console.nextInt();
      Account account = getAccount(id, accounts);
      if (account == null) {
        System.out.println(">> There is no such account with id " + id + "\n");
        continue;
      }

      System.out.println();
      processRequest(account);
    }
  }

  private static void processRequest(Account account) {
    boolean exit = false;
    while (!exit) {
      menu();

      String choice = console.next();
      switch (choice) {
        case "1":
          System.out.printf("The balance is $%.1f\n", account.getBalance());
          break;
        case "2":
          System.out.print("Enter an amount to withdraw: ");
          double amount = console.nextDouble();
          account.withdraw(amount);
          break;
        case "3":
          System.out.print("Enter an amount to deposit: ");
          amount = console.nextDouble();
          account.deposit(amount);
          break;
        case "4":
          exit = true;
          break;
      }

      System.out.println();
    }
  }

  private static void menu() {
    System.out.print(
            "Main menu\n" +
            "1: check balance\n" +
            "2: withdraw\n" +
            "3: deposit\n" +
            "4: exit\n" +
            "Enter a choice: "
    );
  }

  private static Account getAccount(int id, Account[] accounts) {
    for (Account account : accounts) {
      if (account.getId() == id) {
        return account;
      }
    }

    return null;
  }

  public static Account[] createAccounts(int numberOfAccounts, double initialBalance) {
    if (numberOfAccounts <= 0) {
      throw new IllegalArgumentException("Can't create 0 or negative accounts");
    }

    if (initialBalance < 0) {
      initialBalance = DEFAULT_INITIAL_AMOUNT;
    }

    Account[] accounts = new Account[numberOfAccounts];
    for (int i = 0; i < numberOfAccounts; i++) {
      accounts[i] = new Account(i, initialBalance, 10);
    }

    return accounts;
  }
}
