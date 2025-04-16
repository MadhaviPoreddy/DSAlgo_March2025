
	
	package com.dsalgo.automation.pages;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dsalgo.automation.driver.DriverFactory;

	public class LinkedListPage {

	    WebDriver driver= new ChromeDriver();
		String url="https://dsportalapp.herokuapp.com/login";
		@FindBy (xpath="//*[@id=\"id_username\"]") WebElement userName;
		@FindBy (xpath="//*[@id=\"id_password\"]") WebElement passWord;
		@FindBy (css="body > div.container > div > div.col-sm > form > input[type=submit]:nth-child(6)") WebElement loginBtn;
		@FindBy (xpath="/html/body/div[3]/div[3]/div/div/a") WebElement linkedListGetStartedBtn;
		@FindBy (xpath="/html/body/div[2]/ul[1]/a") WebElement arrayHeader;
		
		//Introduction
		@FindBy (xpath="/html/body/div[2]/ul[1]/a") WebElement linkedListIntroductionLink;
		@FindBy (xpath="/html/body/div[2]/div/div[2]/a") WebElement linkedListIntroductionTryEdit;
		@FindBy (xpath="//*[@id=\"answer_form\"]/div/div/div[6]/div[1]/div") WebElement linkedListIntroductionTextEdit;
		@FindBy (xpath="//*[@id=\"answer_form\"]/button") WebElement linkedListIntroductionTextEditRun;
		@FindBy (xpath="//*[@id=\"content\"]/li[1]/a") WebElement linkedListIntroductionFromLeftMenu;
		
		//Creating Linked List
		@FindBy (xpath="/html/body/div[2]/ul[2]/a") WebElement creatingLinkedList;
		@FindBy (xpath="/html/body/div[2]/div/div[2]/a") WebElement creatingLinkedListTryEdit;
		@FindBy (xpath="//*[@id=\"answer_form\"]/div/div/div[6]/div[1]/div") WebElement creatingLinkedListTextEdit;
		@FindBy (xpath="//*[@id=\"answer_form\"]/button") WebElement creatingLinkedListTextEditRun;
		@FindBy (xpath="//*[@id=\"content\"]/li[2]") WebElement creatingLinkedListFromLeftMenu;

		//Types of Linked Lists
		@FindBy (xpath="/html/body/div[2]/ul[3]/a") WebElement typesOfListLink;
		@FindBy (xpath="/html/body/div[2]/div/div[2]/a") WebElement typesOfListTryEdit;
		@FindBy (xpath="//*[@id=\"answer_form\"]/div/div/div[6]/div[1]/div") WebElement typesOfListTextEdit;
		@FindBy (xpath="//*[@id=\"answer_form\"]/button") WebElement typesOfListTextEditRun;
		@FindBy (xpath="//*[@id=\"content\"]/li[3]") WebElement typesOfListLinkFromLeftMenu;
		@FindBy (xpath="//a [text()='singly linked list']") WebElement TypesOfLL_SinglyLinkedListLink;
		@FindBy (xpath="//a [text()='linked list']") WebElement TypesOfLL_LinkedListLink;

		

		//Implement Linked List in Python
		@FindBy (xpath="/html/body/div[2]/ul[4]/a") WebElement implementLinkedList;
		@FindBy (xpath="/html/body/div[2]/div/div[2]/a") WebElement implementLinkedListTryEdit;
		@FindBy (xpath="//*[@id=\"answer_form\"]/div/div/div[6]/div[1]/div") WebElement implementLinkedListTextEdit;
		@FindBy (xpath="//*[@id=\"answer_form\"]/button") WebElement implementLinkedListTextEditRun;
		@FindBy (xpath="//*[@id=\"content\"]/li[4]") WebElement implementLinkedListFromLeftMenu;

		//Traversal
		@FindBy (xpath="/html/body/div[2]/ul[5]/a") WebElement traversalLink;
		@FindBy (xpath="/html/body/div[2]/div/div[2]/a") WebElement traversalTryEdit;
		@FindBy (xpath="//*[@id=\"answer_form\"]/div/div/div[6]/div[1]/div") WebElement traversalTextEdit;
		@FindBy (xpath="//*[@id=\"answer_form\"]/button") WebElement traversalTextEditRun;
		@FindBy (xpath="//*[@id=\"content\"]/li[5]") WebElement traversalLinkedListFromLeftMenu;

		//Insertion
		@FindBy (xpath="/html/body/div[2]/ul[6]/a") WebElement insertionLink;
		@FindBy (xpath="/html/body/div[2]/div/div[2]/a") WebElement insertionTryEdit;
		@FindBy (xpath="//*[@id=\"answer_form\"]/div/div/div[6]/div[1]/div") WebElement insertionTextEdit;
		@FindBy (xpath="//*[@id=\"answer_form\"]/button") WebElement insertionTextEditRun;
		@FindBy (xpath="//*[@id=\"content\"]/li[6]") WebElement insertionLinkedListFromLeftMenu;

		//Deletion
		@FindBy (xpath="/html/body/div[2]/ul[7]/a") WebElement deletionLink;
		@FindBy (xpath="/html/body/div[2]/div/div[2]/a") WebElement deletionTryEdit;
		@FindBy (xpath="//*[@id=\"answer_form\"]/div/div/div[6]/div[1]/div") WebElement deletionTextEdit;
		@FindBy (xpath="//*[@id=\"answer_form\"]/button") WebElement deletionTextEditRun;
		@FindBy (xpath="//*[@id=\"content\"]/li[7]") WebElement deletionLinkedListFromLeftMenu;
		
		
		//practice Questions
		@FindBy (xpath="//a [text()='Practice Questions']") WebElement linkedListPracticeLink;
		
		
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
		
	}



