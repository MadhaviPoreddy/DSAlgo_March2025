package com.dsalgo.automation.stepdefinations;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.List;
import java.util.Map;

import com.dsalgo.automation.pages.TreePage;
import com.dsalgo.automation.utils.ExcelReader;
import com.dsalgo.automation.utils.LoggerLoad;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class TreeStepDef {

	TreePage treePage = new TreePage();
	List<Map<String, String>> testData = ExcelReader.getAllRows("Tree");

	@Given("The user is on Tree page")
	public void the_user_is_on_tree_page() {
		String treePageTile = treePage.verifyTitleOfPage();
		LoggerLoad.info("User is on page " +treePageTile);
	}

	@When("The user clicks on Overview of Trees link")
	public void when_the_user_clicks_on_overview_of_trees_link() {
		treePage.clickOverviewOfTreeslnk();
	}

	@Then("The User should be navigated to Overview of Trees page")
	public void then_the_user_should_be_navigated_to_overview_of_trees_page() {
		Map<String, String> specificRow = testData.get(1);
		String expectedTitle = specificRow.get("PageTitle");
		String OvrvwOfTreePageTitle = treePage.verifyTitleOfPage();
		assertEquals(OvrvwOfTreePageTitle, expectedTitle);

	}

	@Given("The User is on Overview of Trees page")
	public void given_the_user_is_on_overview_of_trees_page() {
		treePage.clickOverviewOfTreeslnk();

	}

	@Then("The User should be able to view Tree image on The Overveiw of Tress page")
	public void then_the_user_should_be_able_to_view_tree_image_on_the_overveiw_of_tress_page() {
		Boolean isDisplayed = treePage.verifyOverviewImage();
		assertTrue(isDisplayed);

	}

	@Given("The User is on Overview of Trees Try Editor Page")
	public void the_user_is_on_overview_of_trees_try_editor_page() {
		treePage.clickOverviewOfTreeslnk();
		treePage.tryCodeEditor();

	}

	@When("The user clicks on Terminologies link")
	public void when_the_user_clicks_on_terminologies_link() {
		treePage.clickTerminologieslnk();

	}

	@Then("The User should be navigated to Terminologies page")
	public void then_the_user_should_be_navigated_to_terminologies_page() {
		treePage.clickTerminologieslnk();
		Map<String, String> specificRow = testData.get(2);
		String expectedTitle = specificRow.get("PageTitle");
		String terminologiesPageTitle = treePage.verifyTitleOfPage();
		assertEquals(terminologiesPageTitle, expectedTitle);

	}

	@Given("The User is on Terminologies page")
	public void given_the_user_is_on_terminologies_page() {
		treePage.clickTerminologieslnk();

	}

	@Then("The user should be able to view all the data in table")
	public void then_the_user_should_be_able_to_view_all_the_data_in_table() {
		Boolean isDisplayed = treePage.verifyTerminologiesTable();
		assertTrue(isDisplayed);
		String rowData = treePage.verifyTermTableLastRow();
		try {
			assertEquals(rowData, "");
			throw new AssertionError("Test failed: Column Value is blank");
		} catch (AssertionError e) {
			LoggerLoad.error("Assertion failed: " + e.getMessage());
			throw e;
		}
	}

	@Given("The User is on Terminologies Try Editor Page")
	public void the_user_is_on_terminologies_try_editor_page() {
		treePage.clickTerminologieslnk();
		treePage.tryCodeEditor();
	}

	@When("The user clicks on Types of Trees link")
	public void when_the_user_clicks_on_types_of_trees_link() {
		treePage.clickTypesOfTreeslnk();

	}

	@Then("The User should be navigated to Types of Trees page")
	public void then_the_user_should_be_navigated_to_types_of_trees_page() {
		Map<String, String> specificRow = testData.get(3);
		String expectedTitle = specificRow.get("PageTitle");
		String typesOfTreePageTitle = treePage.verifyTitleOfPage();
		assertEquals(typesOfTreePageTitle, expectedTitle);

	}

	@Given("The User is on Types of Trees page")
	public void given_the_user_is_on_types_of_trees_page() {
		treePage.clickTypesOfTreeslnk();

	}

	@Given("The User is on Types of Trees Try Editor Page")
	public void the_user_is_on_types_of_trees_try_editor_page() {
		treePage.clickTypesOfTreeslnk();
		treePage.tryCodeEditor();
	}

	@When("The user clicks on Tree Traversals link")
	public void when_the_user_clicks_on_tree_traversals_link() {
		treePage.clickTreeTraversalsLnk();

	}

	@Then("The User should be navigated to Tree Traversals page")
	public void then_the_user_should_be_navigated_to_tree_traversals_page() {
		Map<String, String> specificRow = testData.get(4);
		String expectedTitle = specificRow.get("PageTitle");
		String treeTraversalPageTitle = treePage.verifyTitleOfPage();
		assertEquals(treeTraversalPageTitle, expectedTitle);

	}

	@Given("The User is on Tree Traversals page")
	public void given_the_user_is_on_tree_traversals_page() {
		treePage.clickTreeTraversalsLnk();

	}

	@Then("The User should be able to view Level Order Traversal example image")
	public void then_the_user_should_be_able_to_view_level_order_traversal_example_image() {
		Boolean isDisplayed = treePage.verifyTreeTraversalImage();
		assertTrue(isDisplayed);

	}

	@Then("The User should be able to view all the data in Depth First Traversal types table")
	public void then_the_user_should_be_able_to_view_all_the_data_in_depth_first_traversal_types_table() {

		Boolean isDisplayed = treePage.verifyTreeTraversalTable();
		assertTrue(isDisplayed);
	}

	@Given("The User is on Tree Traversals Try Editor Page")
	public void the_user_is_on_tree_traversals_try_editor_page() {
		treePage.clickTreeTraversalsLnk();
		treePage.tryCodeEditor();
	}

	@When("The user clicks on Traversals-Illustration link")
	public void when_the_user_clicks_on_traversalsillustration_link() {
		treePage.clickTraversalsIllustrationLnk();

	}

	@Then("The User should be navigated to Traversals-Illustration page")
	public void then_the_user_should_be_navigated_to_traversalsillustration_page() {
		Map<String, String> specificRow = testData.get(5);
		String expectedTitle = specificRow.get("PageTitle");
		String traversalIllsPageTitle = treePage.verifyTitleOfPage();
		assertEquals(traversalIllsPageTitle, expectedTitle);

	}

	@Given("The User is on Traversals-Illustration page")
	public void given_the_user_is_on_traversalsillustration_page() {
		treePage.clickTraversalsIllustrationLnk();

	}

	@Then("The User should be able to view Depth First Traversal diagram")
	public void then_the_user_should_be_able_to_view_depth_first_traversal_diagram() {
		Boolean isDisplayed = treePage.verifyDepthFirstTraversalImage();
		assertTrue(isDisplayed);

	}

	@Given("The User is on Traversals-Illustration Try Editor Page")
	public void the_user_is_on_traversals_illustration_try_editor_page() {
		treePage.clickTraversalsIllustrationLnk();
		treePage.tryCodeEditor();
	}

	@When("The user clicks on Binary Trees link")
	public void when_the_user_clicks_on_binary_trees_link() {
		treePage.clickBinaryTreesLnk();

	}

	@Then("The User should be navigated to Binary Trees page")
	public void then_the_user_should_be_navigated_to_binary_trees_page() {
		Map<String, String> specificRow = testData.get(6);
		String expectedTitle = specificRow.get("PageTitle");
		String binaryTreePageTitle = treePage.verifyTitleOfPage();
		assertEquals(binaryTreePageTitle, expectedTitle);

	}

	@Given("The User is on Binary Trees page")
	public void given_the_user_is_on_binary_trees_page() {
		treePage.clickBinaryTreesLnk();

	}

	@Then("The User should be able to view Binary Trees diagram")
	public void then_the_user_should_be_able_to_view_binary_trees_diagram() {
		Boolean isDisplayed = treePage.verifyBinaryTreeImage();
		assertTrue(isDisplayed);

	}

	@Given("The User is on Binary Trees Try Editor Page")
	public void the_user_is_on_binary_trees_try_editor_page() {
		treePage.clickBinaryTreesLnk();
		treePage.tryCodeEditor();
	}

	@When("The user clicks on Types of Binary Trees link")
	public void when_the_user_clicks_on_types_of_binary_trees_link() {
		treePage.clickTypesOfBinaryTreesLnk();

	}

	@Then("The User should be navigated to Types of Binary Trees page")
	public void then_the_user_should_be_navigated_to_types_of_binary_trees_page() {
		Map<String, String> specificRow = testData.get(7);
		String expectedTitle = specificRow.get("PageTitle");
		String typesOfBinaryPageTitle = treePage.verifyTitleOfPage();
		assertEquals(typesOfBinaryPageTitle, expectedTitle);

	}

	@Given("The User is on Types of Binary Trees page")
	public void given_the_user_is_on_types_of_binary_trees_page() {
		treePage.clickTypesOfBinaryTreesLnk();
	}

	@Then("The User should be able to view the Complete binary tree diagram")
	public void then_the_user_should_be_able_to_view_the_complete_binary_tree_diagram() {
		Boolean isDisplayed = treePage.verifyCompletteBinaryTreeImage();
		assertTrue(isDisplayed);
	}

	@Then("The User should be able to view Full binary tree diagram")
	public void then_the_user_should_be_able_to_view_full_binary_tree_diagram() {
		Boolean isDisplayed = treePage.verifyFullBinaryTreeImage();
		assertTrue(isDisplayed);

	}

	@Given("The User is on Types of Binary Trees Try Editor Page")
	public void the_user_is_on_types_of_binary_trees_try_editor_page() {
		treePage.clickTypesOfBinaryTreesLnk();
		treePage.tryCodeEditor();
	}

	@When("The user clicks on Implementation in Python link")
	public void when_the_user_clicks_on_implementation_in_python_link() {
		treePage.clickImplementationInPythonLnk();
	}

	@Then("The User should be navigated to Implementation in Python page")
	public void then_the_user_should_be_navigated_to_implementation_in_python_page() {
		Map<String, String> specificRow = testData.get(8);
		String expectedTitle = specificRow.get("PageTitle");
		String impOfPythonPageTitle = treePage.verifyTitleOfPage();
		assertEquals(impOfPythonPageTitle, expectedTitle);
	}

	@Given("The User is on Implementation in Python page")
	public void given_the_user_is_on_implementation_in_python_page() {
		treePage.clickImplementationInPythonLnk();
	}

	@Given("The User is on Implementation in Python Try Editor Page")
	public void the_user_is_on_implementation_in_python_try_editor_page() {
		treePage.clickImplementationInPythonLnk();
		treePage.tryCodeEditor();
	}

	@When("The user clicks on Binary Tree Traversals link")
	public void when_the_user_clicks_on_binary_tree_traversals_link() {
		treePage.clickBinaryTreeTraversalsLnk();

	}

	@Then("The User should be navigated to Binary Tree Traversals page")
	public void then_the_user_should_be_navigated_to_binary_tree_traversals_page() {
		Map<String, String> specificRow = testData.get(9);
		String expectedTitle = specificRow.get("PageTitle");
		String binTreeTravPageTitle = treePage.verifyTitleOfPage();
		assertEquals(binTreeTravPageTitle, expectedTitle);
	}

	@Given("The User is on Binary Tree Travesals page")
	public void given_the_user_is_on_binary_tree_travesals_page() {
		treePage.clickBinaryTreeTraversalsLnk();
	}

	@Then("The User should be able to view path of traversals In Binary Tree Data diagram")
	public void then_the_user_should_be_able_to_view_path_of_traversals_in_binary_tree_data_diagram() {
		Boolean isDisplayed = treePage.verifyBinaryTreeDataImage();
		assertTrue(isDisplayed);
	}

	@Given("The User is on Binary Tree Traversals Try Editor Page")
	public void the_user_is_on_binary_tree_traversals_try_editor_page() {
		treePage.clickBinaryTreeTraversalsLnk();
		treePage.tryCodeEditor();
	}

	@When("The user clicks on Implementation of Binary Trees link")
	public void when_the_user_clicks_on_implementation_of_binary_trees_link() {
		treePage.clickImplementationOfBinaryTreesLnk();
	}

	@Then("The User should be navigated to Implementation of Binary Trees page")
	public void then_the_user_should_be_navigated_to_implementation_of_binary_trees_page() {
		Map<String, String> specificRow = testData.get(10);
		String expectedTitle = specificRow.get("PageTitle");
		String impBinTreePageTitle = treePage.verifyTitleOfPage();
		assertEquals(impBinTreePageTitle, expectedTitle);
	}

	@Given("The User is on Implementation of Binary Trees page")
	public void given_the_user_is_on_implementation_of_binary_trees_page() {
		treePage.clickImplementationOfBinaryTreesLnk();
	}

	@When("The user clicks on Applications of Binary Trees link")
	public void when_the_user_clicks_on_applications_of_binary_trees_link() {
		treePage.clickApplicationsOfBinaryTreesLnk();
	}

	@Given("The User is on Implementation of Binary Trees Try Editor Page")
	public void the_user_is_on_implementation_of_binary_trees_try_editor_page() {
		treePage.clickApplicationsOfBinaryTreesLnk();
		treePage.tryCodeEditor();
	}

	@Then("The User should be navigated to Applications of Binary Trees page")
	public void then_the_user_should_be_navigated_to_applications_of_binary_trees_page() {
		Map<String, String> specificRow = testData.get(11);
		String expectedTitle = specificRow.get("PageTitle");
		String appOfBinaryPageTitle = treePage.verifyTitleOfPage();
		assertEquals(appOfBinaryPageTitle, expectedTitle);
	}

	@Given("The User is on Applications of Binary Trees page")
	public void given_the_user_is_on_applications_of_binary_trees_page() {
		treePage.clickApplicationsOfBinaryTreesLnk();
	}

	@Given("The User is on Applications of Binary Trees Try Editor Page")
	public void the_user_is_on_applications_of_binary_trees_try_editor_page() {
		treePage.clickApplicationsOfBinaryTreesLnk();
		treePage.tryCodeEditor();
	}

	@When("The user clicks on Binary Search Trees link")
	public void when_the_user_clicks_on_binary_search_trees_link() {
		treePage.clickBinarySearchTreesLnk();

	}

	@Then("The User should be navigated to Binary Search Trees page")
	public void then_the_user_should_be_navigated_to_binary_search_trees_page() {
		Map<String, String> specificRow = testData.get(12);
		String expectedTitle = specificRow.get("PageTitle");
		String binSrcTreePageTitle = treePage.verifyTitleOfPage();
		assertEquals(binSrcTreePageTitle, expectedTitle);
	}

	@Given("The User is on Binary Search Trees page")
	public void given_the_user_is_on_binary_search_trees_page() {
		treePage.clickBinarySearchTreesLnk();
	}

	@Then("The User should be able to view Binary Search Tree diagram")
	public void then_the_user_should_be_able_to_view_binary_search_tree_diagram() {
		Boolean isDisplayed = treePage.verifyBinarySearchTreeImage();
		assertTrue(isDisplayed);
	}

	@Given("The User is on Binary Search Trees Try Editor Page")
	public void the_user_is_on_binary_search_trees_try_editor_page() {
		treePage.clickBinarySearchTreesLnk();
		treePage.tryCodeEditor();
	}

	@When("The user clicks on Implementation of BST link")
	public void when_the_user_clicks_on_implementation_of_bst_link() {
		treePage.clickImplementationOfBSTLnk();
	}

	@Then("The User should be navigated to Implementation of BST page")
	public void then_the_user_should_be_navigated_to_implementation_of_bst_page() {
		Map<String, String> specificRow = testData.get(13);
		String expectedTitle = specificRow.get("PageTitle");
		String impOfBSTPageTitle = treePage.verifyTitleOfPage();
		assertEquals(impOfBSTPageTitle, expectedTitle);
	}

	@Given("The User is on Implementation of BST page")
	public void given_the_user_is_on_implementation_of_bst_page() {
		treePage.clickImplementationOfBSTLnk();
	}

	@Given("The User is on Implementation of BST Try Editor Page")
	public void the_user_is_on_implementation_of_bst_try_editor_page() {
		treePage.clickImplementationOfBSTLnk();
		treePage.tryCodeEditor();
	}
}