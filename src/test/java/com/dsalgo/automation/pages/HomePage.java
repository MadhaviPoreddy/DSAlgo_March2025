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
	
	
	
}
