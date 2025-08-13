package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginCredentials extends BaseClass {

	
	
	@Given("Launch the browser")
	public void launch_the_browser() {
		options = new ChromeOptions();
		options.addArguments("guest");
		driver = new ChromeDriver(options);
	}

	@And("Load the url")
	public void load_the_url() {
	    driver.get("http://leaftaps.com/opentaps/control/main");
	}

	@And("Enter the username as {string}")
	public void enter_the_username_as_democsr(String usrname) {
		driver.findElement(By.id("username")).sendKeys(usrname);
	}

	@And("Enter the password as {string}")
	public void enter_the_password_as_crmsfa(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
	}

	@When("Click on Login button")
	public void click_on_login_button() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}

	@Then("It should be logged in")
	public void it_should_be_logged_in() {
		System.out.println("Hurray!!!Login successful");
	}
	@But("It should throw error message")
	public void it_should_throw_error_message() {
		System.out.println("Oops!!!Login unsuccessful");
	}
}
