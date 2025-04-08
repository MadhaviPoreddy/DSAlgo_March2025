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
	
	
}
