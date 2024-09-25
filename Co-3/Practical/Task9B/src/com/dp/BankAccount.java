package com.dp;

public class BankAccount {
	private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Synchronized method to deposit money
    public synchronized void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(Thread.currentThread().getName() + " deposited: $" + amount);
            System.out.println("Current Balance: $" + balance);
        }
    }

    // Synchronized method to withdraw money
    public synchronized void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " withdrew: $" + amount);
            System.out.println("Current Balance: $" + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " tried to withdraw: $" + amount + " (Insufficient Funds)");
        }
    }

    // Method to get the current balance
    public synchronized double getBalance() {
        return balance;
    }
}

// Runnable class to simulate a user performing transactions
class UserTransaction implements Runnable {
    private BankAccount account;
    private double depositAmount;
    private double withdrawAmount;

    public UserTransaction(BankAccount account, double depositAmount, double withdrawAmount) {
        this.account = account;
        this.depositAmount = depositAmount;
        this.withdrawAmount = withdrawAmount;
    }

    @Override
    public void run() {
        account.deposit(depositAmount);
        account.withdraw(withdrawAmount);
    }
}

