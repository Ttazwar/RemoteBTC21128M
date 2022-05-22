package com.bit.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.bit.pages.HomePage;

public class BaseTest {
	
	
WebDriver dr;
	
	
	public HomePage openBrowser() {
		//to read any data from the system 
		String b = System.getProperty("browser");
		
		if(b.equals("chrome")) {
			System.out.println("Chrome browser............");
			System.setProperty("webdriver.chrome.driver", "/Users/bittech/Downloads/chromedriver");
			dr = new ChromeDriver();
		}else if(b.equals("firefox")) {
			System.out.println("Firefox browser...........");
			System.setProperty("webdriver.gecko.driver", "/Users/bittech/Downloads/geckodriver");
			dr = new FirefoxDriver();
		}else if(b.equals("ie")) {
			System.out.println("IE Browser................");
			System.setProperty("webdriver.ie.driver", "/Users/bittech/Downloads/IEDriverServer");
			dr = new InternetExplorerDriver();
		}else {
			System.out.println("No browser condition match found, executed Default setting......");
			System.setProperty("webdriver.chrome.driver", "/Users/bittech/Downloads/chromedriver");
			dr = new ChromeDriver();
		}
		
		
		dr.get("http://www.express.com");
		return new HomePage(dr);
	}
	

	public void closeBrowser() throws InterruptedException {
		Thread.sleep(5000);
		dr.quit();
	}

	public BaseTest() {
		System.out.println("baseTest blank constructor...");
	}

}
