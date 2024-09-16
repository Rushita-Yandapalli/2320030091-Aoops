package com.dp;

public class EmailService implements MessageService{

	@Override
	public void sendMessage(String message, String receiver) {
		// TODO Auto-generated method stub
		System.out.println("Email sent to " + receiver + " with message: " + message);
	}
	

}
