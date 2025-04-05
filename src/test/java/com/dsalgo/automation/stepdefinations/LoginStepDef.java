package com.dsalgo.automation.stepdefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef {
	
	 	@Given("the user is on the DS Algo Home Page")
	    public void theUserIsOnHomePage() {
	        // Initialize the WebDriver (e.g., ChromeDriver)
	        
	        // Navigate to the DS Algo Home Page
	       
	    }

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
	    

	    @When("the user clicks the \"Login\" button with empty \"Username\" and \"Password\" fields")
	    public void theUserClicksLoginWithEmptyFields() {
	        // Locate the "Username" and "Password" input fields
	       
	        // Ensure the fields are empty
	       
	        // Locate the "Login" button and click it
	        
	    }

	    @Then("the user should see an error message \"Please fill out this field.\" below the \"Username\" textbox")
	    public void theUserSeesErrorMessage() {
	        // Locate the error message element below the "Username" field
	        
	        // Assert that the error message is displayed
	       
	        // Assert that the error message text matches the expected message
	       
	    }
	    

	    @When("the user enters a valid \"Username\" and leaves the \"Password\" field empty")
	    public void theUserEntersUsernameWithEmptyPassword() {
	        // Locate the "Username" and "Password" input fields
	       
	        // Clear any existing text in the fields
	       
	        // Enter a valid username
	      
	        // Leave the password field empty
	    }

	  

	    @Then("an error message \"Please fill out this field.\" should appear below the \"Password\" textbox")
	    public void theUserSeesPasswordErrorMessage() {
	        // Locate the error message element below the "Password" field
	      
	        // Assert that the error message is displayed
	     
	        // Assert that the error message text matches the expected message
	    
	    }
	    
	    @When("the user enters a valid password and leaves the \"Username\" field empty")
	    public void theUserEntersPasswordWithEmptyUsername() {
	        // Locate the "Username" and "Password" input fields
	       
	        // Clear any existing text in the fields
	       
	        // Leave the username field empty
	        // Enter a valid password
	       

	    }

	   

	    @Then("an error message \"Please fill out this field.\" should appear below the \"Username\" textbox")
	    public void theUserSeesUsernameErrorMessage() {
	        // Locate the error message element below the "Username" field
	       
	        // Assert that the error message is displayed
	       
	        // Assert that the error message text matches the expected message
	        
	    }
	    
	    @When("the user enters an invalid username and a valid password")
	    public void theUserEntersInvalidUsernameWithValidPassword() {
	        // Locate the "Username" and "Password" input fields
	        
	        // Clear any existing text in the fields
	      
	        // Enter an invalid username
	      
	        // Enter a valid password
	       
	    }

	   

	    @Then("the user should see an error message \"Invalid username and password\"")
	    public void theUserSeesInvalidusernamepasswordErrorMessage() {
	        // Locate the error message element
	        
	        // Assert that the error message is displayed
	       
	        // Assert that the error message text matches the expected message
	       
	    }
	    
	    @When("the user enters a valid username and password")
	    public void enterValidCredentials() {
	        // Locate the "Username" and "Password" input fields
	       
	        // Clear any existing text in the fields
	      
	        // Enter a valid username
	  
	        // Enter a valid password
	     
	    }

	 
	    

	    @Then("a message \"You are logged in\" should be displayed")
	    public void verifyLoginMessage() {
	        // Locate the login message element
	      
	        // Assert that the login message is displayed
	       
	        // Assert that the login message text matches the expected message
	        
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
	    
	    @When("the user clicks the \"NumpyNinja\" link on the top left corner")
	    public void clickNumpyNinjaLink() {
	        // Locate the "NumpyNinja" link
	       
	        // Click the "NumpyNinja" link
	        
	    }

	    @Then("the user is not redirected to the home page")
	    public void verifyNotRedirectedToHomePage() {
	        // Wait for the page to load and verify the current URL
	       
	        // Assert that the current URL does not contain the home page URL
	       
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

}
