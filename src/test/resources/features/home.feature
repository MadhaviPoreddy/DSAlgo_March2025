Feature: Access dsAlgo Portal

  Scenario: Verify that the user can open the dsAlgo Portal
    Given the user enters the correct dsAlgo portal URL
    Then the user should land on the dsAlgo portal homepage with Get Started button

  Scenario: Verify the Home page for a user without Sign in
    Given the user is on the dsAlgo Portal
    When the user clicks the "Get Started" button
    Then the user should be navigated to the Home page which displays the Register and Sign in links

  Scenario: Verify that user views Data Structures dropdown options before sign in
    Given the user is on the Home page before sign in
    When the user clicks the Data Structures dropdown
    Then the user is not able to see Data Structure Introduction in the dropdown

  Scenario: Verify that user is able to see a warning message while selecting "Arrays" from the dropdown without signing in
    Given the user is on the Home page before sign in
    When the user selects "Arrays" from the Data Structure dropdown without signing in
    Then the user should see a warning message "You are not logged in"

  Scenario: Verify that user is able to see a warning message while selecting "Linked List" from the dropdown without signing in
    Given the user is on the Home page before sign in
    When the user selects "Linked List" from the Data Structure dropdown without signing in
    Then the user should see a warning message "You are not logged in"

  Scenario: Verify that user is able to see a warning message while selecting "Stack" from the dropdown without signing in
    Given the user is on the Home page before sign in
    When the user selects "Stack" from the Data Structure dropdown without signing in
    Then the user should see a warning message "You are not logged in"

  Scenario: Verify that user is able to see a warning message while selecting "Queue" from the dropdown without signing in
    Given the user is on the Home page before sign in
    When the user selects "Queue" from the Data Structure dropdown without signing in
    Then the user should see a warning message "You are not logged in"

  Scenario: Verify that user is able to see a warning message while selecting "Tree" from the dropdown without signing in
    Given the user is on the Home page before sign in
    When the user selects "Tree" from the Data Structure dropdown without signing in
    Then the user should see a warning message "You are not logged in"

  Scenario: Verify that user is able to see a warning message while selecting "Graph" from the dropdown without signing in
    Given the user is on the Home page before sign in
    When the user selects "Graph" from the Data Structure dropdown without signing in
    Then the user should see a warning message "You are not logged in"

  Scenario: Verify that user is able to see a warning message on clicking "Get Started" button of "Data Structures-Introduction" without Sign in
    Given the user is on the Home page before sign in
    When the user clicks the Get Started button for "Data Structures-Introduction" without signing in
    Then the user should see a warning message "You are not logged in"

  Scenario: Verify that user is able to see a warning message on clicking "Get Started" button of "Arrays" without Sign in
    Given the user is on the Home page before sign in
    When the user clicks the Get Started button for "Arrays" without signing in
    Then the user should see a warning message "You are not logged in"

  Scenario: Verify that user is able to see a warning message on clicking "Get Started" button of "linked List" without Sign in
    Given the user is on the Home page before sign in
    When the user clicks the Get Started button for "Linked List" without signing in
    Then the user should see a warning message "You are not logged in"

  Scenario: Verify that user is able to see a warning message on clicking "Get Started" button of "Stack" without Sign in
    Given the user is on the Home page before sign in
    When the user clicks the Get Started button for "Stack" without signing in
    Then the user should see a warning message "You are not logged in"

  Scenario: Verify that user is able to see a warning message on clicking "Get Started" button of "Queue" without Sign in
    Given the user is on the Home page before sign in
    When the user clicks the Get Started button for "Queue" without signing in
    Then the user should see a warning message "You are not logged in"

  Scenario: Verify that user is able to see a warning message on clicking "Get Started" button of "Tree" without Sign in
    Given the user is on the Home page before sign in
    When the user clicks the Get Started button for "Tree" without signing in
    Then the user should see a warning message "You are not logged in"

  Scenario: Verify that user is able to see a warning message on clicking "Get Started" button of "Graph" without Sign in
    Given the user is on the Home page before sign in
    When the user clicks the Get Started button for "Graph" without signing in
    Then the user should see a warning message "You are not logged in"

  Scenario: Verify that user views Data Structures dropdown options after sign in
    Given the user is on the Home page after sign in
    When the user clicks the Data Structures dropdown
    Then the dropdown submenus should match the expected items from "dropdown" sheet

  Scenario: Verify that user is able to navigate to "Arrays" data structure page
    Given the user is on the Home page after sign in
    When the user selects "Arrays" from the Data Structures dropdown
    Then the user should be directed to the "Array" Data Structure Page

  Scenario: Verify that user is able to navigate to "Linked List" data structure page
    Given the user is on the Home page after sign in
    When the user selects "Linked List" from the Data Structures dropdown
    Then the user should be directed to the "Linked List" Data Structure Page

  Scenario: Verify that user is able to navigate to "Stack" data structure page
    Given the user is on the Home page after sign in
    When the user selects "Stack" from the Data Structures dropdown
    Then the user should be directed to the "Stack" Data Structure Page

  Scenario: Verify that user is able to navigate to "Queue" data structure page
    Given the user is on the Home page after sign in
    When the user selects "Queue" from the Data Structures dropdown
    Then the user should be directed to the "Queue" Data Structure Page

  Scenario: Verify that user is able to navigate to "Tree" data structure page
    Given the user is on the Home page after sign in
    When the user selects "Tree" from the Data Structures dropdown
    Then the user should be directed to the "Tree" Data Structure Page

  Scenario: Verify that user is able to navigate to "Graph" data structure page
    Given the user is on the Home page after sign in
    When the user selects "Graph" from the Data Structures dropdown
    Then the user should be directed to the "Graph" Data Structure Page

  Scenario: Verify that the user is able to sign out successfully
    Given the user is on the Home page after sign in
    When the user clicks on the "Sign out" button
    Then the user should be redirected to the Home page
    And a message "Logged out successfully" should be displayed

  Scenario: Verify that the user is able to be redirected to the home page
    Given the user is on the Home page before sign in
    When the user clicks the "NumpyNinja" logo on the "Home" page
    Then the user should be redirected to the home page

  Scenario: Verify that user navigates to the Sign-In page from the Home Page
    Given the user is on the Home page before sign in
    When the user clicks the "Sign in" link
    Then the user should be redirected to the "login" page

  Scenario: Verify that user navigates to the Register page from the Home Page
    Given the user is on the Home page before sign in
    When the user clicks the "Register" link
    Then the user should be redirected to the "register" page
