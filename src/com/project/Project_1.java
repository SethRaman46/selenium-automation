package com.project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Project_1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\seleniumfundamental\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https:www.google.com");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.navigate().to("https://adactinhotelapp.com/");

		WebElement username = driver.findElement(By.xpath("//input[@name= \"username\"]"));
		username.click();
		username.sendKeys("SethuVR46");
		Thread.sleep(1000);

		WebElement password = driver.findElement(By.xpath("//input[@type = \"password\"]"));
		password.click();
		password.sendKeys("sehwag319");

		WebElement login = driver.findElement(By.xpath("//input[@type = \"Submit\"]"));
		login.click();

		WebElement location = driver.findElement(By.id("location"));
		location.click();
		Thread.sleep(2000);
		Select s = new Select(location);
		s.selectByIndex(6);
		location.click();

		Thread.sleep(2000);

		WebElement hotels = driver.findElement(By.xpath("//select [@name = \"hotels\"]"));
		hotels.click();
		Thread.sleep(2000);
		Select a = new Select(hotels);
		a.selectByIndex(2);
		hotels.click();

		WebElement roomType = driver.findElement(By.xpath("//select [contains(@name, \"room_type\")]"));
		roomType.click();
		Thread.sleep(3000);

		Select b = new Select(roomType);
		b.selectByIndex(4);
		Thread.sleep(3000);
		roomType.click();

		WebElement noOfRooms = driver.findElement(By.xpath("//select[@name = \"room_nos\"]"));
		noOfRooms.click();
		Thread.sleep(1000);
		Select c = new Select(noOfRooms);
		c.selectByIndex(5);
		Thread.sleep(1000);
		noOfRooms.click();

		WebElement checkIn = driver.findElement(By.xpath("// input[@name = \"datepick_in\"]"));
		checkIn.click();
		checkIn.clear();
		checkIn.sendKeys("17/05/2025");

		Thread.sleep(2000);

		WebElement checkOut = driver.findElement(By.xpath("//input[@name=\"datepick_out\"]"));
		checkOut.click();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value', '25/05/2025')", checkOut);
		Thread.sleep(2000);

		WebElement adultsPerRoom = driver.findElement(By.xpath("//select[@name = \"adult_room\"]"));
		adultsPerRoom.click();
		Select aa = new Select(adultsPerRoom);
		aa.selectByIndex(2);
		adultsPerRoom.click();
		Thread.sleep(2000);

		WebElement childPerRoom = driver.findElement(By.xpath("// select[@name = \"child_room\"]"));
		childPerRoom.click();
		Select ab = new Select(childPerRoom);
		ab.selectByIndex(1);
		childPerRoom.click();

		Thread.sleep(2000);

		WebElement search = driver.findElement(By.xpath("//input[@type =\"submit\"]"));
		search.click();
		Thread.sleep(2000);

		WebElement select = driver.findElement(By.xpath("//input[@name= \"radiobutton_0\"]"));
		select.click();

		WebElement ccontinue = driver.findElement(By.xpath("//input[@type= \"submit\"]"));
		ccontinue.click();

		WebElement firstName = driver.findElement(By.xpath("//input[@name = \"first_name\"]"));
		firstName.click();
		firstName.sendKeys("Sethu");
		Thread.sleep(1000);

		WebElement lastName = driver.findElement(By.xpath("//input[@name = \"last_name\"]"));
		lastName.click();
		lastName.sendKeys("Raman");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);

		WebElement address = driver.findElement(By.xpath("//textarea[@name = \"address\"]"));
		address.click();
		address.sendKeys("No.22 Avadi, Chennai-54");
		Thread.sleep(1000);

		WebElement creditCardNum = driver.findElement(By.xpath("//input[@name = \"cc_num\"]"));
		creditCardNum.click();
		creditCardNum.sendKeys("1317 5678 5555 1221");
		Thread.sleep(1000);

		WebElement creditCardType = driver.findElement(By.xpath("//select[@name = \"cc_type\"]"));
		creditCardType.click();
		Select type = new Select(creditCardType);
		type.selectByIndex(1);
		creditCardType.click();

		WebElement ExpiryDate = driver.findElement(By.xpath("//select[@name=\"cc_exp_month\"]"));
		ExpiryDate.click();
		Select date = new Select(ExpiryDate);
		date.selectByIndex(8);
		ExpiryDate.click();

		WebElement year = driver.findElement(By.xpath("//select[@name= \"cc_exp_year\"]"));
		year.click();
		Select y = new Select(year);
		y.selectByIndex(20);
		year.click();

		WebElement ccv = driver.findElement(By.xpath("//input[@name= \"cc_cvv\"]"));
		ccv.click();
		ccv.sendKeys("143");
		Thread.sleep(1000);

		WebElement bookNow = driver.findElement(By.xpath("//input[@type=\"button\"][1]"));
		bookNow.click();

		WebElement logout = driver.findElement(By.xpath("//input[contains(@name,\"logout\")]"));
		logout.click();
		Thread.sleep(3000);

//		driver.quit();

	}

}
