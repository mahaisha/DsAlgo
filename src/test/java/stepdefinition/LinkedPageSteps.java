package stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

//import com.page.LoginPage;
import com.pages.LinkedPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LinkedPageSteps {

	private static String Title;
	private static String Title1;
	private WebDriver driver = DriverFactory.getDriver();
	private LinkedPage linkedPg = new LinkedPage(DriverFactory.getDriver());
	//private com.pages.LoginPage loginPg = new com.pages.LoginPage(DriverFactory.getDriver());
	

@Given("The user is in the {string}  page after logged in")
public void the_user_is_in_the_page_after_logged_in(String expectedtitle) {
   linkedPg.navigateToLinkedPage(); 
   String Title = linkedPg.getLinkedPageTitle();
	System.out.println("The title of the Page is " +Title+  "The expected title is " +expectedtitle);
	Assert.assertTrue(Title.contentEquals(expectedtitle)); 
}

@When("The user clicks {string} button on Linked List Page")
public void the_user_clicks_button_on_linked_list_page(String expectedtitle) {
	linkedPg.LinkedIntroLink();
}
@Then("The user should be directed to {string} of Linked List Page")
public void the_user_should_be_directed_to_of_linked_list_page(String string) {
//	String Title1 = LinkedPage.getTitleLinkedPage();
//	System.out.println("The title of the Page is " +Title1+ "The expected title is " +expectedTitle);
//	Assert.assertTrue(Title1.contentEquals(expectedTitle)); 

}

}

	


	
	
	
	
	
	
	
	
	
	
	
	
	

