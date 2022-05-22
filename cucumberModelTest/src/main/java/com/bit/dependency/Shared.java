package com.bit.dependency;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shared {
	
	
WebDriver dr;
	
	public void goToAnyWebSite(String url) {
		dr.get(url);
	}
	
	public void clickOnAnyElement(By locator) {
		dr.findElement(locator).click();
	}
	
	public void clickOnElement(WebElement ele) {
		//dr.findElement(By.id("")).click();
		ele.click();
	}
	
	public void clickOnAnyElementByXpath(String xpathValue) {
		dr.findElement(By.xpath(xpathValue)).click();
	}
	
	//click by css, id, class etc
	
	public void typeOnAnyElement(String text, By locator) {
		dr.findElement(locator).sendKeys(text);
	}
	
	public void waitForElement(long milli) throws InterruptedException {
		Thread.sleep(milli);
	}
	
	//Target : Expect More. Pay Less.
	public void verifyTitle(String expectedTitle) {
		String actualTitle = dr.getTitle();
		boolean result = actualTitle.equals(expectedTitle);
		System.out.println("Title matched or not ? : " + result);
	}
	
	public void verifyUrl(String expectedUrl) {
		String actualUrl = dr.getCurrentUrl();
		boolean result = actualUrl.contains(expectedUrl);
		System.out.println("URL matched or not ? : " + result);
	}
	
	public void verifyElementDisplay(By by) {
		boolean result = dr.findElement(by).isDisplayed();
		System.out.println("Is element displayed? : " + result);
	}
	
	public void verifyAnyText(By locator, String expectedText) {
		String text = dr.findElement(locator).getText();
		System.out.println("Did the text matched or not? : " + text.contains(expectedText));
	}
	
	public ChromeDriver getDriver() {
		
		return dr;
	}

}
