package com.dsalgo.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TreePage {

	WebDriver driver ;
	
	@FindBy (xpath = "//a[contains(text(),'Overview')]")
	private WebElement overviewOfTreesLnk;
	
	@FindBy (xpath = "//a[contains(text(),'Terminologies')]")
	private WebElement terminologiesLnk;
	
	@FindBy (xpath = "//a[contains(text(),'Types of')]")
	private WebElement typesOfTreesPageLnk;
	
	@FindBy (xpath = "//a[text()='Tree Traversals']")
	private WebElement treeTraversalsLnk;
	
	@FindBy (xpath = "//a[text()='Traversals-Illustration']")
	private WebElement traversalsIllustrationLnk;
	
	@FindBy (xpath = "//a[text()='Binary Trees']")
	private WebElement binaryTreesLnk;
	
	@FindBy (xpath = "//a[text()='Types of Binary Trees']")
	private WebElement typesOfBinaryTreesLnk;
	
	@FindBy (xpath = "//a[text()='Implementation in Python']")
	private WebElement implementationInPythonLnk;
	
	@FindBy (xpath = "//a[text()='Binary Tree Traversals']")
	private WebElement binaryTreeTraversalsLnk;
	
	@FindBy (xpath = "//a[text()='Implementation of Binary Trees']")
	private WebElement implementationOfBinaryTreesLnk;
	
	@FindBy (xpath = "//a[text()='Applications of Binary trees']")
	private WebElement applicationsOfBinaryTreesLnk;
	
	@FindBy (xpath = "//a[text()='Binary Search Trees']")
	private WebElement binarySearchTreesLnk;
	
	@FindBy (xpath = "//a[text()='Implementation Of BST']")
	private WebElement implementationOfBSTLnk;
	
	@FindBy(css = "img[src='/media/ckupload/Trees_Overview.jpg']")
	private WebElement treeOverviewImage;
	
	@FindBy(xpath = "//img[@src='/media/ckupload/Level_order_traversal.jpg']")
	private WebElement levelOrderTraversalImage;
	
	@FindBy(xpath = "//img[@src='/media/ckupload/Tree_traversals.jpg\']")
	private WebElement depthFirstTraversalImage;
	
	@FindBy(xpath = "//img[@src='/media/ckupload/Binary%20Trees.jpg\']")
	private WebElement binaryTreeImage;
	
	@FindBy(xpath = "//img[@src='/media/ckupload/Complete%20Binary%20Tree.jpg']")
	private WebElement completteBinaryTreeImage;
	
	@FindBy(xpath = "//img[@src='/media/ckupload/Full%20Binary%20Tree.jpg']")
	private WebElement fullBinaryTreeImage;
	
	@FindBy(xpath = "//img[@src='/media/ckupload/tree_traversal_diagram.jpg']")
	private WebElement binaryTreeDataImage;
	
	@FindBy(xpath = "//img[contains(@src,'content.com')]")
	private WebElement binarySearchTreeImage;
	
	
	
	
	public TreePage(WebDriver webDriver) {
		this.driver = webDriver;
        PageFactory.initElements(driver, this);
	}
	

	public void clickOverviewOfTreeslnk() {
		overviewOfTreesLnk.click();
	}
	
	public boolean verifyOverviewImage() {
		return treeOverviewImage.isDisplayed();
	}
	
	public void clickTerminologieslnk() {
		terminologiesLnk.click();
	}
	
	public void clickTypesOfTreeslnk() {
		typesOfTreesPageLnk.click();
	}
	
	public void clickTreeTraversalsLnk() {
		treeTraversalsLnk.click();
	}
	
	public boolean verifyTreeTraversalImage() {
		return levelOrderTraversalImage.isDisplayed();
	}
	
	public void clickTraversalsIllustrationLnk() {
		traversalsIllustrationLnk.click();
	}
	
	public boolean verifyDepthFirstTraversalImage() {
		return depthFirstTraversalImage.isDisplayed();
	}
	
	public void clickBinaryTreesLnk() {
		binaryTreesLnk.click();
	}
	
	public boolean verifyBinaryTreeImage() {
		return binaryTreeImage.isDisplayed();
	}
	
	public void clickTypesOfBinaryTreesLnk() {
		typesOfBinaryTreesLnk.click();
	}
	
	public boolean verifyCompletteBinaryTreeImage() {
		return completteBinaryTreeImage.isDisplayed();
	}
	
	public boolean verifyFullBinaryTreeImage() {
		return fullBinaryTreeImage.isDisplayed();
	}	
	
	public void clickImplementationInPythonLnk() {
		implementationInPythonLnk.click();
	}
	
	public void clickBinaryTreeTraversalsLnk() {
		binaryTreeTraversalsLnk.click();
	}
	
	public boolean verifyBinaryTreeDataImage() {
		return binaryTreeDataImage.isDisplayed();
	}	
	
	public void clickImplementationOfBinaryTreesLnk() {
		implementationOfBinaryTreesLnk.click();
	}
	
	public void clickApplicationsOfBinaryTreesLnk() {
		applicationsOfBinaryTreesLnk.click();
	}
	
	public void clickBinarySearchTreesLnk() {
		binarySearchTreesLnk.click();
	}
	
	public boolean verifyBinarySearchTreeImage() {
		return binarySearchTreeImage.isDisplayed();
	}	
	
	public void clickImplementationOfBSTLnk() {
		implementationOfBSTLnk.click();
	}
}
