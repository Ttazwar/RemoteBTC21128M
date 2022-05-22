package com.bit.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShirtMenu {
	
	WebDriver dr;
	public ShirtMenu(WebDriver dr) {
	this.dr=dr;
	}
	
	public ProductPage clickOnAnyProduct() {
		
		
		dr.findElement(By.xpath("")).click();
		
		return new ProductPage(dr);
		
	}
	
	
	
	
}
