package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	private WebDriver driver;
	
	//1. By Locators;
	
	private By username = By.id("id_username");
	private By password = By.id("id_password");
	private By loginButton = By.xpath("//input[@value='Login']");
	private By registerLink = By.linkText("Register!");
	private By sucessfulLoginMsg = By.xpath("//div[@class='alert alert-primary']");
	private By errorMsg = By.xpath("//div[@class='alert alert-primary']");
	private By loginLinkRegister = By.linkText("Login");
	private By signOutLink = By.linkText("Sign out");						 //("//a[@href='/logout']");
	private By logOutMsg = By.xpath("//div[@class='alert alert-primary']");
	
	String error="";
	
	//2.Constructor of the page class:
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	//3. page actions: features(behavior) of the page the form of methods
	
	public boolean isRegisterLinkExist()
	{
		return driver.findElement(registerLink).isDisplayed();
	}
	public void enterUserName(String usernameValue)
	{
		driver.findElement(username).sendKeys(usernameValue);
	}
	public void enterPassword(String pwd)
	{
		driver.findElement(password).sendKeys(pwd);
	}
	public void clickOnLogin()
	{
		driver.findElement(loginButton).click();
	}
	public void clickRegisterLink() 
	{
		driver.findElement(registerLink).click();
	}
	public void clickSignOutLink() {
		driver.findElement(signOutLink).click();
	}
	public String getErrorMsg() {
		return driver.findElement(errorMsg).getText();
	}
	public  String SignOutMessage() {
		return driver.findElement(logOutMsg).getText();
	}
	public void clickLoginonRegister() {
		driver.findElement(loginLinkRegister).click();
	}
	public String clickWithoutUsername() {
		driver.findElement(loginButton).click();
		WebElement uName = driver.findElement(username);
		 error = uName.getAttribute("validationMessage");
		System.out.println("Validation Message="+error);
		return error;
	}
	public String clickWithoutPassword() {
		driver.findElement(loginButton).click();
		WebElement pwd = driver.findElement(password);
		error = pwd.getAttribute("validationMessage");
		System.out.println("Validation Msg = "+error);
		return error;
	}
	public String getSucessMsg() {
		return driver.findElement(sucessfulLoginMsg).getText();
	}

}
