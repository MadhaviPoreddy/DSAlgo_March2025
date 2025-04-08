Feature: Navigation to Sign-In Page

  Scenario: User navigates to the Sign-In page from the Home Page
    Given the user is on the "Home" page before sign in
    When the user clicks the "Sign in" link
    Then the user should be redirected to the Sign-In page

  Scenario: Login with various combinations of username and password from Excel
    Given the user is on the "Sign-In" page
    When the user performs login using Excel sheet "LoginData"
    Then login results should be validated based on Excel data
    And if login is successful, the user should be redirected to the Home Page

  Scenario: User views Data Structures dropdown options after sign in
    Given the user is on the "Home" page after sign in
    When the user clicks the Data Structures dropdown after sign in
    Then the user is not able to see Data Structure Introduction in the dropdown

  Scenario Outline: Selecting an option from the Data Structures dropdown after sign in
    Given the user is on the "Home" page after sign in
    When the user selects "<option>" from the Data Structure dropdown after signing in
    Then the user should be navigated to the "<option>" module page

    Examples: 
      | option      |
      | Array       |
      | Linked List |
      | Stack       |
      | Queue       |
      | Tree        |
      | Graph       |

  Scenario: User navigates to the Registration Page from the Sign-In Page
    Given the user is on the "Sign-In" page
    When the user clicks the "Register" link
    Then the user should be redirected to the User Registration Page

  Scenario: Verify that the user is able to sign out successfully
    Given the user is on the "Sign-In" page
    When the user clicks on the "Sign out" button
    Then the user should be redirected to the Home page
    And a message "Logged out successfully" should be displayed

  Scenario: Verify that the user is able to be redirected to the home page
    Given the user is on the "Sign-In" page
    When the user clicks the "NumpyNinja" logo on the top left corner
    Then the user is not redirected to the home page
