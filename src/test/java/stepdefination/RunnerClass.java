package stepdefination;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions 
(
		features = {"src\\test\\resources\\Execution\\loginPage.feature"},
		glue = {"stepdefination"},
		plugin = {"pretty"},       // it is used to get the proper display of o/p of the execution 
	 	                            // along with the step written in feature file
		publish=true


)
public class RunnerClass extends AbstractTestNGCucumberTests
{

	
}
