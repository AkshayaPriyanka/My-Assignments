package week1.Assignments;

public class Palindrome_Learn {

	public static void main(String[] args) {
		
		//int input=121;
		int input=12345;
		int output=0;
		int number=input;
		
		
		while(number!=0)
		{
			int rem=number%10;
			output=output*10+rem;
			number=number/10;
		}
		if(input==output) {
			System.out.println(input +" - The number is palindrome");
		}
		else
			System.out.println(input+" - The number is not a palindrome");
	}

}
