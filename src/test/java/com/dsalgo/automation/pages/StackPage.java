package com.dsalgo.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.dsalgo.automation.driver.DriverFactory;
import org.openqa.selenium.JavascriptExecutor;


public class StackPage {

   // WebDriver driver= new ChromeDriver();
	WebDriver driver;

	String url="https://dsportalapp.herokuapp.com/login";
	@FindBy (xpath="//*[@id=\"id_username\"]") WebElement userName;
	@FindBy (xpath="//*[@id=\"id_password\"]") WebElement passWord;
	@FindBy (css="body > div.container > div > div.col-sm > form > input[type=submit]:nth-child(6)") WebElement loginBtn;
	@FindBy (xpath="//a [@href='stack']") WebElement stackGetStartedBtn;
	@FindBy (xpath="/html/body/div[2]/h4") WebElement stackHeader;
	
	//Operations in stack
	@FindBy (xpath="/html/body/div[2]/ul[1]/a") WebElement operationsInStackLink;
	@FindBy (xpath="/html/body/div[2]/div/div[2]/a") WebElement operationsInStackLinkTryEdit;
	@FindBy (xpath="//*[@id=\"answer_form\"]/div/div/div[6]/div[1]/div") WebElement operationsInStackLinkTextEdit;
	@FindBy (xpath="//*[@id=\"answer_form\"]/button") WebElement operationsInStackLinkTextEditRun;
	

	//Implementation 
	@FindBy (xpath="/html/body/div[2]/ul[2]/a") WebElement stackImplementation;
	@FindBy (xpath="/html/body/div[2]/div/div[2]/a") WebElement stackImplementationTryEdit;
	@FindBy (xpath="//*[@id=\"answer_form\"]/div/div/div[6]/div[1]/div") WebElement stackImplementationTextEdit;
	@FindBy (xpath="//*[@id=\"answer_form\"]/button") WebElement stackImplementationTextEditRun;
	
	//Applications
	@FindBy (xpath="//a [@href='stack-applications']") WebElement stackApplications;
	@FindBy (xpath="/html/body/div[2]/div/div[2]/a") WebElement stackApplicationsTryEdit;
	@FindBy (xpath="//*[@id=\"answer_form\"]/div/div/div[6]/div[1]/div") WebElement stackApplicationsTextEdit;
	@FindBy (xpath="//*[@id=\"answer_form\"]/button") WebElement traversalTextEditRun;
	
	//practice Questions
	@FindBy (xpath="//*[@id=\"content\"]/a") WebElement stackPracticeLink;
	
	public StackPage()
 	{
 	
		//this.driver=driver;
 		this.driver=DriverFactory.getDriver();
		PageFactory.initElements( driver, this);
 	}
	public void stackGetStartedBtn()
	{
		stackGetStartedBtn.click();
	}
	public String verfyPageTitle()
	{
 		return driver.getTitle();
 
 	}
	public void operationsInStackLink()
	{
		operationsInStackLink.click();
	}
	public void operationsInStackLinkTryEdit()
	{
		operationsInStackLinkTryEdit.click();
	}
	public void operationsInStackLinkTextEditRun()
	{
		operationsInStackLinkTextEditRun.click();
	}
	
	public void stackPracticeLink()
	{
		stackPracticeLink.click();
	}
	
	public void stackImplementation()
	{
		stackImplementation.click();
	}
	public void stackImplementationTryEdit()
	{
		stackImplementationTryEdit.click();
	}
	public void stackApplications()
	{
		stackApplications.click();
	}
	public void stackApplicationsTryEdit()
	{
		stackApplicationsTryEdit.click();
	}
}