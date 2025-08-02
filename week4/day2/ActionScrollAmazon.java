package week4.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionScrollAmazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ChromeDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       
       driver.get("https://www.amazon.in/");
       
       Actions act=new Actions(driver);
       
       //to perform scroll action
       
       WebElement ScrollEle = driver.findElement(By.xpath("//a[text()='Conditions of Use & Sale']"));
       
       act.scrollToElement(ScrollEle).perform();
       
       //ScrollEle.click();
       
       //to perform mouse hover action
       
       WebElement mouseHover = driver.findElement(By.xpath("//div[text()='EN']"));
       act.moveToElement(mouseHover).perform();
       
       


	}

}
