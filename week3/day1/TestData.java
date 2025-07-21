package week3.day1;
//Create a superclass as TestData.
//Implement 2 methods: enterCredentials(), navigateToHomePage() in the TestData class.
//- Create subclasses and create 2 methods in each
// LoginTestData
// - enterUsername()
// - enterPassword()
//- Demonstrate the concept by creating objects for both classes and calling their methods.

public class TestData {
public void enterCredentials() 
{
	System.out.println("Enter Credentials");
}
public void navigateToHomePage()
{
	System.out.println("Navigate to home page");
	
}
public static void main(String[] args) {
	TestData obj1=new TestData();
	obj1.enterCredentials();
	obj1.navigateToHomePage();
}
}
