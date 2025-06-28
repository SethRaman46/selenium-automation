package com.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\seleniumfundamental\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/dashboard.xhtml");
		System.out.println(driver.getTitle());
		
		WebElement browser = driver.findElement(By.id("menuform:j_idt39"));
		browser.click();
		
		WebElement frame = driver.findElement(By.id("menuform:m_frame"));
		frame.click();
		driver.getTitle();
		
	    driver.switchTo().frame(0);
	    WebElement clickOnFrame = driver.findElement(By.id("Click"));
	    System.out.println(clickOnFrame.getText());
	    clickOnFrame.click();
	    
	    
	    
		
		
		
		
		
	}
}

