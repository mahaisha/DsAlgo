package com.pages;



import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.util.Constants;

import io.cucumber.messages.types.Duration;

public class ArrayPage {
	
	private WebDriver driver;

	
	private By arrayInPy = By.xpath("//a[@href='arrays-in-python']");
	private By arraysList = By.xpath("//a[@href='arrays-using-list']");
	private By basicLists = By.xpath("//a[@href='basic-operations-in-lists']");
	private By appArray = By.xpath("//a[@href='applications-of-array']");
	private By arrayPracQues = By.xpath("//a[@href='/array/practice']");
	private By searchArray = By.xpath("//a[@href='/question/1']");
	private By maxConsecutive = By.xpath("//a[@href='/question/2']");
	private By findEvenNum = By.xpath("//a[@href='/question/3']");
	private By araaySortedSq = By.xpath("//a[@href='/question/4']");
	private By codeeditor = By.xpath("//div[@class='input']");
	private By answerform = By.id("output");
	private By runButton = By.xpath("//button[@type='button']");
	
	public ArrayPage(WebDriver driver)
	{
		this.driver = driver;
		
	}
	public void arrayPageHome()
	{
		driver.get(Constants.arrayUrl);
	}

	public String getArrayPageTitle()
	{
		return driver.getTitle();
	}
	
	public void clickOnArraysInPy() {
		driver.findElement(arrayInPy).click();
	}
	public void clickOnArraysUsingList() {
		driver.findElement(arraysList).click();
	} 
	public void clickOnBasicOpLists() {
		driver.findElement(basicLists).click();
	} 
	public void clickOnAppOfArray() {
		driver.findElement(appArray).click();
	} 

	public void clickOnPracticeQuest() {
		driver.findElement(arrayPracQues).click();
	}	
	
	public void clickOnSearchArray() {
		driver.findElement(searchArray).click();
	}	
	public void clickOnMaxConsecutive() {
		driver.findElement(maxConsecutive).click();
	}		

	public void clickOnFinfEvenNumbers() {
		driver.findElement(findEvenNum).click();
	}			
			
	public void clickOnSortedArraySq() {
		driver.findElement(araaySortedSq ).click();
	}	
	
    public void clickOnRunButton() {
	    driver.findElement(runButton).click();
    }	
    
    public void getPracticeQuestUrl()
	{
		driver.get("https://dsportalapp.herokuapp.com/array/practice");
    }
		 
	public void fillCodeEditor(String code) throws InterruptedException
	{
		WebElement textarea = driver.findElement(codeeditor);
		Actions action = new Actions(driver);
		action.sendKeys(textarea, code).build().perform();
		Thread.sleep(500);

	}
	public void clearCodeEditor() throws InterruptedException{
	WebElement textarea = driver.findElement(codeeditor);
	Actions action = new Actions(driver);
	  action.keyDown(textarea,Keys.SHIFT)
	   .keyDown(textarea,Keys.ARROW_DOWN)
	   .sendKeys(textarea,Keys.DELETE)
	   .keyUp(textarea,Keys.ARROW_DOWN)
	   .keyUp(textarea,Keys.SHIFT)
	   .build()
	   .perform();

		}
	public boolean isAnswerDisplayed() throws InterruptedException
	{
		String text =  driver.findElement(answerform).getText();
		Thread.sleep(1000);
		if(text.isBlank())
			return false;
		return true;
	}
	
	
	public void present_alertMsg() throws InterruptedException
	{
		Thread.sleep(5000);
		Alert alert= driver.switchTo().alert();
		System.out.println(alert.getText());
		String text = alert.getText();
//		if(text.equals("NameError: name 'color' is not defined on line 1")) {
//			System.out.println("correct alert msg");
//		}
//		else {
//			System.out.println("in-correct alert msg");
//		}
		alert.accept();
		}
	
}
