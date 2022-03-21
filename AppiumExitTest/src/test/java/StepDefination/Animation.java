package StepDefination;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseClass;
import Screens.Animation_Screen;
import Utilites.Loger;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Animation extends BaseClass{
	
	Loger log = new Loger("Animation");
	
	Animation_Screen ani;
	

	@Test @Given("^Open application$")
	public void open_application() throws Throwable {
		
		log.loger.info("Start The App");
		setupApp();
	}
	
	@Test @Given("^Click on Animation$")
	public void click_on_animation() throws Throwable {
		
		ani = new Animation_Screen(wd);
		log.loger.info("Click on animation");
		ani.clickAniamtion();
	}
	
	@Test @Then("^Click on Hide-Show Animations button$")
	public void click_on_hide_show_animation_button() throws Throwable {
		
		log.loger.info("click on hide show btn");
		
		ani.clickHideShow();
	}

	@Test @When("^Click on number buttons$")
	public void click_on_show_buttons_and() throws Throwable {
		log.loger.info("click on hide btn");
		ani.clickHideBtn();
	}
	
	@Test @Then("^Numbers btn are hide$")
	public void numbers_btn_are_hide() throws Throwable {
		log.loger.info("Number btn are hide");
	
		Assert.assertEquals(ani.hide_button0.getText(), "1");
		log.loger.info("Assertion is pass Succsessfully");
		
		log.loger.info("Exit the applicaton");
		stopDriver();
	}
	
	@Test @When("^Click on Show Btn$")
	public void click_on_Show_Btn() throws Throwable {
		log.loger.info("click on hide btn");
		ani.clickShowBtn();
		
	}
	
	@Test @Then("^Numbers buttons are Shown$")
	public void numbers_buttons_are_Shown() throws Throwable {
		log.loger.info("Number btn are shown");

		
		Assert.assertEquals(ani.hide_button0.getText(), "0");
		log.loger.info("Assertion is pass Succsessfully");
		
		
		log.loger.info("Exit the applicaton");
		stopDriver();
		
	}

	

}
