package com.dsalgo.automation.pages;





import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.dsalgo.automation.driver.DriverFactory;
import com.dsalgo.automation.utils.LoggerLoad;
import com.dsalgo.automation.utils.waitHelper;



public class GraphPage {
	public WebDriver driver;
	waitHelper waitHelper;
	
	//Setting up logging using Apache Log4j
	//private static final Logger LoggerLoad = LogManager.getLogger(GraphPage.class);
	
	@FindBy (xpath ="//a[@href ='graph']")
	WebElement getStartedgraph;
	@FindBy (linkText="Graph")
	WebElement graphLink;
	@FindBy (xpath ="//*[text()='Graph Representations']")
	WebElement graphRep_link;
	@FindBy(xpath="//a[contains(text(),'Practice Questions')]")
	WebElement graphPracticeQues;
	@FindBy (xpath = "//a[@href='/tryEditor']")
	WebElement try_here;
	@FindBy (className = ("CodeMirror-scroll"))
	WebElement textEditor; 
	@FindBy(xpath ="//button[text()='Run']")
	WebElement runBtn;
	@FindBy (id = "output")
	WebElement successMsg;
	@FindBy (xpath = "//form/div/div/div/textarea")
	WebElement output;
	@FindBy (xpath="//*[text()='NumpyNinja']")
	WebElement numpyninjaLogo;
	@FindBy (xpath = "//body")
	WebElement bodyTag;
	@FindBy (xpath = "(//*[text()='Graph Representations'])[3]/../../p[15]")
	WebElement paragraph;
	@FindBy (xpath = "(//*[text()='Graph Representations'])[3]/../../p[15]/img")
	WebElement table;
	
	public GraphPage() {
		this.driver = DriverFactory.getDriver();
		PageFactory.initElements(driver, this);
		LoggerLoad.info("GraphPage initialized");
	}
	
	public String getTitleofPage() {
		String title = driver.getTitle();
		LoggerLoad.info("Page title: " + title);
		return title;
	}
	
	public void clickGraphLink() {
		try {
			graphLink.click();
			LoggerLoad.info("Clicked on Graph link");
		} catch (Exception e) {
			LoggerLoad.error("Failed to click Graph link");
		}
	}
	
	public String getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		LoggerLoad.info("Current URL: " + currentUrl);
		return currentUrl;
	}

	public void clickTryHere() {
		try {
			try_here.click();
			LoggerLoad.info("Clicked on Try Here");
		} catch (Exception e) {
			LoggerLoad.error("Failed to click Try Here");
		}
	}
	
	public Boolean isTextEditorVisible() {
		try {
			boolean visible = textEditor.isDisplayed();
			LoggerLoad.info("Text editor visibility: " + visible);
			return visible;
		} catch (Exception e) {
			LoggerLoad.error("Text editor not visible");
			return false;
		}
	}
	
	public Boolean isRunBtnVisible() {
		try {
			boolean visible = runBtn.isDisplayed();
			LoggerLoad.info("Run button visibility: " + visible);
			return visible;
		} catch (Exception e) {
			LoggerLoad.error("Run button not visible");
			return false;
		}
	}
	
	public String isTextEditorEmpty() {
		return output.getText().trim();
	}
	
	public void clickRunButton() {
		try {
			runBtn.click();
			LoggerLoad.info("Clicked Run button");
		} catch (Exception e) {
			LoggerLoad.error("Failed to click Run button");
		}
	}
	
	public String errorMsg() {
	    return output.getText().trim();

	}
	
	public void enterPythonCode(String pythonCode) {
		try {
			output.sendKeys(pythonCode);
			LoggerLoad.info("Entered Python code: " + pythonCode);
		} catch (Exception e) {
			LoggerLoad.error("Failed to enter Python code");
		}
	}
	
	public String successMsg() {
		return successMsg.getText();
	}
	
	public void clickGraphRep() {
		try {
			graphRep_link.click();
			LoggerLoad.info("Clicked Graph Representation link");
		} catch (Exception e) {
			LoggerLoad.error("Failed to click Graph Representation link");
		}
	}
	
	public void clickNumpyninjaLogo() {
		try {
			numpyninjaLogo.click();
			LoggerLoad.info("Clicked on NumpyNinja logo");
		} catch (Exception e) {
			LoggerLoad.error("Failed to click NumpyNinja logo");
		}
	}
	
	public void clickPracticeQues() {
		try {
			graphPracticeQues.click();
			LoggerLoad.info("Clicked on Practice Questions link");
		} catch (Exception e) {
			LoggerLoad.error("Failed to click Practice Questions link");
		}
	}
	
	public String bodyText() {
		String text = bodyTag.getText().trim();
		LoggerLoad.info("Body text: " + text);
		return text;
	}
	
	
	public boolean isParagraphLeftAligned(WebElement paragraph) {
	    String alignment = paragraph.getCssValue("text-align");
		LoggerLoad.info("Paragraph alignment: " + alignment);
	    return alignment.equals("left") || alignment.equals("start");
	}
	
	public boolean isParagraphVisible() {
		try {
			boolean visible = paragraph.isDisplayed();
			LoggerLoad.info("Paragraph visibility: " + visible);
			return visible;
		} catch (Exception e) {
			LoggerLoad.error("Paragraph not visible");
			return false;
		}
	}
	    
    public String getParagraphText() {
    	String text = paragraph.getText();
    	LoggerLoad.info("Paragraph text: " + text);
    	return text;    
    }
    
    public boolean isOverlapping() {
        Rectangle paraRect = paragraph.getRect();
        Rectangle tableRect = table.getRect();
        //checking whether image and paragraph are overlapped
        boolean overlapping = paraRect.x < tableRect.x + tableRect.width &&
                paraRect.x + paraRect.width > tableRect.x &&
                paraRect.y < tableRect.y + tableRect.height &&
                paraRect.y + paraRect.height > tableRect.y;
        LoggerLoad.info("Paragraph and table overlapping: " + overlapping);
        return overlapping;
    }
    
    public WebElement getParagraphImage() {
        return table;
    }
}
