package com.dsalgo.automation.driver;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class DriverFactory {
	
	    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

	    public static void initializeDriver() {
	        quitDriver();

	        ChromeOptions options = new ChromeOptions();
	        options.addArguments("--disable-extensions");
	        options.addArguments("--disable-gpu");
	        options.addArguments("--no-sandbox");
	        options.addArguments("--remote-allow-origins=*");
//			options.addArguments("--headless=new");

	        driver.set(new ChromeDriver(options));
	        driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        driver.get().manage().window().maximize();
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


