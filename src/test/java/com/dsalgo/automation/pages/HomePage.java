package com.dsalgo.automation.pages;



import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.dsalgo.automation.driver.DriverFactory;
import com.dsalgo.automation.utils.waitHelper;




public class HomePage {
	WebDriver driver;
	waitHelper waitHelper;
	String url = configReader.getProperty("baseUrl");
	String homeurl = configReader.getProperty("homeUrl");
	//Setting up logging using Apache Log4j
	private static final Logger LoggerLoad = LogManager.getLogger(HomePage.class);
	
	
	// Get Started Button
	@FindBy(xpath = "//button[@class='btn']")
	WebElement getStartedbtn;

	// alertmessage
	@FindBy(xpath = "//div[contains(text(),'You are not logged in')]")
	WebElement alertMessage;

	// Home Page
	@FindBy(xpath = "//a[@href ='data-structures-introduction']")
	WebElement getStartedDSintro;
	@FindBy(xpath = "//a[@href = 'array']")
	WebElement getStartedArray;
	@FindBy(xpath = "//a[@href = 'linked-list']")
	WebElement getStartedLinkedlist;
	@FindBy(xpath = "//a[@href = 'stack']")
	WebElement getStartedStack;
	@FindBy(xpath = "//a[@href = 'queue']")
	WebElement getStartedQueue;
	@FindBy(xpath = "//a[@href = 'tree']")
	WebElement getStartedTree;
	@FindBy(xpath = "//a[@href = 'graph']")
	WebElement getStartedGraph;

	// NumpyNinja Logo
	@FindBy(xpath = "//a[text()='NumpyNinja']")
	WebElement numpyNinjaLogo;

	// dropdown
	@FindBy(xpath = "//a[text()='Data Structures']")
	WebElement dropDown;
	@FindBy(xpath = "//a[text()='Arrays']")
	WebElement dropDownArrays;
	@FindBy(xpath = "//a[text()='Linked List']")
	WebElement dropDownLinkedlist;
	@FindBy(xpath = "//a[text()='Stack']")
	WebElement dropDownStack;
	@FindBy(xpath = "//a[text()='Queue']")
	WebElement dropDownQueue;
	@FindBy(xpath = "//a[text()='Tree']")
	WebElement dropDownTree;
	@FindBy(xpath = "//a[text()='Graph']")
	WebElement dropDownGraph;

	// SignIn
	@FindBy(xpath = "//a[@href ='/login']")
	WebElement signin;

	// Register
	@FindBy(xpath = "//a[@href ='/register']")
	WebElement register;

	// DataStructure Introduction
	@FindBy(xpath = "//*[text()='Data Structure Introduction']")
	WebElement dataStructureIntroOption;
	
	//AlertMessage
	@FindBy(xpath = "//div[contains(text(),'You are logged in')]")
	WebElement successLogin;
	
	@FindBy(xpath = "//a[text()='Data Structures']/../div")
	List<WebElement> dropdownMenu;

	@FindBy(xpath = "//*[text()='Sign out']")
	WebElement signOut;
	
	@FindBy(xpath = "//*[contains(text(),'Logged out successfully')]")
	WebElement signoutAlert;
	
	public HomePage() {
		this.driver = DriverFactory.getDriver();
		PageFactory.initElements(driver, this);
		waitHelper = new waitHelper(driver,10);
		LoggerLoad.info("HomePage initialized with WebDriver and waitHelper");
	}

	// DS-Algo Main url
	public void dsalgoportal() {
		driver.get(url);
		LoggerLoad.info("Navigated to DSAlgo portal: " + url);

	}

	public void navigateToHomePage() {
		driver.get(homeurl);
		LoggerLoad.info("Navigated to Home Page: " + homeurl);
	}

	public String getHomeUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}
	
	public String getExpectedHomeUrl() {
        return homeurl;
    }

	// Actions
	public boolean isGetStartedButtonVisible() {
		try {
			return getStartedbtn.isDisplayed();
		} catch (NoSuchElementException e) {
			LoggerLoad.error("Get Started button not visible", e);
			return false;
		}
	}

	public void getstarted_btn_clk() {
		try {
			getStartedbtn.click();
			LoggerLoad.info("Clicked on Get Started button.");
		}catch (Exception e) {
			LoggerLoad.error("Failed to click on Get Started button.", e);
		}
	}

	public String getTitleofPage() {
		String title = driver.getTitle();
		return title;
	}

	public String getAlert() {
		try {
			String alertMsg = alertMessage.getText();
			return alertMsg;
		}catch (NoSuchElementException e) {
			LoggerLoad.error("Alert message not found.", e);
			return null;
		}
	}

	public boolean isRegisterButtonVisible() {
		return register.isDisplayed();
	}

	public boolean isSigninLinkVisible() {
		return signin.isDisplayed();
	}
	
	//Checking "You are logged in" message
	public boolean checkLoginSuccess() {
		try {
			//wait for success message
			waitHelper.waitForElementVisible(successLogin);
			return successLogin.isDisplayed();			
		}catch(TimeoutException e) {
			return false;
		}
	}
	
	public boolean isSubmenuPresent(String submenuText) {
        for (WebElement item : dropdownMenu) {
            if (item.getText().equalsIgnoreCase(submenuText)) {
                return true;
            }
        }
        return false;
    }
	
	
	public List<String> getDropdownSubmenuTexts() {
	    List<String> texts = new ArrayList<>();
	    for (WebElement item : dropdownMenu) {
	        texts.add(item.getText());
	
	    }
	    return texts;
	}
	
	
	public void getStartedhome(String string) {
		try {
			switch (string) {
			case "Data Structures-Introduction":
				LoggerLoad.info("click " + getStartedDSintro.getText() + "link on  DataStructures ");
				getStartedDSintro.click();
				break;
			case "Arrays":
				LoggerLoad.info("click " + getStartedArray.getText() + "link on Array ");
				getStartedArray.click();
				break;
			case "Linked List":
				LoggerLoad.info("click " + getStartedLinkedlist.getText() + "link on LinkedList");
				getStartedLinkedlist.click();
				break;
			case "Stack":
				LoggerLoad.info("click " + getStartedStack.getText() + "link on stack");
				getStartedStack.click();
				break;
			case "Queue":
				LoggerLoad.info("click " + getStartedQueue.getText() + "link on queue ");
				getStartedQueue.click();
				break;
			case "Tree":
				LoggerLoad.info("click " + getStartedTree.getText() + "link on Tree ");
				getStartedTree.click();
				break;
			case "Graph":
				LoggerLoad.info("click " + getStartedGraph.getText() + "link on Graph ");
				getStartedGraph.click();
				break;
			}
		}catch (Exception e) {
			LoggerLoad.error("Failed to click Get Started link for: " + string, e);
		}
		
	}


	public void clickDataStructuresDropdown() {
		dropDown.click();
		LoggerLoad.info("Clicked on Data Structures dropdown.");
	}

	public boolean clickDataStructureIntroOption() {
		
		try {
			return dataStructureIntroOption.isDisplayed();
		} catch (NoSuchElementException e) {
			LoggerLoad.error("Failed while verifying visibility of Data Structure Introduction in the drop down");
			return false; // Element is not in the DOM
		}

	}
	
	public void selectDropdown(String string) {
		try {
			dropDown.click();
			switch (string) {
			case "Arrays":
				LoggerLoad.info("User click on " + string);
				dropDownArrays.click();
				break;
			case "Linked List":
				LoggerLoad.info("User click on " + string);
				dropDownLinkedlist.click();
				break;
			case "Stack":
				LoggerLoad.info("User click on " + string);
				dropDownStack.click();
				break;
			case "Queue":
				LoggerLoad.info("User click on " + string);
				dropDownQueue.click();
				break;
			case "Tree":
				LoggerLoad.info("User click on " + string);
				dropDownTree.click();
				break;
			case "Graph":
				LoggerLoad.info("User click on " + string);
				dropDownGraph.click();
				break;
			}
		}catch (Exception e) {
			LoggerLoad.error("Failed to select dropdown option: " + string, e);
		}

	}
	
	// Method to get the warning message "You are not logged in"
    public String getWarningMessage() {
        return alertMessage.getText();
    }

    // Method to check if the warning message is visible
    public boolean isWarningMessageVisible() {
        return alertMessage.isDisplayed();
    }
	
    //Sign In
	public void signinLink() {
		try {
			signin.click();
			LoggerLoad.info("Clicked on Signin link.");
		}catch (Exception e) {
			LoggerLoad.error("Failed to click on Signin link", e);
		}
	}

	// Register
	public void registerLink() {
		try {
			register.click();
			LoggerLoad.info("Clicked on Register link.");
		}catch (Exception e) {
			LoggerLoad.error("Failed to click on Register link", e);
		}
	}

	public String register_page() {
		String title = driver.getTitle();
		return title;
	}
	
	//Sign out
	public void signoutLink() {
		try {
			signOut.click();
			LoggerLoad.info("Clicked on Sign out link.");
		}catch (Exception e) {
			LoggerLoad.error("Failed to click on Sign out link", e);
		}
	}
	
	public String getSignoutAlert() {
		return signoutAlert.getText();
	}
	
	public void clickNumpyNinja() {
		try {
			numpyNinjaLogo.click();
			LoggerLoad.info("Clicked on NumpyNinja Logo link.");
		}catch (Exception e) {
			LoggerLoad.error("Failed to click on Sign out link", e);
		}
	}
	
	public String successLogin() {
		return successLogin.getText();
	}
}
