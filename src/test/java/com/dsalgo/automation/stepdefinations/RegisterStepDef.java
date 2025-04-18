package com.dsalgo.automation.stepdefinations;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.List;
import java.util.Map;

import com.dsalgo.automation.driver.DriverFactory;
import com.dsalgo.automation.pages.RegisterPage;
import com.dsalgo.automation.utils.ExcelReader;
import com.dsalgo.automation.utils.HelperUtility;
import com.dsalgo.automation.utils.LoggerLoad;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterStepDef {

	RegisterPage registerPage = new RegisterPage();

	List<Map<String, String>> testData = ExcelReader.getAllRows("Register");

	@Given("The user is on the home page")
	public void the_user_is_on_the_home_page() {
		Map<String, String> specificRow = testData.get(0);
		String webURL = specificRow.get("URL");
		DriverFactory.getDriver().get(webURL);
	}

	@When("The user clicks on Register link")
	public void the_user_clicks_on_register_link() {
		registerPage.goToRegister();
	}

	@Given("The user is on Registration page")
	public void the_user_is_on_registration_page() {
		String pageTitle = registerPage.verifyTitleOfPage();
		assertEquals(pageTitle,"Registration");
	}

	@When("The user clicks Register button with all fields empty")
	public void when_the_user_clicks_register_button_with_all_fields_empty() {
		registerPage.clickRegister();
	}

	@Then("The error {string} appears below Username textbox")
	public void then_the_error_appears_below_username_textbox(String errorMsg) {
		String actualErrMsg = registerPage.verifyUserErrorMsg();
		assertEquals(errorMsg,actualErrMsg);
	}

	@When("The user clicks Register button after entering Username with other fields empty")
	public void when_the_user_clicks_register_button_after_entering_username_with_other_fields_empty() {
		Map<String, String> specificRow = testData.get(1);
		List<String> userDetails = HelperUtility.extractUserDetails(specificRow);

		registerPage.enterDetails(userDetails.get(0), userDetails.get(1), userDetails.get(2));

		registerPage.clickRegister();
	}

	@Then("The error message {string} appears below Password textbox")
	public void then_the_error_message_appears_below_password_textbox(String errorMsg) {
		String actualErrMsg = registerPage.verifyPwdErrorMsg();
		;
		assertEquals(errorMsg,actualErrMsg);

	}

	@When("The user clicks Register button after entering Username and Password")
	public void when_the_user_clicks_register_button_after_entering_username_and_password() {
		Map<String, String> specificRow = testData.get(2);
		List<String> userDetails = HelperUtility.extractUserDetails(specificRow);
		registerPage.enterDetails(userDetails.get(0), userDetails.get(1), userDetails.get(2));
		registerPage.clickRegister();

	}

	@Then("The error message {string} appears below Password Confirmation textbox")
	public void then_the_error_message_appears_below_password_confirmation_textbox(String errorMsg) {
		String actualErrMsg = registerPage.verifyCnPwdErrorMsg();
		assertEquals(errorMsg, actualErrMsg);
	}

	@When("The user clicks Register button after entering space in username field and valid passwords")
	public void when_the_user_clicks_register_button_after_entering_a_username_with_spaces() {
		Map<String, String> specificRow = testData.get(3);
		List<String> userDetails = HelperUtility.extractUserDetails(specificRow);
		registerPage.enterDetails(userDetails.get(0), userDetails.get(1), userDetails.get(2));
		registerPage.clickRegister();

	}

	@When("The user clicks Register button after entering username and confirm password field")
	public void when_the_user_clicks_register_button_after_entering_username_and_confirm_password_field() {
		Map<String, String> specificRow = testData.get(4);
		List<String> userDetails = HelperUtility.extractUserDetails(specificRow);
		registerPage.enterDetails(userDetails.get(0), userDetails.get(1), userDetails.get(2));
		registerPage.clickRegister();

	}

	@When("The user clicks Register button after entering password and confirm password field")
	public void when_the_user_clicks_register_button_after_entering_password_and_confirm_password_field() {
		Map<String, String> specificRow = testData.get(5);
		List<String> userDetails = HelperUtility.extractUserDetails(specificRow);
		registerPage.enterDetails(userDetails.get(0), userDetails.get(1), userDetails.get(2));
		registerPage.clickRegister();

	}

	@When("The user clicks Register button after entering a username with more than x characters")
	public void when_the_user_clicks_register_button_after_entering_a_username_with_more_than_x_characters() {
		Map<String, String> specificRow = testData.get(6);
		List<String> userDetails = HelperUtility.extractUserDetails(specificRow);
		registerPage.enterDetails(userDetails.get(0), userDetails.get(1), userDetails.get(2));

	}

	@Then("The username field should only allow x charaters")
	public void then_the_username_field_should_only_allow_x_charaters() {
		String userName = registerPage.verifyUserNameField();
		int userLength = userName.length();
		assertEquals(userLength, 150);

	}

	@When("The user clicks Register button after entering a password too similar to username")
	public void when_the_user_clicks_register_button_after_entering_a_password_too_similar_to_username() {
		Map<String, String> specificRow = testData.get(7);
		List<String> userDetails = HelperUtility.extractUserDetails(specificRow);
		registerPage.enterDetails(userDetails.get(0), userDetails.get(1), userDetails.get(2));
		registerPage.clickRegister();

	}

	@Then("The correct error message is not displayed")
	public void then_the_correct_error_message_is_not_displayed() {
		String actualErrMsg = registerPage.verifyErrorMessage();
		String displyedMsg = "password_mismatch:The two password fields didn’t match.";
		try {
			assertEquals(actualErrMsg, displyedMsg);
			throw new AssertionError("Test failed: Incorrect error message displayed.");
		} catch (AssertionError e) {
			LoggerLoad.error("Assertion failed: " + e.getMessage());
			throw e;
		}
	}

	@When("The user clicks Register button after entering a password and confirm password less than eight characters")
	public void when_the_user_clicks_register_button_after_entering_a_password_less_than_eight_characters() {
		Map<String, String> specificRow = testData.get(8);
		List<String> userDetails = HelperUtility.extractUserDetails(specificRow);
		registerPage.enterDetails(userDetails.get(0), userDetails.get(1), userDetails.get(2));
		registerPage.clickRegister();

	}

	@When("The user clicks Register button after entering a password with numeric data with valid username")
	public void when_the_user_clicks_register_button_after_entering_a_password_with_numeric_data() {
		Map<String, String> specificRow = testData.get(9);
		List<String> userDetails = HelperUtility.extractUserDetails(specificRow);
		registerPage.enterDetails(userDetails.get(0), userDetails.get(1), userDetails.get(2));
		registerPage.clickRegister();

	}

	@When("The user clicks Register button after entering commonly used passwords")
	public void when_the_user_clicks_register_button_after_entering_commonly_used_password() {
		Map<String, String> specificRow = testData.get(10);
		List<String> userDetails = HelperUtility.extractUserDetails(specificRow);
		registerPage.enterDetails(userDetails.get(0), userDetails.get(1), userDetails.get(2));
		registerPage.clickRegister();

	}

	@When("The user clicks Register button after entering valid username and different passwords in Password and Password Confirmation fields")
	public void when_the_user_clicks_register_button_after_entering_different_passwords_in_password_and_password_confirmation_fields() {
		Map<String, String> specificRow = testData.get(11);
		List<String> userDetails = HelperUtility.extractUserDetails(specificRow);
		registerPage.enterDetails(userDetails.get(0), userDetails.get(1), userDetails.get(2));
		registerPage.clickRegister();

	}

	@Then("The user should able to see an pwd warning message {string}")
	public void then_the_user_should_able_to_see_an_pwd_warning_message(String arg1) {
		String actualErrMsg = registerPage.verifyErrorMessage();
		String displyedMsg = "password_mismatch:The two password fields didn’t match.";
		assertEquals(actualErrMsg, displyedMsg);

	}

	@When("The user clicks Register button after entering  with valid username, password and password confirmation in related textboxes")
	public void when_the_user_clicks_register_button_after_entering_with_valid_username_password_and_password_confirmation_in_related_textboxes() {
		Map<String, String> specificRow = testData.get(0);
		List<String> userDetails = HelperUtility.extractUserDetails(specificRow);
		registerPage.enterDetails(userDetails.get(0), userDetails.get(1), userDetails.get(2));
		registerPage.clickRegister();

	}

	@Then("The user should be redirected to Home Page of DS Algo with message {string}")
	public void then_the_user_should_be_redirected_to_home_page_of_ds_algo_with_message(String succMsg) {
		Map<String, String> specificRow = testData.get(0);
		String expectedSuccMsg = succMsg + specificRow.get("Username");
		String successMesg = registerPage.verifySucces();
		assertEquals(expectedSuccMsg, successMesg);

	}

	@When("The user clicks the NumpyNinja link on the top left corner")
	public void when_the_user_clicks_the_numpyninja_link_on_the_top_left_corner() {
		registerPage.clickNumpyNinjaLnk();

	}

	@Then("The user should be navigated to numpy ninja main page")
	public void then_the_user_is_not_able_to_land_on_home_page() {
		String actualErrMsg = registerPage.verifyTitleOfPage();
		String displyedMsg = "Numpy Ninja";
		assertEquals(actualErrMsg, displyedMsg);

	}

	@When("The user clicks on login link")
	public void when_the_user_clicks_on_login_link() {
		registerPage.clickLoginLnk();

	}

	@When("The user clicks on Sign in link")
	public void when_the_user_clicks_on_sign_in_link() {
		registerPage.clickSigninLnk();

	}

	@Then("The user should be navigated to login page")
	public void then_the_user_should_be_navigated_to_login_page() {
		String actualErrMsg = registerPage.verifyTitleOfPage();
		String displyedMsg = "Login";
		assertEquals(actualErrMsg, displyedMsg);
	}

}
