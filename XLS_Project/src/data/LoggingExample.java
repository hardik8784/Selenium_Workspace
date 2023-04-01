package data;

import org.apache.log4j.Logger;

public class LoggingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//add log4j.jar to the project - to build path
		//copy log4j.properties directly inside the src folder
		//create the object of Logger in the code
		
		Logger print = Logger.getLogger("devpinoyLogger");
		print.debug("hello");  //System.out.println("hello");
		print.debug("We are writing in log file");
		print.debug("test case 1");
		print.debug("test case 2");
		
	}

}
