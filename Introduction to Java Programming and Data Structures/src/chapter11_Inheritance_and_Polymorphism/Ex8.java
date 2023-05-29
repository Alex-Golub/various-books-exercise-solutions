package chapter11_Inheritance_and_Polymorphism;

import utils.chapter_11.Account;
import utils.chapter_11.Transaction;

import java.util.List;

/**
 * @author Alex Golub
 * @since 02/06/2023 2:38 PM
 */
class Ex8 {
    public static void main(String[] args) {
        Account account = new Account(1122, 1000, 1.5);
        System.out.println("account.getTransactions() = " + account.getTransactions());
        account.deposit(100);
        System.out.println(account.getTransactions());
        account.withdraw(1000);
        List<Transaction> transactions = account.getTransactions();
        transactions.forEach(System.out::println);
        account.withdraw(1000);
        transactions.forEach(System.out::println);
    }
}
