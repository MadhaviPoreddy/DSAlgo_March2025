Feature: Queue

  Background: 
    Given the user is on the DS Algo Sign in Page
    When the user enters a valid credentials and click on login
    And The user clicks on get started button for Queue on homepage


  Scenario: Verify that user is able to navigate to Implementation of Queue in Python page
  	Given The User is on Queue page
    When The user clicks on Implementation of Queue in Python link
    Then The User should be navigated to Implementation of Queue in Python page

  Scenario: Verify that user is able to navigate to Practice questions page
    Given The User is on Implementation of Queue in Python page
    When The user clicks on Practice questions link
    Then The User should be navigated to Practice Questions page
 
  Scenario: Verify that user is able to navigate to Code executor page
    Given The User is on Implementation of Queue in Python page
    When The user clicks on Try Here button
    Then The User should be navigated to the CodeExecutor Editor Page

  Scenario: Verify TryEditor with empty code
    Given The User is on Implementation of Queue Try Editor Page
    When The user clicks the Run Button without entering the code in Try Editor
    Then The user is not able to see an error message on try Editor page

  Scenario: Verify TryEditor with valid code
    Given The User is on Implementation of Queue Try Editor Page
    When The user enters a valid Python code in Editor and click on the Run button
    Then The user should be able to execute the code

  Scenario: Verify TryEditor with invalid code
    Given The User is on Implementation of Queue Try Editor Page
    When The user enters an invalid code in Editor and click on the Run button
    Then The user should get an error message after excuting the code

  Scenario: Verify that user is able to navigate to Implementation using collections.deque page
  	Given The User is on Queue page
    When The user clicks on Implementation using collections.deque link
    Then The User should be navigated to Implementation using collections.deque page

  Scenario: Verify that user is able to navigate to Practice questions page
    Given The User is on Implementation using collections.deque page
    When The user clicks on Practice questions link
    Then The User should be navigated to Practice Questions page

  Scenario: Verify that user is able to navigate to Code executor page
    Given The User is on Implementation using collections.deque page
    When The user clicks on Try Here button
    Then The User should be navigated to the CodeExecutor Editor Page

  Scenario: Verify TryEditor with empty code
    Given The User is on Implementation using collections.deque Try Editor Page
    When The user clicks the Run Button without entering the code in Try Editor
    Then The user is not able to see an error message on try Editor page
    
  Scenario: Verify TryEditor with valid code
    Given The User is on Implementation using collections.deque Try Editor Page
    When The user enters a valid Python code in Editor and click on the Run button
    Then The user should be able to execute the code

  Scenario: Verify TryEditor with invalid code
    Given The User is on Implementation using collections.deque Try Editor Page
    When The user enters an invalid code in Editor and click on the Run button
    Then The user should get an error message after excuting the code

  Scenario: Verify that user is able to navigate to Implementation using array page
    Given The User is on Queue page
    When The user clicks on Implementation using array link
    Then The User should be navigated to Implementation using array page

  Scenario: Verify that user is able to navigate to Practice questions page
    Given The User is on Implementation using array page
    When The user clicks on Practice questions link
    Then The User should be navigated to Practice Questions page

  Scenario: Verify that user is able to navigate to Code executor page
    Given The User is on Implementation using array page
    When The user clicks on Try Here button
    Then The User should be navigated to the CodeExecutor Editor Page

  Scenario: Verify TryEditor with empty code
    Given The User is on Implementation using array Try Editor Page
    When The user clicks the Run Button without entering the code in Try Editor
    Then The user is not able to see an error message on try Editor page
    
  Scenario: Verify TryEditor with valid code
    Given The User is on Implementation using array Try Editor Page
    When The user enters a valid Python code in Editor and click on the Run button
    Then The user should be able to execute the code

  Scenario: Verify TryEditor with invalid code
    Given The User is on Implementation using array Try Editor Page
    When The user enters an invalid code in Editor and click on the Run button
    Then The user should get an error message after excuting the code

  Scenario: Verify that user is able to navigate to Queue Operations page
  	Given The User is on Queue page
    When The user clicks on Queue Operations link
    Then The User should be navigated to Queue Operations page

  Scenario: Verify that user is able to navigate to Practice questions page
    Given The User is on Queue Operations page
    When The user clicks on Practice questions link
    Then The User should be navigated to Practice Questions page

  Scenario: Verify that user is able to navigate to Code executor page
    Given The User is on Queue Operations page
    When The user clicks on Try Here button
    Then The User should be navigated to the CodeExecutor Editor Page

  Scenario: Verify TryEditor with empty code
    Given The User is on Queue Operations Try Editor Page
    When The user clicks the Run Button without entering the code in Try Editor
    Then The user is not able to see an error message on try Editor page
    
  Scenario: Verify TryEditor with valid code
    Given The User is on Queue Operations Try Editor Page
    When The user enters a valid Python code in Editor and click on the Run button
    Then The user should be able to execute the code

  Scenario: Verify TryEditor with invalid code
    Given The User is on Queue Operations Try Editor Page
    When The user enters an invalid code in Editor and click on the Run button
    Then The user should get an error message after excuting the code