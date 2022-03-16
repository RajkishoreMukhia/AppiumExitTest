package Screens;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

import java.sql.Driver;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.BaseClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Animation_Screen {
	
	public AppiumDriver<MobileElement> webd;
	

	public Animation_Screen(AppiumDriver<MobileElement> driver) {
		
		 this.webd = driver;
		 PageFactory.initElements(new AppiumFieldDecorator(webd),this);
	}
	
	@AndroidFindBy(id ="Animation")
    public AndroidElement animation_btn;
	@AndroidFindBy(accessibility = "Hide-Show Animations")
    public AndroidElement hide_show_animation;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.Button[1]")
	public AndroidElement hide_button0;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.Button[2]")
	public AndroidElement hide_button1;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.Button[3]")
	public AndroidElement hide_button2;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.Button[4]")
	public AndroidElement hide_button3;
	
	
	@AndroidFindBy(id = "io.appium.android.apis:id/addNewButton")
	public AndroidElement show_Btn;
	
	
	
	
	
	
	public void clickAniamtion() throws InterruptedException {
		TouchAction touch = new TouchAction(webd);
		MobileElement Element = (MobileElement) webd.findElementByXPath("	\r\n"
				+ "//android.widget.TextView[@content-desc=\"Animation\"]");
		touch.tap(tapOptions().withElement(element(Element))).release().perform();	
    }
	 
	public void clickHideShow() {
		hide_show_animation.click();
	}
	
	public void clickHideBtn() throws InterruptedException {
		hide_button0.click();
//		hide_button1.click();
		hide_button2.click();
//		hide_button3.click();
		
	}
	
	public void clickShowBtn() throws InterruptedException {
		show_Btn.click();
	}
	

}
