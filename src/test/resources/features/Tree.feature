
Feature: Tree

  Background: 
    Given the user is on the DS Algo Sign in Page
    When the user enters a valid credentials and click on login
    And The user clicks on get started button for Tree on homepage

  Scenario: Verify that user is able to navigate to Overview of Trees page
    Given The user is on Tree page
    When The user clicks on Overview of Trees link
    Then The User should be navigated to Overview of Trees page

  Scenario: Verify Stucture of Tree image is present
    Given The User is on Overview of Trees page
    Then The User should be able to view Tree image on The Overveiw of Tress page

  Scenario: Verify that user is able to navigate to Practice questions page
    Given The User is on Overview of Trees page
    When The user clicks on Practice questions link
    Then The User should be navigated to Practice Questions page

  Scenario: Verify that user is able to navigate to Code executor page
    Given The User is on Overview of Trees page
    When The user clicks on Try Here button
    Then The User should be navigated to the CodeExecutor Editor Page

  Scenario: Verify TryEditor with empty code
    Given The User is on Overview of Trees Try Editor Page
    When The user clicks the Run Button without entering the code in the Editor
    Then The user is not able to see an error message

  Scenario: Verify TryEditor with valid code
    Given The User is on Overview of Trees Try Editor Page
    When The user enters a valid Python code in Editor and click on the Run button
    Then The user should be able to execute the code

  Scenario: Verify TryEditor with invalid code
    Given The User is on Overview of Trees Try Editor Page
    When The user enters an invalid code in Editor and click on the Run button
    Then The user should get an error message after excuting the code

  Scenario: Verify that user is able to navigate to Terminologies page
    Given The user is on Tree page
    When The user clicks on Terminologies link
    Then The User should be navigated to Terminologies page

  Scenario: Verify the data is present in the table on Terminlogies page
    Given The User is on Terminologies page
    Then The user should be able to view all the data in table

  Scenario: Verify that user is able to navigate to Practice questions page
    Given The User is on Terminologies page
    When The user clicks on Practice questions link
    Then The User should be navigated to Practice Questions page

  Scenario: Verify that user is able to navigate to Code executor page
    Given The User is on Terminologies page
    When The user clicks on Try Here button
    Then The User should be navigated to the CodeExecutor Editor Page

  Scenario: Verify TryEditor with empty code
    Given The User is on Terminologies Try Editor Page
    When The user clicks the Run Button without entering the code in the Editor
    Then The user is not able to see an error message

  Scenario: Verify TryEditor with valid code
    Given The User is on Terminologies Try Editor Page
    When The user enters a valid Python code in Editor and click on the Run button
    Then The user should be able to execute the code

  Scenario: Verify TryEditor invalid code
    Given The User is on Terminologies Try Editor Page
    When The user enters an invalid code in Editor and click on the Run button
    Then The user should get an error message after excuting the code

  Scenario: Verify that user is able to navigate to Types of Trees page
    Given The user is on Tree page
    When The user clicks on Types of Trees link
    Then The User should be navigated to Types of Trees page

  Scenario: Verify that user is able to navigate to Practice questions page
    Given The User is on Types of Trees page
    When The user clicks on Practice questions link
    Then The User should be navigated to Practice Questions page

  Scenario: Verify that user is able to navigate to Code executor page
    Given The User is on Types of Trees page
    When The user clicks on Try Here button
    Then The User should be navigated to the CodeExecutor Editor Page

  Scenario: Verify TryEditor with empty code
    Given The User is on Types of Trees Try Editor Page
    When The user clicks the Run Button without entering the code in the Editor
    Then The user is not able to see an error message

  Scenario: Verify TryEditor with valid code
    Given The User is on Types of Trees Try Editor Page
    When The user enters a valid Python code in Editor and click on the Run button
    Then The user should be able to execute the code

  Scenario: Verify TryEditor invalid code
    Given The User is on Types of Trees Try Editor Page
    When The user enters an invalid code in Editor and click on the Run button
    Then The user should get an error message after excuting the code

  Scenario: Verify that user is able to navigate to Tree Traversals page
    Given The user is on Tree page
    When The user clicks on Tree Traversals link
    Then The User should be navigated to Tree Traversals page

  Scenario: Verify that user is able to view image on Tree Traversals page
    Given The User is on Tree Traversals page
    Then The User should be able to view Level Order Traversal example image

  Scenario: Verify that user is able to view table on Traversals page
    Given The User is on Tree Traversals page
    Then The User should be able to view all the data in Depth First Traversal types table

  Scenario: Verify that user is able to navigate to Practice questions page
    Given The User is on Tree Traversals page
    When The user clicks on Practice questions link
    Then The User should be navigated to Practice Questions page

  Scenario: Verify that user is able to navigate to Code executor page
    Given The User is on Tree Traversals page
    When The user clicks on Try Here button
    Then The User should be navigated to the CodeExecutor Editor Page

  Scenario: Verify TryEditor with empty code
    Given The User is on Tree Traversals Try Editor Page
    When The user clicks the Run Button without entering the code in the Editor
    Then The user is not able to see an error message

  Scenario: Verify TryEditor with valid code
    Given The User is on Tree Traversals Try Editor Page
    When The user enters a valid Python code in Editor and click on the Run button
    Then The user should be able to execute the code

  Scenario: Verify TryEditor with invalid code
    Given The User is on Tree Traversals Try Editor Page
    When The user enters an invalid code in Editor and click on the Run button
    Then The user should get an error message after excuting the code

  Scenario: Verify that user is able to navigate to Traversals-Illustration page
    Given The user is on Tree page
    When The user clicks on Traversals-Illustration link
    Then The User should be navigated to Traversals-Illustration page

  Scenario: Verify that user is able to view image on Traversals-Illustration page
    Given The User is on Traversals-Illustration page
    Then The User should be able to view Depth First Traversal diagram

  Scenario: Verify that user is able to navigate to Practice questions page
    Given The User is on Traversals-Illustration page
    When The user clicks on Practice questions link
    Then The User should be navigated to Practice Questions page

  Scenario: Verify that user is able to navigate to Code executor page
    Given The User is on Traversals-Illustration page
    When The user clicks on Try Here button
    Then The User should be navigated to the CodeExecutor Editor Page

  Scenario: Verify TryEditor with empty code
    Given The User is on Traversals-Illustration Try Editor Page
    When The user clicks the Run Button without entering the code in the Editor
    Then The user is not able to see an error message

  Scenario: Verify TryEditor with valid code
    Given The User is on Traversals-Illustration Try Editor Page
    When The user enters a valid Python code in Editor and click on the Run button
    Then The user should be able to execute the code

  Scenario: Verify TryEditor with invalid code
    Given The User is on Traversals-Illustration Try Editor Page
    When The user enters an invalid code in Editor and click on the Run button
    Then The user should get an error message after excuting the code

  Scenario: Verify that user is able to navigate to Binary Trees page
    Given The user is on Tree page
    When The user clicks on Binary Trees link
    Then The User should be navigated to Binary Trees page

  Scenario: Verify that user is able to view diagram on Binary Trees page
    Given The User is on Binary Trees page
    Then The User should be able to view Binary Trees diagram

  Scenario: Verify that user is able to navigate to Practice questions page
    Given The User is on Binary Trees page
    When The user clicks on Practice questions link
    Then The User should be navigated to Practice Questions page

  Scenario: Verify that user is able to navigate to Code executor page
    Given The User is on Binary Trees page
    When The user clicks on Try Here button
    Then The User should be navigated to the CodeExecutor Editor Page

  Scenario: Verify TryEditor with empty code
    Given The User is on Binary Trees Try Editor Page
    When The user clicks the Run Button without entering the code in the Editor
    Then The user is not able to see an error message

  Scenario: Verify TryEditor with valid code
    Given The User is on Binary Trees Try Editor Page
    When The user enters a valid Python code in Editor and click on the Run button
    Then The user should be able to execute the code

  Scenario: Verify TryEditor with invalid code
    Given The User is on Binary Trees Try Editor Page
    When The user enters an invalid code in Editor and click on the Run button
    Then The user should get an error message after excuting the code

  Scenario: Verify that user is able to navigate to Types of Binary Trees page
    Given The user is on Tree page
    When The user clicks on Types of Binary Trees link
    Then The User should be navigated to Types of Binary Trees page

  Scenario: Verify that user is able to view diagram on Types of Binary Trees page
    Given The User is on Types of Binary Trees page
    Then The User should be able to view the Complete binary tree diagram

  Scenario: Verify that user is able to view diagram on Types of Binary Trees page
    Given The User is on Types of Binary Trees page
    Then The User should be able to view Full binary tree diagram

  Scenario: Verify that user is able to navigate to Practice questions page
    Given The User is on Types of Binary Trees page
    When The user clicks on Practice questions link
    Then The User should be navigated to Practice Questions page

  Scenario: Verify that user is able to navigate to Code executor page
    Given The User is on Types of Binary Trees page
    When The user clicks on Try Here button
    Then The User should be navigated to the CodeExecutor Editor Page

  Scenario: Verify TryEditor with empty code
    Given The User is on Types of Binary Trees Try Editor Page
    When The user clicks the Run Button without entering the code in the Editor
    Then The user is not able to see an error message

  Scenario: Verify TryEditor with valid code
    Given The User is on Types of Binary Trees Try Editor Page
    When The user enters a valid Python code in Editor and click on the Run button
    Then The user should be able to execute the code

  Scenario: Verify TryEditor with invalid code
    Given The User is on Types of Binary Trees Try Editor Page
    When The user enters an invalid code in Editor and click on the Run button
    Then The user should get an error message after excuting the code

  Scenario: Verify that user is able to navigate to Implementation in Python page
    Given The user is on Tree page
    When The user clicks on Implementation in Python link
    Then The User should be navigated to Implementation in Python page

  Scenario: Verify that user is able to navigate to Practice questions page
    Given The User is on Implementation in Python page
    When The user clicks on Practice questions link
    Then The User should be navigated to Practice Questions page

  Scenario: Verify that user is able to navigate to Code executor page
    Given The User is on Implementation in Python page
    When The user clicks on Try Here button
    Then The User should be navigated to the CodeExecutor Editor Page

  Scenario: Verify TryEditor with empty code
    Given The User is on Implementation in Python Try Editor Page
    When The user clicks the Run Button without entering the code in the Editor
    Then The user is not able to see an error message

  Scenario: Verify TryEditor with valid code
    Given The User is on Implementation in Python Try Editor Page
    When The user enters a valid Python code in Editor and click on the Run button
    Then The user should be able to execute the code

  Scenario: Verify TryEditor with invalid code
    Given The User is on Implementation in Python Try Editor Page
    When The user enters an invalid code in Editor and click on the Run button
    Then The user should get an error message after excuting the code

  Scenario: Verify that user is able to navigate to Binary Tree Traversals page
    Given The user is on Tree page
    When The user clicks on Binary Tree Traversals link
    Then The User should be navigated to Binary Tree Traversals page

  Scenario: Verify that user is able to view diagram on Binary Tree Traversals page
    Given The User is on Binary Tree Travesals page
    Then The User should be able to view path of traversals In Binary Tree Data diagram

  Scenario: Verify that user is able to navigate to Practice questions page
    Given The User is on Binary Tree Travesals page
    When The user clicks on Practice questions link
    Then The User should be navigated to Practice Questions page

  Scenario: Verify that user is able to navigate to Code executor page
    Given The User is on Binary Tree Travesals page
    When The user clicks on Try Here button
    Then The User should be navigated to the CodeExecutor Editor Page

  Scenario: Verify TryEditor with empty code
    Given The User is on Binary Tree Traversals Try Editor Page
    When The user clicks the Run Button without entering the code in the Editor
    Then The user is not able to see an error message

  Scenario: Verify TryEditor with valid code
    Given The User is on Binary Tree Traversals Try Editor Page
    When The user enters a valid Python code in Editor and click on the Run button
    Then The user should be able to execute the code

  Scenario: Verify TryEditor with invalid code
    Given The User is on Binary Tree Traversals Try Editor Page
    When The user enters an invalid code in Editor and click on the Run button
    Then The user should get an error message after excuting the code

  Scenario: Verify that user is able to navigate to Implementation of Binary Trees page
    Given The user is on Tree page
    When The user clicks on Implementation of Binary Trees link
    Then The User should be navigated to Implementation of Binary Trees page

  Scenario: Verify that user is able to navigate to Practice questions page
    Given The User is on Implementation of Binary Trees page
    When The user clicks on Practice questions link
    Then The User should be navigated to Practice Questions page

  Scenario: Verify that user is able to navigate to Code executor page
    Given The User is on Implementation of Binary Trees page
    When The user clicks on Try Here button
    Then The User should be navigated to the CodeExecutor Editor Page

  Scenario: Verify TryEditor with empty code
    Given The User is on Implementation of Binary Trees Try Editor Page
    When The user clicks the Run Button without entering the code in the Editor
    Then The user is not able to see an error message

  Scenario: Verify TryEditor with valid code
    Given The User is on Implementation of Binary Trees Try Editor Page
    When The user enters a valid Python code in Editor and click on the Run button
    Then The user should be able to execute the code

  Scenario: Verify TryEditor with invalid code
    Given The User is on Implementation of Binary Trees Try Editor Page
    When The user enters an invalid code in Editor and click on the Run button
    Then The user should get an error message after excuting the code

  Scenario: Verify that user is able to navigate to Applications of Binary Trees page
    Given The user is on Tree page
    When The user clicks on Applications of Binary Trees link
    Then The User should be navigated to Applications of Binary Trees page

  Scenario: Verify that user is able to navigate to Practice questions page
    Given The User is on Applications of Binary Trees page
    When The user clicks on Practice questions link
    Then The User should be navigated to Practice Questions page

  Scenario: Verify that user is able to navigate to Code executor page
    Given The User is on Applications of Binary Trees page
    When The user clicks on Try Here button
    Then The User should be navigated to the CodeExecutor Editor Page

  Scenario: Verify TryEditor with empty code
    Given The User is on Applications of Binary Trees Try Editor Page
    When The user clicks the Run Button without entering the code in the Editor
    Then The user is not able to see an error message

  Scenario: Verify TryEditor with valid code
    Given The User is on Applications of Binary Trees Try Editor Page
    When The user enters a valid Python code in Editor and click on the Run button
    Then The user should be able to execute the code

  Scenario: Verify TryEditor with invalid
    Given The User is on Applications of Binary Trees Try Editor Page
    When The user enters an invalid code in Editor and click on the Run button
    Then The user should get an error message after excuting the code

  Scenario: Verify that user is able to navigate to Binary Search Trees page
    Given The user is on Tree page
    When The user clicks on Binary Search Trees link
    Then The User should be navigated to Binary Search Trees page

  Scenario: Verify that user is able to view  diagram on Binary Search Trees page
    Given The User is on Binary Search Trees page
    Then The User should be able to view Binary Search Tree diagram

  Scenario: Verify that user is able to navigate to Practice questions page
    Given The User is on Binary Search Trees page
    When The user clicks on Practice questions link
    Then The User should be navigated to Practice Questions page

  Scenario: Verify that user is able to navigate to Code executor page
    Given The User is on Binary Search Trees page
    When The user clicks on Try Here button
    Then The User should be navigated to the CodeExecutor Editor Page

  Scenario: Verify TryEditor with empty code
    Given The User is on Binary Search Trees Try Editor Page
    When The user clicks the Run Button without entering the code in the Editor
    Then The user is not able to see an error message

  Scenario: Verify TryEditor with valid code
    Given The User is on Binary Search Trees Try Editor Page
    When The user enters a valid Python code in Editor and click on the Run button
    Then The user should be able to execute the code

  Scenario: Verify TryEditor with invalid code
    Given The User is on Binary Search Trees Try Editor Page
    When The user enters an invalid code in Editor and click on the Run button
    Then The user should get an error message after excuting the code

  Scenario: Verify that user is able to navigate to Implementation of BST page
    Given The user is on Tree page
    When The user clicks on Implementation of BST link
    Then The User should be navigated to Implementation of BST page

  Scenario: Verify that user is able to navigate to Practice questions page
    Given The User is on Implementation of BST page
    When The user clicks on Practice questions link
    Then The User should be navigated to Practice Questions page

  Scenario: Verify that user is able to navigate to Code executor page
    Given The User is on Implementation of BST page
    When The user clicks on Try Here button
    Then The User should be navigated to the CodeExecutor Editor Page

  Scenario: Verify TryEditor with empty code
    Given The User is on Implementation of BST Try Editor Page
    When The user clicks the Run Button without entering the code in the Editor
    Then The user is not able to see an error message

  Scenario: Verify  TryEditor with valid code
    Given The User is on Implementation of BST Try Editor Page
    When The user enters a valid Python code in Editor and click on the Run button
    Then The user should be able to execute the code

  Scenario: Verify  TryEditor with invalid code
    Given The User is on Implementation of BST Try Editor Page
    When The user enters an invalid code in Editor and click on the Run button
    Then The user should get an error message after excuting the code
