package week3.day1;

public class Chrome extends Browser {

	//openIncognito() and clearCache() 
	
	public void openIncognito()  
	{
		System.out.println("Chrome's incognito window");
	}
	
	public void clearCache() 
	{
		System.out.println("Chrome's cache cleared");
		
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
         Chrome chromeObj= new Chrome();
         chromeObj.openURL();
         chromeObj.navigateBack();
         chromeObj.clearCache();
         chromeObj.closeBrowser();
         chromeObj.openIncognito();

	}

}
