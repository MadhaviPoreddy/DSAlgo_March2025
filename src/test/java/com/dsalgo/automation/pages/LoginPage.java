package com.dsalgo.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(xpath = "//input[@id='id_username']")WebElement username;
	@FindBy(xpath = "//input[@id='id_password']")WebElement password;
	@FindBy(xpath = "//input[@value='Login']")WebElement loginbtn;
	@FindBy(xpath = "//div[contains(text(),'Invalid Username and Password')]")WebElement alertMsg;
	@FindBy(xpath="//a[text()=' Register ']")WebElement registerlink;
	@FindBy(xpath = "//div[contains(text(),'You are logged in')]")WebElement successLogin;
	@FindBy(xpath = "//a[contains(text(),'Sign out')]")WebElement signout;
	@FindBy(xpath = "//div[contains(text(),'Logged out successfully')]")WebElement successLogout;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void enterUsername(String userName) {
		username.sendKeys(userName);
	}
	
	public void enterPassword(String passWord) {
		password.sendKeys(passWord);
	}
	
	public void clickLogin() {
		loginbtn.click();
	}
	
	public String successAlert() {
		String alert = successLogin.getText();
		return alert;
	}
	
	public String invalidAlert() {
		String alertMessage = alertMsg.getText();
		return alertMessage;
	}
	
	public String validateUsernamefield(String validationMessge) {
		String message = username.getAttribute("validationMessage");
		System.out.println("message");
		return message;

	}
	
	public String validatePasswordfield(String validationMessge) {
		String message = password.getAttribute("validationMessage");
		System.out.println("message");
		return message;

	}
	
	public void register() {
		registerlink.click();
	}
	
	public String register_page() {
		String title = driver.getTitle();
		return title;
	}
	
	public void logout() {
		signout.click();
	}
	
	public String successLogout() {
		String alert = successLogout.getText();
		return alert;
	}

}
