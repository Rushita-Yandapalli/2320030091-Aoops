package com.DP;

public class LogCommand implements Command {
private LogHandler handler;
private LogLevel level;
private String message;

public LogCommand(LogHandler handler, LogLevel level, String message) {
	this.handler = handler;
	this.level = level;
	this.message = message;
}
	public LogCommand(LogHandler errorhandler, LogLevel error) {
	// TODO Auto-generated constructor stub
}
	@Override
	public void execute(String additionalmessage) {
		// TODO Auto-generated method stub
		handler.handleRequest(level, message + additionalmessage);
	}

}
