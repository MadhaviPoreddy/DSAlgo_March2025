Feature: Navigation to Graph Data Structure Page

 Background:
    Given the user is on the dsAlgo Portal Sign-In Page
    When the user enters valid credentials
    And the user clicks the "Sign in" button
    Then the user should be redirected to the Home Page
    
   
  Scenario: User navigates to the Graph page after signing in
 		Given the user is on the Home page
    When the user clicks the "Getting Started" button in the Graph Panel
    Then the user should be directed to the "Graph" Data Structure Page
	  
	Scenario: User navigates to the Graph page 
    Given the user is on the "Graph" data structure page
    When the user clicks the "Graph" link
    Then the user should be redirected to the "Graph" page
    
  Scenario: User navigates to "Try Editor" page
  	Given the user is in the "Graph Representations" page 
  	When the user clicks "Try here" button
  	Then The user should be redirected to a page having an try Editor with a run button to test
  	
  Scenario: User receives error when click on Run button without entering code
  	Given the user is in the tryEditor page
  	When the user clicks the Run button without entering the code in the Editor
  	Then the user is not able to see an error message 
  	
  Scenario: User receives error for invalid python code
  	Given the user is in the tryEditor page
  	When the user write the invalid code in Editor and click the Run button
  	Then the user should able to see an error message in alert window
  	
  Scenario: User sees the output for valid python code
  	Given the user is in the tryEditor page
  	When the user write the valid code in Editor and click the Run button
  	Then the user should able to see output in the console
  	
 	Scenario: User is redirected to the  home page
 		Given the user is in the Graph page
 		When the user clicks the "NumpyNinja" logo on the top left corner
 		Then the user is not able to land on home page
 		
 	Scenario: User navigates to "Practice Questions" page
 		Given the user is in the Graph page
 		When the user clicks the "Practice Questions" button
 		Then the user is able to view a blank page for Practice Questions of Array
 		
 	Scenario: User navigates to "try Editor" page
 		Given the user is in the "Graph" page 
 		When the user clicks "Try here" button
 		Then the user should be redirected to a page having an try Editor with a Run button to test
 		
 	Scenario: User receives error when click on Run button without entering code
 		Given the user is in the tryEditor page
 		When the user clicks the Run button without entering the code in the Editor
 		Then the user is not able to see an error message
 		
 	Scenario: User receives error for invalid python code 
 		Given the user is in the tryEditor page
 		When the user write the invalid code in Editor and click the Run button
 		Then the user should able to see an error message in alert window
 		
 	Scenario: User is able to see output for valid python code
 		Given: the user is in the tryEditor page
 		When the user write the valid code in Editor and click the Run button
 		Then the user should able to see output in the console
 		
 	Scenario: Verify that user sees the paragraph starts on a new line and is left-aligned after a table
 		Given the user is in the Graph Representations page with a table followed by a paragraph
 		When the user examine the paragraph positioning and alignment
 		Then the user is not able to see the paragraph start on a new line with left aligned
 		
 	Scenario: Redirect to home page via NumpyNinja logo
    Given the user is signed in to the dsAlgo Portal
    And the user is on the "Graph" page
    When the user clicks the NumpyNinja logo
    Then the user is not redirected to home page