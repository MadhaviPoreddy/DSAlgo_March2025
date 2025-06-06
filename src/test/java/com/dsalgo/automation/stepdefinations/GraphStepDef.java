package com.dsalgo.automation.stepdefinations;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.dsalgo.automation.pages.DataStructure;
import com.dsalgo.automation.pages.GraphPage;
import com.dsalgo.automation.pages.HomePage;
import com.dsalgo.automation.pages.LoginPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.dsalgo.automation.utils.ExcelReader;

public class GraphStepDef {
	HomePage homepom = new HomePage();
	LoginPage loginpom = new LoginPage();
	GraphPage graphpom = new GraphPage();
	DataStructure datastructurepom = new DataStructure();
	List<WebElement> paragraphElements;
	
	
	
	@Given("the user is on the {string} data structure page")
	public void the_user_is_on_the_data_structure_page(String section) {
        homepom.getStartedhome(section); 
	    graphpom.clickGraphLink();
	}

	@Then("the user should be redirected to the {string} subtopics page")
	public void user_should_be_redirected_to_subtopics_page(String pageName) {
		switch (pageName) {
		case "Graph":
			String currentUrl = graphpom.getCurrentUrl();
			Assert.assertTrue(currentUrl.contains("/graph/graph/"), " User is not on the Graph subtopics page. URL: " + currentUrl);
			break;
		case "Graph Representations":
			String currentGraphRepUrl = graphpom.getCurrentUrl();
			Assert.assertTrue(currentGraphRepUrl.contains("/graph/graph-representations/"), " User is not on the Graph Representation subtopics page. URL: " + currentGraphRepUrl);
			break;
		}
	   
	}
	
	@Given("the user is on the {string} subtopics page")
	public void user_is_on_subtopics_page(String topic) {
		switch (topic) {
		case "Graph":
			homepom.getStartedhome(topic);
			graphpom.clickGraphLink();
		    break;
		case "Graph Representations":
			homepom.getStartedhome("Graph");
			graphpom.clickGraphRep();
		    break;
		}
		
	}
	
	@Then("The user should be redirected to a page having an {string} with a run button to test")
	public void user_should_see_try_editor_with_run_button(String editorName) {
		// Assert user is on Try Editor page
		String currentUrl = graphpom.getCurrentUrl();
		Assert.assertTrue(currentUrl.contains(editorName),
				"Not redirected to Try Editor page. Current URL: " + currentUrl);

		// Check presence of code editor
		Assert.assertTrue(graphpom.isTextEditorVisible(), " Try Editor is not visible.");

		// Check presence of Run button
		Assert.assertTrue(graphpom.isRunBtnVisible(), " Run button is not visible.");
	}
	
	@When("the user clicks on the graph {string} button")
	public void the_user_clicks_on_graph_run_button(String buttonName) {
	    graphpom.clickRunButton();
	}
	
	@Then("the user should see an error message for graph")
	public void the_user_should_see_error_message_for_graph() {
		String message = graphpom.errorMsg();
		Assert.assertFalse(message.isEmpty(), "No error message displayed.");
	}
	
	@And("the user enters invalid python code for Graph")
	public void the_user_enters_invalid_python_code() {
		// Load the Excel file containing test data
		List<Map<String, String>> allData = ExcelReader.getAllRows("PythonCode"); 
		// Get value of third row and column "pythonCode"
		String invalidCode = allData.get(1).get("PythonCode");		
		graphpom.enterPythonCode(invalidCode);
	}
	
	@Then("the user should see an error message in an alert window for graph")
	public void the_user_should_see_error_alert() {
		try {
			String alertText = datastructurepom.AlertGetText();
			Assert.assertFalse(alertText.isEmpty(), "Alert is empty or not displayed.");
			
		} catch (NullPointerException e) {
			Assert.fail("Alert was not displayed.");
		}
	}
	
	@And("the user enters valid python code for Graph")
	public void user_enters_valid_python_code() {
		// Load the Excel file containing test data
		List<Map<String, String>> allData = ExcelReader.getAllRows("PythonCode"); 
		// Get value of second row and column "pythonCode"
		String validCode = allData.get(0).get("PythonCode");
		graphpom.enterPythonCode(validCode);
	}
	
	@Then("the user should be able to see output in the console for Graph")
	public void user_should_see_output_in_console() {
		String successMsg = graphpom.successMsg();
		Assert.assertFalse(successMsg.isEmpty(), " Output is empty — expected result was not printed.");
	}
	
	@Then("the user should be redirected to a {string} page with a run button to test")
	public void user_should_be_redirected_to_try_editor_page(String pageName) {
		// Assert user is on Try Editor page
		String currentUrl = graphpom.getCurrentUrl();
		Assert.assertTrue(currentUrl.contains(pageName),
				"Not redirected to Try Editor page. Current URL: " + currentUrl);

		// Check presence of code editor
		Assert.assertTrue(graphpom.isTextEditorVisible(), " Try Editor is not visible.");

		// Check presence of Run button
		Assert.assertTrue(graphpom.isRunBtnVisible(), " Run button is not visible.");
	}
	
	@When("the user examine the paragraph positioning and alignment")
	public void the_user_examine_the_paragraph_positioning_and_alignment() throws IOException {
		// Print image attributes
		graphpom.getParagraphImage();
		graphpom.getParagraphText();	
	}
	
	
	@Then("the paragraph should not overlap with the matrix table")
	public void the_paragraph_should_not_overlap_with_matrix_table() {
	    boolean isOverlapping = graphpom.isOverlapping();
	    Assert.assertFalse(isOverlapping, "Overlap detected between paragraph and table/image!");
	}
}
