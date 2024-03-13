package com.cs.pages;

import org.openqa.selenium.By;

import com.cs.Driver.DriverManager;

public final class OrangeHRMLoginPage extends BasePage {

	// Locators
	private static final By userName = By.name("username");
	private static final By password = By.name("password");
	private static final By btnLogin = By.xpath("//button[@type='submit']");

	// Methods
	public OrangeHRMLoginPage enterUsername(String un) {
//		DriverManager.getDriver().findElement(userName).sendKeys(un);
		sendKeys(userName, un);
		return this;
	}
	
	public OrangeHRMLoginPage enterPassword(String pw) {
//		DriverManager.getDriver().findElement(password).sendKeys(pw);
		sendKeys(password, pw);
		return this;
	}
	
	public OrangeHRMLoginPage clickOnLoginBtn() {
//		 DriverManager.getDriver().findElement(btnLogin).click();
		click(btnLogin);
		return new OrangeHRMLoginPage();
	}
	
}
