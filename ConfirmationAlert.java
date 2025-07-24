package week3.day4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationAlert {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.leafground.com/alert.xhtml");
		
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();	
		System.out.println("The text inside confirmation alert box is: "+ text);
		
		Thread.sleep(5000);
		alert.accept();
		
		
		

	}

}
