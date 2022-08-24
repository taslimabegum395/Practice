package com.TestingBee1;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumWindowHandles {

public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
WebDriver  driver=new ChromeDriver();
driver.manage().window().maximize();		
driver.manage().timeouts().pageLoadTimeout(6000l,TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(3000l,TimeUnit.SECONDS);
driver.get("https://rahulshettyacademy.com/AutomationPractice/");//parent window
driver.findElement(By.xpath("//button[@id='openwindow']")).click();
 Set<String>window=driver.getWindowHandles();
 Iterator<String>it = window.iterator();
 String parent=it.next();
 String child=it.next();
 driver.switchTo().window(child);
 String childtitle= driver.getTitle();
 System.out.println(childtitle);
 Assert.assertEquals(childtitle, "QA Click Academy | Selenium,Jmeter,SoapUI,Appium,Database testing,QA Training Academy");
 driver.close();
 driver.quit();
 




















	}

}
