package com.Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
	WebDriver driver=null;
	@Test
	public void login()
	{
		driver=initialization();
		log.info("login to the application");
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//button")).click();
		log.info("user successfully logged in to the application");
	}
	

}
