package week3.day2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
//- Navigate to amazon.in
//- Search phones in the search field
//- Find the lowest price from the list of phones
//Hints to Solve:
//- Write common locator / xpath matching all the phone price in the page and get into List<Element>
//- Get the values in a list and sort the values in ascending order
//- Get the first item from the sorted list which is the least price


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonPhone {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		  ChromeDriver driver=new ChromeDriver();
			driver.get("https://www.amazon.in/");
			driver.manage().window().maximize();
			//to find the search element and enter phones
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phones");
			//search button click
			driver.findElement(By.id("nav-search-submit-button")).click();
			
			//find price elements
			List<WebElement> priceElements = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
			
			//extract valid numeric  price into list
			List<Integer>prices=new ArrayList<Integer>();
			
			for(WebElement priceElement:priceElements) {
				
				String priceText = priceElement.getText();
				priceText.replace(",", "").trim();
				
				if(priceText.matches("\\d+")) {
					
					int price = Integer.parseInt(priceText);
					prices.add(price);
				}
				
				
				//sort list
				
				Collections.sort(prices);
				System.out.println("the lowest perice of phone is: "+prices.get(0));
				
			}
			
				
			
			
			
		
			
       
	}

}
