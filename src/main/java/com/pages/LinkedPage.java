package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.qa.util.Constants;

public class LinkedPage {

private WebDriver driver;
	
	
	private By introductionPg = By.xpath("//a[@href='introduction']");
	private By creatingLink = By.xpath("//a[@href='creating-linked-list']");
	private By typesLink = By.xpath("//a[@href='types-of-linked-list']");
	private By implimentingLink = By.xpath("//a[@href='implement-linked-list-in-python']");
	private By traversalPg = By.xpath("//a[@href='traversal']");
	private By insertionPg = By.xpath("//a[@href='insertion-in-linked-list']");
	private By deletionPg = By.xpath("//a[@href='deletion-in-linked-list']");
	private By practiceQuesPg = By.xpath("//a[@href ='/linked-list/practice']");
	private By codeeditor = By.xpath("//div[@class='input'] ");
	private By answerform = By.id("output");
	private By runButton = By.xpath("//button[@type='button']");
	
	public LinkedPage(WebDriver driver)
	{
		this.driver = driver;
	} 
	public void linkedListHome()
	{
		driver.get(Constants.linkedlistUrl);
	}
	
    public void clickOnIntroduction() {
		driver.findElement(introductionPg).click();
	} 
   
		public String getLinkedPageTitle()
	{
		return driver.getTitle();
		
			}
		 public void clickOnCreatingLinked() {
				driver.findElement(creatingLink).click();
			} 
		 public void clickOnTypesOfLink() {
				driver.findElement(typesLink ).click();
			} 
		 public void clickOnImplimentingLink() {
				driver.findElement(implimentingLink).click();
			} 
		 public void clickOnTraversal() {
				driver.findElement(traversalPg).click();
			} 
		 public void clickOnInsertion() {
				driver.findElement(insertionPg).click();
			} 
		 public void clickOnDeletion() {
				driver.findElement(deletionPg).click();
			} 
		 
		 public void clickOnPracticeQuest() {
				driver.findElement(practiceQuesPg).click();
			} 
		 
		 																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																													
//		 public void fillCodeEditor(String code) throws InterruptedException
//			{
//				WebElement textarea = driver.findElement(codeeditor);
//				Actions action = new Actions(driver);
//				action.sendKeys(textarea, code).build().perform();
//				Thread.sleep(1000);
//			}
//
//			public boolean isAnswerDisplayed() throws InterruptedException
//			{
//				String text =  driver.findElement(answerform).getText();
//				Thread.sleep(1000);
//				if(text.isBlank())
//					return false;
//				return true;
//			}

				public String getCurrentUrl() {
					return driver.getCurrentUrl();}
				
				public boolean isRunButtonExists() {
					return driver.findElement(runButton).isDisplayed();
				}
				

			    
	
}
