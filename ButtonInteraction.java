package week3.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//A web page that contains various buttons. Your task is to automate interactions with these buttons using Selenium
//WebDriver.
//Precondition:
//- Initialize the WebDriver (ChromeDriver).
//- Load the URL https://leafground.com/button.xhtml .
//- Maximize the browser window.
//Requirements:
//- Click on the button with the text ‘Click and Confirm title.’
//- Verify that the title of the page is ‘dashboard.’
//- Check if the button with the text ‘Confirm if the button is disabled’ is disabled.
//- Find and print the position of the button with the text ‘Submit.’
//- Find and print the background color of the button with the text ‘Find the Save button color.’
//- Find and print the height and width of the button with the text ‘Find the height and width of this button.’
//- Close the browser window.
//Hints to Solve:
//- Use Selenium WebDriver methods such as navigate(), manage(), findElement(), getTitle(), isEnabled(),
//getLocation(), getCssValue(), getSize(), and close() to perform the required actions.
//- To go back to the previous page from the current page use navigate().back()
public class ButtonInteraction {

	public static void main(String[] args) {
		
      ChromeDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.get(" https://leafground.com/button.xhtml ");
      
    //- Click on the button with the text ‘Click and Confirm title.’
      
      WebElement button = driver.findElement(By.xpath("//h5[text()='Click and Confirm title.']"));
      String text = button.getText();
      System.out.println(text);
      
      WebElement element = driver.findElement(By.xpath("//span[text()='Click']"));
      element.click();
      
      
      
      //- Verify that the title of the page is ‘dashboard.’ 
      String expectedTitle="dashboard";
      String actualTitle=driver.getTitle();
      if(actualTitle.equalsIgnoreCase(expectedTitle))
      {
    	  System.out.println("Page title is correct");
      }
      else {
    	  System.out.println("page title is not correct");
    	  
      }
      driver.navigate().back();
      
      
      WebElement element2 = driver.findElement(By.xpath("//h5[text()='Confirm if the button is disabled.']"));
      String text2 = element2.getText();
      System.out.println(text2);
      
    //- Check if the button with the text ‘Confirm if the button is disabled’ is disabled
      boolean val = driver.findElement(By.xpath("//span[text()='Disabled']")).isEnabled();
      System.out.println("Disabled button:true/false : "+val);
      
     // - Find and print the position of the button with the text ‘Submit.’
      
      Point location = driver.findElement(By.id("j_idt88:j_idt94")).getLocation();
      System.out.println(location);
      
    //- Find and print the background color of the button with the text ‘Find the Save button color.’
      WebElement element3 = driver.findElement(By.xpath("//span[text()='Save']/parent::button"));
      String cssValue = element3.getCssValue("background-color");
      System.out.println(cssValue);
      
      //- Find and print the height and width of the button with the text ‘Find the height and width of this button.’
      Dimension size = driver.findElement(By.xpath("//span[text()='Submit']/parent::button[@id='j_idt88:j_idt98']")).getSize();
	  System.out.println("size: "+size);
	  driver.close();
	}

}
