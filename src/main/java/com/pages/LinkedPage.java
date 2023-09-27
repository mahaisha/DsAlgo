package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.util.Constants;

public class LinkedPage {

private WebDriver driver;
	
	
	//private By LinkedPageTitle = By.xpath("//h4[@class='bg-secondary text-white']");
	private By LinkedIntroLink = By.xpath("//a[@href='introduction']");
	
	public LinkedPage(WebDriver driver)
	{
		this.driver = driver;
	} 
		public void navigateToLinkedPage()
		{
			driver.get(Constants.linkedUrl);
		}
   
		public String getLinkedPageTitle()
	{
		return driver.getTitle();
		
			}
		public void LinkedIntroLink()
		{
			driver.findElement(LinkedIntroLink).click();
		}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
