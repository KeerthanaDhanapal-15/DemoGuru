package org.java.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition 
{
	WebDriver driver;
	@Given("User wants to enter the Url")
	public void user_wants_to_enter_the_Url() {
	   driver = new ChromeDriver();
	   driver.get("http://demo.guru99.com/telecom/");
	}

	@When("User wants to click Add Customer")
	public void user_wants_to_click_Add_Customer() {
	    
	}

	@Then("User wants to click Done")
	public void user_wants_to_click_Done() {
	 
	}

	@Then("User wants to enter firstname {string} in firstname Textbox")
	public void user_wants_to_enter_firstname_in_firstname_Textbox(String string) {

	}

	@Then("User wants to enter lastname  {string} in lastname Textbox")
	public void user_wants_to_enter_lastname_in_lastname_Textbox(String string) {
	    
	}

	@Then("User wants to enter emailId {string} in email Textbox")
	public void user_wants_to_enter_emailId_in_email_Textbox(String string) {
	 
	}

	@Then("User wants to enter address {string} in address Textbox")
	public void user_wants_to_enter_address_in_address_Textbox(String string) {
	   
	}

	@Then("User wants to enter mobileno {string} in mobileno Textbox")
	public void user_wants_to_enter_mobileno_in_mobileno_Textbox(String string) {
	   
	}

	@Then("User wants to click Submit button")
	public void user_wants_to_click_Submit_button() {
	   
	}

	@Then("User Wants to click Done")
	public void user_Wants_to_click_Done() {
	  
	}

}
