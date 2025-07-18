package week2.wednesday;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Facebook_HomeAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		- Initialize ChromeDriver
//		- Load the URL https://en-gb.facebook.com/
//		- Maximize the browser window
//		- Add an implicit wait to ensure the web page elements are fully loaded
//		Requirements:
//		- Click on the Create new account button.
//		- Enter the First name.
//		- Enter the Surname.
//		- Enter the Mobile number or email address.
//		- Enter the New password.
//		- Handle all three dropdowns in Date of birth
//		- Select the radio button in Gender.
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(options);
		
//		- Load the URL https://en-gb.facebook.com/
		driver.get("https://en-gb.facebook.com/");
		
//		- Maximize the browser window
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		driver.findElement(By.name("firstname")).sendKeys("Akshaya");
		driver.findElement(By.name("lastname")).sendKeys("Priyanka");
		driver.findElement(By.name("reg_email__")).sendKeys("akshucoolbuddy@gmai.com");
		driver.findElement(By.id("password_step_input")).sendKeys("123asd098");
		WebElement date = driver.findElement(By.id("day"));
		Select option =new Select(date);
		option.selectByVisibleText("4");
		
		WebElement month = driver.findElement(By.id("month"));
		Select option1 =new Select(month);
		option1.selectByVisibleText("Aug");
		 
		 WebElement year = driver.findElement(By.id("year"));
		Select option2 =new Select(year);
		option2.selectByVisibleText("1993");
		
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		
		//driver.close();
		
			 
			 
			 
			 
		 
		
		
		
		
		
		

	}

}
