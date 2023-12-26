package stepdefination;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.LaunchBrowser;
import pagessClass.LoginPage;

public class LoginpageStep
{
	WebDriver driver;
	LoginPage lp =new LoginPage(LaunchBrowser.getdriver());
	@Given("user should be on login page")
	public void user_should_be_on_login_page() 
	{
		driver =LaunchBrowser.getdriver();
		driver.get("https://rahulshettyacademy.com/client");
	}

	@When("user enters username as {string}")
	public void user_enters_username_as(String user) 
	{
		lp.username(user);
	}

	@When("user enters password as {string}")
	public void user_enters_password_as(String pass) {
		lp.password(pass);
	}

	@When("user click on Loginbutton")
	public void user_click_on_loginbutton() throws InterruptedException {
		lp.submitlogin();
	}

	@Then("user should be navigate to next page")
	public void user_should_be_navigate_to_next_page()
	{
		System.out.println("next page navigate");
	}

	@Given("user should be on navigation page")
	public void user_should_be_on_navigation_page() {

	}

	@When("user clicks on checkbox beside fashion")
	public void user_clicks_on_checkbox_beside_fashion() 
	{

		lp.checkboxfashion();

	}

	@When("user should be  seen only two product on page")
	public void user_should_be_seen_only_two_product_on_page() {

	}

	@When("user clicks on add to cart button")
	public void user_clicks_on_add_to_cart_button() throws InterruptedException {
		lp.productAddtocart();
	}

	@Then("product should be added in the cart")
	public void product_should_be_added_in_the_cart()
	{
		System.out.println("product added in the cart");
	}


	@When("user clicks on cart icon or basket")
	public void user_clicks_on_cart_icon_or_basket() throws InterruptedException 
	{
		Thread.sleep(4000);
		lp.productAddintheBasket(); 
	}

	@Then("user navigate on product added cart page")
	public void user_navigate_on_product_added_cart_page()
	{
		System.out.println("user can seen product page in the basket");
	}


	@Then("user clicks on Checkout button")
	public void user_clicks_on_checkout_button() throws InterruptedException 
	{
		lp.checkoutproduct();
	}

	@Then("user fill the cardnumber details")
	public void user_fill_the_cardnumber_details() throws InterruptedException 
	{
		lp.cardnumber();
	}

	@Then("user Select the Expirymonth and Date")
	public void user_select_the_expirymonth_and_date() throws InterruptedException {
		lp.expirycard();
	}



}
