#Author:Madhavi
@array
Feature: Test Scenarios for Arrays

  Background: The user sign in to dsAlgo Portal
  	Given the user is on the DS Algo Sign in Page
    When the user enters a valid credentials and click on login
    And The user clicks the Getting Started button in Array Panel After Sign in

  #Test Case 1
  Scenario: Verify that user is able to navigate to "Array" data structure page
    Then The user be directed to Array Data Structure Page

  #Test Case 2
  Scenario: Verify that user is able to navigate to "Arrays in Python" page
    Given The user is in the Array page after Sign in
    When The user clicks Arrays in Python link
    Then The user should be redirected to Arrays in Python page

  #Test Case 3
  Scenario: Verify that user is able to navigate to "try Editor" page for "Arrays in Python" page
    Given The user is on the Arrays in Python page
    When The user clicks Try Here button in Arrays in Python page
    Then The user should be redirected to a page having an try Editor with a Run button to test

  #Test Case 4
  Scenario: Verify that user receives error when click on Run button without entering code for "Arrays in Python" page
    Given The user is in the tryEditor page
    When The user clicks the Run Button without entering the code in the Editor
    Then The user is not able to see an error message

  #Test Case 5
  Scenario: Verify that user receives error for invalid python code for "Arrays in Python" page
    Given The user is in the tryEditor page
    When The user write the invalid code in Editor and click the Run Button
    Then The user should able to see an error message in alert window
#
  #Test Case 6
  Scenario: Verify that user is able to see output for valid python code for "Arrays in Python" page
    Given The user is in the tryEditor page
    When The user write the valid code in Editor and click the Run Button
    Then The user should able to see output in the console for Arrays

  #Test Case 7
  Scenario: Verify that user is able to navigate to "Arrays using List" page
    Given The user is in the Array page after Sign in
    When The user clicks Arrays using List link
    Then The user should be redirected to Arrays using List page

  #Test Case 8
  Scenario: Verify that user is able to navigate to "Arrays using List" page
    Given The user is in the Array Topics page
    When The user clicks Arrays using List link of the Arrays Topics page left side menu
    Then The user should be redirected to Arrays using List page

  #Test Case 9
  Scenario: Verify that user is able to navigate to "try Editor" page for "Arrays using List" page
    Given The user is on the Arrays Using List page
    When The user clicks Try Here button in Arrays using List page
    Then The user should be redirected to a page having an try Editor with a Run button to test
#
  #Test Case 10
  Scenario: Verify that user receives error when click on Run button without entering code for "Arrays using List" page
    Given The user is in the Arrays using List tryEditor page
    When The user clicks the Run Button without entering the code in the Editor
    Then The user is not able to see an error message

  #Test Case 11
  Scenario: Verify that user receives error for invalid python code for "Arrays using List" page
    Given The user is in the Arrays using List tryEditor page
    When The user write the invalid code in Editor and click the Run Button
    Then The user should able to see an error message in alert window
#
  #Test Case 12
  Scenario: Verify that user is able to see output for valid python code for "Arrays using List" page
    Given The user is in the Arrays using List tryEditor page
    When The user write the valid code in Editor and click the Run Button
    Then The user should able to see output in the console for Arrays

  #Test Case 13
  Scenario: Verify that user is able to navigate to "Basic Operation in List" page
    Given The user is in the Array page after Sign in
    When The user clicks Basic Operation in List link
    Then The user should be redirected to Basic Operation in List page

  #Test Case 14
  Scenario: Verify that user is able to navigate to "Basic Operation in List" page
    Given The user is in the Array Topics page
    When The user clicks Basic Operation in List link of the Arrays Topics page left side menu
    Then The user should be redirected to Basic Operation in List page

  #Test Case 15
  Scenario: Verify that user is able to navigate to "try Editor" page for "Basic Operation in List" page
    Given The user is on the Basic Operation in List page
    When The user clicks Try Here button in Basic Operation in List page
    Then The user should be redirected to a page having an try Editor with a Run button to test

  #Test Case 16
  Scenario: Verify that user receives error when click on Run button without entering code for "Basic Operation in List" page
    Given The user is in the Basic Operation tryEditor page
    When The user clicks the Run Button without entering the code in the Editor
    Then The user is not able to see an error message

  #Test Case 17
  Scenario: Verify that user receives error for invalid python code for "Basic Operation in List" page
    Given The user is in the Basic Operation tryEditor page
    When The user write the invalid code in Editor and click the Run Button
    Then The user should able to see an error message in alert window
#
  #Test Case 18
  Scenario: Verify that user is able to see output for valid python code for "Basic Operation in List" page
    Given The user is in the Basic Operation tryEditor page
    When The user write the valid code in Editor and click the Run Button
    Then The user should able to see output in the console for Arrays

  #Test Case 19
  Scenario: Verify that user is able to navigate to "Applications of Array" page
    Given The user is in the Array page after Sign in
    When The user clicks Applications of Array link
    Then The user should be redirected to Application of Array page

  #Test Case 20
  Scenario: Verify that user is able to navigate to "Applications of Array" page
    Given The user is in the Array Topics page
    When The user clicks Applications of Array link of the Arrays Topics page left side menu
    Then The user should be redirected to Application of Array page

  #Test Case 21
  Scenario: Verify that user is able to navigate to "try Editor" page for "Applications of Array" page
    Given The user is on the Application of Array page
    When The user clicks Try Here button in Applications of Array page
    Then The user should be redirected to a page having an try Editor with a Run button to test

  #Test Case 22
  Scenario: Verify that user receives error when click on Run button without entering code for "Applications of Array" page
    Given The user is in the tryEditor page
    When The user clicks the Run Button without entering the code in the Editor
    Then The user is not able to see an error message

  #Test Case 23
  Scenario: Verify that user receives error for invalid python code for "Applications of Array" page
    Given The user is in the Applications of Array tryEditor page
    When The user write the invalid code in Editor and click the Run Button
    Then The user should able to see an error message in alert window

  #Test Case 24
  Scenario: Verify that user is able to see output for valid python code for "Applications of Array" page
    Given The user is in the Applications of Array tryEditor page
    When The user write the valid code in Editor and click the Run Button
    Then The user should able to see output in the console for Arrays

  #Test Case 25
  Scenario: Verify that user is able to navigate to "Practice Questions" Page for "Arrays in Python" page
    Given The user is on the Arrays in Python page
    When The user clicks Arrays Practice Questions button
    Then The user should be redirected Arrays to Practice page

  #Test Case 26
  Scenario: Verify that user is able to navigate to "Search the array" Page from Practice question page of "Arrays in Python" page
    Given The user is on the Arrays Practice Questions page
    When The user clicks the Search the array link
    Then The user should be redirected to Question page contains a question,and try Editor with Run and Submit buttons
    
  #Test Case 27
  Scenario: Verify that user receives error for invalid python code on running "Search the array" question
    Given The user is on the Search the array Practice Questions editor
    When The user write the invalid code in Practice Questions Editor and Click the Run Button
    Then The user should able to see an error message in alert window

  #Test Case 28
  Scenario: Verify that user is able to run valid python code for "Search the array" question
    Given The user is on the Search the array Practice Questions editor
    When The user write the valid code in Practice Questions Editor and Click the Run Button
    Then The user should able to see Practiece Questions output in the console

  #Test Case 29 
  Scenario: Verify that user receives error on submitting invalid python code for "Search the array" question
    Given The user is on the Search the array Practice Questions editor
    When The user write the invalid code in Practice Questions Editor and Click the Submit Button
    Then The user see an error message Error occurred during submission

  #Test Case 30 ------Need to check with team on code
  Scenario: Verify that user receives "Submission Successful" on submitting valid python code for "Search the array" question
    Given The user is on the Search the array Practice Questions editor
    When The user write the valid Search the Array code in Editor and Click the Submit Button
    Then The user is not able to see success message Submission successful

  #Test Case 31
  Scenario: Verify that user receives error message without entering any code in "Search the Array" editor and click on Run button
    Given The user is on the Search the array Practice Questions editor
    When The user Clicks the Run Button without entering any code in Editor
    Then The user is not able to see error message for blank input

  #Test Case 32 ---Need to ask Kalpana to check this
  Scenario: Verify that user receives error message without entering any code in "Search the Array" editor and click on Submit button
    Given The user is on the Search the array Practice Questions editor
    When The user Clicks the Submit Button without entering any code in Editor
    Then The user see an error message Error occurred during submission

  #Test Case 33
  Scenario: Verify that user is able to navigate to "Max Consecutive Ones" Page from Practice question page of "Arrays in Python" page
    Given The user is on the Arrays Practice Questions page
    When The user clicks the Max Consecutive Ones link
    Then The user should be redirected to Question page contains a question,and try Editor with Run and Submit buttons

  #Test Case 34
  Scenario: Verify that user receives error for invalid python code on running "Max Consecutive Ones" question
    Given The user is on the Max Consecutive Ones practice question editor
    When The user write the invalid code in Practice Questions Editor and Click the Run Button
    Then The user should able to see an error message in alert window

  #Test Case 35
  Scenario: Verify that user is able to run valid python code for "Max Consecutive Ones" question
    Given The user is on the Max Consecutive Ones practice question editor
    When The user write the valid Max Consecutive Ones code in Editor and Click the Run Button
    Then The user should able to see Max Consecutive Ones Practiece Questions output in the console

  #Test Case 36
  Scenario: Verify that user receives error message on submitting invalid python code for "Max Consecutive Ones" question
    Given The user is on the Max Consecutive Ones practice question editor
    When The user write the invalid code in Practice Questions Editor and Click the Submit Button
    Then The user see an error message Error occurred during submission

  #Test Case 37
  Scenario: Verify that user receives "Submission Successful" on submitting valid python code for "Max Consecutive Ones" question
    Given The user is on the Max Consecutive Ones practice question editor
    When The user write the valid Max Consecutive Ones code in Editor and Click the Submit Button
    Then The user is not able to see success message Submission successful

  #Test Case 38
  Scenario: Verify that user receives error message without entering any code in "Max Consecutive Ones" editor and click on Run button
    Given The user is on the Max Consecutive Ones practice question editor
    When The user Clicks the Run Button without entering any code in Editor
    Then The user is not able to see error message for blank input

  #Test Case 39
  Scenario: Verify that user receives error message without entering any code in "Max Consecutive Ones" editor and click on Submit button
    Given The user is on the Max Consecutive Ones practice question editor
    When The user Clicks the Submit Button without entering any code in Editor
    Then The user see an error message Error occurred during submission

  #Test Case 40
  Scenario: Verify that user is able to navigate to "Find Numbers with Even Number of Digits" Page from Practice question page of "Arrays in Python" page
    Given The user is on the Arrays Practice Questions page
    When The user clicks the Find Numbers with Even Number of Digits link
    Then The user should be redirected to Question page contains a question,and try Editor with Run and Submit buttons

  #Test Case 41
  Scenario: Verify that user receives error message for invalid python code on running "Find Numbers with Even Number of Digits" question
    Given The user is on the Find Numbers with Even Number of Digits practice question editor
    When The user write the invalid code in Practice Questions Editor and Click the Run Button
    Then The user should able to see an error message in alert window

  #Test Case 42
  Scenario: Verify that user is able to run valid python code for "Find Numbers with Even Number of Digits" question
    Given The user is on the Find Numbers with Even Number of Digits practice question editor
    When The user write the valid Find Numbers with Even Number of Digits and Click the Run Button
    Then The user should able to see Find Numbers with Even Number of Digits Practiece Questions output in the console

  #Test Case 43
  Scenario: Verify that user receives error on submitting invalid python code for "Find Numbers with Even Number of Digits" question
    Given The user is on the Find Numbers with Even Number of Digits practice question editor
    When The user write the invalid code in Practice Questions Editor and Click the Submit Button
    Then The user see an error message Error occurred during submission
    
  #Test Case 44
  Scenario: Verify that user receives "Submission Successful" on submitting valid python code for "Find Numbers with Even Number of Digits" question
    Given The user is on the Find Numbers with Even Number of Digits practice question editor
    When The user write the valid Find Numbers with Even Number of Digits and Click the Submit Button
    Then The user is not able to see success message Submission successful in Find Numbers with Even Number of Digits output

  #Test Case 45
  Scenario: Verify that user receives error message without entering any code in "Find Numbers with Even Number of Digits" editor and click on Run button
    Given The user is on the Find Numbers with Even Number of Digits practice question editor
    When The user Clicks the Run Button without entering any code in Editor
    Then The user is not able to see error message for blank input

  #Test Case 46
  Scenario: Verify that user receives error message without entering any code in "Find Numbers with Even Number of Digits" editor and click on Submit button
    Given The user is on the Find Numbers with Even Number of Digits practice question editor
    When The user Clicks the Submit Button without entering any code in Editor
    Then The user see an error message Error occurred during submission

  #Test Case 47
  Scenario: Verify that user is able to navigate to "Squares of a Sorted Array" Page from Practice question page of "Arrays in Python" page
    Given The user is on the Arrays Practice Questions page
    When The user clicks the Squares of a Sorted Array link
    Then The user should be redirected to Question page contains a question,and try Editor with Run and Submit buttons

  #Test Case 48
  Scenario: Verify that user receives error message for invalid python code on running "Squares of a Sorted Array" question
    Given The user is on the Squares of a Sorted Array practice question editor
    When The user write the invalid code in Editor and click the Run Button
    Then The user should able to see an error message in alert window

  #Test Case 49
  Scenario: Verify that user is able to run valid python code for "Squares of a Sorted Array" question
    Given The user is on the Squares of a Sorted Array practice question editor
    When The user write the valid Squares of a Sorted Array code in Editor and Click the Run Button
    Then The user should able to see Squares of a Sorted Array output in the console

  #Test Case 50
  Scenario: Verify that user receives error message on submitting invalid python code for "Squares of a Sorted Array" question
    Given The user is on the Squares of a Sorted Array practice question editor
    When The user write the invalid code in Practice Questions Editor and Click the Submit Button
    Then The user should be able to see error message No tests were Collected

  #Test Case 51 
  Scenario: Verify that user receives "Submission Successful" on submitting valid python code for "Squares of a Sorted Array" question
    Given The user is on the Squares of a Sorted Array practice question editor
    When The user write the valid Squares of a Sorted Array code in Editor and Click the Submit Button
    Then The user is not able to see success message Submission successful for Squares of a Sorted Array code

  #Test Case 52
  Scenario: Verify that user receives error message without entering any code in "Squares of a Sorted Array" editor and click on Run button
    Given The user is on the Squares of a Sorted Array practice question editor
    When The user Clicks the Run Button without entering any code in Editor
    Then The user is not able to see error message for blank input

  #Test Case 53
  Scenario: Verify that user receives error message without entering any code in "Squares of a Sorted Array" editor and click on Submit button
    Given The user is on the Squares of a Sorted Array practice question editor
    When The user Clicks the Submit Button without entering any code in Editor
    Then The user should be able to see error message No tests were Collected

  #Test Case 54
  Scenario: Verify that user is able to navigate to "Arrays in Python" page
    Given The user is in the Array page after Sign in
    When The user clicks Arrays in Python link of the Arrays page left side menu
    Then The user should be redirected to Arrays in Python page

  #Test Case 55 -This will be mapped to Registration page
  Scenario: Verify that user is able to redirected to the  home page
   	Given The user is in the Array page after Sign in
    When The user clicks the NumpyNinja link on the top left corner
    Then The user should be navigated to numpy ninja main page