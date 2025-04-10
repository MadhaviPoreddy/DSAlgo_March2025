package com.dsalgo.automation.hooks;

import com.dsalgo.automation.driver.DriverFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;

	public class Hooks {
	    
	    @Before //this will open the browser for each scenario 
	    public static void setup() {
	        DriverFactory.initializeDriver();
	    }
	    
	    @After //this will close the browser for each scenario 
	    public static void teardown() {
		DriverFactory.quitDriver();
	    }
	}


