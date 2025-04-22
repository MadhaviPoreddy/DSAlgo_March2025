package com.dsalgo.automation.pages;



import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.dsalgo.automation.driver.DriverFactory;
import com.dsalgo.automation.utils.LoggerLoad;
import com.dsalgo.automation.utils.waitHelper;




public class DataStructure {
	public WebDriver driver;
	waitHelper waitHelper;
	
	
	
	@FindBy (xpath = "//a[@href ='data-structures-introduction']")
	WebElement getStartedDSintro_link;
	@FindBy (xpath="//a[@href='time-complexity']")
	WebElement timecomplexity_link;
	@FindBy (xpath="//a[@href='/tryEditor']")
	WebElement tryHere_link;
	@FindBy (className = ("CodeMirror-scroll"))
	WebElement textEditor; 
	@FindBy (xpath = "//*[text()='Practice Questions']")
	WebElement practiceQues;
	@FindBy(xpath = "//button[text()='Run']")
	WebElement runBtn;
	@FindBy (xpath = "//body")
	WebElement bodyTag;
	@FindBy (xpath = "//form/div/div/div/textarea")
	WebElement output;
	@FindBy (id = "output")
	WebElement successMsg;
	@FindBy (xpath="//*[text()='NumpyNinja']")
	WebElement numpyninjaLogo;
	
	public DataStructure() {
		this.driver = DriverFactory.getDriver();
		PageFactory.initElements(driver, this);
		waitHelper = new waitHelper(driver,10);
		LoggerLoad.info("Initialized DataStructure page");
	}
	
	public String getTitleofPage() {
		String title = driver.getTitle();
        LoggerLoad.info("Page title: " + title);
		return title;
	}
	
	public void clickTimeCom() {
		try {
			timecomplexity_link.click();
			LoggerLoad.info("Clicked on 'Time Complexity' link");
	    } catch (Exception e) {
	        LoggerLoad.error("Failed to click Time Complexity link");
	    }
	}
	
	public String getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
        LoggerLoad.info("Current URL: " + currentUrl);
		return currentUrl;
	}
	
	public void clickPracticeQues() {
		try {
			practiceQues.click();
			 LoggerLoad.info("Clicked on Practice Questions");
	    } catch (Exception e) {
	        LoggerLoad.error("Failed to click Practice Questions");
	    }
	}
	
	public String bodyText() {
		String text = bodyTag.getText().trim();
        LoggerLoad.info("Body text: " + text);
        return text;
	}

	public void clickTryHere() {
		try {
		tryHere_link.click();
			LoggerLoad.info("Clicked on Try Here link");
	    } catch (Exception e) {
	        LoggerLoad.error("Failed to click Try Here");
	    }
	}
	
	public Boolean isTextEditorVisible() {
		try {
            boolean visible = textEditor.isDisplayed();
            LoggerLoad.info("Text editor visible: " + visible);
            return visible;
        } catch (Exception e) {
            LoggerLoad.error("Text editor not visible");
            return false;
    }	}
	
	public Boolean isRunBtnVisible() {
		try {
			boolean visible = runBtn.isDisplayed();
	        LoggerLoad.info("Run button visible: " + visible);
	        return visible;
	    } catch (Exception e) {
	        LoggerLoad.error("Run button not visible");
	        return false;
	    }
	}
	
	public String isTextEditorEmpty() {
		String content = output.getText().trim();
        LoggerLoad.info("Editor content: " + content);
        return content;
	}
	
	public void clickRunButton() {
		try {
			runBtn.click();
			LoggerLoad.info("Clicked on Run button");
	    } catch (Exception e) {
	        LoggerLoad.error("Failed to click Run button");
	    }
	}
	
	public String errorMsg() {
		String msg = output.getText().trim();
        LoggerLoad.info("Error message: " + msg);
        return msg;
	}
	
	public void enterPythonCode(String pythonCode) {
		try {
			output.sendKeys(pythonCode);
			LoggerLoad.info("Entered Python code into editor: " + pythonCode);
	    } catch (Exception e) {
	        LoggerLoad.error("Failed to enter Python code");
	    }
	}
	
	public String successMsg() {
		String msg = successMsg.getText();
        LoggerLoad.info("Success message: " + msg);
        return msg;	
    }
	
	public void clickNumpyninjaLogo() {
		try {
			numpyninjaLogo.click();
			LoggerLoad.info("Clicked on NumpyNinja logo");
	    } catch (Exception e) {
	        LoggerLoad.error("Failed to click NumpyNinja logo");
	    }
	}
	public String AlertGetText() {
		 try {
		        Alert alert = waitHelper.waitForAlertIsPresent();
		        String alertText = alert.getText();
		        alert.accept();
		        LoggerLoad.info("Alert appeared: " + alertText);
		        return alertText;
		  } catch (Exception e) {
		        LoggerLoad.error("No alert was present or failed to handle alert");
		        return null;
		  }
	}
}
