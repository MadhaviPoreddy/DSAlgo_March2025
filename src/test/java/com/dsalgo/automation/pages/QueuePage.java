package com.dsalgo.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QueuePage {

	WebDriver driver;

	@FindBy(xpath = "//a[text()='Implementation of Queue in Python']")
	private WebElement implementationOfQPyLnk;

	@FindBy(xpath = "//a[text()='Implementation using collections.deque']")
	private WebElement implementationUsingColDkLnk;

	@FindBy(xpath = "//a[text()='Implementation using array']")
	private WebElement implementationUsingArrayLnk;

	@FindBy(xpath = "//a[text()='Queue Operations']")
	private WebElement queueOperationLnk;

	public QueuePage(WebDriver webDriver) {
		this.driver = webDriver;
		PageFactory.initElements(driver, this);
	}

	public void clickimpOfQPy() {
		implementationOfQPyLnk.click();
	}

	public void clickimpOfCollectionDq() {
		implementationUsingColDkLnk.click();
	}

	public void implementationUsingArray() {
		implementationUsingArrayLnk.click();
	}

	public void queueOperation() {
		queueOperationLnk.click();
	}
}
