package com.bit.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MenMenu {

	
	WebDriver dr;
	public MenMenu(WebDriver dr) {
	this.dr=dr;
}
	
	public ShirtMenu ClickOnShirtMenu() {
		
		dr.findElement(By.xpath("")).click();
		
		return new ShirtMenu(dr);
		
		
		
		
		
	}
}
