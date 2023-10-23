package com.pages;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage {
	private WebDriver driver;
	
	//Locators
		private By getStarted = By.xpath("//button[@class='btn']");
		private By usernameLocator = By.name("username");
		private By passwordLocator = By.name("password1");
		private By pass_confirmLocator = By.name("password2");
		private By register_button = By.xpath("//input[@type='submit']");
		private By registerLink = By.linkText("Register");
		private By errorMsg = By.xpath("//div[@class='alert alert-primary']");
		private By validLogin = By.xpath("//div[@class='alert alert-primary']");
		String error="";
		
		 // Constructor
	    public RegisterPage(WebDriver driver) {
	        this.driver = driver;
	    }

	    // Methods
	    
	    public void clickGetStartedButton() {
	    	WebElement getStartedButton = driver.findElement(getStarted);
	    	getStartedButton.click();
	    }
	    
	    public void clickRegisterLink() {
	    	driver.findElement(registerLink).click();
	    }
	    public void enterUsername(String userName) {
	        WebElement usernameInput = driver.findElement(usernameLocator);
	        usernameInput.sendKeys(userName);
	    }

	    public void enterPassword(String password) {
	        WebElement passwordInput = driver.findElement(passwordLocator);
	        passwordInput.sendKeys(password);
	    }
	    
	    public void password_confirmation(String pass_confirm) {
	    	WebElement pass_confirmInput = driver.findElement(pass_confirmLocator);
	    	pass_confirmInput.sendKeys(pass_confirm);
	    }

	    public void clickRegisterButton(){
	         driver.findElement(register_button).click();	        
	    }
		public String passwordErrorMessage() {
			return  driver.findElement(errorMsg).getText();
		}
		public String validLoginMessage() {
			return driver.findElement(validLogin).getText();
		}
		public void randomUserNameGenerator(String uname) {
			String uNameInput = RandomStringUtils.randomAlphanumeric(6);
			WebElement userInput = driver.findElement(usernameLocator);
			String str = uname+uNameInput;
			System.out.println("Username ="+str);
			userInput.sendKeys(str);
		}
		public String getCurrentUrl() {
				return driver.getCurrentUrl();
				}
		
		public String clickRegisterwithoutUsername()
				{ 	
					driver.findElement(register_button).click();
					WebElement uName = driver.findElement(usernameLocator);
					error=uName.getAttribute("validationMessage");
					System.out.println("Validation Message = "+error);	
					return error;
				} 
		
		public String clickRegisterWithoutPassword(){
			driver.findElement(register_button).click();
			WebElement pwd = driver.findElement(passwordLocator);
			error = pwd.getAttribute("validationMessage");
			System.out.println("Validation Message = "+error);	
			return error;
		}
		
		public String clickRegisterwithoutPasswordConfirm() {
			driver.findElement(register_button).click();
			WebElement cpwd = driver.findElement(pass_confirmLocator);
			error = cpwd.getAttribute("validationMessage");
			System.out.println("Validation Message = "+error);	
			return error;
		}
}
