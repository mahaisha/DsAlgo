package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;

public class DataStructurePage {

	
	private WebDriver driver;
	
	private By DataStructureGetStarted = By.xpath("//a[@href ='data-structures-introduction']");
	private By TimeComplexity_mainPage = By.linkText("Time Complexity");
	private By Practice_questions = By.linkText("Practice Questions");
	private By try_here_dataStructure = By.xpath("//a[@href='/tryEditor']");
	private By runbutton = By.xpath("//button[contains(text(),'Run')]");
	
	public DataStructurePage(WebDriver driver){
		this.driver = driver;
	}
	
	public void getStartedDataStructurePage() {	
		driver.findElement(DataStructureGetStarted).click();		
	}
	
	public String getDataStructureTitle() {
		return driver.getTitle();
	}
	public void clickTimeComplexityLink(){
		driver.findElement(TimeComplexity_mainPage).click();
	}
	public void clickPracticeQuestions() {
		driver.findElement(Practice_questions).click();
	}
	
}
