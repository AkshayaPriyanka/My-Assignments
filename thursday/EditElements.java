package week2.thursday;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Microsoft");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Akshaya");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Priyanka");
		driver.findElement(By.xpath("//input[@name='firstNameLocal']")).sendKeys("Chandrasekaran");
		driver.findElement((By.xpath("//input[@name='departmentName']"))).sendKeys("Computer Science");
		driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("Selenium Web Driver Learning");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("akshucoolbuddy@gmail.com");
		WebElement stateProvince = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select options=new Select(stateProvince);
		options.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		////tagName[text()='text value in DOM'] 
		driver.findElement(By.xpath(" //a[text()='Edit']")).click();
		driver.findElement(By.xpath("//textarea[@id='updateLeadForm_description']")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("important note is being updated");
		driver.findElement(By.xpath("(//input[@class='smallSubmit'])[2]")).click();
		
		System.out.println(driver.getTitle());
		driver.close();

	}

}
