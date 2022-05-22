package com.bit.test;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination {

	
	@Given("^open browser$")
	public void open_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("open browser");
	    throw new PendingException();
	}

	@Given("^go to homepage$")
	public void go_to_homepage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("go to homepgae");
	    throw new PendingException();
	}

	@When("^user type email in user type box$")
	public void user_type_email_in_user_type_box() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user type email in user type box");
	    throw new PendingException();
	}

	@When("^user type pass in password Text box$")
	public void user_type_pass_in_password_Text_box() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user type pass in password Text box");
	    throw new PendingException();
	}

	@When("^user click on login button$")
	public void user_click_on_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user click on login button");
	    throw new PendingException();
	}

	@Then("^user should be in his profile page$")
	public void user_should_be_in_his_profile_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user should be in his profile page");
	    throw new PendingException();
	}


}
