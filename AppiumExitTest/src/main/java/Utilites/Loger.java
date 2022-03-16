package Utilites;
import org.apache.log4j.Logger;

public class Loger {
	
	//intialize logger
	public Logger loger;

	//constructor for loger get class name 
	public Loger(String className) {
			
		loger = Logger.getLogger(className);
	}


}
