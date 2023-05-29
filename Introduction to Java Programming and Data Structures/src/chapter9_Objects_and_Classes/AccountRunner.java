package chapter9_Objects_and_Classes;

import utils.chapter_11.Account;

/**
 * 9.7 (The Account class)
 *
 * @author Mr.Dr.Professor
 * @since 19/03/2021 13:12
 */
class AccountRunner {

  public static void main(String[] args) {
    Account account = new Account(1122, 20_000, 4.5);
    System.out.println(account);
    account.withdraw(25_000);
    System.out.println(account);
    account.withdraw(2000);
    System.out.println(account);
    account.deposit(1500);
    System.out.println(account);
  }
}
