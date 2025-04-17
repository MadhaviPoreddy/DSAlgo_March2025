package com.dsalgo.automation.stepdefinations;

import java.util.List;
import java.util.Map;

import org.testng.Assert;

import com.dsalgo.automation.pages.HomePage;
import com.dsalgo.automation.pages.LoginPage;
import com.dsalgo.automation.utils.ExcelReader;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginStepDef {
	LoginPage loginpom = new LoginPage();
	HomePage homepom = new HomePage();
	// Load the Excel file containing test data
	List<Map<String, String>> data = ExcelReader.getAllRows("SignIn"); // Specify the correct path to your Excel file
	
	@Given("the user is on the DS Algo Sign in Page")
	public void user_is_on_signin_page() {
	    loginpom.openLoginurl(); 
	}
	
	@When("the user enters a valid username and password")
	public void user_enters_valid_credentials() {
		// Get first data row (not header)
	    Map<String, String> rowData = data.get(0); // index 0 = first data row after header
	    //Exact value from excel cell
	    String username = rowData.get("username");
		String password = rowData.get("password");
		//Use it in the step
	    loginpom.enterUsername(username);
		loginpom.enterPassword(password);
				
	}
	
	@And("the user clicks the login button")
	public void user_clicks_login_button() {
		// Sign in using the retrieved credentials
		loginpom.clickLogin();
	}
	
	@Then("the user should land on the Home Page with the message {string}")
	public void user_should_land_on_home_page_with_message(String expectedMessage) {
	    // Validate URL 
	    String currentUrl = homepom.getHomeUrl();
	    Assert.assertTrue(currentUrl.toLowerCase().contains("home")," Not redirected to Home page. Current URL: " + currentUrl);

	    // Validate success message
	    String actualMessage = homepom.successLogin();
	    Assert.assertEquals(actualMessage, expectedMessage, "Login success message mismatch.\nExpected: " + expectedMessage + "\nActual: " + actualMessage);
	}
	
	@When("the user clicks the login button after leaving the {string} and {string} fields empty")
	public void user_clicks_login_with_empty_fields(String username, String password) throws InterruptedException {
	    // Just click the login button — don't enter anything
	    loginpom.clickLogin();
	    Thread.sleep(2000);
	}
	
	@When("the user enters username and leaves the Password field empty")
	public void userEntersUsernameOnly() {
		// Load the Excel file containing test data
		List<Map<String, String>> data = ExcelReader.getAllRows("SignIn"); // Specify the correct path to the Excel file
		// Get first data row (not header)
	    Map<String, String> rowData = data.get(1); // index 0 = first data row after header
	    //Exact value from excel cell
	    String username = rowData.get("username");
		String password = rowData.get("password");
		//Use it in the step
	    loginpom.enterUsername(username);
		loginpom.enterPassword(password);
		
	}
	
	@Then("the user should see the error message {string} below the Password textbox")
	public void userShouldSeePasswordFieldError(String expectedMessage) {
		String actualMessage = loginpom.getPasswordValidationMessage();
	    Assert.assertEquals(actualMessage, expectedMessage, "Password field validation message is not visible");
	}
	
	@When("the user enters password and leaves the Username field empty")
	public void userEntersPasswordOnly() {
		List<Map<String, String>> data = ExcelReader.getAllRows("SignIn"); // Specify the correct path to the Excel file
		// Get first data row (not header)
	    Map<String, String> rowData = data.get(2); // index 0 = first data row after header
	    //Exact value from excel cell
	    String username = rowData.get("username");
		String password = rowData.get("password");
		//Use it in the step
	    loginpom.enterUsername(username);
		loginpom.enterPassword(password);
	}
	
	@Then("the user should see the error message {string} below the Username textbox")
	public void userShouldSeeUsernameValidationMessage(String expectedMessage) {
	    String actualMessage = loginpom.getUsernameValidationMessage();
	    Assert.assertEquals(actualMessage, expectedMessage,"Username field validation message is not visible");
	}
	
	@When("the user enters an invalid username and a valid password")
	public void enterInvalidUsernameValidPassword() {
	    List<Map<String, String>> data = ExcelReader.getAllRows("SignIn"); // Specify the correct path to the Excel file
		// Get first data row (not header)
	    Map<String, String> rowData = data.get(4); // index 0 = first data row after header
	    //Exact value from excel cell
	    String username = rowData.get("username");
		String password = rowData.get("password");
		//Use it in the step
	    loginpom.enterUsername(username);
		loginpom.enterPassword(password);
	}
	
	@Then("the user should see an error message {string}")
	public void userShouldSeeErrorMessage(String expectedErrorMsg) {
	    String actualErrorMsg = loginpom.invalidAlert();
	    Assert.assertEquals(actualErrorMsg, expectedErrorMsg,"Error message doesn't match");
	}
	
	@When("the user enters a valid username and an invalid password")
	public void enterValidUsernameInvalidPassword() {

		List<Map<String, String>> data = ExcelReader.getAllRows("SignIn"); // Specify the correct path to the Excel file
		// Get first data row (not header)
	    Map<String, String> rowData = data.get(3); // index 0 = first data row after header
	    //Exact value from excel cell
	    String username = rowData.get("username");
		String password = rowData.get("password");
		//Use it in the step
	    loginpom.enterUsername(username);
		loginpom.enterPassword(password);
	}
	
	@When("the user clicks the {string} link from signin page")
	public void clickLinkFromSigninPage(String linkText) {
	    loginpom.clickRegister();// This will handle clicking the link
	}
	
	@Then("the user should be redirected to the User Registration Page")
	public void verifyRedirectToRegistrationPage() {
	    String pageTitle = loginpom.register_page();   //Check title of the register page
	  
	    Assert.assertEquals(pageTitle.trim(), "Registration", "Expected heading to be 'Registration'");
	}
	
	@Then("the user should be redirected to the home page")
	public void the_user_should_be_redirected_to_the_home_page() {
		String expectedUrl = homepom.getExpectedHomeUrl();  // from POM
	    String actualUrl = homepom.getHomeUrl();

	    Assert.assertEquals(actualUrl, expectedUrl," User was not redirected to the Home page.");
	}
}
