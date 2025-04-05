Feature: Navigation to Data Structures - Introduction Page

  Scenario: User navigates to Data Structures - Introduction page after signing in
    Given the user is on the dsAlgo Portal Sign-In Page
    When the user enters valid credentials
    And the user clicks the "Login" button
    Then the user should be redirected to the Home Page
    When the user clicks the "Getting Started" button in the Data Structures - Introduction panel
    Then the user should be directed to the "Data Structures - Introduction" Page
    
  Scenario: "Data Structures - Introduction" option is unavailable in the dropdown menu
    Given the user is on the dsAlgo Portal Sign-In Page
    When the user enters valid credentials
    And the user clicks the "Login" button
    Then the user should be redirected to the Home Page
    When the user attempts to select "Data Structures - Introduction" from the dropdown menu
    Then the "Data Structures - Introduction" option should not be visible in the dropdown menu
    
  Scenario: User navigates to Time Complexity page
    Given the user is on the "Data Structures - Introduction" page
    When the user clicks the "Time Complexity" link
    Then the user should be redirected to the "Time Complexity" page of Data Structures - Introduction
    
  Scenario: User navigates to Practice Questions page
    Given the user is on the "Time Complexity" page
    When the user clicks the "Practice Questions" button
    Then the user is redirected to the blank page of "Practice Questions"
    
    
  Scenario: User navigates to "try editor" page
  	Given the user is on the "Time Complexity" page
  	When the user clicks the "Try Here" button
  	Then the user should be redirected to a page with a Try Editor
    And the Try Editor should contain a "Run" button to test the code
    
  Scenario: Display error message when running empty code
    Given the user is signed in to the dsAlgo Portal
    And the user is on the "tryEditor" page
    When the user clicks the "Run" button without entering any code
    Then an error message is not displayed
    
   Scenario: Display error for invalid Python code
    Given the user is signed in to the dsAlgo Portal
    And the user is on the "tryEditor" page
    When the user enters invalid Python code into the editor
    And the user clicks the "Run" button
    Then an error alert should be displayed
    
  Scenario: Execute valid Python code
    Given the user is signed in to the dsAlgo Portal
    And the user is on the "tryEditor" page
    When the user enters valid Python code into the editor
    And the user clicks the "Run" button
    Then the output should be displayed in the console
    
 	Scenario: Redirect to home page via NumpyNinja logo
    Given the user is signed in to the dsAlgo Portal
    And the user is on the "Data Structures Introduction" page
    When the user clicks the NumpyNinja logo
    Then the user is not redirected to home page