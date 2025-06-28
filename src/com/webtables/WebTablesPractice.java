package com.webtables;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablesPractice {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\seleniumfundamental\\Drivers\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.get("https://www.leafground.com/dashboard.xhtml");
      System.out.println(driver.getTitle());
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      
      
    driver.findElement(By.xpath("//li[@id =\"menuform:j_idt41\"]")).click();
    driver.findElement(By.xpath("//li[@id = \"menuform:m_table\"]")).click();
    driver.findElement(By.xpath("//div[@class = \"ui-datatable-scrollable-body\"]/table/thead/tr/th[3]")).click();
    
    driver.quit();
    
    
    
    
      
      
      
		
		
	}

}
