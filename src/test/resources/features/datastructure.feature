Feature: Navigation to Data Structures - Introduction Page

  Background: The user signs in to dsAlgo Portal
    Given the user is on the "Sign-In" page
    When the user enters valid credentials
    And the user clicks the "Login" button
    Then the user should be redirected to the Home Page

  Scenario: Verify that user is able to navigate to "Data Structures - Introduction" page
    Given the user is on the "Home" page after sign in
    When the user clicks the "Getting Started" button in Data Structures - Introduction
    Then the user should land on the "Data Structures - Introduction" Page

  Scenario: User navigates to Time Complexity page
    Given the user is on the "Data Structures - Introduction" page
    When the user clicks the "Time Complexity" link
    Then the user should be redirected to the "Time Complexity" page of Data Structures - Introduction

  Scenario: User navigates to Practice Questions page
    Given the user is on the "Time Complexity" page
    When the user clicks the "Practice Questions" button
    Then the user is redirected to the blank page of "Practice Questions"

  Scenario: Verify that user is able to navigate to "try Editor" page
    Given the user is on the "Time Complexity" page
    When the user clicks the "Try Here" button
    Then the user should be redirected to a page having a try Editor with a Run button to test

  Scenario: Verify python editor functionality using Excel
    Given the user is on the tryEditor page
    When the user executes code from Excel sheet "TryEditor"
    Then the output should be validated

  Scenario: Verify that user is not redirected to the home page when clicking the "NumpyNinja" link on the "Data Structures - Introduction" page
    Given the user is on the "Data Structures - Introduction" page
    When the user clicks the "NumpyNinja" logo on the top left corner
    Then the user is not redirected to the home page
