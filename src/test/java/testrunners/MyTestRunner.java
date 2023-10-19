package testrunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;


@io.cucumber.testng.CucumberOptions(
		features= {"src/test/resources/AppFeatures/Blogin.feature","src/test/resources/AppFeatures/graphPage.feature"},
		glue= {"stepdefinition","AppHooks"},
		plugin= {"pretty","html:target/cucumber-reports/reports.html",
				"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
				"json:target/cucumber-reports/cucumber.json",
				"junit:target/cucumber-reports/cucumber.xml",
				"rerun:target/rerun.txt"},
		monochrome = true
		
		)



public class MyTestRunner extends AbstractTestNGCucumberTests{

	
	
	
}
