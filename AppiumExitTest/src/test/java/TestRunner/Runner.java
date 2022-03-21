package TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions
(
//		plugin = { "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" },
		features = "./src/test/java/FeaturesFiles",
		glue = {"StepDefination"},
		 
		 
		 tags = {"@ani"}

)

public class Runner extends AbstractTestNGCucumberTests{

}
