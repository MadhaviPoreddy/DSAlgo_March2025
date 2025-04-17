package com.dsalgo.automation.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dsalgo.automation.driver.DriverFactory;
import com.dsalgo.automation.utils.configReader;
import com.dsalgo.automation.utils.waitHelper;

public class LoginPage {
	public WebDriver driver;
	waitHelper waitHelper;
	String loginurl = configReader.getProperty("loginUrl");
	String registerurl = configReader.getProperty("registerUrl");
	//Setting up logging using Apache Log4j
	private static final Logger LoggerLoad = LogManager.getLogger(LoginPage.class);

	
	@FindBy(xpath = "//input[@id='id_username']")
	WebElement username;
	@FindBy(xpath = "//input[@id='id_password']")
	WebElement password;
	@FindBy(xpath = "//input[@value='Login']")
	WebElement loginbtn;
	@FindBy(xpath = "//div[contains(text(),'Invalid Username and Password')]")
	WebElement alertMsg;
	@FindBy(xpath = "//a[text()=' Register ']")
	WebElement registerlink;
	
	@FindBy(xpath = "//a[contains(text(),'Sign out')]")
	WebElement signout;
	@FindBy(xpath = "//div[contains(text(),'Logged out successfully')]")
	WebElement successLogout;
	
	@FindBy(xpath = "//*[text()='NumpyNinja']")
	WebElement numpyninjaLogo;
	
	public LoginPage(){
		this.driver = DriverFactory.getDriver();
		PageFactory.initElements(driver, this);
		waitHelper = new waitHelper(driver,10);
		LoggerLoad.info("Initialized Login page");
	}

	//To get Log in URL
	public void openLoginurl() {
		try {
			driver.get(loginurl);
			LoggerLoad.info("Navigated to login URL: " + loginurl);
		} catch (Exception e) {
			LoggerLoad.error("Failed to navigate to login URL", e);
		}
	}
	
	public void openRegisterurl() {
		driver.get(registerurl);
	}
	
	public String getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}

	public void enterUsername(String userName) {
		try {
			username.sendKeys(userName);
		} catch (Exception e) {
			LoggerLoad.error("Failed to enter username", e);
		}

	}

	public void enterPassword(String passWord) {
		try {
			password.sendKeys(passWord);
		} catch (Exception e) {
			LoggerLoad.error("Failed to enter password", e);
		}
	}

	
	public void clickLogin() {
		try {
		loginbtn.click();
		} catch (Exception e) {
			LoggerLoad.error("Failed to click login button", e);
		}
	}

	

	public String invalidAlert() {
		try {
			String alertMessage = alertMsg.getText();
			return alertMessage;
			} catch (Exception e) {
				LoggerLoad.error("Failed to get invalid alert message", e);
				return null;
		}
	}
	
	public boolean isLoginErrorMessageDisplayed() {
        try {
        	//wait for Alert message
			waitHelper.waitForElementVisible(alertMsg);
        	return alertMsg.isDisplayed();
        } catch (TimeoutException e) {
            return false;
        }
    }

    public String getUsernameValidationMessage() {
    	try {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        return (String) js.executeScript("return arguments[0].validationMessage;", username);
	    } catch (Exception e) {
			LoggerLoad.error("Failed to get username validation message", e);
			return null;
	    }
    }

    public String getPasswordValidationMessage() {
    	try {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        return (String) js.executeScript("return arguments[0].validationMessage;", password);
    	} catch (Exception e) {
    		LoggerLoad.error("Failed to get password validation message", e);
    		return null;
    	}
    }
    
	public void clickRegister() {
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
	
	public void clickNumpyninjaLogo() {
		numpyninjaLogo.click();
	}

}
