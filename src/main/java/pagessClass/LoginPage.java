package pagessClass;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage
{
	WebDriver driver;
	// webElements
	private @FindBy(xpath = "//*[@id='userEmail']")
	WebElement username;

	private @FindBy(xpath = "//*[@id='userPassword']")
	WebElement password;
	private @FindBy(xpath = "//*[@id='login']")
	WebElement loginbutton;


	private @FindBy(xpath = "(//*[@type='checkbox'])[12]")
	WebElement fashioncheckbox;


	private @FindBy(xpath = "//*[@id=\"products\"]/div[1]/div[2]/div[1]/div/div//*[@class='btn w-10 rounded']")
	WebElement addTocartbutton;


	private @FindBy(xpath = "//html/body/app-root/app-dashboard/app-sidebar/nav/ul/li[4]//*[@class='btn btn-custom']")
	WebElement addToBasket;


	private @FindBy(xpath = "//*[@class='totalRow']/following-sibling::li/following-sibling::li/child::button")
	WebElement checkoutbutton;


	private @FindBy(xpath = "//*[text()='Credit Card Number ']/following-sibling::input")
	WebElement SendCardnumber;
	private @FindBy(xpath = "(//*[@class='input ddl'])[1]")
	WebElement expirymonth;
	private @FindBy(xpath = "(//*[@class='input ddl'])[2]")
	WebElement expirydate;
	private @FindBy(xpath = "//*[text()='CVV Code ']/following-sibling::input")
	WebElement cvvcardnumber;
   private @FindBy(xpath = "(//*[@style='margin-top: -10px;']/preceding-sibling::div/following-sibling::div/following-sibling::div/child::div/child::div/following-sibling::input)[1]")
	WebElement cardname;

	private @FindBy(xpath = "(//*[@class='input txt text-validated'])[2]")
	WebElement country;
	
	//*[text()=' India']
	
	private @FindBy(xpath = "//*[text()=' India']")
	WebElement dropdowncountry;
	
	private @FindBy(xpath = "//*[text()='Place Order ']/child::i")
	WebElement placeorder;
	
	Actions act;
	

	
	// constructor
	public LoginPage (WebDriver driver)
	{
		this.driver =driver;
		PageFactory.initElements(driver, this);

	}

	// methods 

	public void username(String user)
	{
		username.sendKeys(user);

	}
	public void password(String pass)
	{

		password.sendKeys(pass);

	}
	public void submitlogin() throws InterruptedException
	{
		loginbutton.click();
		Thread.sleep(2000);

	}
	public void checkboxfashion()
	{
		fashioncheckbox.click();

	}
	public void productAddtocart() throws InterruptedException
	{	Thread.sleep(2000);
	addTocartbutton.click();

	}
	public void productAddintheBasket() throws InterruptedException
	{	Thread.sleep(2000);
	addToBasket.click();

	}
	public void checkoutproduct() throws InterruptedException
	{	Thread.sleep(2000);
	checkoutbutton.click();


	}


	public void cardnumber() throws InterruptedException
	{	Thread.sleep(2000);

	 act =new Actions(driver);
	SendCardnumber.click();
	act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL)
	.sendKeys("1234567891011").build().perform();
	}

	
	public void expirycard() throws InterruptedException
	{	
		
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		Select sm=new Select(expirymonth);
		sm.selectByVisibleText("12");
		Select sd=new Select(expirydate);
		sd.selectByVisibleText("26");

		cvvcardnumber.click();
        cvvcardnumber.sendKeys("456");
      
		cardname.click();
		cardname.sendKeys("RUPAY");
		

		
		country.click();
		country.sendKeys("INDIA");
		dropdowncountry.click();
		Thread.sleep(2000);
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",placeorder );
	    
//		act.scrollByAmount(0,700);
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
//		//wait.until(ExpectedConditions.elementToBeClickable(placeorder));
//		wait.until(ExpectedConditions.visibilityOf(placeorder));
//		
//		placeorder.click();
		

	}
	

}
