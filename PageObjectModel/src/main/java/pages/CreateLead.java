package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class CreateLead extends BaseClass {
	public CreateLead(ChromeDriver driver) {
		this.driver=driver;
	}

public CreateLead enterCompanyName(String companyname) {
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyname);
    return this;
	}

public CreateLead enterFirstName(String firstname) {
	
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstname);
	return this;
}

public CreateLead enterLastName(String Lastname) {
	
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys(Lastname);
	return this;
}

public ViewLeadPage clickCreateLead() {
	
	driver.findElement(By.name("submitButton")).click();
	return new ViewLeadPage(driver);
}

	
}