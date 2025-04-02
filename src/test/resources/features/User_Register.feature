Feature: User Registration

  Background: The user is on the user registration page
    Given The user is on the home page
    When The user clicks on Register link
    Then the user should be navigated to Registration page

  Scenario: Successful Registration with valid details
  	Given The user is on the user registration page
    When The user enters valid registration details and submits the form
    Then The user should be registered successfully
