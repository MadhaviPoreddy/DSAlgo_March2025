package com.dsalgo.automation.driver;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
	private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

	// Added Code below for Cross Browser Testing
	
	public static void initializeDriver(String browser) {
		quitDriver();

		switch (browser) {

		case "firefox":
			driver.set(new FirefoxDriver());
			driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get().manage().window().maximize();

			break;
		
		case "edge":

			driver.set(new EdgeDriver());
			driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get().manage().window().maximize();
			break;
			
		case "chrome":
		default:
			ChromeOptions options = new ChromeOptions();

//			options.addArguments("--incognito");
//			options.addArguments("--headless=new");

			driver.set(new ChromeDriver(options));
			driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get().manage().window().maximize();
			break;
		}
	}

	public static WebDriver getDriver() {
		return driver.get();
	}

	public static void quitDriver() {
		if (driver.get() != null) {
			driver.get().quit();
			driver.remove();
		}
	}
}
