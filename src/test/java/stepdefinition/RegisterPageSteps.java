package stepdefinition;

	import org.testng.Assert;

	import java.io.IOException;
	import java.util.List;
	import java.util.Map;

	import org.apache.commons.lang3.RandomStringUtils;
	import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;

	import com.qa.factory.DriverFactory;
	import com.qa.util.Constants;

	import io.cucumber.datatable.DataTable;
	import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;

	import com.pages.RegisterPage;
	import com.pages.ExcelReader;

	public class RegisterPageSteps {
		private WebDriver driver;	
		private RegisterPage registerPage = new RegisterPage(DriverFactory.getDriver());
		
		@Given("User is on DS-Algo website")
		public void user_is_on_DS_Algo_website() {
		    DriverFactory.getDriver().get(Constants.dsAlgoLandingUrl);
		    registerPage.clickGetStartedButton();    
		}
		
		@Given("User clicks on Register link")
		public void user_clicks_on_register_link() {
			registerPage.clickRegisterLink();
		}

		@Given("User enters valid username and valid password")
		public void user_enters_valid_username_and_valid_password(DataTable dataTable) {
		  List<Map<String,String>> userMap=  dataTable.asMaps(String.class, String.class);
		  String pwd = userMap.get(0).get("password");
		  registerPage.enterPassword(pwd);
		}

		@Given("User enters valid value in password confirmation field")
		public void user_enters_valid_value_in_password_confirmation_field() {
		    registerPage.password_confirmation("Ninjas123");
		}
		@Given("user is on register page")
		public void user_is_on_register_page() {
		  Assert.assertTrue(registerPage.getCurrentUrl().equalsIgnoreCase("https://dsportalapp.herokuapp.com/register"));
		}
		@When("User clicks on register button")
		public void user_clicks_on_register_button() throws InterruptedException {
		   registerPage.clickRegisterButton();
		}
		@Given("user enters the valid username")
		public void user_enters_the_valid_username(DataTable dataTable) {
		  List<Map<String,String>> userMap=	dataTable.asMaps(String.class, String.class);
		  String uName =userMap.get(0).get("username");
		  registerPage.enterUsername(uName);
		}

		@Then("It should display an error {string} below Password textbox")
		public void it_should_display_an_error_below_password_textbox(String toolTipMsg) {
			System.out.println("Expected ="+toolTipMsg);
			String actualError = registerPage.clickRegisterWithoutPassword();
			Assert.assertTrue(toolTipMsg.equalsIgnoreCase(actualError));
		}

		@Then("It should display an error {string} below Password Confirmation textbox")
		public void it_should_display_an_error_below_password_confirmation_textbox(String toolTipMsg) {
			System.out.println("Expected ="+toolTipMsg);
			String actualError = registerPage.clickRegisterwithoutPasswordConfirm();
			Assert.assertTrue(toolTipMsg.equalsIgnoreCase(actualError));
		}
		@Given("User enters invalid {string} and invalid {string}")
		public void user_enters_invalid_and_invalid(String string, String string2) {
		   registerPage.enterUsername(string);
		   registerPage.enterPassword(string2);
		}

		@Given("User enters invalid {string}")
		public void user_enters_invalid(String string) {
		   registerPage.password_confirmation(string);
		}
		@Given("User enters valid {string} and valid {string}")
		public void user_enters_valid_and_valid(String uname, String pwd) {
		    registerPage.randomUserNameGenerator(uname);
		    registerPage.enterPassword(pwd);
		}

		@Given("User enters valid value in {string} field")
		public void user_enters_valid_value_in_field(String cpwd) {
		  registerPage.password_confirmation(cpwd);
		}

		
		@Then("User gets an error message {string}")
		public void user_gets_an_error_message(String ExpectedStr) throws InterruptedException {
			System.out.println("Expected String ="+ExpectedStr);
			String ActualStr = registerPage.passwordErrorMessage();
			System.out.println("ActualStr="+ActualStr);
			Assert.assertTrue(ExpectedStr.equalsIgnoreCase(ActualStr));
		}
		
		@Then("It should display an error {string} below Username textbox")
		public void it_should_display_an_error_below_username_textbox(String toolTipMsg) {
			System.out.println("Expected ="+toolTipMsg);
			String actualError = registerPage.clickRegisterwithoutUsername();
			Assert.assertTrue(toolTipMsg.equalsIgnoreCase(actualError));

		}
		@Given("User enters invalid {string} and invalid <Rownumber>")
		public void user_enters_invalid_and_invalid_rownumber(String sheetname, Integer Rownumber) throws InvalidFormatException, IOException {
		    ExcelReader reader = new ExcelReader();
		   List<Map<String,String>> testData = reader.getData("C:\\Users\\umesh\\Downloads", sheetname);
		   String uName = testData.get(Rownumber).get("username");
		   String pwd = testData.get(Rownumber).get("password");
		   String cpwd = testData.get(Rownumber).get("confirm Password");
		   
		   registerPage.enterUsername(uName);
		   registerPage.enterPassword(pwd);
		   registerPage.password_confirmation(cpwd);
		}

		@Given("User enters valid values from {string} and {int}")
		public void user_enters_valid_values_from_and(String sheetname, Integer Rownumber) throws InvalidFormatException, IOException, InterruptedException {
			String filePath = System.getProperty("user.dir")+"/src/test/resources/TestData/AutomationTestData.xlsx";
			System.out.println(filePath);
			ExcelReader reader = new ExcelReader();
			   List<Map<String,String>> testData = reader.getData(filePath, sheetname);
			   String uName = testData.get(Rownumber).get("username");
			   String pwd = testData.get(Rownumber).get("password");
			   String cpwd = testData.get(Rownumber).get("confirm Password");
			   
			   registerPage.randomUserNameGenerator(uName);
			   registerPage.enterPassword(pwd);
			   registerPage.password_confirmation(cpwd);
		}
		@Then("The user should be redirected to Homepage with the message as New Account Created.")
		public void the_user_should_be_redirected_to_homepage_with_the_message_as_new_account_created() {
			String validLogin = "New Account Created. You are logged in as";
			   System.out.println("Expected MSg="+validLogin);
			   String actualMsg = registerPage.validLoginMessage();
			   System.out.println("Actual Msg="+actualMsg);
			   Assert.assertTrue(actualMsg.contains(validLogin));
		   String expectedURL = "https://dsportalapp.herokuapp.com/home";
		   String actualURL = registerPage.getCurrentUrl();
		   Assert.assertTrue(actualURL.equalsIgnoreCase(expectedURL));
		   
		}
	}


