package com.cs.Driver;

import java.time.Duration;
import java.util.Objects;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver {
	
	private Driver() {
	}
/*
	public static void initDriver(String browser) {
		if (Objects.isNull(DriverManager.getDriver())) {
			if (browser.equalsIgnoreCase("chrome")) {
				WebDriverManager.chromedriver().setup();
				DriverManager.setDriver(new ChromeDriver());
			} else if (browser.equalsIgnoreCase("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				DriverManager.setDriver(new FirefoxDriver());
			} else if (browser.equalsIgnoreCase("edge")) {
				WebDriverManager.edgedriver().setup();
				DriverManager.setDriver(new EdgeDriver());
			}
		}
	}
*/
	public static void initDriver() throws Exception {
		if (Objects.isNull(DriverManager.getDriver())) {
			DriverManager.setDriver(new ChromeDriver()); // capable to run script in parallel
			//DriverManager.getDriver().get(ReadPropertyFile.get("url"));
			
			DriverManager.getDriver().manage().window().maximize();
			DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		}
	}
	
	public static void quitDriver() {
		if (Objects.nonNull(DriverManager.getDriver())) {
			DriverManager.getDriver().quit();
			DriverManager.unload();
		}
	}
}
