package stepdefination;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions
(
		features = {"src\\test\\resources\\Execution\\PaytmcomRecharge.feature"},
		glue = {"stepdefination"},
		plugin = {"pretty"},       // it is used to get the proper display of o/p of the execution 
		dryRun = false,                      // along with the step written in feature file
		publish=true
)

public class PaytmCom_Runner extends AbstractTestNGCucumberTests
{

	

}
