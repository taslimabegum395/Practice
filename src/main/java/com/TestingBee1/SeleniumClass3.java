package com.TestingBee1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumClass3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(6000l,TimeUnit.MILLISECONDS);
		driver.manage().timeouts().implicitlyWait(3000l,TimeUnit.MILLISECONDS);
		Thread.sleep(3000);
		//driver.get("https://expire.badssl.com/");
		driver.get("https://google.com");
		
		
		FirefoxOptions fo =new FirefoxOptions();
		fo.setAcceptInsecureCerts(true);
		
		
	

	}

}
