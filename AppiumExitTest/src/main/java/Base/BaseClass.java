package Base;

import org.apache.log4j.PropertyConfigurator;
import Utilites.SetUpApp;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class BaseClass {
	
//		//Intialise driver
	public static AppiumDriver<MobileElement> wd ;
	
	//For Appium local servise  
	AppiumDriverLocalService service;
	
	
	//intialise extend reporting variables
//	public static  ExtentReports extent;
//	public static  ExtentTest extentTest;	
		
	
	//Start appium driver localy
	public void startAppium() {
		
		service = AppiumDriverLocalService.buildDefaultService();
		service.start();
	}
	
	
	//Setup and lounch application
	public void setupApp() {
		SetUpApp set = new SetUpApp();
		set.startApp();
		wd = SetUpApp.driver;
	}
	
	
	//set path for logging
	public void logging() {
		
		PropertyConfigurator.configure("./src/test/resource/log4j.properties");		
	}
	
	//set the extend to path for save the report every time before the suite
//	public void setExtent() {
//		
//	extent = new ExtentReports("./Reports/extentreports.html");
//	
//	}
	
	//ending the reporting after the suite
//	public void endReport() {
//		
//	extent.flush();
//	extent.close();
	
//	}
	
	//method for stop the driver
	public void stopDriver() {
		wd.quit();
//		wd.close();
	}
	
	//Close the appium
	public void closeAppium() {
		service.stop();
	}
	
}