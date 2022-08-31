package com.TestingBee1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Droppablelass {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(4, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://jqueryui.com/droppable/");
		 WebElement frame= driver.findElement(By.tagName("iframe"));//tagname start with iframe//iframe referance
        List<WebElement>totalframe =driver.findElements(By.tagName("iframe"));//collection--use list bcz(iframe) follow index number
		totalframe.size();
		System.out.println(	totalframe.size());
		driver.switchTo().frame(frame);
		WebElement source =driver.findElement(By.xpath("//div[@id='draggable']"));//which we drag(start from here)
		WebElement target = driver.findElement(By.xpath("//div[@id='droppable']"));//where we drop
		Actions ac=new Actions(driver);
		ac.dragAndDrop(source, target).build().perform();
		//Actions ac=new Actions(driver);
		
		//ac.dragAndDrop(source, target).build().perform();
		driver.switchTo().defaultContent();
	   Thread.sleep(6000);
		driver.findElement(By.xpath("//a[@href='http://jqueryui.com/draggable/']")).click();
		Thread.sleep(6000);
		driver.quit();
		
		
			
		
		
		
		

	}

}
