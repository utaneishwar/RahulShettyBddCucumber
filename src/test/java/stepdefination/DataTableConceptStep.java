package stepdefination;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.LaunchBrowser;
import pagessClass.ScenarioOutlineCredentialPage;

public class DataTableConceptStep {
	WebDriver driver;
	ScenarioOutlineCredentialPage sos=new ScenarioOutlineCredentialPage(LaunchBrowser.getdriver());
	@Given("user at the loginpage")
	public void user_at_the_loginpage() {
		driver =LaunchBrowser.getdriver();
		driver.get("https://automationexercise.com/login");  }

	@When("user enters following data")
	public void user_enters_following_data(DataTable dataTable) throws InterruptedException
	{

		List<List<String>> data = dataTable.asLists(String.class);
		ArrayList<String> al =new ArrayList<>();

		for(List<String> value:data)      // |mno07@gmail.com ||  
		{
			// |mno07@gmail.com | Test@123 |   
			// | xyz07@gmail.com | Pass@123 |
			//	| abc07@gmail.com |123456 |
			for( String uniquevalue:value) // mno07@gmail.com , Test@123,  xyz07@gmail.com , Pass@123 |
			{ 
				al.add(uniquevalue);   //     mno07@gmail.com , Test@123 , xyz07@gmail.com,123456 
				// 	 abc07@gmail.com , 123456 
			}
		}  
		System.out.println(al);   
		System.out.println(al.size());
		for(int i=0; i<al.size();i=i+2)
		{
			sos.username(al.get(i));       //mno07@gmail.com    
			sos.password(al.get(i+1));     // Test@123,
			sos.login();                   // susccess
			System.out.println(al.get(i));
			System.out.println(al.get(i+1));
           //  sos.clearlogin();
			if(sos.logout().isDisplayed()) // we perform operation on the basis of 
			{                                                          // logoutbutton is enable or not
				sos.checkout();
			}
		}
		}

	@When("user clicked on login button")
	public void user_clicked_on_login_button() {
		System.out.println(" click on log in button ");
	}

	@Then("user should login succesfully")
	public void user_should_login_succesfully() {
		System.out.println("login successfull ");
	}

	//	|mno07@gmail.com | Test@123 |
	//		| xyz07@gmail.com | Pass@123 |
	//		| abc07@gmail.com |123456 |




}   

