package com.dsalgo.automation.stepdefinations;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.List;
import java.util.Map;

import com.dsalgo.automation.pages.QueuePage;
import com.dsalgo.automation.pages.TreePage;
import com.dsalgo.automation.utils.ExcelReader;
import com.dsalgo.automation.utils.LoggerLoad;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CommonStepDef {
	
	QueuePage queuePage = new QueuePage();
	TreePage treePage = new TreePage();
	List<Map<String, String>> testData = ExcelReader.getAllRows("CodeEditor");

    @And("The user clicks on get started button for Queue on homepage")
    public void the_user_clicks_on_get_strated_link_for_queue() {
    	queuePage.clickQueues();
    }
    
    @When("The user clicks on get started button for Tree on homepage")
    public void the_user_clicks_on_get_strated_link_for_tree() {
    	treePage.clickTree();
    }

    @When("The user clicks on Practice questions link")
    public void when_the_user_clicks_on_practice_questions_link() {
    	queuePage.practiceQuestions();
    }

    @Then("The User should be navigated to Practice Questions page")
    public void then_the_user_should_be_navigated_to_practice_questions_page() {
        String practiceTitle = queuePage.verifyTitleOfPage();
        assertEquals(practiceTitle, "Practice Questions");
        String verifyContect = queuePage.verifyContent();
		try {
		assertTrue(verifyContect.isEmpty(), "Expected verifyContect to be empty");
		throw new AssertionError("Test failed: Page is Empty.");
        } catch (AssertionError e) {
            LoggerLoad.error("Assertion failed: " + e.getMessage());
            throw e;
        }
    }

    @When("The user clicks on Try Here button")
    public void when_the_user_clicks_on_try_here_button() {
    	queuePage.tryCodeEditor();
    }

    @Then("The User should be navigated to the CodeExecutor Editor Page")
    public void then_the_user_should_be_navigated_to_the_codeexecutor_editor_page() {
    	Map<String, String> specificRow = testData.get(0);
    	String expectedTitle = specificRow.get("PageTitle");
        String codeEditorTitle = queuePage.verifyTitleOfPage();
        assertEquals(codeEditorTitle, expectedTitle);
    }

    @When("The user clicks the Run Button without entering the code in the Editor")
    public void when_the_user_clicks_the_run_button_without_entering_the_code_in_the_editor() {
    	queuePage.runCode();
    }

    @Then("The user is not able to see an error message")
    public void then_the_user_is_not_able_to_see_an_error_message() {
    	Map<String, String> specificRow = testData.get(0);
    	String expectedOutput = specificRow.get("Output");
        String codeOutput = queuePage.verifyOutput();
        assertEquals(codeOutput, expectedOutput);
    }

    @When("The user enters a valid Python code in Editor and click on the Run button")
    public void when_the_user_enters_a_valid_python_code_in_editor_and_click_on_the_run_button() {
    	Map<String, String> specificRow = testData.get(1);
    	String validCode = specificRow.get("ValidCode");
    	queuePage.verifyCodeEditor(validCode);
    	queuePage.runCode();
    }

    @Then("The user should be able to execute the code")
    public void then_the_user_should_be_able_to_execute_the_code() {
    	Map<String, String> specificRow = testData.get(1);
    	String expectedOutput = specificRow.get("Output");
        String codeOutput = queuePage.verifyOutput();
        assertEquals(codeOutput, expectedOutput);
    }

    @When("The user enters an invalid code in Editor and click on the Run button")
    public void when_the_user_enters_an_invalid_code_in_editor_and_click_on_the_run_button() {
    	Map<String, String> specificRow = testData.get(2);
    	String invalidCode = specificRow.get("InvalidCode");
    	queuePage.verifyCodeEditor(invalidCode);
    	queuePage.runCode();
    }    

    @Then("The user should get an error message after excuting the code")
    public void then_the_user_should_get_an_error_message_after_excuting_the_code() {
    	Boolean isDisplayed = queuePage.alertPresent();
    	assertTrue(isDisplayed);
    	queuePage.handleAlert();
        
    }
}
