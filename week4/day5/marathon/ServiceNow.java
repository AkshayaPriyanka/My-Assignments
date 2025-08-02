package week4.day5.marathon;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.sukgu.Shadow;

public class ServiceNow {

	public static void main(String[] args) throws InterruptedException {
		//launch browser
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
        ChromeDriver driver = new ChromeDriver(options);
		
		//maximise browser
		driver.manage().window().maximize();
		
		//load url
		driver.get("https://dev209663.service-now.com");
		
		//username
		driver.findElement(By.id("user_name")).sendKeys("admin");
		
		//password
		driver.findElement(By.id("user_password")).sendKeys("qy/Q6A=vOM3x");
		
		//click login
		driver.findElement(By.id("sysverb_login")).click();
		
		//to handle shadow
		Shadow sh=new Shadow(driver);
		sh.setImplicitWait(30);
		
		//to click All
		sh.findElementByXPath("//div[contains(text(),'All')]").click();
	
		//to click service catalog

		sh.findElementByXPath("//input[@id='filter']").sendKeys("Service Catalog");
		sh.findElementByXPath("//mark[contains(text(),'Service Catalog')]").click();
		
		
		//to click mobile inside frame located inside shadow
		//switch to iframe first
		//find thru web element
		WebElement mobileFrame = sh.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(mobileFrame);
		Thread.sleep(2000);
		//sh.findElementByXPath("//h2[text()='Mobiles']").click();
		driver.findElement(By.linkText("Mobiles")).click();
		//to click apple iphone 13 pro
		sh.findElementByXPath("//strong[text()='Apple iPhone 13 pro']/ancestor::a[contains(@class,'service_catalog')]").click();
		
		//choose yes
		sh.findElementByXPath("//label[text()='Yes']").click();
		
		//phone number as 99
		sh.findElementByXPath("//input[@class='cat_item_option sc-content-pad form-control']").sendKeys("99");
		
		WebElement dataUsage = sh.findElementByXPath("//select[@class='form-control cat_item_option ']");
		Select s=new Select(dataUsage);
		s.selectByValue("unlimited");
		
		//choose color
		sh.findElementByXPath("//label[@class='radio-label' and contains(text(),'Sierra Blue')]").click();
		
		//storage to 512gb
		sh.findElementByXPath("//label[@class='radio-label' and contains(text(),'512 GB')]").click();
		
		//order now
		sh.findElementByXPath("//button[text()='Order Now']").click();
		
		//oder placed
		String orderStat = sh.findElementByXPath("//div[@class='notification notification-success']").getText();
		System.out.println("Order status :"+orderStat);
		
		//request number
		String text = sh.findElementByXPath("//a[@id='requesturl']").getText();
		System.out.println("Request number: "+text);
		
		//screenshot
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest= new File("./Data/ordermobile.png");
		try {
			FileUtils.copyFile(src, dest);
			System.out.println("Screen shot saved");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
