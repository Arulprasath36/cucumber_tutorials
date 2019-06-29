package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
		features="featureFiles" , 
		glue={"stepDefinitions","hooks"},
		dryRun=false,
		monochrome=true,
		plugin={"html:report/WebReport", "json:report/jsonreport.json","junit:report/xmlreport.xml"},
		tags={"@BackgroundExample"}
		)
public class RunnerClass {
	
	// it should combine the feature file and the step definition
	// Runnner define
}
