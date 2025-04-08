

	package com.dsalgo.automation.hooks;

	import com.dsalgo.automation.driver.DriverFactory;

	import io.cucumber.java.AfterAll;
	import io.cucumber.java.BeforeAll;

	public class Hooks {
	    
	    @BeforeAll
	    public static void setup() {
	        System.out.println("Initializing WebDriver once before all scenarios");
	        DriverFactory.initializeDriver();
	    }
	    
	    @AfterAll
	    public static void teardown() {
	        System.out.println("Closing WebDriver after all scenarios");
	        DriverFactory.quitDriver();
	    }
	}


