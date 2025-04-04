Feature: User Registration

  Background: The user is on the user registration page
    Given The user is on the home page
    When The user clicks on Register link
    Then the user should be navigated to Registration page
# user is on registr page

  Scenario: Verify that user receives error message for all empty fields during registration	
    When The user clicks Register button with all fields empty	
    Then The error "Please fill out this field." appears below Username textbox
 	