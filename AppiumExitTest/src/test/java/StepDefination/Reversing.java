package StepDefination;

import org.testng.Assert;

import Base.BaseClass;
import Screens.Reversing_Screen;
import Utilites.Loger;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Reversing extends BaseClass {
	
	Loger log = new Loger("Resvers_Screen");
	
	Reversing_Screen res;

	@Then("^Click on Reversing Tab$")
	public void click_on_Reversing_Tab() throws Throwable {
	    log.loger.info("Click On Reversing Tab");
		res = new Reversing_Screen(wd);
	    res.clickReversing();
	}

	@When("^Click on Play Button$")
	public void click_on_Play_Button() throws Throwable {
	    log.loger.info("Click On Play Button");
		res.clickPlay();
	}

	@Then("^The item goes in buttom$")
	public void the_item_goes_in_buttom() throws Throwable {
	 
		
	}

	@When("^Click on Revers Button$")
	public void click_on_Revers_Button() throws Throwable {
		log.loger.info("Click On Revers Button");
		res.clickRevers();
	}

	@Then("^The item goes same place$")
	public void the_item_goes_same_place() throws Throwable {
		boolean isEnable = res.revers_btn.isEnabled();
		Assert.assertEquals(isEnable, true);
		
		stopDriver();
	}
}
