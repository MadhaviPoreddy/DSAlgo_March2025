package com.dsalgo.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	
	//Get Started Button
	@FindBy (xpath="//button[@class='btn']")WebElement getStartedbtn;
	
	//alertmessage
	@FindBy(xpath="//div[contains(text(),'You are not logged in')]")WebElement alertMessage;

	//Home Page
	@FindBy (xpath = "//a[@href ='data-structures-introduction']")WebElement getStartedDSintro;
	@FindBy (xpath = "//a[@href = 'array']")WebElement getStartedArray;
	@FindBy (xpath = "//a[href = 'linked-list']")WebElement getStartedLinkedlist;
	@FindBy (xpath = "//a[href = 'stack']")WebElement getStartedStack;
	@FindBy (xpath = "//a[href = 'queue']")WebElement getStartedQueue;
	@FindBy (xpath = "//a[href = 'tree']")WebElement getStartedTree;
	@FindBy (xpath = "//a[href = 'graph']")WebElement getStartedGraph;
	
	//NumpyNinja Logo
	@FindBy (xpath = "//a[text()='NumpyNinja']")WebElement numpyNinjaLogo;
	
	//dropdown
	@FindBy (xpath = "//a[text()='Data Structures']")WebElement dropDown;
	@FindBy (xpath = "//a[text()='Arrays']")WebElement dropDownArrays;
	@FindBy (xpath = "//a[text()='Linked List']")WebElement dropDownLinkedlist;
	@FindBy (xpath = "//a[text()='Stack']")WebElement dropDownStack;
	@FindBy (xpath = "//a[text()='Queue']")WebElement dropDownQueue;
	@FindBy (xpath = "//a[text()='Tree']")WebElement dropDownTree;
	@FindBy (xpath = "//a[text()='Graph']")WebElement dropDownGraph;
	
	//SignIn
	@FindBy (xpath="//a[@href ='/login']")WebElement signin;
		
	//Register
	@FindBy (xpath="//a[@href ='/register']")WebElement register;
	
	
	public HomePage() {
		PageFactory.initElements(driver,this);
	}
	
	//DS-Algo Main url
	public void dsalgoportal() {
		driver.get(url);
		
	}
	
	public void getstarted_btn() {
		getStartedbtn.click();
		
	}
	
	public String getTitleofPage() {
		String title=driver.getTitle();
		return title;
	}
	
	public String getAlert() {
		String alertMsg=alertMessage.getText();
		return alertMsg;
	}
	
	//Home Page Validations
	//Home Page URL
	public void homepage() {
		driver.get(homePageurl);
		
	}
	
	public void getStartedhome(String string) {

		switch (string) {
		case "Data Structures-Introduction":
			LoggerLoad.info("click " + getStartedDSintro.getText() + "link on  DataStructures ");
			getStartedDSintro.click();
			break;
		case "Arrays":
			LoggerLoad.info("click " + getStartedArray.getText() + "link on Array ");
			getStartedArray.click();
			break;
		case "Linked List":
			LoggerLoad.info("click " + getStartedLinkedlist.getText() + "link on LinkedList");
			 getStartedLinkedlist.click();
			break;
		case "Stack":
			LoggerLoad.info("click " +  getStartedStack.getText() + "link on stack");
			 getStartedStack.click();
			break;
		case "Queue":
			LoggerLoad.info("click " + getStartedQueue.getText() + "link on queue ");
			getStartedQueue.click();
			break;
		case "Tree":
			LoggerLoad.info("click " + getStartedTree.getText() + "link on Tree ");
			getStartedTree.click();
			break;
		case "Graph":
			LoggerLoad.info("click " +getStartedGraph.getText() + "link on Graph ");
			getStartedGraph.click();
			break;
		}
	}
	
	public void dropdown(String string) {

		dropDown.click();
		switch (string) {
		case "Arrays":
			LoggerLoad.info("User click on " + string);
			dropDownArrays.click();
			break;
		case "Linked List":
			LoggerLoad.info("User click on " + string);
			dropDownLinkedlist.click();
			break;
		case "Stack":
			LoggerLoad.info("User click on " + string);
			dropDownStack.click();
			break;
		case "Queue":
			LoggerLoad.info("User click on " + string);
			dropDownQueue.click();
			break;
		case "Tree":
			LoggerLoad.info("User click on " + string);
			dropDownTree.click();
			break;
		case "Graph":
			LoggerLoad.info("User click on " + string);
			dropDownGraph.click();
			break;
		}
		
	}
	
	//signIn
	public void signinLink() {
		signin.click();
	}
	
	//Register
	public void registerLink() {
		register.click();
	}
	
	public String register_page() {
		String title = driver.getTitle();
		return title;
	}
}
