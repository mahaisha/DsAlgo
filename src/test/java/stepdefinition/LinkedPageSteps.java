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
	if(string.equals("Introduction")) {
			linkedPg.clickOnIntroduction();
    }else if (string.equals("Creating Linked LIst")) {
            linkedPg.clickOnCreatingLinked();
    }else if (string.equals("Types of Linked List")) {
        linkedPg.clickOnTypesOfLink();       
    }else if (string.equals("Implement Linked List in Python")) {
        linkedPg.clickOnImplimentingLink();        
    }else if (string.equals("Traversal")) {
        linkedPg.clickOnTraversal();       
    }else if (string.equals("Insertion")) {
        linkedPg.clickOnInsertion();       
    }else if (string.equals("Deletion")) {
        linkedPg.clickOnDeletion();  
    }else if (string.equals("Practice Questions")) {
        linkedPg.clickOnPracticeQuest();      
    }}  
   
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
//
//  @Given("The user is on try here page having tryEditor with a Run button to test")
//  public void the_user_is_on_try_here_page_having_try_editor_with_a_run_button_to_test() {
//  linkedPg.getLinkedPageTitle();
//   
//  }
// 
//  @Then("The user should be presented with the Run output")
//  public void the_user_should_be_presented_with_the_run_output() throws InterruptedException {
//	  Assert.assertTrue(homePage.isAnswerDisplayed());
//  }
//  
  @Given("The user is on the Linked List  page after logged in")
  public void the_user_is_on_the_linked_list_page_after_logged_in() {
	  linkedPg.linkedListHome(); 
  }

//@Given("The user is on the Introduction page")
//public void the_user_is_on_the_introduction_page() {
//    
//}

  
//  @Then("The user is directed to {string} page")
//  public void the_user_is_directed_to_page(String expectedTitle) {
//	  
//	  String Title = linkedPg.getLinkedPageTitle();
//	   System.out.println("The title of the Page is " +Title  + "  The expected title is " +expectedTitle);
//	   Assert.assertTrue(Title.equalsIgnoreCase(expectedTitle)); 
//	}
  
}




