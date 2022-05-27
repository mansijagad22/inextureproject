import java.util.logging.Logger;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;

public class Log4jImplementationExample {

private static String Log4jImplementationExample;
	//	private static String Log4jImplementationExample;
	private static final org.apache.log4j.Logger logger = LogManager.getLogger(Log4jImplementationExample.class);
	public static void main(String[] args) {
		BasicConfigurator.configure();
		logger.info("Logger info is written here");
		logger.info("Logger info is written here");
	}
	
}
