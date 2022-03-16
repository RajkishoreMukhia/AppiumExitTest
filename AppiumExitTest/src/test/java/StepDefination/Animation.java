package StepDefination;

import Base.BaseClass;
import Screens.Animation_Screen;
import Utilites.Loger;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Animation extends BaseClass{
	
	Loger log = new Loger("Animation");
	
	Animation_Screen ani;
	
	
	

	@Given("^Open application$")
	public void open_application() throws Throwable {
		
		log.loger.info("Start The App");
		setupApp();
	}
	
	@Given("^Click on animation$")
	public void click_on_animation() throws Throwable {
		ani = new Animation_Screen(wd);
		log.loger.info("Click on animation");
		ani.clickAniamtion();
		log.loger.info("Click on animation end");
	}
	
	@Then("^Click on hide show animation button$")
	public void click_on_hide_show_animation_button() throws Throwable {
		ani = new Animation_Screen(wd);
		log.loger.info("click on hide show btn");
		
		ani.clickHideShow();
	}

	@Then("^Click on show buttons and$")
	public void click_on_show_buttons_and() throws Throwable {
		ani = new Animation_Screen(wd);
		log.loger.info("click on hide btn");
		ani.clickHideBtn();
	}

	@When("^Click on show button$")
	public void click_on_show_button() throws Throwable {
		ani = new Animation_Screen(wd);
		log.loger.info("click on hide btn");
		
		log.loger.info("click on hide btn");
	    ani.clickShowBtn();
	}

	@Then("^Btn are showing$")
	public void btn_are_showing() throws Throwable {
		log.loger.info("Exit the applicaton");
	}
}
