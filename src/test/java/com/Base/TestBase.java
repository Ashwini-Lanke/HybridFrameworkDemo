package com.Base;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	WebDriver driver=null;
	
	public static Logger log=Logger.getLogger(TestBase.class);
	public WebDriver initialization()
	{
		log.info("Initializing Browser");
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		log.info("Chrome browser opened");
		driver.get("file:///D:/Ashwini/Softwares/Offline%20Website/index.html");
		driver.manage().window().maximize();
		log.info("JBK offline website is launched");
		return driver;
	}

}
