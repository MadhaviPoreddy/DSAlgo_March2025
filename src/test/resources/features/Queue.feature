Feature: Queue

 Scenario: Login into DsAlgo application
    Given the user is on the DS Algo Sign-In Page
    When the user clicks the Login button
    Then user should be redirected to the Home Page

  Scenario: Navigate to Queue page
    Given the user is on the Home page
    When the user clicks the Get Started button for Queues
    Then the user should navigated to Queue page

  Scenario: Verify that user is able to navigate to Implementation of Queue in Python page
    When The user clicks on Implementation of Queue in Python link
    Then The User should be navigated to Implementation of Queue in Python page

  Scenario: Verify that user is able to navigate to Practice questions page
    Given The User is on Implementation of Queue in Python page
    When The user clicks on Practice questions link
    Then The User should be navigated to Practice Questions page

  Scenario: Verify that dequeue text should navigate to another page
    Given The User is on Implementation of Queue in Python page
    When The user is clicks on "dequeue" red color text
    Then The User should be navigated to dequeue link page

  Scenario: Verify that user is able to navigate to Code executor page
    Given The User is on Implementation of Queue in Python page
    When The user clicks on Try Here button
    Then The User should be navigated to the CodeExecutor Editor Page

  Scenario: Verify TryEditor
    Given The User is on Try Editor Page
    When The user clicks the Run Button without entering the code in the Editor
    Then The user is not able to see an error message

  Scenario: Verify TryEditor
    Given The User is on Try Editor Page
    When The user enters a valid Python code in Editor and click  on the Run button
    Then The user should be able to execute the code

  Scenario: Verify TryEditor
    Given The User is on Try Editor Page
    When The user enters an invalid code in Editor and click on the Run button
    Then The user should get an error message after excuting the code

  Scenario: Verify that user is able to navigate to Implementation using collections.deque page
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

  Scenario: Verify TryEditor
    Given The User is on Try Editor Page
    When The user clicks the Run Button without entering the code in the Editor
    Then The user is not able to see an error message

  Scenario: Verify TryEditor
    Given The User is on Try Editor Page
    When The user enters a valid Python code in Editor and click  on the Run button
    Then The user should be able to execute the code

  Scenario: Verify TryEditor
    Given The User is on Try Editor Page
    When The user enters an invalid code in Editor and click on the Run button
    Then The user should get an error message after excuting the code

  Scenario: Verify that user is able to navigate to Implementation using array page
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

  Scenario: Verify TryEditor
    Given The User is on Try Editor Page
    When The user clicks the Run Button without entering the code in the Editor
    Then The user is not able to see an error message

  Scenario: Verify TryEditor
    Given The User is on Try Editor Page
    When The user enters a valid Python code in Editor and click  on the Run button
    Then The user should be able to execute the code

  Scenario: Verify TryEditor
    Given The User is on Try Editor Page
    When The user enters an invalid code in Editor and click on the Run button
    Then The user should get an error message after excuting the code

  Scenario: Verify that user is able to navigate to Queue Operations page
    When The user clicks on Queue Operations link
    Then The User should be navigated to Queue Operations page should be displayed

  Scenario: Verify that user is able to navigate to Practice questions page
    Given The User is on Queue Operations page
    When The user clicks on Practice questions link
    Then The User should be navigated to Practice Questions page

  Scenario: Verify that user is able to navigate to Code executor page
    Given The User is on Queue Operations page
    When The user clicks on Try Here button
    Then The User should be navigated to the CodeExecutor Editor Page

  Scenario: Verify TryEditor
    Given The User is on Try Editor Page
    When The user clicks the Run Button without entering the code in the Editor
    Then The user is not able to see an error message

  Scenario: Verify TryEditor
    Given The User is on Try Editor Page
    When The user enters a valid Python code in Editor and click  on the Run button
    Then The user should be able to execute the code

  Scenario: Verify TryEditor
    Given The User is on Try Editor Page
    When The user enters an invalid code in Editor and click on the Run button
    Then The user should get an error message after excuting the code