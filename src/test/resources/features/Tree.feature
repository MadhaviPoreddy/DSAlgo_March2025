Feature: Tree

 Scenario: Login into DsAlgo application
    Given the user is on the DS Algo Sign-In Page
    When the user clicks the Login button
    Then user should be redirected to the Home Page
    
   Scenario: Navigate to Queue page
    Given the user is on the Home page
    When the user clicks the Get Started button for Tree
    Then the user should navigated to Tree page

  Scenario: Verify that user is able to navigate to Overview of Trees page
    When The user clicks on Overview of Trees link
    Then The User should be navigated to Overview of Trees page

  Scenario: Verify Stucture of Tree image is present
    Given The User is on Overview of Trees page
    When The Overview of Trees page is fully loaded
    Then The User should be able to view Tree image on The Overveiw of Tress page

  Scenario: Verify that user is able to navigate to Practice questions page
    Given The User is on Overview of Trees page
    When The user clicks on Practice questions link
    Then The User should be navigated to Practice Questions page

  Scenario: Verify that user is able to navigate to Code executor page
    Given The User is on Overview of Trees page
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

  Scenario: Verify that user is able to navigate to Terminologies page
    When The user clicks on Terminologies link
    Then The User should be navigated to Terminologies page

  Scenario: Verify the data is present in the table on Terminlogies page
    Given The User is on Terminologies page
    When The Terminlogies page fully gets loaded
    Then The user should be able to view all the data in table

  Scenario: Verify that user is able to navigate to Practice questions page
    Given The User is on Terminologies page
    When The user clicks on Practice questions link
    Then The User should be navigated to Practice Questions page

  Scenario: Verify that user is able to navigate to Code executor page
    Given The User is on Terminologies page
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

  Scenario: Verify that user is able to navigate to Types of Trees page
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

  Scenario: Verify that user is able to navigate to Tree Traversals page
    When The user clicks on Tree Traversals link
    Then The User should be navigated to Tree Traversals page

  Scenario: Verify that user is able to navigate to Tree Traversals page
    Given The User is on Tree Traversals page
    When The Tree Traversals page gets fully loaded
    Then The User should be able to view Level Order Traversal example image

  Scenario: Verify that user is able to navigate to Tree Traversals page
    Given The User is on Tree Traversals page
    When When Tree Traversals page gets fully loaded
    Then The User should be able to view all the data in Depth First Traversal types table

  Scenario: Verify that user is able to navigate to Practice questions page
    Given The User is on Tree Traversals page
    When The user clicks on Practice questions link
    Then The User should be navigated to Practice Questions page

  Scenario: Verify that user is able to navigate to Code executor page
    Given The User is on Tree Traversals page
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

  Scenario: Verify that user is able to navigate to Traversals-Illustration page
    When The user clicks on Traversals-Illustration link
    Then The User should be navigated to Traversals-Illustration page

  Scenario: Verify that user is able to navigate to Traversals-Illustration page
    Given The User is on Traversals-Illustration page
    When The Traversals-Illustration page gets fully loaded
    Then The User should be able to view Depth First Traversal diagram

  Scenario: Verify that user is able to navigate to Practice questions page
    Given The User is on Traversals-Illustration page
    When The user clicks on Practice questions link
    Then The User should be navigated to Practice Questions page

  Scenario: Verify that user is able to navigate to Code executor page
    Given The User is on Traversals-Illustration page
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

  Scenario: Verify that user is able to navigate to Binary Trees page
    When The user clicks on Binary Trees link
    Then The User should be navigated to Binary Trees page

  Scenario: Verify that user is able to navigate to Binary Trees page
    Given The User is on Binary Trees page
    When Binary Tree page gets fully loaded
    Then The User should be able to view Binary Trees diagram

  Scenario: Verify that user is able to navigate to Practice questions page
    Given The User is on Binary Trees page
    When The user clicks on Practice questions link
    Then The User should be navigated to Practice Questions page

  Scenario: Verify that user is able to navigate to Code executor page
    Given The User is on Binary Trees page
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

  Scenario: Verify that user is able to navigate to Types of Binary Trees page
    When The user clicks on Types of Binary Trees link
    Then The User should be navigated to Types of Binary Trees page

  Scenario: Verify that user is able to navigate to Types of Binary Trees page
    Given The User is on Types of Binary Trees page
    When The Types of Binary Tress page gets fully loaded
    Then The User should be able to view the Complete binary tree diagram

  Scenario: Verify that user is able to navigate to Types of Binary Trees page
    Given The User is on Types of Binary Trees page
    When Types of Binary Tress page gets fully loaded
    Then The User should be able to view Full binary tree diagram

  Scenario: Verify that user is able to navigate to Practice questions page
    Given The User is on Types of Binary Trees page
    When The user clicks on Practice questions link
    Then The User should be navigated to Practice Questions page

  Scenario: Verify that user is able to navigate to Code executor page
    Given The User is on Types of Binary Trees page
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

  Scenario: Verify that user is able to navigate to Implementation in Python page
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

  Scenario: Verify that user is able to navigate to Binary Tree Traversals page
    When The user clicks on Binary Tree Traversals link
    Then The User should be navigated to Binary Tree Traversals page

  Scenario: Verify that user is able to navigate to Binary Tree Traversals page
    Given The User is on Binary Tree Travesals page
    When The Binary Tree Traversals page gets fully loaded
    Then The User should be able to view path of traversals In Binary Tree Data diagram

  Scenario: Verify that user is able to navigate to Practice questions page
    Given The User is on Binary Tree Travesals page
    When The user clicks on Practice questions link
    Then The User should be navigated to Practice Questions page

  Scenario: Verify that user is able to navigate to Code executor page
    Given The User is on Binary Tree Travesals page
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

  Scenario: Verify that user is able to navigate to Implementation of Binary Trees page
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

  Scenario: Verify that user is able to navigate to Applications of Binary Trees page
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

  Scenario: Verify that user is able to navigate to Binary Search Trees page
    When The user clicks on Binary Search Trees link
    Then The User should be navigated to Binary Search Trees page

  Scenario: Verify that user is able to navigate to Binary Search Trees page
    Given The User is on Binary Search Trees page
    When The Binary Search Trees page fully loaded
    Then The User should be able to view Binary Search Tree diagram

  Scenario: Verify that user is able to navigate to Practice questions page
    Given The User is on Binary Search Trees page
    When The user clicks on Practice questions link
    Then The User should be navigated to Practice Questions page

  Scenario: Verify that user is able to navigate to Code executor page
    Given The User is on Binary Search Trees page
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

  Scenario: Verify that user is able to navigate to Implementation of BST page
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

  Scenario: Verify TryEditor
    Given The User is on Try Editor Page
    When The user clicks the Run Button without entering the code in the Editor
    Then The user is not able to see an error message

  Scenario: Verify  TryEditor
    Given The User is on Try Editor Page
    When The user enters a valid Python code in Editor and click  on the Run button
    Then The user should be able to execute the code

  Scenario: Verify  TryEditor
    Given The User is on Try Editor Page
    When The user enters an invalid code in Editor and click on the Run button
    Then The user should get an error message after excuting the code