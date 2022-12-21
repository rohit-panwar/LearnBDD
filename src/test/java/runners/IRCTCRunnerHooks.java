package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"C:\\Users\\Rohit\\eclipse-workspace\\BDDCucumberTest\\src\\test\\resources\\feature\\irctcHooks.feature"},
		glue = {"stepDefinations", "myHooks"},
		tags = "@Smoke or @Prod"
		)
public class IRCTCRunnerHooks {
	
	
}
