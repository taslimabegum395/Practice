package com.TestingBee1;
//"https://rahulshettyacademy.com/AutomationPractice/(Practice Page)

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumClass2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver  driver=new ChromeDriver();//child class object can be referred by parent interface reference variable
		                                      //WebDriver=interface,ChromeDiver is a class,driver is a ChromeDriver object,
                                                 //driver is reference variable of WebDriver means interface
		
driver.manage().timeouts().pageLoadTimeout(6000l,TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(3000l,TimeUnit.SECONDS);
		
		
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");//driver.get  url give enough time for elements  loading after loading then exicute
	//driver.navigate();//navigate do not give enough time for loading (navigate click before loading)
	//Thread.sleep(2000);
	//driver.quit();
	
	
	//page title test
 
	String actual=driver.getTitle();//practice page
	String expected="Practice Page";
	Assert.assertEquals(actual, expected);	
	System.out.println(driver.getTitle());
	
	driver.findElement(By.xpath("(//input[@class='radioButton'])[3]")).click();	
	
	driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();
	
WebElement w=driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
Select select =new Select(w);
select.selectByVisibleText("Option1");

	
	
	
	//Giving SendKeys to text field
	driver.findElement(By.id("autocomplete")).clear();
	driver.findElement(By.id("autocomplete")).sendKeys("GroupStudy");
	Thread.sleep(3000);
	driver.findElement(By.id("autocomplete")).clear();
	
	
	
//driver.findElement(By.xpath("(//input[@name='radioButton'])[2]")).click();
//driver.findElement(By.xpath("(//input[@class='radioButton'])[3]")).click();
//driver.findElement(By.xpath("(//input[@name='radioButton'])[1]")).click();
//driver.findElement(By.cssSelector("input[value='radio3']")).click();//css3 rule.simple rule tagname[attribute='value',.classname,//id




Thread.sleep(4000);
driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
Thread.sleep(3000);
driver.switchTo().alert().accept();
driver.quit();
	
	


	

	
		
		
		
		
		
	}
	

}
