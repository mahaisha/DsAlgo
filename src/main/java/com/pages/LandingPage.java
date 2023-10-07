package com.pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LandingPage {
	
	private WebDriver driver;

	private By signInlink = By.xpath("//a[contains(text(),'Sign in')]");
	private By getstarted = By.linkText("Get Started");
	private By register = By.linkText("Register");
	private By errorMsg = By.xpath("//div[@class='alert alert-primary']");
	private By dropDown = By.xpath("//div[@class = 'navbar-nav']");
	private By arrayGetStart = By.xpath("//a[@href ='array']");
	private By linkedlistGetStart = By.xpath("//a[@href ='linked-list']");
	private By stackGetStart = By.xpath("//a[@href ='stack']");
	private By queueGetStart = By.xpath("//a[@href ='queue']");
	private By treeGetStart = By.xpath("//a[@href ='tree']");
	private By graphGetStart = By.xpath("//a[@href ='graph']");

	public LandingPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public String getErrorMsg() {
		String errorMsgText = driver.findElement(errorMsg).getText();
		return errorMsgText;
	}
	
	public int countGetStartedButtons() {
		List <WebElement> listOfButtons =  driver.findElements(getstarted);
		int count  = listOfButtons.size();
		return count;
	}
	
	public void registerOrSignInLink(String linkClicked) {
		if(linkClicked.equalsIgnoreCase("Sign in")) {
			driver.findElement(signInlink).click();
		}else {
			driver.findElement(register).click();
		}
	}
	
	public void clickDropDown() {
		driver.findElement(dropDown).click();
	}
	
	public void selectDataStructure(String dataStructure) throws InterruptedException {
		if(dataStructure.equalsIgnoreCase("array")) {
			System.out.println("Clicking arrays");
			driver.findElement(arrayGetStart).click();
		}
		else if(dataStructure.equalsIgnoreCase("linked-list")) {
			System.out.println("Clicking ll");
			driver.findElement(linkedlistGetStart).click();
			}
		else if(dataStructure.equalsIgnoreCase("stack")) {
			System.out.println("Clicking stack");
			driver.findElement(stackGetStart).click();
			}
		else if(dataStructure.equalsIgnoreCase("queue")) {
			driver.findElement(queueGetStart).click();
			System.out.println("Clicking queue");
			}
		else if(dataStructure.equalsIgnoreCase("tree")) {
			System.out.println("Clicking tree");
			driver.findElement(treeGetStart).click();
			}
		else if(dataStructure.equalsIgnoreCase("graph")) {
			System.out.println("Clicking graph");
			driver.findElement(graphGetStart).click();
		}

	}
}
