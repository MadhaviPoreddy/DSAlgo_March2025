package com.dsalgo.automation.pages;

import static org.assertj.core.api.Assertions.assertThat;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserRegisterPage {
	private WebDriver driver;
	
	@FindBy(id = "id_username")
	private WebElement userId;

	@FindBy(id = "id_password1")
	private WebElement userPassword;
	
	@FindBy(id = "id_password2")
	private WebElement confirmPassword;

	@FindBy(xpath = "/html/body/div[2]/div/div[2]/form/input[5]")
	private WebElement registerButton;
	
	@FindBy (xpath = "//html/body/div[3]")
	private WebElement errorMessage;
	
	public UserRegisterPage(WebDriver webDriver) {
		this.driver = webDriver;
		PageFactory.initElements(driver, this);
	}

	public void clickRegister() {
		registerButton.click();
	}

	public void verifyUserErrorMsg(String expectedErrorMsg) {
		String actualMessage =  getMessage(userId);
		System.out.println("Error message is : " +actualMessage);
		assertThat(actualMessage).isEqualTo(expectedErrorMsg);

		
	}

	private String getMessage(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		return (String) js.executeScript("return arguments[0].validationMessage;", element);
	}
}
