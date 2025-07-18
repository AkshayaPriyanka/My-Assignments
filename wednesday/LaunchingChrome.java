package week2.wednesday;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingChrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
	
	driver.findElement(By.id("pass")).sendKeys("Tuna@321");
	driver.findElement(By.name("login")).click();
	//driver.findElement(By.linkText(null))
	}

}
