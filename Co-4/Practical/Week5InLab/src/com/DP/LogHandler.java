package com.DP;

public abstract class LogHandler {
protected LogHandler nextHander;
public void setNextHandler(LogHandler nextHandler) {
	this.nextHander = nextHandler;
}
public void handleRequest(LogLevel level, String message) {
	if (canHandle(level)) {
		log(message);
	}
	else if(nextHander != null) {
		nextHander.handleRequest(level, message);
	}
}
protected abstract boolean canHandle(LogLevel level);
protected abstract void log(String message);
}
