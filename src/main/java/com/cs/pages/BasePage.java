package com.cs.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cs.Driver.DriverManager;

public class BasePage {
	protected void click(By by) {
		explicitlyWaitforElementToBeClickable(by);
		DriverManager.getDriver().findElement(by).click();
	}
	protected void sendKeys(By by, String value) {
		explicitlyWaitforElementToBeClickable(by);
		DriverManager.getDriver().findElement(by).sendKeys(value);
	}
	public String getPageTitle() {
		return DriverManager.getDriver().getTitle();
	}
	private void explicitlyWaitforElementToBeClickable(By by) {
		WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(5));
		wait.until(ExpectedConditions.presenceOfElementLocated(by));
	}
}
