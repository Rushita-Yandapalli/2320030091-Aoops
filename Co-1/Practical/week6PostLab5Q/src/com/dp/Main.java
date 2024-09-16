package com.dp;

public class Main {
	public static void main(String[] args) {
        
        MessageService emailService = new EmailService();
        MyApplication app1 = new MyApplication(emailService);
        app1.processMessage("Hello, Email World!", "Rushita@email.com");

        
        MessageService smsService = new SMSService();
        MyApplication app2 = new MyApplication(smsService);
        app2.processMessage("Hello, SMS World!", "1234567890");
    }

}
