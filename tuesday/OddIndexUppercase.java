package week2.tuesday;

public class OddIndexUppercase {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Change the odd index of a given String to uppercase with the input : String test = “changeme”;
//
//		Requirements:
//		- Convert the given String to a character array.
//		- Implement a loop to iterate through each character of the String (from end to start).
//		- Find the odd index within the loop
//		- Inside the loop, change the character to uppercase only if the index is odd
//		- Print the characters with the expected output: cHaNgEmE
//		Hints to solve:
//		- Use appropriate method to convert the String into a character array.
//		- Use the appropriate operator to get the odd index
//		- Use toUpperCase() method from the Character class to convert the odd index values to uppercase

		
		       String original="changeme";
		       char[] charArray = original.toCharArray();

		       for(int i=0;i<charArray.length;i++)
		       {
		    	   if(i%2==1) 
		    	   {
		    		charArray[i] = Character.toUpperCase(charArray[i]);   
		    	   }
		       }
		       String result=new String(charArray);
		       System.out.println("Modified String :"+result);
	}

}
