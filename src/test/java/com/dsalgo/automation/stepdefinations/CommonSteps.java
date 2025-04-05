package com.dsalgo.automation.stepdefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CommonSteps {
	
	@Given("the user is on the Home page")
    public void theUserIsOnHomePage() {
		 // Initialize the WebDriver (e.g., ChromeDriver)
        
    	
        // Navigate to the Home page
       
    }
	

    @Given("the user is on the DS Algo Sign-In Page")
    public void theUserIsOnSignInPage() {
        // Initialize the WebDriver (e.g., ChromeDriver)
       
        // Navigate to the DS Algo Sign-In Page
       
    }
    
    @When("the user clicks the \"Login\" button")
    public void theUserClicksLoginButton() {
        // Locate the "Login" button
   
        // Click the "Login" button
      
    }
    
    @Then("the user should be redirected to the Data Structure Home Page")
    public void verifyRedirectionToHomePage() {
        // Wait for the page to load and verify the current URL
       
    }
}
