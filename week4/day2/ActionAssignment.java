package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//Assignment Details:
//Automate a series of interactions on the Amazon website using Actions class in Selenium WebDriver.
//Precondition:
//- Initialize ChromeDriver
//- Load the URL (https://www.amazon.in/)
//- Maximize the browser window
//- Add an implicit wait to ensure the webpage elements are fully loaded
//Requirements:
//1. Load the URL (https://www.amazon.in/)
//2. Search for "oneplus 9 pro".
//3. Get the price of the first product.
//4. Print the number of customer ratings for the first displayed product.
//5. Click the first text link of the first image.
//6. Take a screenshot of the product displayed.
//7. Click the 'Add to Cart' button.
//8. Get the cart subtotal and verify if it is correct.
//9. Close the browser.
public class ActionAssignment {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement searchTab = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		
		Actions act=new Actions(driver);
		act.moveToElement(searchTab).click().sendKeys("oneplus 9 pro").sendKeys(Keys.ENTER).perform();
		
		
		
			
		String firstProductPrice = driver.findElement(By.xpath("//div[@data-component-type='s-search-result' and not(.//span[text()='Sponsored'])]//span[@class='a-price-whole']")).getText();
		System.out.println("First product price :"+firstProductPrice);


		
		String cusRatings=driver.findElement(By.xpath("(//a[contains(@class,'a-link-normal')]//span)[2]")).getText();
		System.out.println("The number of customer star rating is :"+cusRatings);
		
		
		//click the first text link
		driver.findElement(By.xpath("//h2[@class='a-size-medium a-spacing-none a-color-base a-text-normal'][1]")).click();
		
		//switch window 
		
		 for(String winHan:driver.getWindowHandles()) {
			 driver.switchTo().window(winHan);
		 }
		
		
		//screenshot
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File srcFile=ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("./Data/Phonepage.png");
		
		try {
			FileUtils.copyFile(srcFile, destination);
			System.out.println("Screenshot saved successfully");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error saving message :"+e.getMessage());
			e.printStackTrace();
		}
		
		
		driver.findElement(By.id("add-to-cart-button")).click();
		
		driver.quit();
		
		
	}

}
