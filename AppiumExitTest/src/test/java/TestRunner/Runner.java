package TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions
(
features = "./src/test/java/FeaturesFiles",
 glue = "StepDefination",
 dryRun = false,
 monochrome = true,
 tags = {"@smoke"}


)

public class Runner extends AbstractTestNGCucumberTests{

}