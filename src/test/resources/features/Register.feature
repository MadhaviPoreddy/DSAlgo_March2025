Feature: User Registration

  Background: The user is on the user registration page
  	Given The user is on the home page
  	When The user clicks on Register link
  	
  Scenario: Verify that user receives error message for all empty fields during registration
    Given The user is on Registration page
    When The user clicks Register button with all fields empty	
    Then The error "Please fill out this field." appears below Username textbox

  Scenario: Verify that user receives error message for empty Password field during registration
  	Given The user is on Registration page
    When The user clicks Register button after entering Username with other fields empty	
    Then The error message "Please fill out this field." appears below Password textbox
    
  Scenario: Verify that user receives error message for empty Password Confirmation field during registration
    Given The user is on Registration page
    When The user clicks Register button after entering Username and Password	
    Then The error message "Please fill out this field." appears below Password Confirmation textbox
  
  Scenario: Verify that user receives error message for empty Password field during registration
  	Given The user is on Registration page
    When The user clicks Register button after entering username and confirm password field
    Then The error message "Please fill out this field." appears below Password textbox
  
  Scenario: Verify that user receives error message for empty Password Confirmation field during registration
  	Given The user is on Registration page
    When The user clicks Register button after entering password and confirm password field
    Then The error "Please fill out this field." appears below Username textbox
    
  Scenario: Verify that user receives error message for invalid username field during registration
    Given The user is on Registration page
    When The user clicks Register button after entering space in username field and valid passwords
    Then The correct error message is not displayed
    
  Scenario: Verify that user receives error message for password too similar to username field during registration
  	Given The user is on Registration page	
    When The user clicks Register button after entering a password too similar to username
    Then The correct error message is not displayed
    
  Scenario: Verify that user receives error message for password field with less than eight characters during registration	
  	Given The user is on Registration page
    When The user clicks Register button after entering a password and confirm password less than eight characters	
    Then The correct error message is not displayed
    
  Scenario: Verify that user receives error message for password  with all numeric value during registration
  	Given The user is on Registration page	
    When The user clicks Register button after entering a password with numeric data with valid username 
    Then The correct error message is not displayed
    
  Scenario: Verify that user receives error message for commonly used password field during registration
  	Given The user is on Registration page
    When The user clicks Register button after entering commonly used passwords
    Then The correct error message is not displayed
    
  Scenario: Verify that user receives error message for mismatched Password and Password Confirmation field during registration	
  	Given The user is on Registration page
    When The user clicks Register button after entering valid username and different passwords in Password and Password Confirmation fields 	
    Then The user should able to see an pwd warning message "password_mismatch:The two password fields didn’t match."
    
  Scenario: Verify that user is able to land on Homepage after registration with valid fields	
  	Given The user is on Registration page
    When The user clicks Register button after entering  with valid username, password and password confirmation in related textboxes 	
    Then The user should be redirected to Home Page of DS Algo with message "New Account Created. You are logged in as "
    
  Scenario: Verify that user is able to redirected to the home page	
  	Given The user is on Registration page
    When The user clicks the NumpyNinja link on the top left corner	
    Then The user should be navigated to numpy ninja main page
    
  Scenario: Verify that user is navigated to login page when clicked on login link	
    Given The user is on Registration page
    When The user clicks on login link 	
    Then The user should be navigated to login page
    
  Scenario: Verify that user is navigated to login page when clicked on signin link	
    Given The user is on Registration page
    When The user clicks on Sign in link 	
    Then The user should be navigated to login page
    
    Scenario: Verify that user is allowed to enter x characters in user name
  	Given The user is on Registration page
    When The user clicks Register button after entering a username with more than x characters	
    Then The username field should only allow x charaters