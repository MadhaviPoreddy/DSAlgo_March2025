package com.dsalgo.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import java.time.Duration;

public class ArrayPage {
	WebDriver driver= new ChromeDriver();
 	String url="https://dsportalapp.herokuapp.com/login";
 	@FindBy (xpath="//*[@id=\"id_username\"]") WebElement userName;
 	@FindBy (xpath="//*[@id=\"id_password\"]") WebElement passWord;
 	@FindBy (css="body > div.container > div > div.col-sm > form > input[type=submit]:nth-child(6)") WebElement loginBtn;
 	@FindBy (xpath="/html/body/div[3]/div[2]/div/div/a") WebElement arrayGetStartedBtn;
 	@FindBy (xpath="/html/body/div[2]/h4") WebElement arrayHeader;
 	
 	//Arrays in Python
 	@FindBy (xpath="/html/body/div[2]/ul[1]/a") WebElement arrayPythonLink;
 	@FindBy (xpath="/html/body/div[2]/div/div[2]/a") WebElement arrayPythonLinkTryEdit;
 	@FindBy (xpath="//*[@id=\"answer_form\"]/div/div/div[6]/div[1]/div/div") WebElement arrayPythonTextEdit;
 	@FindBy (xpath="//*[@id=\"answer_form\"]/button") WebElement arrayPythonTextEditRun;
 	
 	//Arrays Using List
 	@FindBy (xpath="/html/body/div[2]/ul[2]/a") WebElement arrayUsingList;
 	@FindBy (xpath="/html/body/div[2]/div/div[2]/a") WebElement arrayUsingListTryEdit;
 	@FindBy (xpath="//*[@id=\"answer_form\"]/div/div/div[6]/div[1]/div/div/div/div[5]/div/pre/span") WebElement arrayUsingListTextEdit;
 	@FindBy (xpath="//*[@id=\"answer_form\"]/button") WebElement arrayUsingListTextEditRun;
 	
 	//Basic Operations in Lists
 	@FindBy (xpath="/html/body/div[2]/ul[3]/a") WebElement arrayBasicOperinListLink;
 	@FindBy (xpath="/html/body/div[2]/div/div[2]/a") WebElement arrayBasicOperinListTryEdit;
 	@FindBy (xpath="//*[@id=\"answer_form\"]/div/div/div[6]/div[1]/div/div") WebElement arrayBasicOperinListTextEdit;
 	@FindBy (xpath="//*[@id=\"answer_form\"]/button") WebElement arrayBasicOperinListTextEditRun;
 	
 	//Applications of Array
 	@FindBy (xpath="/html/body/div[2]/ul[4]/a") WebElement applicationOfArraryLink;
 	@FindBy (xpath="/html/body/div[2]/div/div[2]/a") WebElement applicationOfArraryTryEdit;
 	@FindBy (xpath="//*[@id=\"answer_form\"]/div/div/div[6]/div[1]/div/div/div/div[5]/div/pre/span") WebElement applicationOfArraryTextEdit;
 	@FindBy (xpath="//*[@id=\"answer_form\"]/button") WebElement applicationOfArraryTextEditRun;
 	
 	//practice Questions
 	@FindBy (xpath="/html/body/div[2]/a") WebElement searchArrayLink;
 	@FindBy (xpath="/html/body/div[3]/a") WebElement maxConsucutiveOnesLink;
 	@FindBy (xpath="/html/body/div[4]/a") WebElement findNumwithEvenDigitsLink;
 	@FindBy (xpath="/html/body/div[4]/a") WebElement squaresOfSortedArrayLink;

 	//Search the Array
 	@FindBy (xpath="//*[@id=\"answer_form\"]/div/div/div[6]/div[1]/div/div/div/div[5]/div/pre/span") WebElement searchArrayTextEdit;
 	@FindBy (xpath="//*[@id=\"answer_form\"]/button") WebElement searchArrayTextEditRun;
 	@FindBy (xpath="//*[@id=\"answer_form\"]/input[2]") WebElement searchArrayTextEditSubmit;

 	//Max Consecutive Ones
 	@FindBy (xpath="//*[@id=\"answer_form\"]/div/div/div[6]/div[1]/div/div/div/div[5]/div/pre/span") WebElement maxConsucutiveOnesTextEdit;
 	@FindBy (xpath="//*[@id=\"answer_form\"]/button") WebElement maxConsucutiveOnesTextEditRun;
 	@FindBy (xpath="//*[@id=\"answer_form\"]/input[2]") WebElement maxConsucutiveOnesTextEditSubmit;

 	//Find Numbers with Even Number of Digits
 	@FindBy (xpath="//*[@id=\"answer_form\"]/div/div/div[6]/div[1]/div/div/div/div[5]/div/pre/span") WebElement findNumwithEvenDigitsTextEdit;
 	@FindBy (xpath="//*[@id=\"answer_form\"]/button") WebElement findNumwithEvenDigitsTextEditRun;
 	@FindBy (xpath="//*[@id=\"answer_form\"]/input[2]") WebElement findNumwithEvenDigitsTextEditSubmit;
 	
 	//Squares of a Sorted Array
 	@FindBy (xpath="//*[@id=\"answer_form\"]/div/div/div[6]/div[1]/div/div/div/div[5]/div/pre/span") WebElement squaresOfSortedArrayTextEdit;
 	@FindBy (xpath="//*[@id=\"answer_form\"]/button") WebElement squaresOfSortedArrayTextEditRun;
 	@FindBy (xpath="//*[@id=\"answer_form\"]/input[2]") WebElement squaresOfSortedArrayTextEditSubmit;

}
	



