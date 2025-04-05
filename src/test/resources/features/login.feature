Feature: Navigation to Sign-In Page

  Scenario: User navigates to the Sign-In page from the Home Page
    Given the user is on the DS Algo Home Page
    When the user clicks the "Sign in" link
    Then the user should be redirected to the Sign-In page

  Scenario: Display error message for empty fields during login
    Given the user is on the DS Algo Sign-In Page
    When the user clicks the "Login" button with empty "Username" and "Password" fields
    Then the user should see an error message "Please fill out this field." below the "Username" textbox

  Scenario: Display error message for empty Password field during login
    Given the user is on the DS Algo Sign-In Page
    When the user enters a valid "Username" and leaves the "Password" field empty
    And the user clicks the "Login" button
    Then an error message "Please fill out this field." should appear below the "Password" textbox

  Scenario: Display error message for empty Username field during login
    Given the user is on the DS Algo Sign-In Page
    When the user enters a valid password and leaves the "Username" field empty
    And the user clicks the "Login" button
    Then an error message "Please fill out this field." should appear below the "Username" textbox

  Scenario: Display error message for invalid username during login
    Given the user is on the DS Algo Sign-In Page
    When the user enters an invalid username and a valid password
    And the user clicks the "Login" button
    Then the user should see an error message "Invalid username and password"

  Scenario: Display error message for invalid password during login
    Given the user is on the DS Algo Sign-In Page
    When the user enters a valid username and an invalid password
    And the user clicks the "Login" button
    Then the user should see an error message "Invalid username and password"

  Scenario: Successful login with valid credentials
    Given the user is on the DS Algo Sign-In Page
    When the user enters a valid username and password
    And the user clicks the "Login" button
    Then the user should be redirected to the Data Structure Home Page
    And a message "You are logged in" should be displayed
   
 
  Scenario: User navigates to the Registration Page from the Sign-In Page
    Given the user is on the DS Algo Sign-In Page
    When the user clicks the "Register" link
    Then the user should be redirected to the User Registration Page
    
   Scenario: User clicks 'NumpyNinja' link and is redirected to the home page
    Given the user is on the DS Algo Sign-In Page
    When the user clicks the "NumpyNinja" link on the top left corner
    Then the user is not redirected to the home page

  Scenario: Verify that the user is able to sign out successfully
    Given the user is on the DS Algo Sign-In Page
    When the user clicks on the "Sign out" button
    Then the user should be redirected to the Home page
    And a message "Logged out successfully" should be displayed

