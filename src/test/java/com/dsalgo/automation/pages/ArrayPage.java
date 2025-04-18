package com.dsalgo.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.dsalgo.automation.driver.DriverFactory;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;

public class ArrayPage {
	WebDriver driver;
	
 	String url="https://dsportalapp.herokuapp.com";
	@FindBy (xpath ="/html/body/div[1]/div/div/a/button")WebElement getStartedHome;
	@FindBy (xpath ="//*[@id=\"navbarCollapse\"]/div[2]/ul/a[3]")WebElement signinLink;
	@FindBy (xpath ="//*[@id=\"id_username\"]")WebElement userName;
	@FindBy (xpath ="//*[@id=\"id_password\"]")WebElement passWord;
	@FindBy (xpath ="/html/body/div[2]/div/div[2]/form/input[4]")WebElement logInBtn;
 	@FindBy (xpath="/html/body/div[3]/div[2]/div/div/a") WebElement arrayGetStartedBtn;
 	@FindBy (xpath="/html/body/div[2]/h4") WebElement arrayHeader;
 	
 	//Arrays in Python
 	@FindBy (xpath="/html/body/div[2]/ul[1]/a") WebElement arrayPythonLink;
 	@FindBy (xpath="/html/body/div[2]/div/div[2]/a") WebElement arrayPythonLinkTryEdit;
 	@FindBy (css=".CodeMirror") WebElement arrayPythonTextEdit;
 	@FindBy (xpath="//*[@id=\"answer_form\"]/button") WebElement arrayPythonTextEditRun;
 	
 	//Arrays Using List
 	@FindBy (xpath="/html/body/div[2]/ul[2]/a") WebElement arrayUsingList;
 	@FindBy (xpath="/html/body/div[2]/div/div[2]/a") WebElement arrayUsingListTryEdit;
 	@FindBy (css=".CodeMirror") WebElement arrayUsingListTextEdit;
 	@FindBy (xpath="//*[@id=\"content\"]/li[2]/a") WebElement arrayUsingListfromLeftMenu;
 	@FindBy (xpath="//*[@id=\"content\"]/li[1]/a") WebElement arrayInPythonfromLeftMenu;
	
 	
 	//Basic Operations in Lists
 	@FindBy (xpath="/html/body/div[2]/ul[3]/a") WebElement arrayBasicOperinListLink;
 	@FindBy (xpath="/html/body/div[2]/div/div[2]/a") WebElement arrayBasicOperinListTryEdit;
 	@FindBy (xpath="//*[@id=\"content\"]/li[3]/a") WebElement arrayBasicOperationfromLeftMenu;

 	//Applications of Array
 	@FindBy (xpath="/html/body/div[2]/ul[4]/a") WebElement applicationOfArraryLink;
 	@FindBy (xpath="/html/body/div[2]/div/div[2]/a") WebElement applicationOfArraryTryEdit;
 	@FindBy (xpath="//*[@id=\"content\"]/li[4]/a") WebElement arrayApplicationfromLeftMenu;
 	
 	//practice Questions
 	
 	@FindBy (xpath="//*[@id=\"content\"]/a") WebElement arrayPractieceQue;
 	@FindBy (css="body > div:nth-child(3) > a") WebElement searchArrayPractieceQue;
 	@FindBy (xpath="/html/body/div[3]/a") WebElement maxConsucutiveOnesPractieceQue;
 	@FindBy (xpath="/html/body/div[4]/a") WebElement findNumwithEvenDigitsPractieceQue;
 	@FindBy (xpath="/html/body/div[5]/a") WebElement squaresOfSortedArrayPractieceQue;

 	//practice Questions Text Editor
 	//@FindBy (xpath="//*[@id=\"answer_form\"]/button") WebElement arrayPracticeRun;
 	@FindBy (css="#answer_form > input.button") WebElement arrayPracticeSubmit;

	@FindBy(xpath = "//pre[text()=\"Error occurred during submission\"]") WebElement outputerror;
	@FindBy(xpath = "//pre [text()=\" No tests were collected\"]") WebElement Blankoutputerror;
	@FindBy(xpath = "//pre[@id='output']") WebElement output;
	//@FindBy(xpath = "//pre[text()=\"[4, 9, 9, 49, 121]\"]") WebElement squaresOfSortedArrayOutput;

	

	
 	public ArrayPage()
 	{
 		//this.driver=driver;
 		this.driver=DriverFactory.getDriver();
		PageFactory.initElements( driver, this);
 	}
 	
 	public void homeGetstarted()
	{
 		driver.navigate().to("https://dsportalapp.herokuapp.com/");
 		getStartedHome.click();
	}

 	public void homeSignin()
	{
		signinLink.click();
	}
	public void enterUsername()
	{
		userName.sendKeys("abc@test.com");
	}
	public void enterPassword()
	{
		passWord.sendKeys("testtest@123");
	}
	public void clickLogin()
	{
		logInBtn.click();
	}
 	
	public void arrayPythonLink()
	{
		arrayPythonLink.click();
	}
	public void arrayPythonLinkTryEdit()
	{
		arrayPythonLinkTryEdit.click();
	}

	public void verifyCodeEditor(String code) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].CodeMirror.setValue(arguments[1]);", arrayPythonTextEdit, code);
	}

	public String verifyOutput() {
		return output.getText();
	}
	
	public String verifyOutputError() {
		return outputerror.getText();
	}
	
	public String verifyBlankOutputError() {
		return Blankoutputerror.getText();
	}
	
	
	public void arrayUsingListTryEdit()
	{
		arrayUsingListTryEdit.click();
	}
		
	public void arrayPythonTextEditRun()
	{
		arrayPythonTextEditRun.click();
	}
	public String verfyArrayTitle()
	{
 		return driver.getTitle();
 
 	}
	public void readAlert()
	{
		
		driver.switchTo().alert();
		Alert alert = driver.switchTo().alert();
		String alertText=alert.getText(); // Get the alert text
		System.out.println(alertText);

	}
	
	public void acceptAlert()
	{
		
		driver.switchTo().alert().accept();
	}
	public void arrayHome()
	{
	arrayGetStartedBtn.click();
	}
	 public void arrayInPythonfromLeftMenu()
	   {
		 arrayInPythonfromLeftMenu.click();
	   }
	
	public void arrayUsingList()
	{
		arrayUsingList.click();
	}
   public void arrayUsingListfromLeftMenu()
   {
	   arrayUsingListfromLeftMenu.click();
   }
   public Boolean alertPresent() {
		if (ExpectedConditions.alertIsPresent() != null) {
			return true;
		}
		return false;
	}
   
   public void arrayPractieceQue() {
		arrayPractieceQue.click();
   }

   public void arrayBasicOperinListLink()
	{
	   arrayBasicOperinListLink.click();
	}
   public void arrayBasicOperinListTryEdit()
	{
	   arrayBasicOperinListTryEdit.click();
	}
   
   public void applicationOfArraryLink()
	{
	   applicationOfArraryLink.click();
	}
   public void applicationOfArraryTryEdit()
	{
	   applicationOfArraryTryEdit.click();
	}
   
   public void searchArrayPractieceQue()
	{
	   searchArrayPractieceQue.click();
	}
   public void maxConsucutiveOnesPractieceQue()
	{
	   maxConsucutiveOnesPractieceQue.click();
	}
   public void findNumwithEvenDigitsPractieceQue()
	{
	   findNumwithEvenDigitsPractieceQue.click();
	}
   public void squaresOfSortedArrayPractieceQue()
	{
	   squaresOfSortedArrayPractieceQue.click();
	}
   
 
     public void arrayPracticeSubmit()
  	{
    	 arrayPracticeSubmit.click();
  	}
     
     public void arrayBasicOperationfromLeftMenu()
     {
    	 arrayBasicOperationfromLeftMenu.click();
     }
   
    public void arrayApplicationfromLeftMenu()
    {
    	arrayApplicationfromLeftMenu.click();
    }

	
}
	