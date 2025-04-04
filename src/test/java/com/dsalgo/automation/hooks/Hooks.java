package com.dsalgo.automation.hooks;

import com.dsalgo.automation.driver.DriverFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

	@Before
	public void setUp(Scenario scenario) {
		DriverFactory.initializeDriver();
	}
	
    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            System.out.println("Scenario Failed: " + scenario.getName());
        }
        DriverFactory.quitDriver();
    }
}
