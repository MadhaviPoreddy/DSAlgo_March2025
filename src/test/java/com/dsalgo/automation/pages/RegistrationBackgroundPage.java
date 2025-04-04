package com.dsalgo.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationBackgroundPage {
	private WebDriver driver;
	
	@FindBy(xpath = "/html/body/div[1]/div/div/a/button") 
	private WebElement usernameField;
	
	@FindBy (xpath = "//a[@href=\"/register\"]")
	private WebElement register;
	
    public RegistrationBackgroundPage(WebDriver webDriver) {
        this.driver = webDriver;
        PageFactory.initElements(driver, this);
    }

	public void goToRegister() {
		register.click();
		
	}
}
