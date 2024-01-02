package pagessClass;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pageFactory.LaunchBrowser;

public class PaytmComPage
{
	static WebDriver driver;
	private @FindBy (xpath = "(//*[@id=\"app\"]//*[text()='Recharge'])[1]")
	WebElement Recharge_pre_mobile;


	private @FindBy (xpath = "//*[text()='Prepaid']")
	WebElement prepaid_radiobutton;
	private @FindBy (xpath = "//*[@type='tel']")
	WebElement  mobilenumber;
	private @FindBy (xpath = "//*[text()='Operator']")
	WebElement  operator;
	private @FindBy (xpath = "//*[@id=\"app\"]/div/div[4]/div[1]//*[text()='Jio']")
	WebElement  jiooperator;
	private @FindBy (xpath = "//*[@id=\"app\"]/div/div[4]/div[1]/div[1]//*[text()='Circle']")
	WebElement circle;
	private @FindBy (xpath = "//*[@class='_3xI1']")
	WebElement maharashtra_circle;
	private @FindBy (xpath = "(//*[@type='text'])[2]")
	WebElement amount;
	private @FindBy (xpath = "//*[@class='_11kC  _15qf _2qE6']")
	WebElement proceed_to_recharget;
//class="_1exI
	// constructor 
	public PaytmComPage(WebDriver  driver)
	{
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}

	//methods 
	public void recharge_prepaid_mobile()
	{
		Recharge_pre_mobile.click();
	}
	public void radiobutton()
	{
	  //	prepaid_radiobutton.click();
	}
	public void prepaid_Recharge(String mobno) throws InterruptedException
	{
		Thread.sleep(1000);
		JavascriptExecutor js =(JavascriptExecutor)LaunchBrowser.getdriver();
		js.executeScript("arguments[0].click();", mobilenumber );
		mobilenumber.click();
		mobilenumber.sendKeys(mobno);
	}
//	public void operator()
//	{
//		operator.click();
//		jiooperator.click();
//	}
//	public void circle()
//	{
//		circle.click();
//		maharashtra_circle.click();
//	}

	public void Amount (String amountrupee) throws InterruptedException
	{
	
		amount.click();
//
//		JavascriptExecutor js =(JavascriptExecutor)LaunchBrowser.getdriver();
//		js.executeScript("arguments[0].value='"+amountrupee+"'", amount );
		
		amount.sendKeys(amountrupee);

	}
	public void proceedrecharge ()
	{
		proceed_to_recharget.click();
	}


}
