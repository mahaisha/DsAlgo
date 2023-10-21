package stepdefinition;

//import java.io.IOException;
//import java.util.List;
//import java.util.Map;
//
import org.junit.Assert;
//
//import com.pages.ExcelReader;
//import org.openqa.selenium.WebDriver;
import com.pages.HomePage;
import com.pages.LinkedPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LinkedPageSteps {
    
	public String Title; 
	private LinkedPage linkedPg = new LinkedPage(DriverFactory.getDriver());
	private HomePage homePage = new HomePage(DriverFactory.getDriver());

    @Given("The user is on the {string}  page after logged in")
    public void the_user_is_on_the_page_after_logged_in(String LinkedPage) {
    linkedPg.linkedListHome(); 
  }
    @When("The user clicks {string} on Linked List Page")
    public void the_user_clicks_button_on_linked_list_page(String string) throws InterruptedException {
            linkedPg.navigateInLinkedList(string);
	}  
   
   @Then("The user should be directed to {string} of Linked List Page")
   public void the_user_should_be_directed_to_of_linked_list_page(String expectedTitle)  {
   String Title = homePage.getPageTitle();
   System.out.println("The title of the Page is " + Title  +  " The expected title is " + expectedTitle);
    Assert.assertTrue(Title.contentEquals(expectedTitle)); 
   
}
   
   @Given("The user is on the {string} page")
   public void the_user_is_on_the_page(String expectedTitle) throws InterruptedException {
   String Title = homePage.getPageTitle();
     System.out.println("The title of the Page is " + Title  + "The expected title is " + expectedTitle);
   Assert.assertTrue(Title.contentEquals(expectedTitle)); 
    
}

  @Given("The user is on the Linked List  page after logged in")
  public void the_user_is_on_the_linked_list_page_after_logged_in() {
	  linkedPg.linkedListHome(); 
  }


  
}




