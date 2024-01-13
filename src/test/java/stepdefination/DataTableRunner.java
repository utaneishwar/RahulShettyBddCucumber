package stepdefination;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
		features = {"src\\test\\resources\\Execution\\DataTableConcept.feature"},
		glue= {"stepdefination"},
		plugin ="pretty",
		publish =true
		//dryRun=false,
)

public class DataTableRunner extends AbstractTestNGCucumberTests{

}