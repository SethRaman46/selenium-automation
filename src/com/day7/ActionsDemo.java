package com.day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\seleniumfundamental\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/dashboard.xhtml");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		
		
		WebElement browser = driver.findElement(By.id("menuform:j_idt39"));
		Actions act = new Actions(driver);
		act.click(browser).build().perform();
		Thread.sleep(5000);
		
		WebElement drag = driver.findElement(By.id("menuform:m_drag"));
		act.click(drag).build().perform();
		Thread.sleep(2000);
		
//		WebElement dragable = driver.findElement(By.id("form:conpnl_header"));
//		act.contextClick(dragable).build().perform();
//		Thread.sleep(2000);
		
		
		WebElement dragMeAround = driver.findElement(By.id("form:conpnl"));
		act.dragAndDropBy(dragMeAround, 500, 0).build().perform();
		Thread.sleep(2000);
		
		WebElement dragContent = driver.findElement(By.id("form:drag_content"));
		WebElement target = driver.findElement(By.id("form:drop"));
//		act.dragAndDrop(dragContent, target).build().perform();
		act.moveToElement(dragContent).contextClick().build().perform();
	
		Thread.sleep(2000);
		
//		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
	}

}
