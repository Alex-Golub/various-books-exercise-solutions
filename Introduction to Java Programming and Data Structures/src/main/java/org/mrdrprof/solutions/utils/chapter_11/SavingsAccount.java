package org.mrdrprof.solutions.utils.chapter_11;

import org.mrdrprof.solutions.utils.exceptions.InsufficientFunds;

/**
 * @author Alex Golub
 * @since 02/06/2023 1:02 PM
 */
public class SavingsAccount extends Account {

    private static final double OVERDRAFT_LIMIT = 0;

    public SavingsAccount(int id, double balance, double annulInterestRate) {
        super(id, balance, annulInterestRate);
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount >= OVERDRAFT_LIMIT) {
            super.withdraw(amount);
        }

        throw new InsufficientFunds("Insufficient funds");
    }
}
