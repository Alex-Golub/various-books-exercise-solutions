package org.mrdrprof.solutions.chapter11_Inheritance_and_Polymorphism;

import org.mrdrprof.solutions.utils.chapter_11.CheckingAccount;
import org.mrdrprof.solutions.utils.chapter_11.SavingsAccount;

/**
 * 11.3 (Subclasses of Account)
 *
 * @author Alex Golub
 * @since 02/06/2023 1:12 PM
 */
class Ex3 {
    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount(2, 200, 10);
        checkingAccount.withdraw(250);
        System.out.println(checkingAccount);

        System.out.println("-".repeat(50));

        SavingsAccount savingsAccount = new SavingsAccount(1, 200, 10);
        System.out.println(savingsAccount);
        savingsAccount.withdraw(201);
        System.out.println(savingsAccount);
    }
}
