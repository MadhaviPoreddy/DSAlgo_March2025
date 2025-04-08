package com.dsalgo.automation.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CommonPage {
	
	WebDriver driver;
	
	@FindBy(xpath = "//a[text()='Practice Questions']")
	private WebElement practiceQuestionLnk;

	@FindBy(xpath = "//a[text()='Try here>>>']")
	private WebElement tryHereBtn;

	@FindBy(css = ".CodeMirror")
	private WebElement codeEditor;

	@FindBy(xpath = "//button[@type='button']")
	private WebElement runBtn;

	@FindBy(xpath = "//*[@id='output']")
	private WebElement output;
	
	public CommonPage(WebDriver webDriver) {
		this.driver = webDriver;
		PageFactory.initElements(driver, this);
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

}
