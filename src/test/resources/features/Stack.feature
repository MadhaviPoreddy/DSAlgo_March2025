@tag
Feature: Test Scenarios for Stack Module

Background: The user sign in to dsAlgo Portal 
		Given The user clicks on Getstarted and launch Sign in Page
    When The user enters username and password
    And Clicks on login button 
    Then The user will be directed to dsAlgo Portal Page
    

 #Test Case 1
  @tag1
  Scenario: Verify that user is able to navigate to "Stack" data structure page
    Given The user is in the Home page after Sign in
    When The user clicks the "Getting Started" button in Stack Panel  
    Then The user will be directed to "Stack" Data Structure Page
   
 #Test Case 2
  @tag2
  Scenario: Verify that user is able to navigate to "Operations in Stack" page
    Given The user is in the "Stack" page after Sign in
    When The user clicks "Operations in Stack" link
    Then The user should be redirected to "Operations in Stack" page
    
 #Test Case 3
   Scenario: Verify that user is able to navigate to "try here Editor" page for "Operations in Stack" page
    Given The user is on the "Operations in Stack" page
    When The user clicks "Try Here" button in Operations in Stack page
    Then The user should be redirected to a page having an try Editor with a Run button to test
    
 #Test Case 4
   Scenario: Verify that user receives error when click on Run button without entering code for "Operations in Stack" page
    Given The user is in the tryEditor page
    When The user clicks the Run Button without entering the code in the Editor
    Then The user is not able to see an error message  
    
   #Test Case 5
   Scenario: Verify that user receives error for invalid python code for "Operations in Stack" page
    Given The user is in the tryEditor page
    When The user write the invalid code in Editor and click the Run Button 
    Then The user should able to see an error message in alert window
    
    #Test Case 6
   Scenario: Verify that user is able to see output for valid python code on"Operations in Stack" page
    Given The user is in the tryEditor page
    When The user write the valid code in Editor and click the Run Button
    Then The user should able to see output in the console
    
    #Test Case 7
   Scenario: Verify that user is able to navigate to "Practice Questions" Page for "Operations in Stack" page
    Given The user is in the "Operations in Stack" page after Sign in
    When The user clicks "Practice Questions" button 
    Then The user should be redirected to "Practice" page
    
    #Test Case 8
   Scenario: Verify that user is able to navigate to "Implementation" page
    Given The user is in the "Stack" page after Sign in
    When The user clicks "Implementation" link 
    Then The user should be redirected to "Implementation" page
    
    #Test Case 9
   Scenario: Verify that user is able to navigate to "try here Editor" page for "Implementation" page
    Given The user is on the "Implementation" page
    When The user clicks "Try Here" button in Implementation page
    Then The user should be redirected to a page having an try Editor with a Run button to test
    
    #Test Case 10
   Scenario: Verify that user receives error when click on Run button without entering code for "Implementation" page
    Given The user is in the tryEditor page
    When The user clicks the Run Button without entering the code in the Editor
    Then The user is not able to see an error message 
    
    #Test Case 11
   Scenario: Verify that user receives error for invalid python code for "Implementation" page
    Given The user is in the tryEditor page
    When The user write the invalid code in Editor and click the Run Button 
    Then The user should able to see an error message in alert window 
    
    #Test Case 12
   Scenario: Verify that user is able to see output for valid python code on"Implementation" page
    Given The user is in the tryEditor page
    When The user write the valid code in Editor and click the Run Button 
    Then The user should able to see output in the console
    
    #Test Case 13
   Scenario: Verify that user is able to navigate to "Practice Questions" Page for "Implementation" page
    Given The user is in the "Implementation" page after Sign in
    When The user clicks "Practice Questions" button 
    Then The user should be redirected to "Practice" page
    
    #Test Case 14
   Scenario: Verify that user is able to navigate to "Applications" page
    Given The user is in the "Stack" page after Sign in
    When The user clicks "Applications" link 
    Then The user should be redirected to "Applications" page
    
    #Test Case 15
   Scenario: Verify that user is able to navigate to "try here Editor" page for "Applications" page
    Given The user is on the "Applications" page
    When The user clicks "Try Here" button in Applications page 
    Then The user should be redirected to a page having an try Editor with a Run button to test
    
    #Test Case 16
   Scenario: Verify that user receives error when click on Run button without entering code for "Applications" page
    Given The user is in the tryEditor page
    When The user clicks the Run Button without entering the code in the Editor 
    Then The user is not able to see an error message 
    
    #Test Case 17
   Scenario: Verify that user receives error for invalid python code for "Applications" page
    Given The user is in the tryEditor page
    When The user write the invalid code in Editor and click the Run Button 
    Then The user should able to see an error message in alert window
    
    #Test Case 18
   Scenario: Verify that user is able to see output for valid python code on"Applications" page
    Given The user is in the tryEditor page
    When The user write the valid code in Editor and click the Run Button 
    Then The user should able to see output in the console
    
    #Test Case 19
   Scenario: Verify that user is able to navigate to "Practice Questions" Page for "Applications" page
    Given The user is in the "Applications" page after Sign in
    When The user clicks "Practice Questions" button 
    Then The user should be redirected to "Practice" page
 