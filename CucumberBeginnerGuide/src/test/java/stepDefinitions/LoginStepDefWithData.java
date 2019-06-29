package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDefWithData {
	WebDriver driver;
	
	@Given("^user is on the login page$")
	public void user_is_on_the_login_page() throws Throwable {
		driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	}

	@When("^the user enters the valid credentials \"([^\"]*)\" and \"([^\"]*)\"$")
	public void the_user_enters_the_valid_credentials_and(String username, String password) throws Throwable {
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
	}

	@When("^clicks the login button$")
	public void clicks_the_login_button() throws Throwable {
		driver.findElement(By.id("btnLogin")).click(); 
	}

	@Then("^the user should see the home page$")
	public void the_user_should_see_the_home_page() throws Throwable {
		boolean status=	driver.findElement(By.linkText("Welcome Admin")).isDisplayed();
		Assert.assertTrue(status);
	}

}
