package week3.day5.marathon;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//01) Launch Chrome  
//02) Load https://www.amazon.in/
//     add  implicitlyWait
//     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//03) Type "Bags for boys" in the Search box
//04) Choose the  item in the result (bags for boys)
//05) Print the total number of results (like 50000)
//   example like this-----> 1-48 of over 50,000 results for "bags for boys"
//06) Select the first 2 brands in the left menu
//    (like American Tourister, Generic)
//07) Choose New Arrivals (Sort)
//08) Print the first resulting bag info (name, discounted price)
//09) Get the page title and close the browser(driver.close())

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		
		//1.launch chrome
		ChromeDriver driver=new ChromeDriver();
		
		//2.maximise browser
		driver.manage().window().maximize();
		
		//3.load url
		driver.get(" https://www.amazon.in/");
		
		
		//4.implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//5.find searchbox
		WebElement searchBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		//6.type bags for boys
		searchBox.sendKeys("Bags for boys");
		
		//click the bags for boys
		driver.findElement(By.xpath("(//div[text()='bags for boys'])[1]")).click();
		
		//print the total number of results
		String text = driver.findElement(By.xpath("//h2[@class='a-size-base a-spacing-small a-spacing-top-small a-text-normal']")).getText();
		//String text1=driver.findElement(By.xpath("//span[text()='\"bags for boys\"']")).getText();
		System.out.println(text);
		
		
		//choose safari and skybag
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='a-size-base a-color-base' and contains(text(),'Safari')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='a-size-base a-color-base' and contains(text(),'Skybags')]")).click();
		
		driver.findElement(By.xpath("//span[text()='Sort by:']")).click();
		//driver.findElement(By.xpath("//span[text()='Newest Arrivals']")).click();
		
		  List<WebElement> sortoptions = driver.findElements(By.xpath("//li[@role='option']"));
		    for(WebElement options:sortoptions) {
		    	String sortop = options.getText();
		    	System.out.println(sortop);
		    	if(sortop.equalsIgnoreCase("Newest Arrivals")) {
		    		options.click();
		    	}
		    			 
			}
		Thread.sleep(3000);
		
		String text3 = driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base'])[1]")).getText();
		System.out.println("name of the first product: "+text3);
		String text2 = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
		System.out.println("price: "+text2);
		
		driver.getTitle();
		Thread.sleep(3000);
		driver.close();
		
		
		
		
		
		
        
        
        
	}

}
