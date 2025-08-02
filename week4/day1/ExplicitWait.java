package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

//import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		
		       //launch the browser
				ChromeDriver driver=new ChromeDriver();
				
				//maximise the window
				driver.manage().window().maximize();
				
				//load the url
				driver.get("https://leafground.com/window.xhtml");
				
			
				driver.findElement(By.xpath("//span[text()='Open with delay']")).click();
				
				//explicit wait for the new window to open
				WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
				Boolean until = wait.until(ExpectedConditions.numberOfWindowsToBe(3));
				System.out.println(until);
				Set<String> windowHandles = driver.getWindowHandles();
				List <String> windows=new ArrayList<>(windowHandles);
				System.out.println("Adress of windows :"+windows);
				
					
				WebDriver window = driver.switchTo().window(windows.get(1));
				
				System.out.println(window.getTitle());
				driver.close();
				
				
				WebDriver window2 = driver.switchTo().window(windows.get(2));
				System.out.println(window2.getTitle());
				driver.close();
				
				WebDriver window1 = driver.switchTo().window(windows.get(0));
				String title = window1.getTitle();
				System.out.println("Title of the parent page "+title);
				driver.close();
				
				
				
				
				
			
				
				
				
				
				
				
								

	}

}
