package testcases;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
// EdgeDriver driver = new EdgeDriver();

//ChromeOptions options = new ChromeOptions();
//options.addArguments("guest");
//
//ChromeDriver driver = new ChromeDriver(options);

//driver.manage().window().maximize();
//driver.get("http://leaftaps.com/opentaps/");
//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
//driver.findElement(By.id("password")).sendKeys("crmsfa");
//driver.findElement(By.className("decorativeSubmit")).click();
//driver.findElement(By.linkText("CRM/SFA")).click();
//driver.findElement(By.linkText("Leads")).click();

public class CreateLead extends Baseclass {
	
	@DataProvider(name="fetchData")
	public String[][] setData() throws IOException{
		//String [][] data=new String[2][3];
		
//		data[0][0]="TestLeaf";
//		data[0][1]="Hari";
//		data[0][2]="R";
//		
//		data[1][0]="Qeagle";
//		data[1][1]="Babu";
//		data[1][2]="Raj";
		String [][] readData= ReadExcel.readData();
		
		return readData;
	}
	

	@Test(dataProvider="fetchData")
	public void createLead(String companyName,String firstName,String lastName) {

	
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
		driver.findElement(By.name("submitButton")).click();

	}
}
