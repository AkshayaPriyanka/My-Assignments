package week3.day5.marathon;
import java.time.Duration;

//) Launch the Browser
//2) Load the Url "https://www.pvrcinemas.com/";
//3) Choose Your location as "Chennai" (sometimes it will be located automatically)
//4) Click on Cinema under Quick Book
//5) Select Your Cinema
//6) Select Your Date as Tomorrow
//7) Select Your Movie
//8) Select Your Show Time
//9) Click on Book Button
//10) Click Accept on Term and Condition
//11) Click any one available seat
//12) Click Proceed Button
//13) Print the Seat info under book summary
//14) Print the grand total under book summary
//15) Click Proceed Button
//16) Close the popup
//17) Print Your Current Page title
//18) Close Browser
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;

public class MovieBooking {

	public static void main(String[] args) throws InterruptedException {
		
		
		//launch the browser
		ChromeDriver driver=new ChromeDriver();
		
		//maximize the browser window
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//load the url
		driver.get("https://www.pvrcinemas.com/");
		
		//select the location as chennai
		//driver.findElement(By.xpath("//h6[text()='Chennai']")).click();
		
		//click cinema option in quick book
		driver.findElement(By.className("cinemas-inactive")).click();
		
		//click on the select cinema
		WebElement element = driver.findElement(By.xpath("//span[text()='Select Cinema']"));
		element.click();
		
		//choose theatre	
		driver.findElement(By.xpath("//span[text()='INOX National,Virugambakkam Chennai']")).click();
		
		//select date
		driver.findElement(By.xpath("(//li[@class='p-dropdown-item'])[2]/span")).click();
		
		//select movie
		driver.findElement(By.xpath("//li[@class='p-dropdown-item']/span")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[contains(text(),'09:10 AM')]")).click();
		
		driver.findElement(By.xpath("(//span[text()='Book'])[4]")).click();
		
		driver.findElement(By.xpath("//button[text()='Accept']")).click();
		
		driver.findElement(By.id("SL.SILVER|D:8")).click();
		
		

		String seatInfo = driver.findElement(By.xpath("//h6[text()='Seat Info']")).getText();
		System.out.println(seatInfo);
		
		String seatInfo1 = driver.findElement(By.xpath("//p[text()='SILVER']")).getText();
		System.out.println(seatInfo1);
		
		String seatInfo2 = driver.findElement(By.xpath("//p[text()='D8']")).getText();
		System.out.println(seatInfo2);
		
		Thread.sleep(3000);
		
		String grandTotal = driver.findElement(By.xpath("//div[@class='grand-prices']")).getText();
		System.out.println(grandTotal);
		
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();		
		
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
		
		System.out.println(driver.getTitle());
		
		Thread.sleep(5000);
		driver.close();
		
		
		
		
		
		
		
		
		
		

	}

}
