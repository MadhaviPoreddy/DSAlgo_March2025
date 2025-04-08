package com.dsalgo.automation.stepdefinations;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef {
	
	 	

	    @When("the user clicks the \"Sign in\" link")
	    public void theUserClicksSignInLink() {
	        // Locate the "Sign in" link by its link text
	       
	        // Click the "Sign in" link
	       
	    }

	    @Then("the user should be redirected to the Sign-In page")
	    public void theUserIsRedirectedToSignInPage() {
	        // Wait for the page to load and verify the current URL
	    
	        // Optionally, verify the presence of a unique element on the Sign-In page
	        
	    }
	    

	    @When("the user performs login using Excel sheet {string}")
	    public void user_performs_login_using_excel_sheet(String sheetName) {
	       
	    }
	    
	   
	    
	    @Then("login results should be validated based on Excel data")
	    public void login_results_should_be_validated() {
	        
	        
	    }
	    
	    @Then("if login is successful, the user should be redirected to the Home Page")
	    public void user_should_be_redirected_to_home_if_login_successful() {
	       
	    }
	    
	    @Given("the user is on the {string} page after sign in")
		public void the_user_is_on_the_page_after_sign_in(String pageName) {

		}
	    
	    @When("the user clicks the Data Structures dropdown after sign in")
	    public void the_user_clicks_the_dropdown_after_sign_in() {
	       
	    }
	    
	    @Then("the user is not able to see Data Structure Introduction in the dropdown")
	    public void the_user_is_not_able_to_see_intro_option() {
	       
	    }
	    
	    @When("the user selects {string} from the Data Structure dropdown after signing in")
	    public void the_user_selects_option_from_dropdown(String option) {
	        
	    }
	    
	    @Then("the user should be navigated to the {string} module page")
	    public void the_user_should_be_navigated_to_module_page(String option) {
	       
	    }
	    
	    @When("the user clicks the \"Register\" link")
	    public void clickRegisterLink() {
	        // Locate the "Register" link
	      
	        // Click the "Register" link
	       
	    }

	    @Then("the user should be redirected to the User Registration Page")
	    public void verifyRedirectionToRegistrationPage() {
	        // Wait for the page to load and verify the current URL
	       
	    }
	    
	   
	    
	    @When("the user clicks on the \"Sign out\" button")
	    public void clickSignOutButton() {
	        // Locate the "Sign out" button
	       
	        // Click the "Sign out" button
	      
	    }

	  

	    @Then("a message \"Logged out successfully\" should be displayed")
	    public void verifyLogoutMessage() {
	        // Locate the logout success message element
	      
	        // Assert that the logout message is displayed
	      
	        // Assert that the logout message text matches the expected message
	       
	    }
	    
	    @Then("the user should be redirected to the Home page")
	    public void theUserShouldBeRedirectedToHomePage() {
	        // Wait until the Home page is fully loaded (you can check for a specific element)
	       

	        // Verify if the current URL indicates that the user is on the Home page
	        
	    }

	    @Then("the user is not redirected to the home page")
		public void userIsNotRedirectedToHomePage() {

		}

	    
	    
}
