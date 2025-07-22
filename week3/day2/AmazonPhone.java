package week3.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonPhone {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		  ChromeDriver driver=new ChromeDriver();
			driver.get("https://www.amazon.in/");
			driver.manage().window().maximize();
			//to find the search element and enter phones
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phones");
			//search button click
			driver.findElement(By.id("nav-search-submit-button")).click();
			
			Thread.sleep(3000);
			
			
			
			
		
			
       
	}

}
