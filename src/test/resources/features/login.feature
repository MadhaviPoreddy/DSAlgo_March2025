Feature: Navigation to Sign-In Page

  Scenario: Verify that user can land on the Home page after entering valid Username and Password
    Given the user is on the DS Algo Sign in Page
    When the user enters a valid username and password
    And the user clicks the login button
    Then the user should land on the Home Page with the message "You are logged in"

  Scenario: Verify that user receives error message for empty Password field during Login
    Given the user is on the DS Algo Sign in Page
    When the user enters username and leaves the Password field empty
    And the user clicks the login button
    Then the user should see the error message "Please fill out this field." below the Password textbox

  Scenario: Verify that user receives error message for empty Username field during Login
    Given the user is on the DS Algo Sign in Page
    When the user enters password and leaves the Username field empty
    And the user clicks the login button
    Then the user should see the error message "Please fill out this field." below the Username textbox

  Scenario: Verify that user receives error message for invalid Username field during Login
    Given the user is on the DS Algo Sign in Page
    When the user enters an invalid username and a valid password
    And the user clicks the login button
    Then the user should see an error message "Invalid Username and Password"

  Scenario: Verify that user receives error message for invalid Password field during Login
    Given the user is on the DS Algo Sign in Page
    When the user enters a valid username and an invalid password
    And the user clicks the login button
    Then the user should see an error message "Invalid Username and Password"

  Scenario: User navigates to the Registration Page from the Sign-In Page
    Given the user is on the DS Algo Sign in Page
    When the user clicks the "Register" link from signin page
    Then the user should be redirected to the User Registration Page

  Scenario: Verify that the user is able to be redirected to the home page
    Given the user is on the DS Algo Sign in Page
    When the user clicks the "NumpyNinja" logo on the "login" page
    Then the user should be redirected to the home page
