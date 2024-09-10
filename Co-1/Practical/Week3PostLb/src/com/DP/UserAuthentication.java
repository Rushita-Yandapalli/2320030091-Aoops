package com.DP;

public class UserAuthentication {
  private static UserAuthentication instance;
  private String authenticatedUser;
  private UserAuthentication() {
	  
  }
  public static UserAuthentication getInstance() {
	  if (instance == null) {
		  instance = new UserAuthentication();
	  }
	  return instance;
  }
  public void authenticate(String username) {
	  this.authenticatedUser = username;
	  System.out.println("User" + " " + username + " " + "authenticated.");
  }
  public String getAuthenticatedUser() {
	  return authenticatedUser;
  }
}
