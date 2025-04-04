package com.dsalgo.automation.stepdefinations;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;

//import com.dsalgo.automation.assesrtions.ResgisterBackgroundAssert;
import com.dsalgo.automation.driver.DriverFactory;
import com.dsalgo.automation.pages.RegistrationBackgroundPage;
import com.dsalgo.automation.utils.ExcelReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class registrationBackgroundSteps {
	
	WebDriver driver;
	RegistrationBackgroundPage homePage;
//	ResgisterBackgroundAssert assertBackgroundRegister;
	List<Map<String, String>> testData = ExcelReader.getAllRows("Sheet1");
	Map<String, String> specificRow = testData.get(0); 
	
	@Given("The user is on the home page")
	public void the_user_is_on_the_home_page() {
        String webURL = specificRow.get("URL");
        DriverFactory.getDriver().get(webURL);
	}

	@When("The user clicks on Register link")
	public void the_user_clicks_on_register_link() {
        homePage = new RegistrationBackgroundPage(DriverFactory.getDriver());
        homePage.goToRegister();
	}

	@Then("the user should be navigated to Registration page")
	public void the_user_should_be_navigated_to_registration_page() {
	//	assertBackgroundRegister = new ResgisterBackgroundAssert(DriverFactory.getDriver());
	//	assertBackgroundRegister.verifyPage();
	}

}
