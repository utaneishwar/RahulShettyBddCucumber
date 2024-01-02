package stepdefination;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageFactory.LaunchBrowser;
import pagessClass.ScenarioOutlineCredentialPage;



public class ScenarioOutlineCredentialStep 
{
	WebDriver driver ;                                                   // driver
	ScenarioOutlineCredentialPage sos=new ScenarioOutlineCredentialPage(LaunchBrowser.getdriver());
	@Given("user at the loginpage")
	public void user_at_the_loginpage() {
		driver =LaunchBrowser.getdriver();
		driver.get("https://automationexercise.com/login");  }

	@When("user enters {string}")
	public void user_enters(String username) {
		sos.username(username);
	}

	@When("user  {string}")
	public void user (String password) {
		sos.password(password);
	}
	@When("User clicks on loginButton")
	public void user_clicks_on_login_button() {
		sos.login();
	}

	@When("user login successfully")
	public void user_login_successfully() {
	System.out.println("login success");
	}



}


