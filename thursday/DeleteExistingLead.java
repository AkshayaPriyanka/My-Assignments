package week2.thursday;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DeleteExistingLead {

//	- Enter the username.
//	- Enter the password.
//	- Click the Login button.
//	- Click the "crm/sfa" link.
//	- Click the "Leads" link.
//	- Click "Find leads."
//	- Click on the "Phone" tab.
//	- Enter the phone number.
//	- Click the "Find leads" button.
//	- Capture the lead ID of the first resulting lead.
//	- Click the first resulting lead.
//	- Click the "Delete" button.
//	- Click "Find leads" again.
//	- Enter the captured lead ID.
//	- Click the "Find leads" button.
//	- Verify the presence of the message "No records to display" in the Lead List. This
//	message confirms the successful deletion.
//	- Close the browser. 
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		//driver.findElement(By.xpath("//input[@name='phoneAreaCode']")).sendKeys("8");
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("98127");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		//Capture the lead ID of the first resulting lead.
		WebElement leadId = driver.findElement(By.xpath("//a[text()='10139']"));
		String text = leadId.getText();
		System.out.println("Captured Lead id :" +text);
		
		//Click the first resulting lead
		driver.findElement(By.xpath("//a[text()='10139']")).click();
		
		//Click the "Delete" button
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		
		
		//Click "Find leads" again
		driver.findElement(By.linkText("Find Leads")).click();
        // Enter the captured lead ID.
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys("10139");
		String text2 = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
		
		if(text2.equals("No records to display"))
		{
			System.out.println("Successful Deletion of the ID");
		}
		else
			System.out.println("ID not deleted");
		
		System.out.println(driver.getTitle());
		driver.close();
		
		
		
		

	}

}
