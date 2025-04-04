package com.dsalgo.automation.stepdefinations;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.dsalgo.automation.driver.DriverFactory;
import com.dsalgo.automation.pages.RegistrationBackgroundPage;
import com.dsalgo.automation.pages.UserRegisterPage;
import com.dsalgo.automation.utils.ExcelReader;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserRegisterSteps {

	WebDriver driver;
	RegistrationBackgroundPage homePage;
	UserRegisterPage registerPage = new UserRegisterPage(DriverFactory.getDriver());
	List<Map<String, String>> testData = ExcelReader.getAllRows("Sheet1");


	@When("The user clicks Register button with all fields empty")
	public void the_user_clicks_register_button_with_all_fields_empty() {
		registerPage.clickRegister();
	}
	
	@Then("The error {string} appears below Username textbox")
	public void the_error_appears_below_username_textbox(String errorMsg) {
		registerPage.verifyUserErrorMsg(errorMsg);
	}
}