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
	
   
		public String getLinkedPageTitle()
	{
		return driver.getTitle();
		
			}
		public void navigateInLinkedList(String string){
		
		if(string.equals("Introduction")) {
	    driver.findElement(introductionPg).click();	
    }else if (string.equals("Creating Linked LIst")) {
    	driver.findElement(creatingLink).click();
    }else if (string.equals("Types of Linked List")) {
    	driver.findElement(typesLink ).click();      
    }else if (string.equals("Implement Linked List in Python")) {
    	driver.findElement(implimentingLink).click();        
    }else if (string.equals("Traversal")) {
    	driver.findElement(traversalPg).click();     
    }else if (string.equals("Insertion")) {
    	driver.findElement(insertionPg).click();     
    }else if (string.equals("Deletion")) {
    	driver.findElement(deletionPg).click();
    }else if (string.equals("Practice Questions")) {
    	driver.findElement(practiceQuesPg).click();     
    }}

		 																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																													
				public String getCurrentUrl() {
					return driver.getCurrentUrl();}
				
				public boolean isRunButtonExists() {
					return driver.findElement(runButton).isDisplayed();
				}
				

			    
	
}
