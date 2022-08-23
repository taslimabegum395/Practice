package com.TestingBee1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(4, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		
		//page tittle test
	
		String actual=driver.findElement(By.xpath("//h1[@class='title']")).getText();// actual is variable
		System.out.println(actual);
		String expected="Signing up is easy!";
		System.out.println(expected);
		Assert.assertEquals(actual, expected);
		//System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//input[@id='customer.firstName']")).sendKeys("John");
		driver.findElement(By.xpath("//input[@id='customer.lastName']")).sendKeys("Adam");
		driver.findElement(By.xpath("//input[@id='customer.address.street']")).sendKeys("777 Lincoln ave");
		driver.findElement(By.xpath("//input[@id='customer.address.city']")).sendKeys("Brooklyn");
		driver.findElement(By.xpath("//input[@name='customer.address.state']")).sendKeys("NYC");
		driver.findElement(By.xpath("//input[@id='customer.address.zipCode']")).sendKeys("11123");
		driver.findElement(By.xpath("//input[@name='customer.phoneNumber']")).sendKeys("98765432q1");
		driver.findElement(By.xpath("//input[@name='customer.ssn']")).sendKeys("121-99-9999");
		driver.findElement(By.xpath("//input[@name='customer.username']")).sendKeys("Mosammat");
        driver.findElement(By.xpath("//input[@id='customer.password']")).sendKeys("1234tashin");
        driver.findElement(By.xpath("//input[@name='repeatedPassword']")).sendKeys("1234tashin");
        driver.findElement(By.xpath("//input[@value='Register']")).click();
		
		
	}		
	}
