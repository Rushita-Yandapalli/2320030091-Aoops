package com.DP;

public class ErrorHandler extends LogHandler{

	@Override
	protected boolean canHandle(LogLevel level) {
		// TODO Auto-generated method stub
		return level == LogLevel.ERROR;
	}

	@Override
	protected void log(String message) {
		// TODO Auto-generated method stub
		System.out.println("ERROR: " + message);
	}

}
