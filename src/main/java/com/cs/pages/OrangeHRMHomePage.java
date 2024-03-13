package com.cs.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cs.Driver.DriverManager;  

public final class OrangeHRMHomePage extends BasePage {
	//locators
	private static final By profilePicArrow = By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']");

	private static final By logoutBtn = By.xpath("(//a[@role='menuitem'])[4]");
	
	//methods
	public OrangeHRMHomePage clickProfilePicArrow() {
//		DriverManager.getDriver().findElement(profilePicArrow).click();
		click(profilePicArrow);
		return this;
	}
	
	public OrangeHRMLoginPage clickLogoutOption() {
		//explicit wait
//		WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(5));
//		wait.until(ExpectedConditions.presenceOfElementLocated(logoutBtn));
														
//		DriverManager.getDriver().findElement(logoutBtn).click();
		click(logoutBtn);
		return new OrangeHRMLoginPage();
	}
		
}
