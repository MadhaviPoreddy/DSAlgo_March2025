Feature: Navigation to Graph Data Structure Page

  Background: 
    Given the user is on the DS Algo Sign in Page
    And the user enters a valid credentials and click on login
    And the user is redirected to the Home page

  Scenario: Verify that user navigates to the Graph page after signing in
    Given the user is on the "Home" page
    When the user clicks the Getting Started button in "Graph"
    Then the user should land on the "Graph" Page

  Scenario: Verify that user navigates to the Graph page
    Given the user is on the "Graph" data structure page
    When the user clicks the "Graph" link
    Then the user should be redirected to the "Graph" subtopics page

  Scenario: User navigates to "Try Editor" page
    Given the user is on the "Graph" subtopics page
    When the user clicks on the "Graph Try here" button
    Then The user should be redirected to a page having an "tryEditor" with a run button to test

  Scenario: Verify that an error is displayed when no code is entered and the Run button is clicked
    Given the user is on the "Graph" "Try Editor" page
    And the Try Editor is empty for "Graph"
    When the user clicks on the graph "Run" button
    Then the user should see an error message for graph

  Scenario: Verify error message for invalid Python code
    Given the user is on the "Graph" "Try Editor" page
    And the user enters invalid python code for Graph
    When the user clicks on the "Graph Run" button
    Then the user should see an error message in an alert window

  Scenario: Verify output for valid Python code
    Given the user is on the "Graph" "Try Editor" page
    And the user enters valid python code for Graph
    When the user clicks on the "Graph Run" button
    Then the user should be able to see output in the console for Graph

  Scenario: Verify user navigates to the Graph Representations page
    Given the user is on the "Graph" subtopics page
    When the user clicks the "Graph Representations" link
    Then the user should be redirected to the "Graph Representations" subtopics page

  Scenario: Verify user navigates to "Try Editor" page
    Given the user is on the "Graph Representations" subtopics page
    When the user clicks on the "Graph Representations Try here" button
    Then the user should be redirected to a "tryEditor" page with a run button to test

  Scenario: Verify that user is redirected to the home page when clicking the "NumpyNinja" link on the "Graph" page
    Given the user is on the section "Graph" page
    When the user clicks the "NumpyNinja" logo on the "Graph" page
    Then the user should be redirected to the home page

  Scenario: User navigates to "Practice Questions" page
    Given the user is on the "Graph" data structure page
    When the user clicks the "Graph" "Practice Questions" link
    Then the user is redirected to the blank page of "graph" "Practice Questions"

  Scenario: Verify that user sees the paragraph starts on a new line and is left-aligned after a table
    Given the user is on the "Graph Representations" subtopics page
    When the user examine the paragraph positioning and alignment
    Then the paragraph should not overlap with the matrix table
