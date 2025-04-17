package com.dsalgo.automation.runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features/LinkedList.feature", // Location of the feature files
    glue = {"com.dsalgo.automation.stepdefinations", "com.dsalgo.automation.hooks"}, // Location of the step definition classes
    plugin = {"pretty", "html:target/cucumber-reports.html"},
   
    monochrome = true// Reports
    )
public class TestRunner {

	
}