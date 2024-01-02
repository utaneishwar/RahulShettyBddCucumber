package stepdefination;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageFactory.LaunchBrowser;
import pagessClass.PaytmComPage;

public class PaytmComStep
{
	
	WebDriver driver;
	PaytmComPage ptm = new PaytmComPage (LaunchBrowser.getdriver());
	
@Given("user should have Paytm-com page")
public void user_should_have_paytm_com_page() {
  driver =new LaunchBrowser().getdriver();
  driver.get("https://paytm.com/");
}

@Given("user click on user Recharge prepaid mobile")
public void user_click_on_user_recharge_prepaid_mobile() {
  ptm.recharge_prepaid_mobile(); 
}

@Then("user navigate on paytm-com-recharge page")
public void user_navigate_on_paytm_com_recharge_page() {
   
}

@Then("user clicks on prepaid radio button")
public void user_clicks_on_prepaid_radio_button() {
   ptm.radiobutton();
}

@Then("user clicks on mobile number textfield and provide mobno {string}")
public void user_clicks_on_mobile_number_textfield_and_provide_mobno(String string) throws InterruptedException {
   ptm.prepaid_Recharge(string);
}

@Then("user clicks on operator text field and should show dropdown of operator")
public void user_clicks_on_operator_text_field_and_should_show_dropdown_of_operator() {
  // ptm.operator();
}

@Then("user should select operator from dropdown and show related plan to inside")
public void user_should_select_operator_from_dropdown_and_show_related_plan_to_inside() {
  System.out.println(" user select jio");
}

@Then("user clicks on circle textfield and should show dropdown of circle")
public void user_clicks_on_circle_textfield_and_should_show_dropdown_of_circle() {
 //  ptm.circle();
}

@Then("user should select circle from this dropdown")
public void user_should_select_circle_from_this_dropdown() {
   System.out.println("maharashtra");
}

@Then("user click on Amount and should able to provide amount according plan {string}")
public void user_click_on_amount_and_should_able_to_provide_amount_according_plan(String string) throws InterruptedException {
 
	ptm.Amount(string);
}

@Then("user clicks on proceed to recharge button")
public void user_clicks_on_proceed_to_recharge_button() {
   ptm.proceedrecharge();
}
	
	
}
