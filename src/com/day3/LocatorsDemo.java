package com.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {
	public static void main (String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\seleniumfundamental\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://leafground.com");
		
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
		WebElement element = driver.findElement(By.id("menuform:j_idt40"));
		element.click();
		
		WebElement link = driver.findElement(By.id("menuform:m_link"));
		link.click();
		Thread.sleep(3000);
		
		WebElement linkText = driver.findElement(By.linkText("Go to Dashboard"));
		linkText.click();
		
		driver.navigate().back();
		
		WebElement partialLinkText  = driver.findElement(By.partialLinkText("How many links"));
		partialLinkText.click();
		
		
		
		
		
		
		
		
		 
	}

}
