package com.TestingBee1;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownAutomationPractice {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(6000l, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(3000l, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
        //drop down example
		WebElement mm=driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		Select st=new Select(mm);
		Thread.sleep(3000);
		st.selectByVisibleText("Option2");
		
		//open Window example
		driver.findElement(By.xpath("//button[@id='openwindow']")).click();
		 Set<String>window=driver.getWindowHandles();
		 Iterator<String>it = window.iterator();
		 String parent=it.next();
		 String child=it.next();
		 driver.switchTo().window(child);
		 String childtitle= driver.getTitle();
		 System.out.println(childtitle);
		 Assert.assertEquals(childtitle, "QA Click Academy | Selenium,Jmeter,SoapUI,Appium,Database testing,QA Training Academy");
		 Thread.sleep(3000);
		driver.quit();
		
		
		
	
	}
}
	
	
	
	