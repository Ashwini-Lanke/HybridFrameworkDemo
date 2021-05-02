package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Pages.DashboardPage;

public class LoginPage {
	
	WebDriver lpdriver;

	@FindBy(id="email")
	private WebElement uname;

	@FindBy(id="password")
	private WebElement pass;

	@FindBy(xpath="//button")
	private WebElement loginbutton;

	@FindBy(partialLinkText="Register")
	private WebElement registerLink;



		public LoginPage(WebDriver driver) {
			lpdriver=driver;
			PageFactory.initElements(lpdriver, this);
			
		}
		
		public void clickRegisterLink() {
			registerLink.click();
		}
		public void enterUsername(String text) {
			uname.sendKeys(text);
		}
		
		public void enterPassword(String text) {
			pass.sendKeys(text);
		}
		public void clickLoginButton() {
			loginbutton.click();
		}
		
		public DashboardPage validLogin()
		{
			enterUsername("kiran@gmail.com");
			enterPassword("123456");
			clickLoginButton();
			return new DashboardPage(lpdriver);
		}


}
