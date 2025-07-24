package week3.day4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//Automate interactions with frames, trigger alerts, and verify the displayed text based on actions using Selenium
//WebDriver on the given application.
//Precondition:
//- Initialize ChromeDriver
//- Load the URL (https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt)
//- Maximize the browser window
//- Switch to the frame
//- Add an implicit wait to ensure the webpage elements are fully loaded
//Requirements:
//- Click the "Try It" button inside the frame
//- Click OK/Cancel in the alert that appears
//- Confirm the action is performed correctly by verifying the text displayed
//Hints to Solve:
//- Use Selenium methods such as `switchTo().frame()`, `findElement()`, `click()`, `switchTo().alert()`, `sendKeys()`, and
//`alert.accept()` or `alert.dismiss()` to perform the required actions.
//- Use Conditional statements to verify the text based on the action performed.

public class FrameAlertAssignment {

	public static void main(String[] args) throws InterruptedException {
		
	// Initialize chrome driver
     ChromeDriver driver=new ChromeDriver();
     
     //maximize the browser window
     
     driver.manage().window().maximize();
     
    //Load the url
     driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
     
     
     
     //switch to frame
     
      driver.switchTo().frame("iframeResult");
     
    
      
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
     
     //click try it button
     driver.findElement(By.xpath("//button[text()='Try it']")).click();
     
     //transfer control to alert
     
     Alert alert = driver.switchTo().alert();
     
     //entering the text
     String name="Akshaya Priyanka";
     alert.sendKeys(name);
     
     alert.accept(); 
     String text = driver.findElement(By.xpath("//p[@id='demo']")).getText();
     
     System.out.println(text);
     
     //check
     if(text.contains(name))
     {
    	 System.out.println("Alert executed and the text verified");
     }
     else
     {
    	 System.out.println("Text not same");
     }
     
     
    
     
     
	}

}
