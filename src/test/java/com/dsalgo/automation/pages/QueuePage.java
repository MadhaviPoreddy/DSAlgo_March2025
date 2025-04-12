package com.dsalgo.automation.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.dsalgo.automation.driver.DriverFactory;

public class QueuePage {

	WebDriver driver;
	
	@FindBy (id = "id_username")
	WebElement userName;
	
	@FindBy (id = "id_password")
	WebElement password;
	
	@FindBy (xpath = "/html/body/div[2]/div/div[2]/form/input[4]")
	WebElement loginBtn;

	@FindBy(xpath = "/html/body/div[3]/div[5]/div/div/a")
	WebElement queueBtn;

	@FindBy(xpath = "//a[text()='Implementation of Queue in Python']")
	private WebElement implementationOfQPyLnk;

	@FindBy(xpath = "//a[text()='Implementation using collections.deque']")
	private WebElement implementationUsingColDkLnk;

	@FindBy(xpath = "//a[text()='Implementation using array']")
	private WebElement implementationUsingArrayLnk;

	@FindBy(xpath = "//a[text()='Queue Operations']")
	private WebElement queueOperationLnk;

	@FindBy(xpath = "//a[text()='Practice Questions']")
	private WebElement practiceQuestionLnk;

	@FindBy(xpath = "//a[text()='Try here>>>']")
	public WebElement tryHereBtn;

	@FindBy(css = ".CodeMirror")
	private WebElement codeEditor;

	@FindBy(xpath = "//button[@type='button']")
	private WebElement runBtn;

	@FindBy(xpath = "//*[@id='output']")
	private WebElement output;

	public QueuePage() {
		this.driver = DriverFactory.getDriver();
		PageFactory.initElements(driver, this);
	}

	public void clickQueues() {
		queueBtn.click();
	}

	public String verfyQueuePage() {
		return driver.getTitle();

	}

	public void clickimpOfQPy() {
		implementationOfQPyLnk.click();
	}

	public void clickimpOfCollectionDq() {
		implementationUsingColDkLnk.click();
	}

	public void clickImplementationUsingArray() {
		implementationUsingArrayLnk.click();
	}

	public void clickQueueOperation() {
		queueOperationLnk.click();
	}

	public void practiceQuestions() {
		practiceQuestionLnk.click();
	}

	public void tryCodeEditor() {
		tryHereBtn.click();
	}

	public void verifyCodeEditor(String code) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].CodeMirror.setValue(arguments[1]);", codeEditor, code);
	}

	public void runCode() {
		runBtn.click();
	}

	public String verifyOutput() {
		return output.getText();
	}

	public void handleAlert() {
		Alert alert = driver.switchTo().alert();
		System.out.println("Alert says: " + alert.getText());
		alert.accept();

	}

	public Boolean alertPresent() {
		if (ExpectedConditions.alertIsPresent() != null) {
			return true;
		}
		return false;
	}
	
	public String verifyTitleOfPage() {
		return driver.getTitle();
	}

	public void enterDetails() {
//			loginPage.userName.sendKeys("abc@test.com");
//			loginPage.password.sendKeys("testtest@123");
//			loginPage.loginBtn.click();
			
			userName.sendKeys("abc@test.com");
			password.sendKeys("testtest@123");
			loginBtn.click();
		}
		
	}

