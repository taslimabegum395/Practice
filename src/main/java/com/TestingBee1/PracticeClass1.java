package com.TestingBee1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeClass1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(4, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Register']")).click();
driver.findElement(By.xpath("//input[@id='customer.firstName']")).sendKeys("tasj");
	driver.findElement(By.xpath("//input[@id='customer.lastName']")).sendKeys("Bing");
		driver.findElement(By.xpath("//input[@name='customer.address.street']")).sendKeys("Wisdom Path");
		driver.findElement(By.xpath("//input[@name='customer.address.state']")).sendKeys("virgnia beach");
		driver.findElement(By.xpath("//input[@name='customer.address.city']")).sendKeys("VIRGINIA");
driver.findElement(By.xpath("//input[@name='customer.address.zipCode']")).sendKeys("Bangladesh");
		driver.findElement(By.xpath( "//input[@id='customer.phoneNumber']")).sendKeys("911");
driver.findElement(By.xpath("//input[@id='customer.ssn']")).sendKeys("121-84-8468");
		driver.findElement(By.xpath("//input[@id='customer.username']")).sendKeys("India is better");
driver.findElement(By.xpath("//input[@id='customer.password']")).sendKeys("sufoa");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("12345tashin");
driver.findElement(By.xpath("//input[@name='repeatedPassword']")).sendKeys("12345tashin");
driver.findElement(By.xpath("//input[@value='Register']")).click();
		
	

	}

}
