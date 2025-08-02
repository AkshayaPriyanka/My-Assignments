package week4.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://leafground.com/table.xhtml");
		List<WebElement> secondColumnDatas = driver.findElements(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody/tr/td[2]"));
		System.out.println("Second Column Data");
		
		for(WebElement secondColumnData :  secondColumnDatas) {
			String text = secondColumnData.getText();
		
			System.out.println(text);
		}
		
	}

}
