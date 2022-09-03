package com.TestingBee1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

      public class AutoSuggestiveDropDown {

	    public static void main(String[] args) throws InterruptedException {
	    	WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().pageLoadTimeout(6000l, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(3000l, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
		
		  driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='_2QfC02']/button")).click();
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("iphone");
		List<WebElement>totallist= driver.findElements(By.xpath("//div[@class='lrtEPN _17d0yO']"));
		
        for(int i=0;i<totallist.size();i++) {
        totallist.get(i).getText();
	    System.out.println(totallist.get(i).getText());//i will get all list
	  
	  
      if(totallist.get(i).getText().equalsIgnoreCase("iphone 13 pro")){
    	totallist.get(i).click() ;
    	}  
       }
        Thread.sleep(4000) ; 
        driver.quit();
}
	    }	     
	    

