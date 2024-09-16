package com.dp;

public class MyApplication {
	private MessageService messageService;

    public MyApplication(MessageService service) {
        this.messageService = service;
    }

    public void processMessage(String message, String receiver) {
        
        this.messageService.sendMessage(message, receiver);
    }

}
