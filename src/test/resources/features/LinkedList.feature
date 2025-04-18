
#Author: Madhavi
@linkedlist
Feature: Test Scenarios for Linked List Module

 Background: The user sign in to dsAlgo Portal
    Given the user is on the DS Algo Sign in Page
    And the user enters a valid credentials and click on login
    #Given The user clicks on Getstarted and login to DS algo Home page Page
    When The user clicks the Getting Started button in Linked List After Sign in

  #Test Case 1
  #@tag1
  Scenario: Verify that user is able to navigate to "Linked List" data structure page
   Then The user will be directed to Linked List Data Structure Page

  #Test Case 2
  #@tag2
  Scenario: Verify that user is able to navigate to "Introduction" page
    Given The user is in the Linked List page after Sign in
    When The user clicks Introduction link
    Then The user should be redirected to Introduction page

  #Test Case 3
  Scenario: Verify that user is able to navigate to "try here Editor" page for "Introduction" page
    Given The user is on the Linked List Introduction page
    When The user clicks Try Here button in Linked List Introcution page
    Then The user should be redirected to a page having an try Editor with a Run button to test

  #Test Case 4
  Scenario: Verify that user receives error when click on Run button without entering code for "Linked List Introduction" page
    Given The user is in the Linked List Introduction tryEditor page
    When The user clicks the Run Button without entering the code in the Editor
    Then The user is not able to see an error message

  #Test Case 5
  Scenario: Verify that user receives error for invalid python code for "Linked list introduction" page
    Given The user is in the Linked List Introduction tryEditor page
    When The user write the invalid code in Editor and click the Run Button
    Then The user should able to see an error message in alert window

  #Test Case 6
  Scenario: Verify that user is able to see output for valid python code on"Linked List Introduction" page
    Given The user is in the Linked List Introduction tryEditor page
    When The user write the valid code in Editor and click the Run Button
    Then The user should able to see output in the console for Linkedlist

  #Test Case 7
  Scenario: Verify that user is able to navigate to "Practice Questions" Page for "Introduction" page
    Given The user is on the Linked List Introduction page
    When The user clicks Linked List Practice Questions button
    Then The user should be redirected to Linked List Practice page

  #Test Case 8
  Scenario: Verify that user is able to navigate to "Creating Linked List" page
    Given The user is in the Linked List page after Sign in
    When The user clicks Creating Linked List link
    Then The user should be redirected to Creating Linked List page

  #Test Case 9
  Scenario: Verify that user is able to navigate to "Introduction page" from left side menu
    Given The user is in the Creating Linked List page after Sign in
    When The user clicks Introduction link from left side menu
    Then The user should be redirected to Introduction page

  #Test Case 10
  Scenario: Verify that user is able to navigate to "try here Editor" page for "Creating Linked List" page
    Given The user is in the Creating Linked List page after Sign in
    When The user clicks Try Here button in Creating Linked List page
    Then The user should be redirected to a page having an try Editor with a Run button to test

  #Test Case 11
  Scenario: Verify that user receives error when click on Run button without entering code for "Creating Linked List" page
    Given The user is in the Creating Linked List tryEditor page
    When The user clicks the Run Button without entering the code in the Editor
    Then The user is not able to see an error message

  #Test Case 12
  Scenario: Verify that user receives error for invalid python code for "Creating Linked List" page
    Given The user is in the Creating Linked List tryEditor page
    When The user write the invalid code in Editor and click the Run Button
    Then The user should able to see an error message in alert window

  #Test Case 13
  Scenario: Verify that user is able to see output for valid python code on"Creating Linked List" page
    Given The user is in the Creating Linked List tryEditor page
    When The user write the valid code in Editor and click the Run Button
    Then The user should able to see output in the console for Linkedlist

  #Test Case 14
  Scenario: Verify that user is able to navigate to "Practice Questions" Page for "Creating Linked List" page
    Given The user is in the Creating Linked List page after Sign in
    When The user clicks Linked List Practice Questions button
    Then The user should be redirected to Linked List Practice page

  #Test Case 15
  Scenario: Verify that user is able to navigate to "Types of Linked List" page
    Given The user is in the Linked List page after Sign in
    When The user clicks Types of Linked List link
    Then The user should be redirected to Types of Linked List page

  #Test Case 16
  Scenario: Verify that user is able to navigate to "singly linked list page" upon clicking the hyperlink from Types of Linked List page
    Given The user is in the Types of Linked List page after Sign in
    When The user clicks singly linked list link in the Types of Linked List page
    Then The user should be redirected to singly linked list page

  #Test Case 17
  Scenario: Verify that user is able to navigate to "linked list page" upon clicking the hyperlink from Types of Linked List page
    Given The user is in the Types of Linked List page after Sign in
    When The user clicks linked list link in the Types of Linked List page
    Then The user should be redirected to linked list link page

  #Test Case 18
  Scenario: Verify that user is able to navigate to "doubly linked list page" upon clicking the hyperlink from Types of Linked List page
    Given The user is in the Types of Linked List page after Sign in
    When The user clicks doubly linked list link in the Types of Linked List page
    Then The user should be redirected to doubly linked list page

  #Test Case 19
  Scenario: Verify that user is able to navigate to "type of the linked list page" upon clicking the hyperlink from Types of Linked List page
    Given The user is in the Types of Linked List page after Sign in
    When The user clicks type of the linked list page link in the Types of Linked List page
    Then The user should be redirected to type of the linked list page

  #Test Case 20
  Scenario: Verify that user is able to navigate to "try here Editor" page for "Types of Linked List" page
    Given The user is in the Types of Linked List page after Sign in
    When The user clicks Try Here button in Types of Linked List page
    Then The user should be redirected to a page having an try Editor with a Run button to test

  #Test Case 21
  Scenario: Verify that user receives error when click on Run button without entering code for "Types of Linked List" page
    Given The user is in the Types of Linked List tryEditor page
    When The user clicks the Run Button without entering the code in the Editor
    Then The user is not able to see an error message

  #Test Case 22
  Scenario: Verify that user receives error for invalid python code for "Types of Linked List" page
    Given The user is in the Types of Linked List tryEditor page
    When The user write the invalid code in Editor and click the Run Button
    Then The user should able to see an error message in alert window

  #Test Case 23
  Scenario: Verify that user is able to see output for valid python code on"Types of Linked List" page
    Given The user is in the Types of Linked List tryEditor page
    When The user write the valid code in Editor and click the Run Button
    Then The user should able to see output in the console for Linkedlist

  #Test Case 24
  Scenario: Verify that user is able to navigate to "Practice Questions" Page for "Types of Linked List" page
    Given The user is in the Types of Linked List page after Sign in
    When The user clicks Linked List Practice Questions button
    Then The user should be redirected to Linked List Practice page

  #Test Case 25
  Scenario: Verify that user is able to navigate to "Implement Linked List in Python" page
    Given The user is in the Linked List page after Sign in
    When The user clicks Implement Linked List in Python link
    Then The user should be redirected to Implement Linked List in Python page

  #Test Case 26
  Scenario: Verify that user is able to navigate to "try here Editor" page for "Implement Linked List in Python" page
    Given The user is on the Implement Linked List in Python page
    When The user clicks Try Here button in Implement Linked List in Python page
    Then The user should be redirected to a page having an try Editor with a Run button to test

  #Test Case 27
  Scenario: Verify that user receives error when click on Run button without entering code for "Implement Linked List in Python" page
    Given The user is in the Implement Linked List in Python tryEditor page
    When The user clicks the Run Button without entering the code in the Editor
    Then The user is not able to see an error message

  #Test Case 28
  Scenario: Verify that user receives error for invalid python code for "Implement Linked List in Python" page
    Given The user is in the Implement Linked List in Python tryEditor page
    When The user write the invalid code in Editor and click the Run Button
    Then The user should able to see an error message in alert window

  #Test Case 29
  Scenario: Verify that user is able to see output for valid python code on "Implement Linked List in Python" page
    Given The user is in the Implement Linked List in Python tryEditor page
    When The user write the valid code in Editor and click the Run Button
    Then The user should able to see output in the console for Linkedlist

  #Test Case 30
  Scenario: Verify that user is able to navigate to "Practice Questions" Page for "Implement Linked List" page
    Given The user is on the Implement Linked List in Python page
    When The user clicks Linked List Practice Questions button
    Then The user should be redirected to Linked List Practice page

  #Test Case 31
  Scenario: Verify that user is able to navigate to "Traversal" page
    Given The user is in the Linked List page after Sign in
    When The user clicks Traversal link
    Then The user should be redirected to Traversal page

  #Test Case 32
  Scenario: Verify that user is able to navigate to "try here Editor" page for "Traversal" page
    Given The user is on the Traversal page
    When The user clicks Try Here button in Traversal page
    Then The user should be redirected to a page having an try Editor with a Run button to test

  #Test Case 33
  Scenario: Verify that user receives error when click on Run button without entering code for "Traversal" page
    Given The user is in the Traversal tryEditor page
    When The user clicks the Run Button without entering the code in the Editor
    Then The user is not able to see an error message

  #Test Case 34
  Scenario: Verify that user receives error for invalid python code for "Traversal" page
    Given The user is in the Traversal tryEditor page
    When The user write the invalid code in Editor and click the Run Button
    Then The user should able to see an error message in alert window

  #Test Case 35
  Scenario: Verify that user is able to see output for valid python code on"Traversal" page
    Given The user is in the Traversal tryEditor page
    When The user write the valid code in Editor and click the Run Button
    Then The user should able to see output in the console for Linkedlist

  #Test Case 36
  Scenario: Verify that user is able to navigate to "Practice Questions" Page for "Traversal" page
    Given The user is on the Traversal page
    When The user clicks Linked List Practice Questions button
    Then The user should be redirected to Linked List Practice page

 #Test Case 37
  Scenario: Verify that user is able to navigate to "Insertion" page
    Given The user is in the Linked List page after Sign in
    When The user clicks Insertion link
    Then The user should be redirected to Insertion page

  #Test Case 38
  Scenario: Verify that user is able to navigate to "try here Editor" page for "Insertion" page
    Given The user is on the Insertion page
    When The user clicks Try Here button in Insertion page
    Then The user should be redirected to a page having an try Editor with a Run button to test

  #Test Case 39
  Scenario: Verify that user receives error when click on Run button without entering code for "Insertion" page
    Given The user is in the Insertion tryEditor page
    When The user clicks the Run Button without entering the code in the Editor
    Then The user is not able to see an error message

  #Test Case 40
  Scenario: Verify that user receives error for invalid python code for "Insertion" page
    Given The user is in the Insertion tryEditor page
    When The user write the invalid code in Editor and click the Run Button
    Then The user should able to see an error message in alert window

  #Test Case 41
  Scenario: Verify that user is able to see output for valid python code on"Insertion" page
    Given The user is in the Insertion tryEditor page
    When The user write the valid code in Editor and click the Run Button
    Then The user should able to see output in the console for Linkedlist

  #Test Case 42
  Scenario: Verify that user is able to navigate to "Practice Questions" Page for "Insertion" page
    Given The user is on the Insertion page
    When The user clicks Linked List Practice Questions button
    Then The user should be redirected to Linked List Practice page

  #Test Case 43
  Scenario: Verify that user is able to navigate to "Deletion" page
    Given The user is in the Linked List page after Sign in
    When The user clicks Deletion link
    Then The user should be redirected to Deletion page

  #Test Case 44
  Scenario: Verify that user is able to navigate to "try here Editor" page for "Deletion" page
    Given The user is on the Deletion page
    When The user clicks Try Here button in Deletion page
    Then The user should be redirected to a page having an try Editor with a Run button to test

  #Test Case 45
  Scenario: Verify that user receives error when click on Run button without entering code for "Deletion" page
    Given The user is in the Deletion tryEditor page
    When The user clicks the Run Button without entering the code in the Editor
    Then The user is not able to see an error message

  #Test Case 46
  Scenario: Verify that user receives error for invalid python code for "Deletion" page
    Given The user is in the Deletion tryEditor page
    When The user write the invalid code in Editor and click the Run Button
    Then The user should able to see an error message in alert window

  #Test Case 47
  Scenario: Verify that user is able to see output for valid python code on "Deletion" page
    Given The user is in the Deletion tryEditor page
    When The user write the valid code in Editor and click the Run Button
    Then The user should able to see output in the console for Linkedlist

  #Test Case 48
  Scenario: Verify that user is able to navigate to "Practice Questions" Page for "Deletion" page
    Given The user is on the Deletion page
    When The user clicks Linked List Practice Questions button
    Then The user should be redirected to Linked List Practice page
