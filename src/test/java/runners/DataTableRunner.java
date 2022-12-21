package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/feature/dataTable.feature"},
		glue = {"stepDefinations"},
		monochrome = true,
		plugin = {"pretty"}
		)

public class DataTableRunner {

}
