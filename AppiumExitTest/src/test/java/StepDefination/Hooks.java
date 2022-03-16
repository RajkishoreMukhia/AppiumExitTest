package StepDefination;

import Base.BaseClass;
import Utilites.Loger;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseClass{

	Loger log = new Loger("Hooks");
	
	//start the server by using hokes
	@Before
	public void startServer() {
		
		log.loger.info("Start Appium ");
		startAppium();
		
	}
	
	//stop the driver by using after hokes
	@After
	public void stopWebDeriver() {
		log.loger.info("Stop the Driver");
		stopDriver();
		
	}
	
	//close the server by using after hokes
	@After
	public void cloesServer() throws InterruptedException {
		
		log.loger.info("Colse the Server");
		Thread.sleep(3000);
		closeAppium();
		
		
	}
}
