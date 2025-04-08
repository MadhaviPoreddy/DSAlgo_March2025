Feature: Access dsAlgo Portal

  Scenario: Verify that the user can open the dsAlgo Portal
    Given the user has a web browser open
    When the user enters the correct dsAlgo portal URL
    Then the user should land on the dsAlgo portal homepage with Get Started button

  Scenario: Navigate to Home Page Without Signing In
    Given the user is on the dsAlgo Portal
    When the user clicks the "Get Started" button
    Then the user should be navigated to the Home page which displays the "Register" and "Sign in" links

  Scenario: User views Data Structures dropdown options without signing in
    Given the user is on the "Home" page before sign in
    When the user clicks the "Data Structures" dropdown without signing in
    Then the user is not able to see Data Structure Introduction

  Scenario Outline: Selecting an option from the Data Structures dropdown without signing in
    Given the user is on the "Home" page before sign in
    When the user selects "<option>" from the Data Structure dropdown without signing in
    Then the user should see a warning message "You are not logged in" for dropdown

    Examples: 
      | option      |
      | Array       |
      | Linked List |
      | Stack       |
      | Queue       |
      | Tree        |
      | Graph       |

  Scenario Outline: Display warning message when accessing "<section>" without signing in
    Given the user is on the "Home" page before sign in
    When the user clicks the "Get Started" button for "<section>" without signing in
    Then the user should see a warning message "You are not logged in"

    Examples: 
      | section                      |
      | Data Structures-Introduction |
      | Array                        |
      | Linked List                  |
      | Stack                        |
      | Queue                        |
      | Tree                         |
      | Graph                        |

  Scenario: Verify that the user is able to be redirected to the home page
    Given the user is on the "Home" page before sign in 
    When the user clicks the "NumpyNinja" logo on the top left corner
    Then the user should land on the home page
