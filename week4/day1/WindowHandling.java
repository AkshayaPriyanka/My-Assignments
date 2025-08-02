package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowHandling {

	

	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		
		ChromeDriver driver = new ChromeDriver(options);
		
		
		driver.manage().window().maximize();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("username")).sendKeys("democsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Merge Contacts")).click();
		
		WebElement fromContactWidget = driver.findElement(By.xpath("//img[@src='/images/fieldlookup.gif']"));
		fromContactWidget.click();
		
		Set<String> address = driver.getWindowHandles();
		List<String>addressofPages=new ArrayList<>(address);
		
		System.out.println(addressofPages);
		
		driver.switchTo().window(addressofPages.get(1));
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement until = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@class='linktext'])[1]")));
		until.click();
		
		driver.switchTo().window(addressofPages.get(0));
		
		WebElement toContactWidget = driver.findElement(By.xpath("(//img[@src='/images/fieldlookup.gif'])[2]"));
		toContactWidget.click();
		
		Set<String> address1 = driver.getWindowHandles();
		List<String>addressofPages1=new ArrayList<>(address1);
		System.out.println(addressofPages1);
		
		driver.switchTo().window(addressofPages1.get(1));
		
		WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement until1 = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@class='linktext'])[6]")));
		until1.click();
		
		driver.switchTo().window(addressofPages1.get(0));
		
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		
		Thread.sleep(1000);
		
		//handle alert
		Alert alert=driver.switchTo().alert();
		String text = alert.getText();
		System.out.println("Alert Box message :"+text);
		alert.accept();
		
		 String title2 = driver.getTitle();
		 System.out.println("Title of the page:" +title2);
		 
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
