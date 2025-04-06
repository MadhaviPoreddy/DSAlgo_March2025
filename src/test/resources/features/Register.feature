Feature: User Registration

  Background: The user is on the user registration page

  Scenario: Verify that user receives error message for all empty fields during registration	
    When The user clicks Register button with all fields empty	
    Then The error "Please fill out this field." appears below Username textbox

  Scenario: Verify that user receives error message for empty Password field during registration	
    When The user clicks Register button after entering Username with other fields empty	
    Then The error message "Please fill out this field." appears below Password textbox
    
  Scenario: Verify that user receives error message for empty Password Confirmation field during registration	
    When The user clicks Register button after entering Username and Password	
    Then The error message "Please fill out this field." appears below Password Confirmation textbox
  
  Scenario: Verify that user receives error message for invalid username field during registration
    When The user clicks Register button after entering a username with spaces	
    Then The error "Please fill out this field." appears below Username textbox
    
  Scenario: Verify that user receives error message for empty Password Confirmation field during registration
    When The user clicks Register button after entering username and confirm password field
    Then The error message "Please fill out this field." appears below  Password  textbox
  
  Scenario: Verify that user receives error message for empty Password Confirmation field during registration	
    When The user clicks Register button after entering password and confirm password field
    Then The error "Please fill out this field." appears below Username textbox
    
  Scenario: Verify that user receives error message for invalid username field during registration
    When The user clicks Register button after entering a username with more than x characters	
    Then The username field should only allow x charaters
    
  Scenario: Verify that user receives error message for invalid password field during registration	
    When The user clicks Register button after entering a password too similar to username	
    Then The correct error message is not displayed
    
  Scenario: Verify that user receives error message for invalid password field during registration	
    When The user clicks Register button after entering a password less than eight characters	
    Then The correct error message is not displayed
    
  Scenario: Verify that user receives error message for invalid password field during registration	
    When The user clicks Register button after entering a password with numeric data 	
    Then The correct error message is not displayed
    
  Scenario: Verify that user receives error message for invalid password field during registration
    When The user clicks Register button after entering commonly used password
    Then The correct error message is not displayed
    
  Scenario: Verify that user receives error message for mismatched Password and Password Confirmation field during registration	
    When The user clicks Register button after entering different passwords in Password and Password Confirmation fields 	
    Then The user should able to see an pwd warning message "password_mismatch:The two password fields didn’t match."
    
  Scenario: Verify that user is able to land on Homepage after registration with valid fields	
    When The user clicks Register button after entering  with valid username, password and password confirmation in related textboxes 	
    Then The user should be redirected to Home Page of DS Algo with message "New Account Created. You are logged in as <ID>"
    
  Scenario: Verify that user is able to redirected to the home page	
    When The user clicks the NumpyNinja link on the top left corner	
    Then The user is not able to land on home page
    
  Scenario: Verify that user is navigated to login page when clicked on login link	
    When The user clicks on login link 	
    Then The user should be navigated to login page
    
  Scenario: Verify that user is navigated to login page when clicked on login link	
    When The user clicks on Sign in link 	
    Then The user should be navigated to login page