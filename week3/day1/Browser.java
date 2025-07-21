package week3.day1;
//Requirements:
//- Create a superclass Browser.
//- Add at least two variables to the Broswer class: browserName and browserVersion
//- Implement 3 methods openURL(), closeBrowser(), navigateBack() in the Browser class.
//- Create subclasses such as Chrome, Edge and Safari
//- Define openIncognito() and clearCache() methods in Chrome class
//- Define takeSnap() and clearCookies() methods in Edge class
//- Define readerMode() and fullScreenMode() methods in Safari class
//- Demonstrate the concept by creating objects for both classes and calling their methods.
public class Browser {
	
	String browsername="";
	Double browserVersion=138.0;
	
	public void openURL()
	{
	   System.out.println("URL is opened");
	   
	}
	public void closeBrowser() 
	{
		System.out.println("Browser is closed");
	}
	public void navigateBack() 
	{
	  System.out.println("Browser is navigating back");	
	}

	
}
