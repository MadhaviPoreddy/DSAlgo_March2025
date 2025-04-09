
	
	package com.dsalgo.automation.pages;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.FindBy;

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
		
		//Creating Linked List
		@FindBy (xpath="/html/body/div[2]/ul[2]/a") WebElement creatingLinkedList;
		@FindBy (xpath="/html/body/div[2]/div/div[2]/a") WebElement creatingLinkedListTryEdit;
		@FindBy (xpath="//*[@id=\"answer_form\"]/div/div/div[6]/div[1]/div") WebElement creatingLinkedListTextEdit;
		@FindBy (xpath="//*[@id=\"answer_form\"]/button") WebElement creatingLinkedListTextEditRun;
		
		//Types of Linked Lists
		@FindBy (xpath="/html/body/div[2]/ul[3]/a") WebElement typesOfListLink;
		@FindBy (xpath="/html/body/div[2]/div/div[2]/a") WebElement typesOfListTryEdit;
		@FindBy (xpath="//*[@id=\"answer_form\"]/div/div/div[6]/div[1]/div") WebElement typesOfListTextEdit;
		@FindBy (xpath="//*[@id=\"answer_form\"]/button") WebElement typesOfListTextEditRun;
		
		//Implement Linked List in Python
		@FindBy (xpath="/html/body/div[2]/ul[4]/a") WebElement implementLinkedList;
		@FindBy (xpath="/html/body/div[2]/div/div[2]/a") WebElement implementLinkedListTryEdit;
		@FindBy (xpath="//*[@id=\"answer_form\"]/div/div/div[6]/div[1]/div") WebElement implementLinkedListTextEdit;
		@FindBy (xpath="//*[@id=\"answer_form\"]/button") WebElement implementLinkedListTextEditRun;
		
		//Traversal
		@FindBy (xpath="/html/body/div[2]/ul[5]/a") WebElement traversalLink;
		@FindBy (xpath="/html/body/div[2]/div/div[2]/a") WebElement traversalTryEdit;
		@FindBy (xpath="//*[@id=\"answer_form\"]/div/div/div[6]/div[1]/div") WebElement traversalTextEdit;
		@FindBy (xpath="//*[@id=\"answer_form\"]/button") WebElement traversalTextEditRun;
		
		//Insertion
		@FindBy (xpath="/html/body/div[2]/ul[6]/a") WebElement insertionLink;
		@FindBy (xpath="/html/body/div[2]/div/div[2]/a") WebElement insertionTryEdit;
		@FindBy (xpath="//*[@id=\"answer_form\"]/div/div/div[6]/div[1]/div") WebElement insertionTextEdit;
		@FindBy (xpath="//*[@id=\"answer_form\"]/button") WebElement insertionTextEditRun;
		

		//Deletion
		@FindBy (xpath="/html/body/div[2]/ul[7]/a") WebElement deletionLink;
		@FindBy (xpath="/html/body/div[2]/div/div[2]/a") WebElement deletionTryEdit;
		@FindBy (xpath="//*[@id=\"answer_form\"]/div/div/div[6]/div[1]/div") WebElement deletionTextEdit;
		@FindBy (xpath="//*[@id=\"answer_form\"]/button") WebElement deletionTextEditRun;
		
		
		//practice Questions
		@FindBy (xpath="//*[@id=\"content\"]/a") WebElement linkedListPracticeLink;

	}



