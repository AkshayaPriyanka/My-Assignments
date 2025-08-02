package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Irctc {

	public static void main(String[] args) {
		
		//launch the browser
		ChromeDriver driver=new ChromeDriver();
		
		//maximise the window
		driver.manage().window().maximize();
		
		//load the url
		driver.get("https://www.irctc.co.in/");
		
		//implicit wait
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
//		- Load the IRCTC webpage and click on the "FLIGHTS" link.
//		- Capture the title of the new window that opens (flights window - AirTicket).
//		- Close the parent tab (Train ticket booking) alone.
		
		//to click ok
		driver.findElement(By.xpath("//button[@class ='btn btn-primary']")).click();
		
		//address of parent page
		String windowHandle = driver.getWindowHandle();
		System.out.println("Address of parent page before switching: "+windowHandle);
		System.out.println("Title before Switching to child page :"+driver.getTitle());
		
		// to click flights link
		driver.findElement(By.linkText("FLIGHTS")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println("Address of all the windows opened: "+windowHandles);
		//set -> List for printing the address
		List <String> adresses = new ArrayList <>(windowHandles);
		
		driver.switchTo().window(adresses.get(1));
		System.out.println("Address of the child page after switching: "+adresses.get(1));
		
		
		
		
		//print the title of child page
		
		String titleOfFlightPage = driver.getTitle();
		System.out.println("Title of child page : "+titleOfFlightPage);
		driver.close();
		
		driver.switchTo().window(adresses.get(0));
		System.out.println("Switching back to parent page again: " +driver.getTitle());
		driver.close();
		
		
		
		
		
		

		

	}

}
