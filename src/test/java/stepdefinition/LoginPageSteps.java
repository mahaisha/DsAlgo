package stepdefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.RegisterPage;
import com.qa.factory.DriverFactory;
import com.qa.util.Constants;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps {

	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	private HomePage home = new HomePage(DriverFactory.getDriver());
	
	@Given("user is on {string} page")
	public void user_is_on_page(String expectedTitle) {
		DriverFactory.getDriver().get(Constants.homeUrl);
		String actual = home.getPageTitle();
		System.out.println(actual);
		Assert.assertTrue(expectedTitle.equalsIgnoreCase(actual));
	}
	
	@When("User clicks Signout button")
	public void User_clicks_Signout_button() {
		loginPage.clickSignOutLink();
	}
	
	@Then("User is logged out sucessfully with message {string}")
	public void User_is_logged_out_sucessfully_with_message(String logOutMsg) {
		System.out.println(logOutMsg);
		String actual = loginPage.SignOutMessage();
		System.out.println(actual);
		Assert.assertTrue(logOutMsg.equalsIgnoreCase(actual));
	}
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		DriverFactory.getDriver().get(Constants.signInUrl);
	}
	@When("user enters valid username {string}")
	public void user_enters_valid_username(String usernameValue) {
		loginPage.enterUserName(usernameValue);
	}

	@When("user enters valid password {string}")
	public void user_enters_valid_password(String password) {
		loginPage.enterPassword(password);
	}

	@When("user clicks on Login button")
	public void user_clicks_on_login_button() {
	    
		loginPage.clickOnLogin();
	}
	@When("user clicks Register link")
	public void user_clicks_register_link() 
	{
	    loginPage.clickRegisterLink();
	}

	@When("user clicks login link on registartion page")
	public void user_clicks_login_link_on_registartion_page() {
	   loginPage.clickLoginonRegister();
	}

	@Then("user should be redirected to {string} page")
	public void user_should_be_redirected_to_page(String expectedTitle) {
	    System.out.println("ExpectedTitle="+expectedTitle);
	    String actualTitle =home.getPageTitle();
	    System.out.println(actualTitle);
	    Assert.assertTrue(expectedTitle.equalsIgnoreCase(actualTitle));
	}
	@Given("User enters invalid {string} and invalid {string} combinations")
	public void user_enters_invalid_and_invalid_combinations(String uName, String pwd) {
	    loginPage.enterUserName(uName);
	    loginPage.enterPassword(pwd);
	}

	@Then("user gets an error message {string}")
	public void user_gets_an_error_message(String ExpectederrorMsg) {
	  System.out.println(ExpectederrorMsg);
	  String actualErrorMsg = loginPage.getErrorMsg();
	  System.out.println(actualErrorMsg);
	  Assert.assertTrue(ExpectederrorMsg.equalsIgnoreCase(actualErrorMsg));
	}

	@When("user enters valid username")
	public void user_enters_valid_username(DataTable dataTable) {
	    List<Map<String,String>> userMap =dataTable.asMaps(String.class,String.class);
	    String userName = userMap.get(0).get("username");
	    loginPage.enterUserName(userName);
	}

	@When("user enters valid password")
	public void user_enters_valid_password(DataTable dataTable) {
	  List<Map<String,String>> userMap=  dataTable.asMaps(String.class,String.class);
	  String pwd = userMap.get(0).get("password");
	  loginPage.enterPassword(pwd);
	}

	@Then("It should display an error {string} below Password textbox on login page")
	public void it_should_display_an_error_below_password_textbox_on_login_page(String toolTipMsg) {
	   System.out.println("Expected = "+toolTipMsg);
	   String actualMsg = loginPage.clickWithoutPassword();
	   System.out.println("Actual = "+actualMsg);
	   Assert.assertTrue(toolTipMsg.equalsIgnoreCase(actualMsg));
	}

	@Then("It should display an error {string} below username textbox on login page")
	public void it_should_display_an_error_below_username_textbox_on_login_page(String toolTipMsg) {
	   System.out.println("Expected Msg ="+toolTipMsg);
	   String actualMsg = loginPage.clickWithoutUsername();
	   System.out.println("Actual Msg ="+actualMsg);
	   Assert.assertTrue(toolTipMsg.equalsIgnoreCase(actualMsg));
	}
	@Then("The user should be redirected to Home Page with the message {string} and with the user name on the top.")
	public void the_user_should_be_redirected_to_home_page_with_the_message_and_with_the_user_name_on_the_top(String sucessMsg) {
	   System.out.println(sucessMsg);
	   String Msg = loginPage.getSucessMsg();
	   System.out.println(Msg);
	   Assert.assertTrue(sucessMsg.equalsIgnoreCase(Msg));
	}



}
