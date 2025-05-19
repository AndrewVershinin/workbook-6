package com.pluralsight.finance;

public class BankAccount implements Valuable {
    private String name;
    private int accountNumber;
    private double balance;

    public BankAccount(String name, double balance, int accountNumber) {
        this.name = name;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    @Override
    public double getValue() {
        return balance;
    }
}
