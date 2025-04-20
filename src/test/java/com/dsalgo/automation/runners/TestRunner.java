package com.dsalgo.automation.runners;

import org.junit.runner.RunWith;
//import org.testng.annotations.DataProvider;
import io.cucumber.junit.Cucumber;
//import io.cucumber.testng.AbstractTestNGCucumberTests;
//import io.cucumber.testng.CucumberOptions;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features/Register.feature", // Location of the feature files
    glue = {"com.dsalgo.automation.stepdefinations", "com.dsalgo.automation.hooks"}, // Location of the step definition classes
    plugin = {"pretty", "html:target/cucumber/cucumber-reports.html","json:target/cucumber/cucumber.json",
    		"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
			"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
	tags = "", //tags from feature file
    monochrome = true// Reports
    )

public class TestRunner {
//public class TestRunner extends AbstractTestNGCucumberTests{
	
//	@Override
//    @DataProvider(parallel = false)
//    public Object[][] scenarios() {
//				
//		return super.scenarios();
//    }

}