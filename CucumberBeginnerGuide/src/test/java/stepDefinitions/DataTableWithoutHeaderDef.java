package stepDefinitions;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class DataTableWithoutHeaderDef {

	WebDriver driver;
	@Given("^You are on the login page$")
	public void you_are_on_the_login_page() throws Throwable {
		driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	}

	@When("^You enter the below credentials$")
	public void you_enter_the_below_credentials(DataTable dataTable) throws Throwable {
		
		List<String> credentials=dataTable.asList(String.class);
		String userName=credentials.get(0);
		String password=credentials.get(1);
		
		driver.findElement(By.id("txtUsername")).sendKeys(userName);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
	}

	@When("^click the login button$")
	public void click_the_login_button() throws Throwable {
		driver.findElement(By.id("btnLogin")).click(); 
	}

	

	
}
