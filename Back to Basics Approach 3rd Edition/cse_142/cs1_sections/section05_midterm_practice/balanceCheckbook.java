package cse_142.cs1_sections.section05_midterm_practice;

import java.util.Scanner;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/sections/section5.5/balanceCheckbook
 *
 * initial balance? 48.50                  initial balance? 39.75
 * how many transactions? 4                how many transactions? 5
 * 1/4 amount? -20.00                      1/5 amount? -18.50
 * new balance = $28.5                     new balance = $21.25
 * 2/4 amount? -5.75                       2/5 amount? -7.20
 * new balance = $22.75                    new balance = $14.05
 * 3/4 amount? 138.20                      3/5 amount? -23.10
 * new balance = $160.95                   new balance = $-9.05
 * 4/4 amount? -20.00                      4/5 amount? 50.00
 * new balance = $140.95                   new balance = $40.95
 * minimum balance = $22.75                5/5 amount? -8.45
 *                                         new balance = $32.5
 *                                         minimum balance = $-9.05
 *
 * @author Alex Golub
 * @since 04-Apr-21 10:24 AM
 */
class balanceCheckbook {
  public static void main(String[] args) {
    balanceCheckbook(new Scanner(System.in));
  }

  public static boolean balanceCheckbook(Scanner console) {
    System.out.print("initial balance? ");
    double balance = Double.parseDouble(console.nextLine());

    System.out.print("how many transactions? ");
    int transactions = Integer.parseInt(console.nextLine());

    double minimumBalance = balance;
    for (int i = 1; i <= transactions; i++) {
      System.out.printf("%d/%d amount? ", i, transactions);
      double amount = Double.parseDouble(console.nextLine());
      balance += amount;
      minimumBalance = Math.min(balance, minimumBalance);
      System.out.println("new balance = $" + balance);
    }

    System.out.println("minimum balance = $" + minimumBalance);
    return Double.compare(minimumBalance, 0) < 0;
  }
}
