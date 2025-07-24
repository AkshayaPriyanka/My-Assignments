package week3.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.leafground.com/frame.xhtml");
		
		WebElement outFrame = driver.findElement(By.xpath("//h5[text()=' Click Me (Inside Nested frame)']/following-sibling::iframe"));
		driver.switchTo().frame(outFrame);
		
		WebElement inFrame = driver.findElement(By.id("frame2"));
		driver.switchTo().frame(inFrame);
		
		WebElement element = driver.findElement(By.id("Click"));
		element.click();
		System.out.println(element.getText());

	}

}
