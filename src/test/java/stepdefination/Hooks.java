package stepdefination;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import pageFactory.LaunchBrowser;

public class Hooks 
{


	WebDriver driver;
	@Before
	public void launchUri()
	{
		LaunchBrowser lb =new LaunchBrowser();
		driver = lb.initBrowser();
	
	}

	@After
	public void quitBrowser() throws InterruptedException
	{

//		Thread.sleep(10000);
//		driver.quit();
	}


}
