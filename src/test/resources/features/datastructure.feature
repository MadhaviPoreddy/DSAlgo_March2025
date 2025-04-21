Feature: Navigation to Data Structures - Introduction Page

  Background: 
    Given the user is on the DS Algo Sign in Page
    When the user enters a valid credentials and click on login

  Scenario: Verify that user is able to navigate to Data Structures-Introduction page
    Given the user is on the "Home" page
    When the user clicks the Getting Started button in "Data Structures-Introduction"
    Then the user should land on the "Data Structures-Introduction" Page

  Scenario: Verify that user navigates to Time Complexity page
    Given the user is on the section "Data Structures-Introduction" page
    When the user clicks the "Time Complexity" link
    Then the user should be redirected to the "Time Complexity" page of Data Structures - Introduction

  Scenario: Verrify that user navigates to Practice Questions page
    Given the user is on the data structure "Time Complexity" page
    When the user clicks the "Data Structures-Introduction" "Practice Questions" link
    Then the user is redirected to the blank page of "data structures-introduction" "Practice Questions"

  Scenario: Verify that user is able to navigate to "try Editor" page
    Given the user is on the data structure "Time Complexity" page
    When the user clicks on the "Try Here" button
    Then the user should be redirected to a page having a "tryEditor" with a Run button to test

  Scenario: Verify that an error is displayed when no code is entered and the Run button is clicked
    Given the user is on the "Data Structures-Introduction" "Try Editor" page
    And the Try Editor is empty for "Data Structures-Introduction"
    When the user clicks on the "Run" button
    Then the user should see an error message

  Scenario: Verify error message for invalid Python code
    Given the user is on the "Data Structures-Introduction" "Try Editor" page
    And the user enters invalid python code
    When the user clicks on the "Run" button
    Then the user should see an error message in an alert window for data structure

  Scenario: Verify output for valid Python code
    Given the user is on the "Data Structures-Introduction" "Try Editor" page
    And the user enters valid python code
    When the user clicks on the "Run" button
    Then the user should be able to see output in the console

  Scenario: Verify that user is redirected to the home page when clicking the "NumpyNinja" link on the "Data Structures - Introduction" page
    Given the user is on the section "Data Structures-Introduction" page
    When the user clicks the "NumpyNinja" logo on the "Data Structures-Introduction" page
    Then the user should be redirected to the home page
