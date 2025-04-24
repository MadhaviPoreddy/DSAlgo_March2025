
	
	package com.dsalgo.automation.pages;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dsalgo.automation.driver.DriverFactory;

	public class LinkedListPage {

	    WebDriver driver;
		@FindBy (xpath="//a[@href ='linked-list']") WebElement linkedListGetStartedBtn;
		
		//Introduction
		@FindBy (xpath="//*[text()='Introduction']") WebElement linkedListIntroductionLink;
		@FindBy (xpath="//a[@href='/tryEditor']") WebElement linkedListIntroductionTryEdit;
		@FindBy (xpath="//*[@id=\"answer_form\"]/div/div/div[6]/div[1]/div") WebElement linkedListIntroductionTextEdit;
		@FindBy (xpath="//button[text()='Run']") WebElement linkedListIntroductionTextEditRun;
		@FindBy (xpath="//a[@href='/linked-list/introduction/']") WebElement linkedListIntroductionFromLeftMenu;
		
		//Creating Linked List
		@FindBy (xpath="//*[text()='Creating Linked LIst']") WebElement creatingLinkedList;
		@FindBy (xpath="//a[@href='/tryEditor']") WebElement creatingLinkedListTryEdit;
		@FindBy (xpath=".CodeMirror") WebElement creatingLinkedListTextEdit;
		@FindBy (xpath="//button[text()='Run']") WebElement creatingLinkedListTextEditRun;
		@FindBy (xpath="//a[@href='/linked-list/creating-linked-list/']") WebElement creatingLinkedListFromLeftMenu;

		//Types of Linked Lists
		@FindBy (xpath="//*[text()='Types of Linked List']") WebElement typesOfListLink;
		@FindBy (xpath="//a[@href='/tryEditor']") WebElement typesOfListTryEdit;
		@FindBy (xpath=".CodeMirror") WebElement typesOfListTextEdit;
		@FindBy (xpath="//button[text()='Run']") WebElement typesOfListTextEditRun;
		@FindBy (xpath="//a[@href='/linked-list/types-of-linked-list/']") WebElement typesOfListLinkFromLeftMenu;
		@FindBy (xpath="//a [text()='singly linked list']") WebElement TypesOfLL_SinglyLinkedListLink;
		@FindBy (xpath="//a [text()='linked list']") WebElement TypesOfLL_LinkedListLink;

		

		//Implement Linked List in Python
		@FindBy (xpath="//*[text()='Implement Linked List in Python']") WebElement implementLinkedList;
		@FindBy (xpath="//a[@href='/tryEditor']") WebElement implementLinkedListTryEdit;
		@FindBy (xpath=".CodeMirror") WebElement implementLinkedListTextEdit;
		@FindBy (xpath="//button[text()='Run']") WebElement implementLinkedListTextEditRun;
		@FindBy (xpath="//a[@href='/linked-list/implement-linked-list-in-python/']") WebElement implementLinkedListFromLeftMenu;

		//Traversal
		@FindBy (xpath="//*[text()='Traversal']") WebElement traversalLink;
		@FindBy (xpath="//a[@href='/tryEditor']") WebElement traversalTryEdit;
		@FindBy (xpath=".CodeMirror") WebElement traversalTextEdit;
		@FindBy (xpath="//button[text()='Run']") WebElement traversalTextEditRun;
		@FindBy (xpath="//a[@href='/linked-list/traversal/']") WebElement traversalLinkedListFromLeftMenu;

		//Insertion
		@FindBy (xpath="//*[text()='Insertion']") WebElement insertionLink;
		@FindBy (xpath="//a[@href='/tryEditor']") WebElement insertionTryEdit;
		@FindBy (xpath=".CodeMirror") WebElement insertionTextEdit;
		@FindBy (xpath="//button[text()='Run']") WebElement insertionTextEditRun;
		@FindBy (xpath="//a[@href='/linked-list/insertion-in-linked-list/']") WebElement insertionLinkedListFromLeftMenu;

		//Deletion
		@FindBy (xpath="//*[text()='Deletion']") WebElement deletionLink;
		@FindBy (xpath="//a[@href='/tryEditor']") WebElement deletionTryEdit;
		@FindBy (xpath=".CodeMirror") WebElement deletionTextEdit;
		@FindBy (xpath="//button[text()='Run']") WebElement deletionTextEditRun;
		@FindBy (xpath="//a[@href='/linked-list/deletion-in-linked-list/']") WebElement deletionLinkedListFromLeftMenu;
		
		
		
		//practice Questions
		@FindBy (xpath="//a [text()='Practice Questions']") WebElement linkedListPracticeLink;
		
		@FindBy(xpath = "//pre[@id='output']") WebElement output;
		
		
		public LinkedListPage()
	 	{
			this.driver=DriverFactory.getDriver();
			PageFactory.initElements( driver, this);
	 	}
		public void linkedListGetStartedBtn()
		{
			linkedListGetStartedBtn.click();
		}
		public String verfyPageTitle()
		{
	 		return driver.getTitle();
	 
	 	}
		public void linkedListIntroductionLink()
		{
		linkedListIntroductionLink.click();
		}
		
		public void linkedListIntroductionTryEdit()
		{
			linkedListIntroductionTryEdit.click();
		}
		public void linkedListIntroductionTextEdit()
		{
			linkedListIntroductionTextEdit.click();
		}
		
		public void linkedListIntroductionTextEditRun()
		{
			linkedListIntroductionTextEditRun.click();
		}
		public void linkedListIntroductionFromLeftMenu()
		{
			linkedListIntroductionFromLeftMenu.click();
		}
		
		
		//2nd link
		public void creatingLinkedList()
		{
			creatingLinkedList.click();
		}
		
		public void creatingLinkedListTryEdit()
		{
			creatingLinkedListTryEdit.click();
		}
		public String verifyOutput() {
			return output.getText();
		}
		
		//3rd link
		public void typesOfListLink()
		{
			typesOfListLink.click();
		}
		
		public void typesOfListTryEdit()
		{
			typesOfListTryEdit.click();
		}
		public void TypesOfLL_SinglyLinkedListLink()
		{
			TypesOfLL_SinglyLinkedListLink.click();
		}
		
		public void TypesOfLL_LinkedListLink()
		{
			TypesOfLL_LinkedListLink.click();
		}
		
		
		//4th link
		public void implementLinkedList()
		{
			implementLinkedList.click();
		}
		
		public void implementLinkedListTryEdit()
		{
			implementLinkedListTryEdit.click();
		}
		
		//5th link
		public void traversalLink()
		{
			traversalLink.click();
		}
		
		public void traversalTryEdit()
		{
			traversalTryEdit.click();
		}
		
		
		//6th link
		public void insertionLink()
		{
			insertionLink.click();
		}
		
		public void insertionTryEdit()
		{
			insertionTryEdit.click();
		}
		
		//7th link
		public void deletionLink()
		{
			deletionLink.click();
		}
		public void deletionTryEdit()
		{
			deletionTryEdit.click();
		}
		public void linkedListPracticeLink()
		{
			linkedListPracticeLink.click();
		}
		 
		   public void testAssertFalseWithMessage() {
		        // Assertion with a message to provide context
		       assert false : "This test is designed to fail";
		    }
		
	}