package com.DP;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     LogHandler infoHandler = new InfoHandler();
     LogHandler debugHandler = new DebugHandler();
     LogHandler errorhandler = new ErrorHandler();
     infoHandler.setNextHandler(debugHandler);
     debugHandler.setNextHandler(errorhandler);
     Logger logger = new Logger();
     logger.addCommand(new LogCommand(infoHandler, LogLevel.INFO));
     logger.addCommand(new LogCommand(debugHandler, LogLevel.DEBUG));
     logger.addCommand(new LogCommand(errorhandler, LogLevel.ERROR));
     logger.processCommands();
     logger.addCommand(new LogCommand(infoHandler, LogLevel.INFO));
     logger.addCommand(new LogCommand(debugHandler, LogLevel.DEBUG));
     logger.addCommand(new LogCommand(errorhandler, LogLevel.ERROR));
     logger.processCommands();
     }

}
