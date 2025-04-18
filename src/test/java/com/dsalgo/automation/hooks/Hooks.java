package com.dsalgo.automation.hooks;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import com.dsalgo.automation.driver.DriverFactory;
import com.dsalgo.automation.utils.ExcelReader;
import com.dsalgo.automation.utils.LoggerLoad;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
	
	private WebDriver driver;
	
	List<Map<String, String>> testData = ExcelReader.getAllRows("Browser"); //This code is to get All rows from specific sheet in excel
    
    @Before
    public void setUpFreshBrowser(Scenario scenario) {
    	Map<String, String> specificRow = testData.get(0); 	//This code will get all details from particular row
    	String browser = specificRow.get("Browser"); 		//This code will get specific cell from the row, for the given Tile e.g Here Title (Header) is Browser
    	LoggerLoad.info("Choosen Browser is : "+browser);
    	DriverFactory.initializeDriver(browser);
    }

    @After
    public void tearDownFreshBrowser(Scenario scenario) {
    	driver = DriverFactory.getDriver();
    	//below code is to get screenshots for failed scenarios. screenshots can be viewed in cucumber reports in Target
    	if (scenario.isFailed()) {
    		byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    		scenario.attach(screenshot, "image/png", "Screenshot");
            String base64Screenshot = ((TakesScreenshot) DriverFactory.getDriver())
                    .getScreenshotAs(OutputType.BASE64);
               ExtentCucumberAdapter.getCurrentStep().log(
                   Status.FAIL,
                  MediaEntityBuilder.createScreenCaptureFromBase64String(base64Screenshot).build()
                );
    	}
        DriverFactory.quitDriver();
    }
}
