package com.tutorialsninja.automation.stepdef;

import com.tutorialsninja.automation.base.Base;

import cucumber.api.DataTable;
import cucumber.api.java.en.*;

public class Register {
	
	@Given("^I launch the application$")
	public void i_launch_the_application()  {
		
		Base.driver.get(Base.reader.getUrl());
	    
	}

	@And("^I navigate to the Register page$")
	public void i_navigate_to_the_Register_page()  {
	    
	}

	@When("^I provide the below valid details$")
	public void i_provide_the_below_valid_details(DataTable dataTable)  {
	    
	}

	@And("^I click on the Privacy Policy$")
	public void i_click_on_the_Privacy_Policy() {
	    
	}

	@And("^I click on Continue button$")
	public void i_click_on_Continue_button()  {
	    
	}

	@Then("^I should see the account has been added successfully$")
	public void i_should_see_the_account_has_been_added_successfully()  {
	    
	}

}
