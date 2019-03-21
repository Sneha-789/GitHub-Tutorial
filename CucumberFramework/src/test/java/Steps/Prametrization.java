package Steps;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Prametrization {
	
WebDriver driver;
	
	

	@Given("^I access WebdriverUniversity$")
	public void i_access_WebdriverUniversity() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I access WebdriverUniversity");
	    
	}

	@When("^I click on the login button$")
	public void i_click_on_the_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I click on the login button");
	}

	@Then("^I enter username$")
	public void i_enter_username() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I enter username");
	}

	@Then("^I enter \"([^\"]*)\" password$")
	public void i_enter_password(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I enter "+arg1);
	}

	@Then("^I click on login button$")
	public void i_click_on_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I click on login button");
	}

	@Then("^I should be presented with successful validation$")
	public void i_should_be_presented_with_successful_validation() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I should be presented with not successful validation");
	}



}
