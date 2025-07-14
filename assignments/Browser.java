package week2.monday.assignments;

public class Browser {

	public String launchBrowser(String browserName)
	{
		System.out.println("Browser launched successfully");
	return browserName;
	}
	public void loadUrl()
	{
		System.out.println("Application url loaded successfully");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser brow=new Browser();
		String s=brow.launchBrowser("GoogleChrome");
		System.out.println(s);
		brow.loadUrl();

	}

}
