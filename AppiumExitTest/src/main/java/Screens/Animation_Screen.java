package Screens;

import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;

public class Animation_Screen {
	
	public AppiumDriver<MobileElement> driver;

	

	public Animation_Screen(AppiumDriver<MobileElement> driver) {
		
		 this.driver = driver;
		 PageFactory.initElements(new AppiumFieldDecorator(driver),this);
	}
	
	@AndroidFindBy(xpath = "\r\n"
			+ "//android.widget.TextView[@content-desc=\"Animation\"]")
    public MobileElement animation_btn;
	
	@AndroidFindBy(accessibility = "Hide-Show Animations")
    public AndroidElement hide_show_animation;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.Button[1]")
	public AndroidElement hide_button0;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.Button[3]")
	public AndroidElement hide_button2;

	@AndroidFindBy(id = "io.appium.android.apis:id/addNewButton")
	public AndroidElement show_Btn;
	
	
	
	public void clickAniamtion() throws InterruptedException {
		AndroidTouchAction action = new AndroidTouchAction(driver);	
		action.tap(TapOptions.tapOptions().withElement(ElementOption.element(animation_btn))).perform();
    }
	 
	public void clickHideShow() {
		AndroidTouchAction action = new AndroidTouchAction(driver);	
		action.tap(TapOptions.tapOptions().withElement(ElementOption.element(hide_show_animation))).perform();
	}
	
	public void clickHideBtn() throws InterruptedException {
		AndroidTouchAction action = new AndroidTouchAction(driver);	
		action.tap(TapOptions.tapOptions().withElement(ElementOption.element(hide_button0))).perform();
		
		action.tap(TapOptions.tapOptions().withElement(ElementOption.element(hide_button2))).perform();
		
	}
	
	public void clickShowBtn() throws InterruptedException {
		AndroidTouchAction action = new AndroidTouchAction(driver);	
		action.tap(TapOptions.tapOptions().withElement(ElementOption.element(show_Btn))).perform();
	}
	

}
