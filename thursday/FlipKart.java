package week2.thursday;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FlipKart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.linkText("Fashion")).click();
		//driver.findElement(By.name("q")).sendKeys("men's shirt");
		WebElement m= driver.findElement(By.xpath("//input[@name='q']"));
		m.sendKeys("men's shirt");
		m.submit();
		
		
		
		
		

	}

}
