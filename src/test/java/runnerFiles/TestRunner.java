package runnerFiles;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features", 
		glue = {"stepDefinitions"}, 
		plugin= {"pretty","html:test-output/cucumber.html", "json:json_output/cucumber.json"},
		monochrome = true,
//		strict = true,
		dryRun = false
//		tags = {"@REGRESSION"}
		)
public class TestRunner {
	
	

}
