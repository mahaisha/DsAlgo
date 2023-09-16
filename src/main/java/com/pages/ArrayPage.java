package com.pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class ArrayPage {
	
	private WebDriver driver;
	
	private By arrayGetStart = By.xpath("//a[@href ='array']");
	private By tryherelink = By.linkText("Try here>>>");
	private By runbutton = By.xpath("//button[contains(text(),'Run')]");
	private By arraytitle = By.xpath("//a[@href='applications-of-array']");
	private By codeeditor = By.xpath("//div[@class='input'] ");
	private By answerform = By.id("output");
	
	public ArrayPage(WebDriver driver)
	{
		this.driver = driver;
		
	}
	public void startArrayHomePage()
	{
		driver.get("https://dsportalapp.herokuapp.com/home");
		driver.findElement(arrayGetStart).click();
		driver.findElement(arraytitle).click();	   
	}
	public String getArrayPageTitle()
	{
		return driver.getTitle();
	}
	
	public void clickOnTryHere()
	{
		driver.findElement(tryherelink).click();
	}
	public void clickOnRunButton()
	{
		driver.findElement(runbutton).click();
	}
	public void fillCodeEditor(String code) throws InterruptedException
	{
		WebElement textarea = driver.findElement(codeeditor);
		Actions action = new Actions(driver);
		action.sendKeys(textarea, code).build().perform();
		Thread.sleep(1000);

	}

	public boolean isRunButtonExists()
	{
		return driver.findElement(runbutton).isDisplayed();
	}
	public boolean isAnswerDisplayed() throws InterruptedException
	{
		String text =  driver.findElement(answerform).getText();
		Thread.sleep(1000);
		if(text.isBlank())
			return false;
		return true;
	}
	
}
