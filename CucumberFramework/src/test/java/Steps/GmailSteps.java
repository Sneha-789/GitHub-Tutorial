package Steps;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GmailSteps {
	
	WebDriver driver;
	
	@Before("@Once")
	public void setUp() throws IOException
	{   Runtime rt = Runtime.getRuntime();
	    rt.exec("taskkill /im chrome.exe /f /t");
		System.setProperty("webdriver.chrome.driver", "E:\\Cucumber Java Selenium\\Cucumber Framework\\CucumberFramework\\src\\test\\java\\resources\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Given("^User navigates to gmail login page$")
	public void user_navigates_to_gmail_login_page() throws Throwable {
	    System.out.println("User navigates to gmail login page");
	    driver.get("https://www.google.com/gmail/");
	    
	}

	@Given("^user enters username in username field$")
	public void user_enters_username_in_username_field() throws Throwable {
		System.out.println("user enters username in username field");
		driver.findElement(By.id("identifierId")).sendKeys("sneha.mane1990@gmail.com");
		driver.findElement(By.xpath(".//*[@id='identifierNext']/content/span")).click();
		Thread.sleep(3000);
	}

	@Given("^user enters password in password field$")
	public void user_enters_password_in_password_field() throws Throwable {
		System.out.println("user enters password in password field");
		driver.findElement(By.xpath(".//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("snehamane1990");
	}

	@When("^User clicks on Next button$")
	public void user_clicks_on_Next_button() throws Throwable {
		System.out.println("User clicks on Next button");
		driver.findElement(By.xpath(".//*[@id='passwordNext']/content")).click();
	}

	@Then("^User is logged in successfully$")
	public void user_is_logged_in_successfully() throws Throwable {
		System.out.println("User is logged in successfully");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Inbox")).isDisplayed();
		driver.quit();
		

	}
	

@Given("^User navigates to gmail login page(\\d+)$")
public void user_navigates_to_gmail_login_page(int arg1) throws Throwable {
	System.out.println("User is logged in successfully");
}

@Given("^user enters username in username field(\\d+)$")
public void user_enters_username_in_username_field(int arg1) throws Throwable {
	System.out.println("User is logged in successfully");
}

@Given("^user enters password in password field(\\d+)$")
public void user_enters_password_in_password_field(int arg1) throws Throwable {
	System.out.println("User is logged in successfully");
}

@When("^User clicks on Next button(\\d+)$")
public void user_clicks_on_Next_button(int arg1) throws Throwable {
	System.out.println("User is logged in successfully");
}

@Then("^User is logged in successfully(\\d+)$")
public void user_is_logged_in_successfully(int arg1) throws Throwable {
	System.out.println("User is logged in successfully");
}





}
