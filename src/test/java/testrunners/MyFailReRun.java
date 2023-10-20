package testrunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;


@io.cucumber.testng.CucumberOptions(
		features= {"src/test/resources/AppFeatures"},
		glue= {"stepdefinition","AppHooks"},
		plugin= {"pretty",
				"rerun:target/rerun.txt"},
		monochrome = true
		
		)



public class MyFailReRun extends AbstractTestNGCucumberTests{

	
}
