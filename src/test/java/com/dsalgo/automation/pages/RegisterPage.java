package com.dsalgo.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage {
	
	@FindBy(id = "id_username")
	private WebElement userId;

	@FindBy(id = "id_password1")
	private WebElement userPassword;
	
	@FindBy(id = "id_password2")
	private WebElement confirmPassword;

	@FindBy(xpath = "//input[@type='submit']")
	private WebElement registerButton;
	
	@FindBy (xpath = "//div[contains(text(),'The two password fields')]")
	private WebElement errorMessage;
	
	@FindBy (xpath = "//a[@href='/login' and text()='Login ']")
	private WebElement loginLnk;

	@FindBy (xpath = "//a[@href='/login' and text()='Sign in']")
	private WebElement signInLnk;
	
	public void enterDetails(String username, String password, String confirmPwd) {
		userId.sendKeys(username);
		userPassword.sendKeys(password);
		confirmPassword.sendKeys(confirmPwd);
	}
	
	public void clickRegister() {
		registerButton.click();
	}
	
	public void clickLoginLnk() {
		loginLnk.click();
	}
	
	public void clickSignInLnk() {
		signInLnk.click();
	}
	
	public String verifyError() {
		return errorMessage.getText();
	}
	
	
	
}
