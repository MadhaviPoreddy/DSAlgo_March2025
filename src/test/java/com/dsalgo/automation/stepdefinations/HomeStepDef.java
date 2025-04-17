package com.dsalgo.automation.stepdefinations;




import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.testng.Assert;

import com.dsalgo.automation.pages.HomePage;
import com.dsalgo.automation.pages.LoginPage;
import com.dsalgo.automation.utils.ExcelReader;
import com.dsalgo.automation.utils.LoggerLoad;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeStepDef {

	HomePage homepom = new HomePage();
	LoginPage loginpom = new LoginPage();

	

	@Given("the user has a web browser open")
	public void the_user_has_a_web_browser_open() {
		

	}

	@When("the user enters the correct dsAlgo portal URL")
	public void the_user_enters_the_correct_ds_algo_portal_url() {
		// Opens the DSAlgo portal
		homepom.dsalgoportal();
	}

	@Then("the user should land on the dsAlgo portal homepage with Get Started button")
	public void the_user_should_land_on_the_ds_algo_portal_homepage_with_get_started_button() {
		// Verify that the 'Get Started' button is visible
		Assert.assertTrue(homepom.isGetStartedButtonVisible());
	}

	@Given("the user is on the dsAlgo Portal")
	public void the_user_is_on_the_ds_algo_portal() {
		homepom.dsalgoportal();
	}

	@When("the user clicks the {string} button")
	public void the_user_clicks_the_get_started_button(String buttonName) {
		homepom.getstarted_btn_clk();
	}

	@Then("the user should be navigated to the Home page which displays the Register and Sign in links")
	public void the_user_should_be_navigated_to_home_page_with_links() {

		Assert.assertTrue(homepom.getHomeUrl().contains("home"));
		Assert.assertTrue(homepom.isRegisterButtonVisible());
		Assert.assertTrue(homepom.isSigninLinkVisible());
	}

	@Given("the user is on the Home page before sign in")
	public void the_user_is_on_the_home_page_before_sign_in() {
		homepom.navigateToHomePage(); // Implement navigateToHomePage in POM
	}

	@When("the user clicks the Data Structures dropdown")
	public void the_user_clicks_the_data_structures_dropdown() {
		homepom.clickDataStructuresDropdown(); // Implement clickDataStructuresDropdown in POM
	}

	@Then("the user is not able to see Data Structure Introduction in the dropdown")
	public void the_user_is_not_able_to_see_data_structure_introduction_in_the_dropdown() {
		Assert.assertTrue(homepom.clickDataStructureIntroOption(),
				"Expected 'Data Structure Introduction' to be visible, but it was not.");

	}

	@When("the user selects {string} from the Data Structure dropdown without signing in")
	public void the_user_selects_data_structure_from_dropdown_without_sign_in(String dataStructure) {
		// select the dropdown option
		homepom.selectDropdown(dataStructure);
	}

	@Then("the user should see a warning message {string}")
	public void the_user_should_see_a_warning_message_for_dropdown(String expectedMessage) {
		Assert.assertTrue(homepom.isWarningMessageVisible(), "Warning message not displayed");
		Assert.assertEquals(expectedMessage, homepom.getWarningMessage());
	}

	@When("the user clicks the Get Started button for {string} without signing in")
	public void the_user_clicks_get_started_button(String section) {
		// loop through the get started
		homepom.getStartedhome(section);
	}

	@Given("the user is on the Home page after sign in")
	public void the_user_is_on_the_home_page_after_sign_in_using_excel() throws Exception {
		loginpom.openLoginurl();

		// Load the Excel file containing test data
		List<Map<String, String>> data = ExcelReader.getAllRows("SignIn"); // Specify the correct path to your Excel
																			// file

		// Retrieve username and password from the Excel file
		for (Map<String, String> row : data) {
			String username = row.get("username");
			String password = row.get("password");
			if (username != null && password != null) {
				// You can now use them for login logic
				loginpom.enterUsername(username);
				loginpom.enterPassword(password);
			}
		}

		// Sign in using the retrieved credentials
		loginpom.clickLogin();

		if (homepom.checkLoginSuccess()) {
			Assert.assertTrue(true, "Login was successful.");
			LoggerLoad.info("Login was successful");
		} else if (loginpom.isLoginErrorMessageDisplayed()) {
			Assert.fail("Login failed: Invalid username or password.");
		} else {
			Assert.fail("Neither success nor error message appeared.");
		}

	}

	@Then("the dropdown submenus should match the expected items from {string} sheet")
	public void dropdown_submenus_should_match_expected_items(String sheetName) {
		// Read expected values from Excel
		List<Map<String, String>> expectedSubmenus = ExcelReader.getAllRows("dropdown");
		List<String> realSubmenus = homepom.getDropdownSubmenuTexts();
		// Convert single item with line breaks into a list
		if (realSubmenus.size() == 1) {
			realSubmenus = Arrays.asList(realSubmenus.get(0).split("\\n"));
		}

		// Normalize and check for "data structure introduction"
		for (Map<String, String> row : expectedSubmenus) {
			String expectedMenuItem = row.get("Data Structure"); // or "Menu" or whatever your Excel column is

			boolean isPresent = realSubmenus.stream().map(String::trim).map(String::toLowerCase)
					.anyMatch(item -> item.equals(expectedMenuItem.trim().toLowerCase()));

			Assert.assertTrue(isPresent, " Missing menu item: " + expectedMenuItem);
		}
	}

	@When("the user selects {string} from the Data Structures dropdown")
	public void user_selects_from_dropdown(String menuItem) {
		homepom.selectDropdown(menuItem); // implement this in your POM
	}

	@Then("the user should be directed to the {string} Data Structure Page")
	public void user_should_be_directed_to_page(String expectedPage) {
		String actualTitle = homepom.getTitleofPage(); // or get the heading from the page
		Assert.assertTrue(actualTitle.toLowerCase().contains(expectedPage.toLowerCase()),
				"Expected to be on page with title containing: " + expectedPage + " but got: " + actualTitle);
	}


	@Then("the user should be redirected to the Home page")
	public void user_should_be_redirected_to_home_page() {
		String actualUrl = homepom.getHomeUrl();
		Assert.assertTrue(actualUrl.contains("home"), "Not redirected to Home page. Current URL: " + actualUrl);
	}

	@Then("a message {string} should be displayed")
	public void message_should_be_displayed(String expectedMessage) {
		String actualMessage = homepom.getSignoutAlert(); // Implement this method
		Assert.assertEquals(actualMessage.trim(), expectedMessage.trim(), " Logout message mismatch!");
	}

	

	@Then("the user should land on the home page")
	public void user_should_land_on_home_page() {
		String currentUrl = homepom.getHomeUrl();
		Assert.assertTrue(currentUrl.endsWith("/home"),
				" User was not redirected to the home page. Current URL: " + currentUrl);
	}



	@Then("the user should be redirected to the {string} page")
	public void user_should_be_redirected_to_page(String expectedPage) {
		String currentUrl = null;
		if (expectedPage.equalsIgnoreCase("login")) {
			currentUrl = loginpom.getCurrentUrl();
		} else if (expectedPage.equalsIgnoreCase("Register")) {
			// currentUrl = loginpom.getRegisterurl();
			currentUrl = "register";
		}
		boolean redirected = currentUrl.contains(expectedPage);
		Assert.assertTrue(redirected,
				"Expected to be redirected to: " + expectedPage + " page, but actual URL was: " + currentUrl);
	}
}
