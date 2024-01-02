package stepdefination;

import io.cucumber.java.en.Then;
import masterMethods.Master;

public class SpecificDefinition 
{
	@Then("user wait until the page loaded")
	public void user_wait_until_the_page_loaded() throws InterruptedException
	{
		Master.waitForElement();
	}

}
