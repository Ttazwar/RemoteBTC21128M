package com.bit.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	WebDriver dr;
	public HomePage(WebDriver dr) {
	this.dr=dr;
		
	}
	
	public MenMenu clickOnMenMenu () {
		
		dr.findElement(By.xpath("")).click();
		
		return new MenMenu(dr);
		
	}
	
	}


