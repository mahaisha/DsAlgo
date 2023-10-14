package stepdefinition;


import java.io.IOException;
import java.util.*;


import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.pages.ArrayPage;
import com.pages.ExcelReader;
import com.pages.HomePage;
import com.qa.factory.DriverFactory;
import com.qa.util.Constants;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ArrayPageSteps {
	

	private ArrayPage arrayPage = new ArrayPage(DriverFactory.getDriver());
	private HomePage homePage = new HomePage(DriverFactory.getDriver());

	
	@When("The user clicks {string} on Array Page")
    public void the_user_clicks_button_on_array_page(String string) throws InterruptedException {
	if(string.equals("Arrays in Python")) {
			arrayPage.clickOnArraysInPy();
    }else if (string.equals("Arrays Using List")) {
            arrayPage.clickOnArraysUsingList();
    }else if (string.equals("Basic Operations in Lists")) {
        arrayPage.clickOnBasicOpLists();       
    }else if (string.equals("Applications of Array")) {
        arrayPage.clickOnAppOfArray();        
    } else if (string.equals("Practice Questions")) {
        arrayPage.clickOnPracticeQuest();      
   	} else if (string.equals("Search The Array")) {
        arrayPage.clickOnSearchArray();      
   	} else if (string.equals("Max Consecutive Ones")) {
        arrayPage.clickOnMaxConsecutive();    
   	} else if (string.equals("Find Numbers with Even Numbers")) {
        arrayPage.clickOnFinfEvenNumbers();    
   	} else if (string.equals("Squares of a Sorted Array")) {
        arrayPage.clickOnSortedArraySq();    
   	}  
	}
	 
	 @Given ("The user is on the {string} of Array Page")
	 public void the_user_is_on_of_array(String expectedTitle) {
		 String Title = homePage.getPageTitle();
			System.out.println("The title of the Page is " + Title  + "The expected title is " + expectedTitle);
			Assert.assertTrue(Title.contentEquals(expectedTitle)); 
	 }
			
    @Then("The user should be redirected to {string} page of Array")
	public void the_user_should_be_redirected_to_page_of_array(String expectedTitle) {
	String Title = homePage.getPageTitle();
	System.out.println("The title of the Page is " + Title  + "The expected title is " + expectedTitle);
	Assert.assertTrue(Title.contentEquals(expectedTitle)); 
	}
    
    @Given("user is on {string} of Array Page")
    public void the_user_is_on_array_page(String expectedTitle) {
 	   	arrayPage.getPracticeQuestUrl();
 	   String Title = homePage.getPageTitle();
    System.out.println("The title of the Page is " + Title +  " The expected title is " + expectedTitle);
    Assert.assertTrue(Title.contentEquals(expectedTitle)); 
 }
    

    @Then("user navigates to practice question1 page with Run button to test")
    public void user_navigates_to_practice_question1_page_with_run_button_to_test() {
       	 homePage.getPageTitle();
        System.out.println("The title of the Page is Assessment" );
       
}
   
    @Then("user navigates to practice question2 page with Run button to test")
    public void user_navigates_to_practice_question2_page_with_run_button_to_test() {
       	 homePage.getPageTitle();
        System.out.println("The title of the Page is Assessment" );
       
}
    @Then("user navigates to practice question3 page with Run button to test")
    public void user_navigates_to_practice_question3_page_with_run_button_to_test() {
       	 homePage.getPageTitle();
        System.out.println("The title of the Page is Assessment " );
       
}
    @Then("user navigates to practice question4 page with Run button to test")
    public void user_navigates_to_practice_question4_page_with_run_button_to_test() {
       	 homePage.getPageTitle();
        System.out.println("The title of the Page is Assessment" );
       
}
    @Given("user is on question {string} page with Run button to test")
    public void user_is_on_practice_page_with_run_button_to_test(String expectedTitle) {
       	 String Title = homePage.getPageTitle();
        System.out.println("The title of the Page is " + Title +  " The expected title is " + expectedTitle );
        Assert.assertTrue(Title.contentEquals(expectedTitle)); 
    }
     
   @When("user enters following python code in tryEditor")
  public void user_enters_following_python_code_in_tryEditor(DataTable dataTable) throws InterruptedException {
	   List<String> userList = dataTable.asList(String.class);
	   Thread.sleep(500);
		for (String e : userList) {
			arrayPage.clearCodeEditor();
			  arrayPage.fillCodeEditor(e);
			Thread.sleep(500);
			System.out.println(e);			
	}
}
      @When("user clicks on run button to test")
       public void user_clicks_on_run_button_to_test() {
    	       	arrayPage.clickOnRunButton();
    }
      @Then("The user should be presented with error message")
      public void the_user_should_be_presented_with_error_message() throws InterruptedException {
      		arrayPage.present_alertMsg();
      	
      }  
   
    }
      

