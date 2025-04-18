package com.dsalgo.automation.stepdefinations;

import java.util.List;
import java.util.Map;




import org.testng.Assert;

import com.dsalgo.automation.pages.DataStructure;
import com.dsalgo.automation.pages.GraphPage;
import com.dsalgo.automation.pages.HomePage;
import com.dsalgo.automation.pages.LoginPage;
import com.dsalgo.automation.utils.ExcelReader;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class DataStructureStepDef {
	LoginPage loginpom = new LoginPage();
	HomePage homepom = new HomePage();
	DataStructure datastructurepom = new DataStructure();
	GraphPage graphpom = new GraphPage();
	// Load the Excel file containing test data
	List<Map<String, String>> data = ExcelReader.getAllRows("SignIn"); // Specify the correct path to your Excel file
	

	@And("the user enters a valid credentials and click on login")
	public void user_enters_valid_credentials_and_click_on_login() {
		// Get first data row (not header)
	    Map<String, String> rowData = data.get(0); // index 0 = first data row after header
	    //Exact value from excel cell
	    String username = rowData.get("username");
		String password = rowData.get("password");
		//Use it in the step
	    loginpom.enterUsername(username);
		loginpom.enterPassword(password);
				
		loginpom.clickLogin();
	}

	@And("the user is redirected to the Home page")
	public void user_redirected_to_home_page() {
		String expectedUrl = homepom.getExpectedHomeUrl();
		String actualUrl = homepom.getHomeUrl();
		Assert.assertEquals(actualUrl, expectedUrl, "User was not redirected to the Home page.");
	}

	@Given("the user is on the {string} page")
	public void user_is_on_the_page(String pageName) {
		String currentUrl = homepom.getHomeUrl();
		if (pageName.equalsIgnoreCase("Home")) {
			Assert.assertTrue(currentUrl.contains("home"), "Not on the Home page");
		}
	}

	@When("the user clicks the Getting Started button in {string}")
	public void user_clicks_getting_started_button(String sectionName) {
		switch (sectionName) {
		case "Data Structures-Introduction":
			homepom.getStartedhome(sectionName);
			break;
		case "Graph":
			homepom.getStartedhome(sectionName);
			break;
		}
	}

	@Then("the user should land on the {string} Page")
	public void user_should_land_on_page(String expectedPageTitle) {
		switch (expectedPageTitle) {
		case "Data Structures-Introduction":
			String currentTitle = datastructurepom.getTitleofPage();
			Assert.assertTrue(currentTitle.contains(expectedPageTitle), " Page title mismatch");
			break;
		case "Graph":
			String currentGraphTitle = graphpom.getTitleofPage();
			Assert.assertTrue(currentGraphTitle.contains(expectedPageTitle), " Page title mismatch");
			break;
		}

	}

	@Given("the user is on the section {string} page")
	public void the_user_is_on_the_section_page(String pageName) {
		switch (pageName) {
		case "Data Structures-Introduction":
			homepom.getStartedhome(pageName);
			String currentTitle = datastructurepom.getTitleofPage();
			Assert.assertTrue(currentTitle.contains(pageName), "User is not on the expected page: " + pageName);
			break;
		case "Graph":
			homepom.getStartedhome(pageName);
			String currentGraphTitle = datastructurepom.getTitleofPage();
			Assert.assertTrue(currentGraphTitle.contains(pageName), "User is not on the expected page: " + pageName);
			break;
		}
	}

	@When("the user clicks the {string} link")
	public void user_clicks_the_link(String linkName) {
		switch (linkName) {
		case "Time Complexity":
			datastructurepom.clickTimeCom();
			break;
		case "Graph":
			graphpom.clickGraphLink();
			break;
		case "Sign in":
			homepom.signinLink();
			break;
		case "Register":
			homepom.registerLink();
			break;
		case "Graph Representations":
			graphpom.clickGraphRep();
			break;
		}
		
	}

	@Then("the user should be redirected to the {string} page of Data Structures - Introduction")
	public void user_should_be_redirected_to_time_complexity_page(String pageName) {
		String actualTitle = datastructurepom.getTitleofPage();
		Assert.assertTrue(actualTitle.contains(pageName), "User is not redirected to the " + pageName + " page.");
	}

	@Given("the user is on the data structure {string} page")
	public void the_user_is_on_the_page(String pageName) {
		homepom.getStartedhome("Data Structures-Introduction");
		datastructurepom.clickTimeCom();
	}

	@When("the user clicks the {string} {string} link")
	public void the_user_clicks_practice_questions_link(String module, String linkText) {
		switch (module) {
		case "Data Structures-Introduction":
			datastructurepom.clickPracticeQues();
			break;
		case "Graph":
			graphpom.clickPracticeQues();
			break;
		}
		
	}

	@Then("the user is redirected to the blank page of {string} {string}")
	public void user_is_redirected_to_blank_practice_questions_page(String module, String section) {
		switch (module) {
		case "data structures-introduction":
			String actualTitle = datastructurepom.getTitleofPage();
			Assert.assertTrue(actualTitle.contains(section), "User is not redirected to the Practice Questions page.");
			// Optional: Check if the page content is blank
			String checkBody = datastructurepom.bodyText();
			Assert.assertTrue(checkBody.isEmpty(), "The Practice Questions page is blank.No content Found");
			break;
		case "graph":
			String actualGraphTitle = graphpom.getTitleofPage();
			Assert.assertTrue(actualGraphTitle.contains(section), "User is not redirected to the Practice Questions page.");
			// Optional: Check if the page content is blank
			String checkGraphBody = graphpom.bodyText();
			Assert.assertTrue(checkGraphBody.isEmpty(), "The Practice Questions page is blank.No content Found");
		}
		
	}

	@Then("the user should be redirected to a page having a {string} with a Run button to test")
	public void redirected_to_try_editor_page(String editorId) {
		// Assert user is on Try Editor page
		String currentUrl = datastructurepom.getCurrentUrl();
		Assert.assertTrue(currentUrl.contains(editorId),
				"Not redirected to Try Editor page. Current URL: " + currentUrl);

		// Check presence of code editor
		Assert.assertTrue(datastructurepom.isTextEditorVisible(), " Try Editor is not visible.");

		// Check presence of Run button
		Assert.assertTrue(datastructurepom.isRunBtnVisible(), " Run button is not visible.");
	}

	@Given("the user is on the {string} {string} page")
	public void user_is_on_try_editor_page(String section, String page) {
		switch (section) {
		case "Data Structures-Introduction":
			homepom.getStartedhome(section);
			datastructurepom.clickTimeCom();
			datastructurepom.clickTryHere();
			break;
		case "Graph":
			homepom.getStartedhome(section);
			graphpom.clickGraphLink();
			graphpom.clickTryHere();
		}
		
	}

	@And("the Try Editor is empty for {string}")
	public void the_try_editor_is_empty_for(String section) {
		switch (section){
		case "Data Structures-Introduction":
			String content = datastructurepom.isTextEditorEmpty();
			Assert.assertTrue(content.isEmpty(), "Try Editor is not empty.");
			break;
		case "Graph":
			String graphContent = graphpom.isTextEditorEmpty();
			Assert.assertTrue(graphContent.isEmpty(), "Try Editor is not empty.");
			break;
		}
		
	}

	@When("the user clicks on the {string} button")
	public void the_user_clicks_on_the_button(String buttonText) {
		switch (buttonText) {
		case "Run":
			datastructurepom.clickRunButton();
			break;
		case "Try Here":
			datastructurepom.clickTryHere();
			break;
		case "Sign out":
			homepom.signoutLink();
			break;
		case "Graph Try here" :
			graphpom.clickTryHere();
			break;
		case "Graph Run":
			graphpom.clickRunButton();
			break;
		case "Graph Representations Try here":
			graphpom.clickTryHere();
			break;
		}
	}

	@Then("the user should see an error message")
	public void the_user_should_see_an_error_message() {
		String message = datastructurepom.errorMsg();
		Assert.assertFalse(message.isEmpty(), "No error message displayed.");
	}

	@And("the user enters invalid python code")
	public void the_user_enters_invalid_python_code() {
		// Load the Excel file containing test data
		List<Map<String, String>> allData = ExcelReader.getAllRows("PythonCode"); 
		// Get value of third row and column "pythonCode"
		String invalidCode = allData.get(1).get("PythonCode");
		datastructurepom.enterPythonCode(invalidCode);
	}

	@Then("the user should see an error message in an alert window for data structure")
	public void the_user_should_see_error_alert() {
		try {
			String alertText = datastructurepom.AlertGetText();
			Assert.assertFalse(alertText.isEmpty(), "Alert is empty or not displayed.");
			
		} catch (NullPointerException e) {
			Assert.fail("Alert was not displayed.");
		}
	}

	@And("the user enters valid python code")
	public void user_enters_valid_python_code() {
		// Load the Excel file containing test data
		List<Map<String, String>> allData = ExcelReader.getAllRows("PythonCode"); 
		// Get value of second row and column "pythonCode"
		String validCode = allData.get(0).get("PythonCode");
		datastructurepom.enterPythonCode(validCode);
	}

	@Then("the user should be able to see output in the console")
	public void user_should_see_output_in_console() {
		String successMsg = datastructurepom.successMsg();
		Assert.assertFalse(successMsg.isEmpty(), " Output is empty — expected result was not printed.");
	}

	@When("the user clicks the {string} logo on the {string} page")
	public void user_clicks_logo_on_page(String logoName, String pageName) {
		if (pageName.equalsIgnoreCase("Data Structures-Introduction")) {
			datastructurepom.clickNumpyninjaLogo();
		} else if (pageName.equalsIgnoreCase("Home")) {
			homepom.clickNumpyNinja();
		} else if (pageName.equalsIgnoreCase("login")) {
			loginpom.clickNumpyninjaLogo();
		} else if (pageName.equalsIgnoreCase("Graph")) {
			graphpom.clickNumpyninjaLogo();
		}else {
			throw new IllegalArgumentException("Unknown logo: " + logoName);
		}
	}
}
