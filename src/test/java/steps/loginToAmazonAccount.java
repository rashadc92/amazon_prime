package steps;

import org.testng.Assert;

import common.amazonBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.amazonPage;

public class loginToAmazonAccount extends amazonBase{
	
	amazonPage ap;
	
	@Given("i am on the amazon homepage")
	public void i_am_on_the_amazon_homepage() {
	 
		// Hey, Tina is tin tin
		
		launchBrowser();
		
	}

	

	@When("i click on the sign in button")
	public void i_click_on_the_sign_in_button() {
		
		ap = new amazonPage(driver);
		
		ap.clickonSignInButton();
	     
	}

	@When("i enter the {string} in user name input field")
	public void i_enter_the_in_user_name_input_field(String User_Name ) {
	    
	ap = new amazonPage (driver);
	ap.enterEmail(User_Name);
	
	}

	@When("i enter the {string} in password input field")
	public void i_enter_the_in_password_input_field(String password) {
		ap = new amazonPage (driver);
		ap.enterPassword(password);
		ap.clickonSignIn();
	}

	@Then("i can successfully login to my amazon account")
	public void i_can_successfully_login_to_my_amazon_account() {
		ap = new amazonPage (driver);
		Assert.assertEquals(ap.verifyAmazonAccount(), "Hello, Rashad");
	   
	}

}
