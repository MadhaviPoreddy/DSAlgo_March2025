package com.dsalgo.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class StackPage {

    WebDriver driver= new ChromeDriver();
	String url="https://dsportalapp.herokuapp.com/login";
	@FindBy (xpath="//*[@id=\"id_username\"]") WebElement userName;
	@FindBy (xpath="//*[@id=\"id_password\"]") WebElement passWord;
	@FindBy (css="body > div.container > div > div.col-sm > form > input[type=submit]:nth-child(6)") WebElement loginBtn;
	@FindBy (xpath="/html/body/div[2]/div[4]/div/div/a") WebElement stackGetStartedBtn;
	@FindBy (xpath="/html/body/div[2]/h4") WebElement stackHeader;
	
	//Operations in stack
	@FindBy (xpath="/html/body/div[2]/ul[1]/a") WebElement operationsInStackLink;
	@FindBy (xpath="/html/body/div[2]/div/div[2]/a") WebElement operationsInStackLinkTryEdit;
	@FindBy (xpath="//*[@id=\"answer_form\"]/div/div/div[6]/div[1]/div") WebElement linkedListIntroductionTextEdit;
	@FindBy (xpath="//*[@id=\"answer_form\"]/button") WebElement linkedListIntroductionTextEditRun;
	

	//Implementation 
	@FindBy (xpath="/html/body/div[2]/ul[2]/a") WebElement stackImplementation;
	@FindBy (xpath="/html/body/div[2]/div/div[2]/a") WebElement stackImplementationTryEdit;
	@FindBy (xpath="//*[@id=\"answer_form\"]/div/div/div[6]/div[1]/div") WebElement stackImplementationTextEdit;
	@FindBy (xpath="//*[@id=\"answer_form\"]/button") WebElement stackImplementationTextEditRun;
	
	//Applications
	@FindBy (xpath="/html/body/div[2]/ul[3]/a") WebElement stackApplications;
	@FindBy (xpath="/html/body/div[2]/div/div[2]/a") WebElement traversalTryEdit;
	@FindBy (xpath="//*[@id=\"answer_form\"]/div/div/div[6]/div[1]/div") WebElement traversalTextEdit;
	@FindBy (xpath="//*[@id=\"answer_form\"]/button") WebElement traversalTextEditRun;
	
	//practice Questions
	@FindBy (xpath="//*[@id=\"content\"]/a") WebElement stackPracticeLink;
}