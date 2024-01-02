package masterMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageFactory.LaunchBrowser;

public class Master
{
	public static  void waitForElement() throws InterruptedException
	{
		boolean progressiconAvailable =true;
		boolean displayed;
		int count=0;
		try {
			WebDriverWait wait =new WebDriverWait(LaunchBrowser.getdriver(), Duration.ofSeconds(4));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='loadingStyle']")));
		} 
		catch (Exception e) 
		{
			progressiconAvailable=false;
		}
		if(progressiconAvailable)  //true 
		{
			while(count<120)
			{
				try
				{

					displayed=LaunchBrowser.getdriver().findElement(By.xpath("//div[@class='loadingStyle']")).isDisplayed();
					if(!displayed)
					{
						Thread.sleep(1000);
						break;
					}
					Thread.sleep(1000);
					count++;
				}
				catch(Exception e)
				{
					Thread.sleep(1000);
					break;
				}
			}
		}

	}
}
