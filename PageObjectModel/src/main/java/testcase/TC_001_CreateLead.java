package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class TC_001_CreateLead extends BaseClass {
	@BeforeTest
	public void setValues() {
		filename="TC_001_CreateLead";
	}
	@Test(dataProvider="fetchData")
	public void createLead(String username,String password,String companyname,String firstname, String Lastname ) {
		LoginPage lp=new LoginPage(driver);
        lp.enterUsername(username)
        .enterPassword(password)
        .clickLoginButton()
        .clikCrmsfa()
        .clickLeadsLink()
        .clickCreateLeadLink()
        .enterCompanyName(companyname)
        .enterFirstName(firstname)
        .enterLastName(Lastname)
        .clickCreateLead()
        .verifyLead();
	}
	
}
