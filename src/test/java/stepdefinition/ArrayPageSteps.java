package stepdefinition;


import java.io.IOException;
import java.util.*;


import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.pages.ArrayPage;
import com.pages.ExcelReader;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ArrayPageSteps {
	
	private WebDriver driver = DriverFactory.getDriver();
	private ArrayPage arrayPage = new ArrayPage(DriverFactory.getDriver());
		
	

	@Given("user is logged in to DS Algo portal")
	public void user_is_logged_in_to_ds_algo_portal() {
		
		driver.navigate().to("https://dsportalapp.herokuapp.com/array");
		arrayPage.startArrayHomePage();
		
	}

	@When("user is on the {string} after logged in")
	public void user_is_on_the_after_logged_in(String expectedTitleName) {
		
		String title = arrayPage.getArrayPageTitle();
		System.out.println("The title of the Page is "+title+"\nThe expected title is "+expectedTitleName);
		Assert.assertTrue(title.contentEquals(expectedTitleName));

	}

	@When("user clicks {string} button")
	public void user_clicks_button(String tryherelink) {
		
		arrayPage.clickOnTryHere();
	}

	@Then("user should be redirected to a page having an tryEditor with a Run button to test")
	public void user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
		
		arrayPage.isRunButtonExists();
		System.out.println("Application of Array Page Navigation Successfull");
	}

	@Given("The user is in a page having an tryEditor with a Run button to test")
	public void the_user_is_in_a_page_having_an_try_editor_with_a_run_button_to_test() {
	
		arrayPage.startArrayHomePage();
		arrayPage.clickOnTryHere();
	
	}

	@When("The user enter valid python code in tryEditor from sheetname {string} and rownumber {int}")
	public void the_user_enter_valid_python_code_in_try_editor_from_sheetname_and_rownumber(String sheetName, Integer rownumber)throws IOException, InterruptedException {
		
		String filePath = System.getProperty("user.dir")+"/src/test/resources/TestData/AutomationTestData.xlsx";
		System.out.println(filePath);
		ExcelReader sheetreader = new ExcelReader();

			List<Map<String, String>> code = sheetreader.getData(filePath, sheetName);
			String typeCode = code.get(rownumber).get("pythonCode_valid");
			String typeCode2 = code.get(rownumber).get("Column2");
			System.out.println("PythonExample code:"+typeCode2);
			arrayPage.fillCodeEditor(typeCode);
		}

	@When("The user clicks on run button")
	public void the_user_clicks_on_run_button() {
		
		arrayPage.clickOnRunButton();
		
	}

	@Then("The user should be presented with Run result")
	public void the_user_should_be_presented_with_run_result() throws InterruptedException {
		
		Assert.assertTrue(arrayPage.isAnswerDisplayed());
	}

	
}
