package com.DP;
public class UserLoginManager {
	private static UserLoginManager instance;

    // Variable to keep track of login status
    private boolean loggedIn = false;

    // Private constructor to prevent instantiation
    private UserLoginManager() {
    }

    // Public method to get the single instance of UserLoginManager
    public static UserLoginManager getInstance() {
        if (instance == null) {
            instance = new UserLoginManager();
        }
        return instance;
    }

    // Method to check if the user is logged in
    public boolean isLoggedIn() {
        return loggedIn;
    }

    // Method to simulate user login
    public void login() {
        loggedIn = true;
        System.out.println("User logged in.");
    }

    // Method to simulate user logout
    public void logout() {
        loggedIn = false;
        System.out.println("User logged out.");
    }
}
