package com.dsalgo.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GraphPage {
	@FindBy (xpath ="//a[@href ='graph']")WebElement getStartedgraph;
	@FindBy (linkText="Graph")WebElement Graphlink;
	@FindBy (xpath ="//a[contains(text(),'Graph Representations')]")WebElement graphrep_link;
	@FindBy(xpath="//a[contains(text(),'Practice Questions')]")WebElement graphpracticeq;
	@FindBy (xpath = "//a[@href='/tryEditor']")WebElement graph_tryHere;
	@FindBy (xpath ="//*[@id='answer_form']/div/div/div/textarea")WebElement textEditor;
	@FindBy(xpath ="//button[text()='Run']")WebElement runBtn;
	@FindBy(xpath ="//pre[@id='output']")WebElement outputText;
	
	public GraphPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void getStarted() {
		getStartedgraph.click();
		LoggerLoad.info("User Clicked on Queue get started");
	}
	
	public String getGraphPageTitle() {
		String title = driver.getTitle();
		return title;
	}
	
	public void navigateToHomePage() {
		driver.get(homepage);
		LoggerLoad.info("user is in home page");
	}
	
	public void navigateToGraphPage() {
		driver.get(graphurl);
		LoggerLoad.info("user is in graph page");
	}
	
	public void navigateToGraphGraphPage() {
		driver.get(graphgraphurl);
		LoggerLoad.info("user is in graphgraphpage");
	}
	
	public void navigateToGraphRepresentationsPage() {
		driver.get(graphrepresentationsurl);
		LoggerLoad.info("user is in graph representations page");
	}
	
	public void clickOnGraphPracQuesLink() {
		graphpracticeq.click();
		LoggerLoad.info("User clicked on Graph Practice Questions link");
	}
	
	public void clickOnGraphLink() {
		Graphlink.click();
		LoggerLoad.info("User clicked on Graph link");
	}
	
	public void clickOnGraphRepresentationsLink() {
		graphrep_link.click();
		LoggerLoad.info("User clicked on Graph Representations link");
	}
	
	public void clickOnGraphTryhereLink() {
		graph_tryHere.click();
		LoggerLoad.info("User clicked on Graph Try here link");
	}
	
	public void enterCode(String pythonCode) throws InterruptedException {
		textEditor.sendKeys(pythonCode);
	} 
	
	public String getOutput() {
		
		String output=outputText.getText();
		return output;
	}
}
