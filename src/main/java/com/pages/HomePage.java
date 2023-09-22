package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.util.Constants;

public class HomePage {

	private WebDriver driver;

//	private By homeGetStartedlink = By.xpath("//a[contains(text(),'Get Started')]");
	private By signOutlink = By.xpath("//a[contains(text(),'Sign out')]");
	private By tryherelink = By.linkText("Try here>>>");
	private By runbutton = By.xpath("//button[contains(text(),'Run')]");
	private By array_GetStart = By.xpath("//a[@href ='array']");
	private By data_structures_GetStart = By.xpath("//a[@href ='data-structures-introduction']");
	private By linked_list_GetStart = By.xpath("//a[@href ='linked-list']");
	private By stack_GetStart = By.xpath("//a[@href ='stack']");
	private By queue_GetStart = By.xpath("//a[@href ='queue']");
	private By tree_GetStart = By.xpath("//a[@href ='tree']");
	private By graph_GetStart = By.xpath("//a[@href ='graph']");
	private By tryeditor = By.xpath("//div[@class='input'] ");
	private By answerform = By.id("output");


	public HomePage(WebDriver driver)
	{
		this.driver = driver;
		
	}
	public void clickOnTryHere()
	{
		driver.findElement(tryherelink).click();
	}
	public void clickOnRunButton()
	{
		driver.findElement(runbutton).click();
	}
	public boolean isRunButtonExists()
	{
		return driver.findElement(runbutton).isDisplayed();
	}
	public boolean isSignOutExists()
	{
		return driver.findElement(signOutlink).isDisplayed();
	}
	public void startHomePage(String pageName)
	{
		
		if(pageName.equalsIgnoreCase("array"))
			driver.findElement(array_GetStart).click();
		else if(pageName.equalsIgnoreCase("data-structures-introduction"))
			driver.findElement(data_structures_GetStart).click();
		else if(pageName.equalsIgnoreCase("linked-list"))
			driver.findElement(linked_list_GetStart).click();
		else if(pageName.equalsIgnoreCase("stack"))
			driver.findElement(stack_GetStart).click();
		else if(pageName.equalsIgnoreCase("queue"))
			driver.findElement(queue_GetStart).click();
		else if(pageName.equalsIgnoreCase("tree"))
			driver.findElement(tree_GetStart).click();
		else if(pageName.equalsIgnoreCase("graph"))
			driver.findElement(graph_GetStart).click();
		else
			System.out.println("Page cannot be found-home");
		
	}
	public String getPageTitle()
	{
		return driver.getTitle();
	}
	public boolean istryEditorExists()
	{
		return driver.findElement(tryeditor).isDisplayed();
	}
	public boolean isAnswerDisplayed() throws InterruptedException
	{
		String text =  driver.findElement(answerform).getText();
		Thread.sleep(1000);
		if(text.isBlank())
			return false;
		return true;
	}
	public void getHomePage(String pageName)
	{
		if(pageName.equalsIgnoreCase("array"))
			driver.get(Constants.arrayUrl);
		else if(pageName.equalsIgnoreCase("data-structures-introduction"))
			driver.get(Constants.dsUrl);
		else if(pageName.equalsIgnoreCase("linked-list"))
			driver.get(Constants.linkedlistUrl);
		else if(pageName.equalsIgnoreCase("stack"))
			driver.get(Constants.stackUrl);
		else if(pageName.equalsIgnoreCase("queue"))
			driver.get(Constants.queueUrl);
		else if(pageName.equalsIgnoreCase("tree"))
			driver.get(Constants.treeUrl);
		else if(pageName.equalsIgnoreCase("graph"))
			driver.get(Constants.graphUrl);
		else
			System.out.println("Page cannot be found-home");
	}
	
}
