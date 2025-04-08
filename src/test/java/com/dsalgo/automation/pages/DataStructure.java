package com.dsalgo.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DataStructure {
	@FindBy (xpath = "//a[@href ='data-structures-introduction']")WebElement getStartedDSintro_link;
	@FindBy (xpath="//a[@href='time-complexity']")WebElement timecomplexity_link;
	@FindBy (xpath="//a[@href='/tryEditor']")WebElement tryHere_link;
	@FindBy (xpath ="//*[@id='answer_form']/div/div/div/textarea")WebElement textEditor;
	@FindBy (xpath ="//button[text()='Run']")WebElement runBtn;
	
	

	
}
