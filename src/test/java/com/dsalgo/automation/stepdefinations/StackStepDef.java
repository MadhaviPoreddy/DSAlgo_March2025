package com.dsalgo.automation.stepdefinations;
import io.cucumber.java.en.*;
import java.util.List;
import java.util.Map;
import com.dsalgo.automation.pages.StackPage;
import com.dsalgo.automation.utils.ExcelReader;
//import org.junit.Assert;
import static org.testng.Assert.*;

public class StackStepDef {

	StackPage stack=new StackPage();
	List<Map<String, String>> testData = ExcelReader.getAllRows("Stack");
	List<Map<String, String>> testData1 = ExcelReader.getAllRows("CodeEditor");


	@When("The user clicks the Getting Started button in Stack Panel")
		public void the_user_clicks_the_button_in_stack_panel() {
		stack.stackGetStartedBtn();
	}

	@Then("The user will be directed to Stack Data Structure Page")
		public void the_user_will_be_directed_to_data_structure_page() {
	 	String stackTitle = stack.verfyPageTitle();
		System.out.println("Title of the page is " +stackTitle);
		Map<String, String> specificRow = testData.get(0);
	 	String expectedTitle = specificRow.get("PageTitle");
	 	assertEquals(stackTitle, expectedTitle);
	}

	@Given("The user is in the Stack page after Sign in")
		public void the_user_is_in_the_page_after_sign_in() {
	}

	@When("The user clicks Operations in Stack link")
		public void the_user_clicks_link() {
		stack.operationsInStackLink();
	}

	@Then("The user should be redirected to Operations in Stack page")
		public void the_user_should_be_redirected_to_page() {
		String stackTitle = stack.verfyPageTitle();
		Map<String, String> specificRow = testData.get(1);
	 	String expectedTitle = specificRow.get("PageTitle");
	 	assertEquals(stackTitle, expectedTitle);
	}

	@Given("The user is on the Operations in Stack page")
		public void the_user_is_on_the_page() {
		stack.operationsInStackLink();
	}

	@When("The user clicks Try Here button in Operations in Stack page")
		public void the_user_clicks_button_in_operations_in_stack_page() {
		stack.operationsInStackLinkTryEdit();
	}

	@Given("The user is in the Operations in Stack tryEditor page")
	public void the_user_is_in_the_try_editor_page() {
		stack.operationsInStackLink();
		stack.operationsInStackLinkTryEdit();
	}
	@When("The user clicks Practice Questions button")
	public void the_user_clicks_button() {
		stack.stackPracticeLink();
	}
		
	@Then("The user should be redirected to Practice page")
	public void the_user_should_be_redirected_to_Practice_page() {
		stack.verfyPageTitle();
	}
	

	@When("The user clicks Implementation link")
	public void the_user_clicks_Implementation_link() {
	   stack.stackImplementation();
	}
	
	@Then("The user should be redirected to Implementation page")
	public void the_user_should_be_redirected_to_Implementation_page() {
	String stackTitle = stack.verfyPageTitle();
	Map<String, String> specificRow = testData.get(2);
 	String expectedTitle = specificRow.get("PageTitle");
 	assertEquals(stackTitle, expectedTitle);
	System.out.println("Title of the page is matched with the actual title: " +stackTitle);
	System.out.println("User is landed on Implementation of Stack page");
	}

	@Given("The user is on the Implementation page")
	public void the_user_is_on_the_Implementation_page() {
	stack.stackImplementation();
	System.out.println("User is landed on Implementation in Stack page");
	}
	@When("The user clicks Try Here button in Implementation page")
	public void the_user_clicks_button_in_Implementation_page() {
	stack.stackImplementationTryEdit();
	System.out.println("User is clicked on Try Edit button on Operations in Stack page");
	}
	
	@Given("The user is in the Implementation Stack tryEditor page")
	public void the_user_is_in_the_Implementation_try_editor_page() {
		stack.stackImplementation();
		stack.stackImplementationTryEdit();
		System.out.println("User is clicked on Try Edit button on Implementation in Stack page");
	  
	}
	@When("The user clicks Applications link")
		public void the_user_clicks_applications_link() throws InterruptedException {
		Thread.sleep(2000);
		stack.stackApplications();
	}
	
	@Then("The user should be redirected to Applications page")
	public void the_user_should_be_redirected_to_applications_page() {
	String stackTitle = stack.verfyPageTitle();
	Map<String, String> specificRow = testData.get(3);
 	String expectedTitle = specificRow.get("PageTitle");
 	assertEquals(stackTitle, expectedTitle);
	System.out.println("Title of the page is matched with the actual title: " +stackTitle);
	System.out.println("User is landed on Applications of Stack page");
	}
	
	@Given("The user is on the Applications page")
		public void the_user_is_on_the_applications_page() {
		stack.stackApplications();
		System.out.println("User is landed on Applications in Stack page");
	}

	@When("The user clicks Try Here button in Applications page")
	public void the_user_clicks_button_in_applications_page() {
	stack.stackApplicationsTryEdit();
	System.out.println("User is clicked on Try Edit button on Applications in Stack page");
  
	}
	@Given("The user is in the Applications tryEditor page")
	public void the_user_is_in_the_Applications_try_editor_page() {
		stack.stackApplications();
		stack.stackApplicationsTryEdit();
		System.out.println("User is clicked on Try Edit button on Applications in Stack page");
	  
	}

}
