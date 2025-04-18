package com.dsalgo.automation.runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/Register.feature",
		glue = { "com.dsalgo.automation.stepdefinations", "com.dsalgo.automation.hooks" }, 																							
		plugin = { "pretty", "html:target/cucumber-reports.html",
				"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
				}, 
		monochrome = true
)
public class TestRunner {

}
