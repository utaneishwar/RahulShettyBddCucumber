package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;

public class LaunchBrowser 
{
	public static  WebDriver driver;
	public WebDriver initBrowser()
	{
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		return driver;
	}
	
	public static WebDriver getdriver()
	{
		return driver;
	}
}
