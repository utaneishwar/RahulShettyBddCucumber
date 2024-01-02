package stepdefination;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
      features = {"src\\test\\resources\\Execution\\datatable.feature"},
      glue = {"stepdefination"},
      plugin = {"pretty"},
      dryRun=false



		)


public class ScenarioOutlineCredentialRunner extends AbstractTestNGCucumberTests {

}
