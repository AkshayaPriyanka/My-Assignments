package Steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLead extends BaseClass{
	@When("Click on the CRMSFA link")
	public void click_on_the_crmsfa_link() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	@And("Clcik on the Leads Link")
	public void clcik_on_the_leads_link() {
		driver.findElement(By.linkText("Leads")).click();
	}
	@And("Click on the CreateLead link")
	public void click_on_the_create_lead_link() {
		driver.findElement(By.linkText("Create Lead")).click();
	}
	@Given("Enter the companyname as (.*)$")
	public void enter_the_companyname_as_test_leaf(String companyName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
	}
	@And("Enter the firstname as (.*)$")
	public void enter_the_firstname_as_vineeth(String firstName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
	}
	@And("Enter the lastname as (.*)$")
	public void enter_the_lastname_as_rajendran(String lastName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
	}
	@When("Click on the CreateLead button")
	public void click_on_the_create_lead_button() {
		driver.findElement(By.name("submitButton")).click();
	}
	@Then("Lead should be created")
	public void lead_should_be_created() {
	    System.out.println("CreateLead successful");
	}
}
