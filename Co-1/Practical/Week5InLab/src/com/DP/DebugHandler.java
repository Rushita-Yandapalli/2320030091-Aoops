package com.DP;

public class DebugHandler extends LogHandler{

	@Override
	protected boolean canHandle(LogLevel level) {
		// TODO Auto-generated method stub
		return level == LogLevel.DEBUG;
	}

	@Override
	protected void log(String message) {
		// TODO Auto-generated method stub
		System.out.println("DEBUG: " + message);
	}

}
