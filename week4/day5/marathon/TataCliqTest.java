package week4.day5.marathon;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TataCliqTest {

	public static void main(String[] args) throws InterruptedException {
		
		//launch the browser
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");

		ChromeDriver driver = new ChromeDriver(options);
		
		//load the url
		driver.get("https://www.tatacliq.com/");
		
		//maximise the browser
		driver.manage().window().maximize();
		
		//find web element brand
		WebElement brands = driver.findElement(By.xpath("//div[text()='Brands']"));
		
		//mousehover on brand
		Actions actions=new Actions (driver);
		actions.moveToElement(brands).perform();
		
		//find watch element
		//mousehover on watches
		
		
		WebElement watches = driver.findElement(By.xpath("//div[text()='Watches & Accessories']"));
		actions.moveToElement(watches).perform();
		
		Thread.sleep(3000);
		
		//find the first watch brand and click
		driver.findElement(By.xpath("//div[@class='DesktopHeader__brandsDetails']")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		List<String>windowHandles1=new ArrayList<>(windowHandles);
		
		driver.switchTo().window(windowHandles1.get(windowHandles1.size()-1));
		
		//choose the sortby element
		WebElement sortBy = driver.findElement(By.className("SelectBoxDesktop__hideSelect"));
		Select select=new Select(sortBy);
		
		//choose new arrival
		select.selectByVisibleText("New Arrivals");
		
		driver.findElement(By.xpath("//div[text()='Men']")).click();
		List<WebElement> prices = driver.findElements(By.xpath("(//div[@class='ProductDescription__priceHolder'])//h3"));
		for(WebElement price:prices) {
			String text = price.getText();
			System.out.println(text);
		}
		String firstPrice = prices.get(0).getText();
		//click on the first resulting product
		driver.findElement(By.xpath("(//div[@class='ProductModule__dummyDiv'])[1]")).click();
		
		Set<String> windowHandles2 = driver.getWindowHandles();
		List<String>tabs=new ArrayList<>(windowHandles2);
		driver.switchTo().window(tabs.get(tabs.size()-1));
		
		String offerPrice = driver.findElement(By.xpath("//div[contains(@class,'ProductDetailsMainCard__price')]/h3")).getText();
		
		if(firstPrice.equals(offerPrice)) {
			System.out.println("Prices are same");
		}
		else {
			System.out.println("prices not same");
		}
		//add to bag
		driver.findElement(By.xpath("//span[contains(text(),'ADD TO BAG')]")).click();
		Thread.sleep(2000);
		//bag click
		WebElement cart = driver.findElement(By.xpath("//div[@class='DesktopHeader__myBagShow']"));
		System.out.println("cart count:"+cart.getText());
		cart.click();
		
		Thread.sleep(2000);
		
		//screen shot
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File srcFile=ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("./Data/Watchpage.png");
		
		try {
			FileUtils.copyFile(srcFile, destination);
			System.out.println("Screenshot saved successfully");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error saving message :"+e.getMessage());
			e.printStackTrace();
		}
		
		for(String windowtab:driver.getWindowHandles()) {
			driver.switchTo().window(windowtab);
			driver.close();
		}
		
		
		
		
		
		
		
		

	}

}
