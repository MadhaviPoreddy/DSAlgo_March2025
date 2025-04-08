Feature: Navigation to Graph Data Structure Page

  Background: The user signs in to dsAlgo Portal
    Given the user is on the "Sign-In" page
    When the user enters valid credentials
    And the user clicks the "Login" button
    Then the user should be redirected to the Home Page

  Scenario: User navigates to the Graph page after signing in
    Given the user is on the "Home" page after sign in
    When the user clicks the "Getting Started" button in the Graph Panel
    Then the user should be directed to the "Graph" Data Structure Page

  Scenario: User navigates to the Graph page
    Given the user is on the "Graph" data structure page
    When the user clicks the "Graph topics" link
    Then the user should be redirected to the "Graph topics" page

  Scenario: User navigates to "Try Editor" page
    Given the user is on the "Graph topics" page
    When the user clicks "Try here" button
    Then The user should be redirected to a page having an try Editor with a run button to test

  Scenario: Verify python editor functionality using Excel
    Given the user is on the tryEditor page
    When the user executes code from Excel sheet "TryEditor"
    Then the output should be validated

  Scenario: User navigates to the Graph Representations page
    Given the user is on the "Graph topics" page
    When the user clicks the "Graph Representations" link
    Then the user should be redirected to the "Graph Representations" page

  Scenario: User navigates to "Try Editor" page
    Given the user is on the "Graph Representations" page
    When the user clicks "Try here" button
    Then The user should be redirected to a page having an try Editor with a run button to test

  Scenario: Verify python editor functionality using Excel
    Given the user is on the tryEditor page
    When the user executes code from Excel sheet "TryEditor"
    Then the output should be validated

  Scenario: Verify that user is not redirected to the home page when clicking the "NumpyNinja" link on the "Graph" page
    Given the user is on the "Graph" page
    When the user clicks the "NumpyNinja" logo on the top left corner
    Then the user is not redirected to the home page

  Scenario: User is not redirected to the home page when clicking the "NumpyNinja" link on the "Graph" topics
    Given the user is on the "Graph topics" page
    When the user clicks the "NumpyNinja" logo on the top left corner
    Then the user is not redirected to the home page

  Scenario: User is not redirected to the home page when clicking the "NumpyNinja" link on the "Graph Representations" topics
    Given the user is on the "Graph Representations" page
    When the user clicks the "NumpyNinja" logo on the top left corner
    Then the user is not redirected to the home page

  Scenario: User navigates to "Practice Questions" page
    Given the user is on the "Graph" page
    When the user clicks the "Practice Questions" button
    Then the user is able to view a blank page for Practice Questions

  Scenario: Verify that user sees the paragraph starts on a new line and is left-aligned after a table
    Given the user is on the "Graph Representations" page with a table followed by a paragraph
    When the user examine the paragraph positioning and alignment
    Then the user is not able to see the paragraph start on a new line with left aligned
