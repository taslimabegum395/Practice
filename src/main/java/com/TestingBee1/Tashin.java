package com.TestingBee1;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tashin {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(4, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
driver.findElement(By.xpath("")).click();
Set<String> window = driver.getWindowHandles();
Iterator<String>it= window.iterator();
String parent = it.next();
String child = it.next();
driver.switchTo().window(child);
String childtitle = driver.getTitle();
System.out.println(childtitle);
		
		
		
		
	}

}
	
	
	
	