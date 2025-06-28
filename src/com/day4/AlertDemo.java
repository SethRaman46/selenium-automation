package com.day4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {
	public static void main (String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\seleniumfundamental\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/dashboard.xhtml");
		System.out.println(driver.getTitle());
	
		WebElement browser = driver.findElement(By.xpath("// li[@id = \'menuform:j_idt39\']"));
		browser.click();
		
		WebElement alert = driver.findElement(By.xpath("//li[@id = \'menuform:m_overlay\']"));
		alert.click();
		
		WebElement simpleAlert = driver.findElement(By.xpath("(//span[text() = \"Show\"])[1]"));
		simpleAlert.click();
		
		Alert a = driver.switchTo().alert();
		String text = a.getText();
	    a.accept();
		System.out.println(text);
		
		WebElement confirmAlert = driver.findElement(By.xpath("(//span[text() = \"Show\"])[2]"));
		confirmAlert.click();
		a.accept();
		
		
		
		
		
		
		
		
		
	}

}
