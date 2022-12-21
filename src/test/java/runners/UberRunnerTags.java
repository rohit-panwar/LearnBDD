package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/feature/uberTags.feature"},
		glue = {"stepDefinations"},
		plugin = {"pretty", "html: target/My_Report/report.html",
				"junit: target/My_Report/report.xml","json: target/My_Report/report.json"},
		//publish = true, // To publish the Cucumber Report
		// Instead of this, user can add cucumber.properties file
		monochrome = true,
		//tags = "@Smoke" // 2
		tags= "@All" // 3
		//tags= "@All and @ProdSanity" // 1
		//tags= "@Regression or @ProdSanity " // 2
		//tags= "@Smoke and not @Regression " // 1
		
		)
public class UberRunnerTags {
	// To execute via Maven command
 // mvn test -Dcucumber.filter.tag="@Smoke"
}
