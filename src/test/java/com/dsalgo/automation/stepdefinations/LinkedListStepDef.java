package com.dsalgo.automation.stepdefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;
import com.dsalgo.automation.pages.*;
//import com.dsalgo.automation.pages.LinkedListPage;
//import com.dsalgo.automation.pages.StackPage;
import static org.testng.Assert.*;
import static org.assertj.core.api.Assertions.*;
import java.util.*;
import org.apache.poi.ss.usermodel.Cell;
import org.junit.Assert;
import com.dsalgo.automation.driver.DriverFactory;
import com.dsalgo.automation.utils.ExcelReader;

public class LinkedListStepDef {

	
	WebDriver driver=new ChromeDriver();
	LinkedListPage linkedList=new LinkedListPage();;
	List<Map<String, String>> testData = ExcelReader.getAllRows("LinkedList");
	List<Map<String, String>> testData1 = ExcelReader.getAllRows("CodeEditor");
	
	@When("The user clicks the Getting Started button in Linked List After Sign in")
	public void the_user_clicks_the_button_in_LinkedList_panel() {
		linkedList.linkedListGetStartedBtn();
	System.out.println("Stack Home page is displayed");
}
	
	@Then("The user will be directed to Linked List Data Structure Page")
	public void the_user_will_be_directed_to_data_structure_page() {
		Map<String, String> specificRow = testData.get(0);
     	String expectedTitle = specificRow.get("PageTitle");
     	String linkedListTitle = linkedList.verfyPageTitle();
     	Assert.assertEquals(linkedListTitle, expectedTitle);
		System.out.println("Title of the page is : " +linkedListTitle);
		System.out.println("Title passed through excel is" +expectedTitle);

	}

	@Given("The user is in the Linked List page after Sign in")
	public void the_user_is_in_the_LinkedList_Introduction_page_after_sign_in() {
    Map<String, String> specificRow = testData.get(0);
 	String expectedTitle = specificRow.get("PageTitle");
 	String LinkedListTitle = linkedList.verfyPageTitle();
 	Assert.assertEquals(LinkedListTitle, expectedTitle);
	System.out.println("Title of the page is : " +LinkedListTitle);
 
	}

	@When("The user clicks Introduction link")
	public void the_user_clicks_Introduction_link() {
		linkedList.linkedListIntroductionLink();
	}

	@Then("The user should be redirected to Introduction page")
	public void the_user_should_be_redirected_to_page() {
		Map<String, String> specificRow = testData.get(1);
     	String expectedTitle = specificRow.get("PageTitle");
     	String LinkedListTitle = linkedList.verfyPageTitle();
     	Assert.assertEquals(LinkedListTitle, expectedTitle);
		System.out.println("Title of the page is : " +LinkedListTitle);
	}

	@Given("The user is on the Linked List Introduction page")
	public void the_user_is_on_the_Introduction_page() {
		linkedList.linkedListIntroductionLink();
	}

	@When("The user clicks Try Here button in Linked List Introcution page")
	public void the_user_clicks_Try_Here_button_in_linked_list_introcution_page() {
		linkedList.linkedListIntroductionTryEdit();
	}

//	@Then("The user should be redirected to a page having an try Editor with a Run button to test")
//	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}

	@Given("The user is in the Linked List Introduction tryEditor page")
	public void the_user_is_in_the_Linked_List_Introduction_try_editor_page() {
		linkedList.linkedListIntroductionLink();
		linkedList.linkedListIntroductionTryEdit();
	}
	
	
	@When("The user clicks Linked List Practice Questions button")
	public void the_user_clicks_button() {
		linkedList.linkedListPracticeLink();
	}
		
	@Then("The user should be redirected to Linked List Practice page")
	public void the_user_should_be_redirected_to_linkedList_Practice_page() {
		System.out.println("User is landed on Practiece questions on Operations in linkedList page");
		String PractieceQTitle=linkedList.verfyPageTitle();
		System.out.println("Title of the page is: " +PractieceQTitle);
	}

	
	@When("The user clicks Creating Linked List link")
	public void the_user_clicks_Creating_Linked_List_link() {
		linkedList.creatingLinkedList();
	}
	
	@Then("The user should be redirected to Creating Linked List page")
	public void the_user_should_be_redirected_to_Creating_Linked_List_page() {
		Map<String, String> specificRow = testData.get(2);
	 	String expectedTitle = specificRow.get("PageTitle");
	 	String LinkedListTitle = linkedList.verfyPageTitle();
	 	Assert.assertEquals(LinkedListTitle, expectedTitle);
		System.out.println("Title of the page is : " +LinkedListTitle);
	}
		
	@Given("The user is in the Creating Linked List page after Sign in")
	public void the_user_is_on_the_Creating_Linked_page() {
		linkedList.creatingLinkedList();
	}

	@When("The user clicks Introduction link from left side menu")
	public void the_user_clicks_Introduction_link_from_left_side_menu() {
		linkedList.linkedListIntroductionFromLeftMenu();
	}
	
	@When("The user clicks Try Here button in Creating Linked List page")
	public void the_user_clicks_Try_Here_button_in_Creating_LinkedList_page() {
		linkedList.creatingLinkedListTryEdit();
	}
	
	@Given("The user is in the Creating Linked List tryEditor page")
	public void the_user_is_in_the_Creating_Linked_try_editor_page() {
		linkedList.creatingLinkedList();
		linkedList.creatingLinkedListTryEdit();
	}
	
	@When("The user clicks Types of Linked List link")
	public void the_user_clicks_Typesof_Linked_List_link() {
		linkedList.typesOfListLink();
	}
	
	@Then("The user should be redirected to Types of Linked List page")
	public void the_user_should_be_redirected_to_Typesof_Linked_List_page() {
		Map<String, String> specificRow = testData.get(3);
	 	String expectedTitle = specificRow.get("PageTitle");
	 	String LinkedListTitle = linkedList.verfyPageTitle();
	 	Assert.assertEquals(LinkedListTitle, expectedTitle);
		System.out.println("Title of the page is : " +LinkedListTitle);
	}
		
	@Given("The user is in the Types of Linked List page after Sign in")
	public void the_user_is_on_the_Types_Linked_page() {
		linkedList.typesOfListLink();
	}
	
	@When("The user clicks singly linked list link in the Types of Linked List page")
	public void the_user_clicks_singly_linked_list_on_Typesof_Linked_List_page() {
		linkedList.TypesOfLL_SinglyLinkedListLink();
	}
	
	@Then("The user should be redirected to singly linked list page")
	public void the_user_should_be_redirected_to_singly_Linked_List_page() {
		Map<String, String> specificRow = testData.get(8);
	 	String expectedTitle = specificRow.get("PageTitle");
	 	String LinkedListTitle = linkedList.verfyPageTitle();
		System.out.println("Title of the page is : " +LinkedListTitle);
		System.out.println("Expected Title of the page is : " +expectedTitle);

	 	Assert.assertEquals(LinkedListTitle, expectedTitle);
		System.out.println("Title of the page is : " +LinkedListTitle);
	}
	
	@When("The user clicks linked list link in the Types of Linked List page")
	public void the_user_clicks_linked_list_link_on_Typesof_Linked_List_page() {
		linkedList.TypesOfLL_LinkedListLink();
	}
	
	@Then("The user should be redirected to linked list link page")
	public void the_user_should_be_redirected_to_Linked_List_page_through_Linkedlist_hyperlink() {
		Map<String, String> specificRow = testData.get(9);
	 	String expectedTitle = specificRow.get("PageTitle");
	 	String LinkedListTitle = linkedList.verfyPageTitle();
	 	System.out.println("Title of the page is : " +LinkedListTitle);
	 	System.out.println("Title from excel sheet of the page is : " +expectedTitle);
	 	Assert.assertEquals(LinkedListTitle, expectedTitle);
		System.out.println("Title of the page is : " +LinkedListTitle);
	}
	
	@When("The user clicks doubly linked list link in the Types of Linked List page")
	public void the_user_clicks_doubly_linked_list_on_Typesof_Linked_List_page() {
		linkedList.TypesOfLL_SinglyLinkedListLink();
	}
	
	@Then("The user should be redirected to doubly linked list page")
	public void the_user_should_be_redirected_to_doubly_Linked_List_page() {
		Map<String, String> specificRow = testData.get(10);
	 	String expectedTitle = specificRow.get("PageTitle");
	 	String LinkedListTitle = linkedList.verfyPageTitle();
	 	System.out.println("Title of the page is : " +LinkedListTitle);
	 	System.out.println("Title from excel sheet of the page is : " +expectedTitle);
	 	Assert.assertEquals(LinkedListTitle, expectedTitle);
		System.out.println("Title of the page is : " +LinkedListTitle);
	}
	
	@When("The user clicks type of the linked list page link in the Types of Linked List page")
	public void the_user_clicks_typesof_linked_list_link_on_Typesof_Linked_List_page() {
		linkedList.TypesOfLL_SinglyLinkedListLink();
	}
	
	@Then("The user should be redirected to type of the linked list page")
	public void the_user_should_be_redirected_to_typesof_Linked_List_page_through_link() {
		Map<String, String> specificRow = testData.get(11);
	 	String expectedTitle = specificRow.get("PageTitle");
	 	String LinkedListTitle = linkedList.verfyPageTitle();
	 	System.out.println("Title of the page is : " +LinkedListTitle);
	 	System.out.println("Title from excel sheet of the page is : " +expectedTitle);
	 	Assert.assertEquals(LinkedListTitle, expectedTitle);
	 	
	//	System.out.println("Title of the page is : " +LinkedListTitle);
	}
	
	@When("The user clicks Try Here button in Types of Linked List page")
	public void the_user_clicks_Try_Here_button_in_Typesof_LinkedList_page() {
		linkedList.typesOfListTryEdit();
	}
	

	@Given("The user is in the Types of Linked List tryEditor page")
	public void the_user_is_in_the_Typesof_Linked_try_editor_page() {
		linkedList.typesOfListLink();
		linkedList.typesOfListTryEdit();
	}
	
	@When("The user clicks Implement Linked List in Python link")
	public void the_user_clicks_Implement_Linked_List_link() {
		linkedList.implementLinkedList();
	}
	
	@Then("The user should be redirected to Implement Linked List in Python page")
	public void the_user_should_be_redirected_to_Implement_Linked_List_page() {
		Map<String, String> specificRow = testData.get(4);
	 	String expectedTitle = specificRow.get("PageTitle");
	 	String LinkedListTitle = linkedList.verfyPageTitle();
	 	Assert.assertEquals(LinkedListTitle, expectedTitle);
		System.out.println("Title of the page is : " +LinkedListTitle);
	}
		
	
	@Given("The user is on the Implement Linked List in Python page")
	public void the_user_is_in_the_Implement_Linkedlist_Python_page_after_sign_in() {
		linkedList.implementLinkedList();

	}
	
	@When("The user clicks Try Here button in Implement Linked List in Python page")
	public void the_user_clicks_Try_Here_button_in_Implement_LinkedList_page() {
		linkedList.implementLinkedListTryEdit();
	}
	
	@Given("The user is in the Implement Linked List in Python tryEditor page")
	public void the_user_is_in_the_Implement_Linked_try_editor_page() {
		linkedList.implementLinkedList();
		linkedList.implementLinkedListTryEdit();
	}
	
	@When("The user clicks Traversal link")
	public void the_user_clicks_Traversal_link() {
		linkedList.traversalLink();
	}

	@Then("The user should be redirected to Traversal page")
	public void the_user_should_be_redirected_to_Traversal_page() {
		Map<String, String> specificRow = testData.get(5);
     	String expectedTitle = specificRow.get("PageTitle");
     	String LinkedListTitle = linkedList.verfyPageTitle();
     	Assert.assertEquals(LinkedListTitle, expectedTitle);
		System.out.println("Title of the page is : " +LinkedListTitle);
	}

	@Given("The user is on the Traversal page")
	public void the_user_is_on_the_Traversal_page() {
		linkedList.traversalLink();
	}

	@When("The user clicks Try Here button in Traversal page")
	public void the_user_clicks_Try_Here_button_in_linked_list_Traversal_page() {
		linkedList.traversalTryEdit();
	}
	
	@Given("The user is in the Traversal tryEditor page")
	public void the_user_is_on_the_Traversal_tryEditor_page() {
		linkedList.traversalLink();
		linkedList.traversalTryEdit();
	}
	
	@When("The user clicks Insertion link")
	public void the_user_clicks_Insertion_link() {
		linkedList.insertionLink();
	}

	@Then("The user should be redirected to Insertion page")
	public void the_user_should_be_redirected_to_Insertion_page() {
		Map<String, String> specificRow = testData.get(6);
     	String expectedTitle = specificRow.get("PageTitle");
     	String LinkedListTitle = linkedList.verfyPageTitle();
     	Assert.assertEquals(LinkedListTitle, expectedTitle);
		System.out.println("Title of the page is : " +LinkedListTitle);
	}
	
	@Given("The user is on the Insertion page")
	public void the_user_is_on_the_Insertion_page() {
		linkedList.insertionLink();
	}

	@When("The user clicks Try Here button in Insertion page")
	public void the_user_clicks_Try_Here_button_in_linked_list_Insertion_page() {
		linkedList.insertionTryEdit();
	}
	@Given("The user is in the Insertion tryEditor page")
	public void the_user_is_on_the_Insertion_tryEditor_page() {
		linkedList.insertionLink();
		linkedList.insertionTryEdit();
	}
	@When("The user clicks Deletion link")
	public void the_user_clicks_Deletion_link() {
		linkedList.deletionLink();
	}

	@Then("The user should be redirected to Deletion page")
	public void the_user_should_be_redirected_to_Deletion_page() {
		Map<String, String> specificRow = testData.get(7);
     	String expectedTitle = specificRow.get("PageTitle");
     	String LinkedListTitle = linkedList.verfyPageTitle();
     	Assert.assertEquals(LinkedListTitle, expectedTitle);
		System.out.println("Title of the page is : " +LinkedListTitle);
	}
	
	@Given("The user is on the Deletion page")
	public void the_user_is_on_the_Deletion_page() {
		linkedList.deletionLink();
	}

	@When("The user clicks Try Here button in Deletion page")
	public void the_user_clicks_Try_Here_button_in_linked_list_Deletion_page() {
		linkedList.deletionTryEdit();
	}
	@Given("The user is in the Deletion tryEditor page")
	public void the_user_is_on_the_Deletion_tryEditor_page() {
		linkedList.deletionLink();
		linkedList.deletionTryEdit();
	}
}
