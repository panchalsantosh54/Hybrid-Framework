package com.cs.pages;

import org.openqa.selenium.By;

import com.cs.Driver.DriverManager;

public class BasePage {
	protected void click(By by) {
		DriverManager.getDriver().findElement(by).click();
	}
	protected void sendKeys(By by, String value) {
		DriverManager.getDriver().findElement(by).sendKeys(value);
	}
	public String getPageTitle() {
		return DriverManager.getDriver().getTitle();
	}
}
