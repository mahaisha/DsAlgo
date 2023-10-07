package stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import com.pages.HomePage;
import com.pages.LandingPage;
import com.qa.factory.DriverFactory;
import com.qa.util.Constants;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LandingPageSteps {
	
	private WebDriver driver = DriverFactory.getDriver();
	private HomePage home = new HomePage(DriverFactory.getDriver());
	private LandingPage landPage = new LandingPage(DriverFactory.getDriver());
	
	@Given("user is on Home Page")
	public void user_is_on_home_page() {
		driver.get(Constants.homeUrl);
	}


	@Then("It should alert the user with a message {string}")
	public void it_should_alert_the_user_with_a_message(String errorMsg) {
	    String error = landPage.getErrorMsg();
		System.out.println("The error on the page is "+error+"\nThe expected error is "+errorMsg);
		Assert.assertTrue(error.contentEquals(errorMsg));
	}
	
	@Given("The user opens DS Algo portal link")
	public void the_user_opens_ds_algo_portal_link() {
	   driver.get(Constants.dsAlgoLandingUrl);
	}

	@When("The user clicks the {string} button")
	public void the_user_clicks_the_button(String string) {
	   home.clickOnGetStarted();
	}

	@Then("The user should land in DS Algo portal page")
	public void the_user_should_land_in_ds_algo_portal_page() {
		String url = driver.getCurrentUrl();
		String expectedUrl= Constants.dsAlgoLandingUrl;
		System.out.println("The current url is "+url);
		System.out.println("The expected url is " + expectedUrl);
		Assert.assertTrue(url.contentEquals(expectedUrl)); 
	}

	@Then("The user should be redirected to homepage")
	public void the_user_should_be_redirected_to_homepage() {
		String url = driver.getCurrentUrl();
		String expectedUrl= Constants.homeUrl;
		System.out.println("The current url is "+url);
		System.out.println("The expected url is " + expectedUrl);
		Assert.assertTrue(url.contentEquals(expectedUrl));
	}

	@Given("The user opens Home Page")
	public void the_user_opens_home_page() {
		home.getHomeUrl();
	}

	@Then("The user should see {int} panes with different data structires")
	public void the_user_should_see_panes_with_different_data_structires(int numberOfButtons) {
		int countValue =landPage.countGetStartedButtons();
		System.out.println("The number of the Get Started Buttons are "+countValue+"\nThe expected count is "+numberOfButtons);
		Assert.assertEquals(countValue, numberOfButtons);
	 }
	
	@When("The user clicks {string}")
	public void the_user_clicks(String linkClicked) {
		landPage.registerOrSignInLink(linkClicked);
	}
	
	@When("user clicks drop down wihtout signin.")
	public void user_clicks_drop_down_wihtout_signin() {
		landPage.clickDropDown();
	}

	@When("user selects {string} from drop down.")
	public void user_selects_from_drop_down(String dataStructure) throws InterruptedException {
		landPage.selectDataStructure(dataStructure);
	}

	
	@Then("The user should be redirected to Sign in page")
	public void the_user_should_be_redirected_to_sign_in_page() {
		String url = driver.getCurrentUrl();
		String expectedUrl= Constants.signInUrl;
		System.out.println("The current url is "+url);
		System.out.println("The expected url is " + expectedUrl);
		Assert.assertTrue(url.contentEquals(expectedUrl));
	}

	@Then("The user should be redirected to Register form")
	public void the_user_should_be_redirected_to_register_form() {
		String url = driver.getCurrentUrl();
		String expectedUrl= Constants.registerUrl;
		System.out.println("The current url is "+url);
		System.out.println("The expected url is " + expectedUrl);
		Assert.assertTrue(url.contentEquals(expectedUrl));
	}


}
