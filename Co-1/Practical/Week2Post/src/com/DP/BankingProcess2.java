package com.DP;

public class BankingProcess2 {

    private UserLoginManager loginManager;

    public BankingProcess2() {
        loginManager = UserLoginManager.getInstance();
    }

    // Method to view balance
    public void viewBalance() {
        if (loginManager.isLoggedIn()) {
            // Logic to view balance
            System.out.println("Balance: $1000");
        } else {
            System.out.println("Please log in to view your balance.");
        }
    }

    // Method to deposit amount
    public void deposit(double amount) {
        if (loginManager.isLoggedIn()) {
            // Logic to deposit the amount
            System.out.println("$" + amount + " deposited successfully.");
        } else {
            System.out.println("Please log in to make a deposit.");
        }
    }

    // Method to withdraw amount
    public void withdraw(double amount) {
        if (loginManager.isLoggedIn()) {
            // Logic to withdraw the amount
            System.out.println("$" + amount + " withdrawn successfully.");
        } else {
            System.out.println("Please log in to make a withdrawal.");
        }
    }

    public static void main(String[] args) {
        BankingProcess2 process = new BankingProcess2();

        // Simulate user actions
        UserLoginManager loginManager = UserLoginManager.getInstance();
        loginManager.login();  // Simulating user login

        process.viewBalance();
        process.deposit(500);
        process.withdraw(200);
        loginManager.logout();  // Simulating user logout
    }
}