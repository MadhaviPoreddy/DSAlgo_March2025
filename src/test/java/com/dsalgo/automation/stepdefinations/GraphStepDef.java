package com.dsalgo.automation.stepdefinations;

import java.io.IOException;
import java.util.List;



import org.openqa.selenium.WebElement;
import org.testng.Assert;

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
	List<WebElement> paragraphElements;
	
	
	
	@Given("the user is on the {string} data structure page")
	public void the_user_is_on_the_data_structure_page(String section) {
        homepom.getStartedhome(section); 
	    graphpom.clickGraphLink();
	    Assert.assertEquals(graphpom.getTitleofPage(), "Graph", "User is not on the Graph page.");
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
		    String expectedUrl = topic.toLowerCase() + "/graph/"; // adjust based on your site title
		    String actualUrl = graphpom.getCurrentUrl();
		    Assert.assertFalse(expectedUrl.contains(actualUrl), "User is not on the expected graph subtopics page: " + topic);
		    break;
		case "Graph Representations":
			homepom.getStartedhome("Graph");
			graphpom.clickGraphRep();
			String expectedGraphRepUrl = topic.toLowerCase() + "/graph/graph-representations/"; // adjust based on your site title
		    String actualGraphRepUrl = graphpom.getCurrentUrl();
		    Assert.assertFalse(expectedGraphRepUrl.contains(actualGraphRepUrl), "User is not on the expected graph subtopics page: " + topic);
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
		String secondRow = ExcelReader.getCellValue("PythonCode", 2, 0);
		graphpom.enterPythonCode(secondRow);
	}
	@And("the user enters valid python code for Graph")
	public void user_enters_valid_python_code() {
		String FirstRow = ExcelReader.getCellValue("PythonCode", 1, 0);
		graphpom.enterPythonCode(FirstRow);
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
