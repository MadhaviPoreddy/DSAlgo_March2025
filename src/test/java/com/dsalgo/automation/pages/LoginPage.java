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
	
	
}
