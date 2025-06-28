package com.day6;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorPractice {
	public static void main (String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\seleniumfundamental\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/dashboard.xhtml");
		System.out.println(driver.getTitle());
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1500);");
		Thread.sleep(5000);
		
		js.executeScript("window.scroll(0,-1500);");
		Thread.sleep(5000); 
		
		
//		Scroll to particular element 
		WebElement chart = driver.findElement(By.id("j_idt144_content"));
		js.executeScript("arguments[0].scrollIntoView();", chart);
		Thread.sleep(2000);
		
		WebElement list = driver.findElement(By.xpath("(//span[text() = 'List'])[1]"));
		js.executeScript("arguments[0].click();", list);
		Thread.sleep(2000);
		
		driver.quit();
		
		
		
		
	}

}
