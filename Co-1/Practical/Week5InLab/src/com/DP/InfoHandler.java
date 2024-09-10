package com.DP;

public class InfoHandler extends LogHandler{

	@Override
	protected boolean canHandle(LogLevel level) {
		// TODO Auto-generated method stub
		return level == LogLevel.INFO;
	}

	@Override
	protected void log(String message) {
		// TODO Auto-generated method stub
		System.out.println("INFO: "+ message);
	}

}
