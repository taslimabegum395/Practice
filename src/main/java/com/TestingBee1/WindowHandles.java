package com.TestingBee1;


import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(4, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//getWindowHandle()
		driver.get("https://opensource-demo.orangehrmlive.com/");//parent window
		String parentwindow=driver.getWindowHandle();
		System.out.println(parentwindow);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();//child window
		Set<String>childwindow=driver.getWindowHandles();
		Iterator<String>it = childwindow.iterator();
		
		String parentwin=it.next();
		String childwin=it.next();
		System.out.println(childwin);
		
		
		
	
		
		

	}

}
