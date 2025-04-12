package com.dsalgo.automation.stepdefinations;

import static org.assertj.core.api.Assertions.*;

import java.util.List;
import java.util.Map;

import com.dsalgo.automation.pages.QueuePage;
import com.dsalgo.automation.utils.ExcelReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class QueueStepDef {

	QueuePage queuePage = new QueuePage();
	
	
	
	List<Map<String, String>> testData = ExcelReader.getAllRows("Queue");
	 
	
    @When("the user clicks the Get Started button for Queues")
    public void when_the_user_clicks_the_get_started_button_for_queues() {
    	queuePage.clickQueues();
    }
    
    @Then("the user should navigated to Queue page")
    public void then_the_user_should_navigated_to_queue_page() {
    	Map<String, String> specificRow = testData.get(0);
    	String expectedTitle = specificRow.get("PageTitle");
    	String qPageTitle = queuePage.verifyTitleOfPage();
    	assertThat(qPageTitle).isEqualTo(expectedTitle);
    }
	
    @Given("The User is on Queue page")
    public void given_the_user_is_on_queue_page() {
    	Map<String, String> specificRow = testData.get(0);
    	String expectedTitle = specificRow.get("PageTitle");
    	String qPageTitle = queuePage.verifyTitleOfPage();
    	assertThat(qPageTitle).isEqualTo(expectedTitle);
    }

    @When("The user clicks on Implementation of Queue in Python link")
    public void when_the_user_clicks_on_implementation_of_queue_in_python_link() {
    	queuePage.clickimpOfQPy();
     
    }

    @Then("The User should be navigated to Implementation of Queue in Python page")
    public void then_the_user_should_be_navigated_to_implementation_of_queue_in_python_page() {
    	Map<String, String> specificRow = testData.get(1);
    	String expectedTitle = specificRow.get("PageTitle");
        String impQPyTitle = queuePage.verifyTitleOfPage();
        assertThat(impQPyTitle).isEqualTo(expectedTitle);
    }

    @Given("The User is on Implementation of Queue in Python page")
    public void given_the_user_is_on_implementation_of_queue_in_python_page() {
    	queuePage.clickimpOfQPy();
    }
    
    @Given("The User is on Implementation of Queue Try Editor Page")
    public void the_user_is_on_implementation_of_queue_try_editor_page() {
    	queuePage.clickimpOfQPy();
    	queuePage.tryCodeEditor();
    }


//    @When("The user is clicks on {string} red color text")
//    public void when_the_user_is_clicks_on_red_color_text(String arg1) {
//    	
//        
//    }
//
//    @Then("The User should be navigated to dequeue link page")
//    public void then_the_user_should_be_navigated_to_dequeue_link_page() {
//        
//        
//    }

    @When("The user clicks on Implementation using collections.deque link")
    public void when_the_user_clicks_on_implementation_using_collectionsdeque_link() {
    	queuePage.clickimpOfCollectionDq();
        
    }

    @Then("The User should be navigated to Implementation using collections.deque page")
    public void then_the_user_should_be_navigated_to_implementation_using_collectionsdeque_page() {
    	Map<String, String> specificRow = testData.get(2);
    	String expectedTitle = specificRow.get("PageTitle");
        String impOfCollectionDqPage = queuePage.verifyTitleOfPage();
        assertThat(impOfCollectionDqPage).isEqualTo(expectedTitle);
    }

    @Given("The User is on Implementation using collections.deque page")
    public void given_the_user_is_on_implementation_using_collectionsdeque_page() {
    	queuePage.clickimpOfCollectionDq();
        
    }
    
    @Given("The User is on Implementation using collections.deque Try Editor Page")
    public void the_user_is_on_implementation_using_collections_deque_try_editor_page() {
    	queuePage.clickimpOfCollectionDq();
    	queuePage.tryCodeEditor();
    	Map<String, String> specificRow = testData.get(5);
    	String expectedTitle = specificRow.get("PageTitle");
        String codeEditorTitle = queuePage.verifyTitleOfPage();
        assertThat(codeEditorTitle).isEqualTo(expectedTitle);
    }

    @When("The user clicks on Implementation using array link")
    public void when_the_user_clicks_on_implementation_using_array_link() {
    	queuePage.clickImplementationUsingArray();
        
    }

    @Then("The User should be navigated to Implementation using array page")
    public void then_the_user_should_be_navigated_to_implementation_using_array_page() {
    	Map<String, String> specificRow = testData.get(3);
    	String expectedTitle = specificRow.get("PageTitle");
        String impUsingArrayPage = queuePage.verifyTitleOfPage();
        assertThat(impUsingArrayPage).isEqualTo(expectedTitle);
    }

    @Given("The User is on Implementation using array page")
    public void given_the_user_is_on_implementation_using_array_page() {
    	queuePage.clickImplementationUsingArray();
        
    }
    
    @Given("The User is on Implementation using array Try Editor Page")
    public void the_user_is_on_implementation_using_array_try_editor_page() {
    	queuePage.clickImplementationUsingArray();
    	queuePage.tryCodeEditor();
    	Map<String, String> specificRow = testData.get(5);
    	String expectedTitle = specificRow.get("PageTitle");
        String codeEditorTitle = queuePage.verifyTitleOfPage();
        assertThat(codeEditorTitle).isEqualTo(expectedTitle);
    }

    @When("The user clicks on Queue Operations link")
    public void when_the_user_clicks_on_queue_operations_link() {
        queuePage.clickQueueOperation();
        
    }

    @Then("The User should be navigated to Queue Operations page should be displayed")
    public void then_the_user_should_be_navigated_to_queue_operations_page_should_be_displayed() {
    	Map<String, String> specificRow = testData.get(4);
    	String expectedTitle = specificRow.get("PageTitle");
        String queueOperationPage = queuePage.verifyTitleOfPage();
        assertThat(queueOperationPage).isEqualTo(expectedTitle);
        
    }
    
    @Given("The User is on Queue Operations page")
    public void the_user_is_on_queue_operations_page() {
    	queuePage.clickQueueOperation();
    }
    
    @Given("The User is on Queue Operations Try Editor Page")
    public void the_user_is_on_queue_operations_try_editor_page() {
    	queuePage.clickQueueOperation();
    	queuePage.tryCodeEditor();
    	Map<String, String> specificRow = testData.get(5);
    	String expectedTitle = specificRow.get("PageTitle");
        String codeEditorTitle = queuePage.verifyTitleOfPage();
        assertThat(codeEditorTitle).isEqualTo(expectedTitle);
    }
}
