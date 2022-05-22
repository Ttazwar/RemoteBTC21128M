package com.bit.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.bit.pages.HomePage;
import com.bit.pages.MenMenu;
import com.bit.pages.ProductPage;
import com.bit.pages.ShirtMenu;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination {
	
	BaseTest b = new BaseTest();
	HomePage h;
	MenMenu m;
	ShirtMenu s;
	ProductPage p;
	
	@Given("^Navigate to express\\.com$")
	public void navigate_to_express_com() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		
		h=b.openBrowser();
	    
	}

	@When("^user click on men menu$")
	public void user_click_on_men_menu() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		dr.findElement(By.xpath("")).click();
		m=h.clickOnMenMenu();
	    
	}

	@When("^user click on shirt menu$")
	public void user_click_on_shirt_menu() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		dr.findElement(By.xpath("")).click();
		s=m.ClickOnShirtMenu();
	    
	}

	@When("^user select a product$")
	public void user_select_a_product() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		dr.findElement(By.xpath("")).click();
		p=s.clickOnAnyProduct();
	   
	}

	@When("^user select desired size$")
	public void user_select_desired_size() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		dr.findElement(By.xpath("")).click();
	    
	}

	@When("^user add the product to the cart$")
	public void user_add_the_product_to_the_cart() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		dr.findElement(By.xpath("")).click();
	    
	}

	@Then("^user should see successful message$")
	public void user_should_see_successful_message() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		dr.findElement(By.xpath("")).getText().equals("successful");
	    
	}


}
