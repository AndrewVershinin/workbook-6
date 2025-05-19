package com.pluralsight;

import com.pluralsight.finance.BankAccount;
import com.pluralsight.finance.Valuable;

public class FinanceApplication {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Pam", 12500, 123);
        Valuable account2 = new BankAccount("Gary", 1500, 456);

        account1.deposit(100);
        account2.deposit(100); // account2 is declared as a Valuable, and Valuable only has one method
        // ((BankAccount) account2).deposit(100); so we can do like this
    }
}
