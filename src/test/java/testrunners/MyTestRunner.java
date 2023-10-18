package testrunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;


@io.cucumber.testng.CucumberOptions(
		features= {"src/test/resources/AppFeatures"},
		glue= {"stepdefinition","AppHooks"},
		plugin= {"pretty",
				"json:target/cucumber.json", 
				"rerun:target/rerun.txt"}
		
		)



public class MyTestRunner extends AbstractTestNGCucumberTests{

	
	
	
}
