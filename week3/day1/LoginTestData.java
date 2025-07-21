package week3.day1;

public class LoginTestData extends TestData {
	// - enterUsername()
	// - enterPassword()
	public void enterUsername() {
		super.enterCredentials();
		System.out.println("enter username");
	}
	public void enterPassword()
	{
		super.navigateToHomePage();
		System.out.println("enter password");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginTestData obj=new LoginTestData();
		obj.enterUsername();
		obj.enterPassword();
		
	}

}
