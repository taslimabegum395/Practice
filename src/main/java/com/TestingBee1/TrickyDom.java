package com.TestingBee1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

        public class TrickyDom {
        	
        public static void main(String[] args ) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://selectorshub.com/xpath-practice-page/");
		driver.findElement(By.xpath("//input[@id='userId']")).sendKeys("Mosammat1980@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Mosammat80");
		driver.findElement(By.xpath("//input[@name='company']")).sendKeys("Testing Bee");
		List<WebElement>frame=driver.findElements(By.tagName("iframe"));
		System.out.println("total number of frame :--->"+frame.size());
	    WebElement scrollview =driver.findElement(By.xpath("//button[text()='Checkout here']"));
	    JavascriptExecutor 	  js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", scrollview);
		
		//Entering into iframe.
		driver.switchTo().frame("pact");
		
		//Entering first open shading root
		WebElement elementTea=(WebElement)js.executeScript("return document.querySelector('#snacktime').shadowRoot.querySelector('#tea')");
        String elementValue = "arguments[0].setAttribute('value','Green tea')";
		js.executeScript(elementValue, elementTea);	
		
		//loving lunch
		WebElement elementLunch=(WebElement)js.executeScript("return document.querySelector(\"#snacktime\").shadowRoot.querySelector(\"#app2\").shadowRoot.querySelector(\"#pizza\")");
	    String	elementLunchValue="arguments[0].setAttribute('value','Grill Salmon')";
		js.executeScript(elementLunchValue, elementLunch);
		driver.switchTo().defaultContent();
		
		//close dom
	   driver.findElement(By.xpath("//div[@id='userPass']")).click();
	   Actions ac=new Actions(driver);
	   ac.sendKeys(Keys.TAB).perform();
	   ac.sendKeys("Password").perform();
	   Thread.sleep(3000);
	 /// driver.quit();
	}	
}	
		
		
			
		

