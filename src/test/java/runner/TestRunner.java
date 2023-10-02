package runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features", glue = { "org.cucumber.test" }, plugin = { "pretty",
		"html:src/test/resources/cucumberreports/cucumber-report",
		"json:src/test/resources/cucumberreports/cucumber.json" }, 
         monochrome = true, 
         publish = true)
public class TestRunner extends AbstractTestNGCucumberTests{
	
	@DataProvider(parallel=false)
	public Object[][] scenario(){
		return super.scenarios();
	}

}
