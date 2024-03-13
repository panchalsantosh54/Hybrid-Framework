package com.cs.Driver;

import org.openqa.selenium.WebDriver;

public class DriverManager {
	public static final ThreadLocal<WebDriver> dr = new ThreadLocal<WebDriver>();

	private DriverManager() {}

	public static WebDriver getDriver() {
		return dr.get();
	}
	public static void setDriver(WebDriver driver) {
		dr.set(driver);
	}
	public static void unload() {
		dr.remove();
	}
}
