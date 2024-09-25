package com.dp;

public class BankAccManagement {
	 public static void main(String[] args) {
	        // Create a shared BankAccount object with an initial balance of $1000
	        BankAccount sharedAccount = new BankAccount(1000);

	        // Create multiple threads simulating users performing transactions
	        Thread user1 = new Thread(new UserTransaction(sharedAccount, 500, 200), "User 1");
	        Thread user2 = new Thread(new UserTransaction(sharedAccount, 300, 400), "User 2");
	        Thread user3 = new Thread(new UserTransaction(sharedAccount, 200, 100), "User 3");

	        // Start the threads
	        user1.start();
	        user2.start();
	        user3.start();

	        // Wait for all threads to finish
	        try {
	            user1.join();
	            user2.join();
	            user3.join();
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        // Print the final balance
	        System.out.println("Final Balance: $" + sharedAccount.getBalance());
	    }
}
