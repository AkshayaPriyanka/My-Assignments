package week2.tuesday;

public class CountOfGivenCharacter {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
//		Your task is to count the occurrences of character ‘e’ in the given String input="TestLeaf".
//				Requirements:
//				- Create a class with a main method.
//				- Initialize a variable to 0.
//				- Convert the given String to a character array.
//				- Use loop to iterate through each character in the array.
//				- Compare each character with the target character.
//				- If a match is found, increment the count.
//				- Finally, print the count
//				Hints to solve:
//				 - Use appropriate method to convert the String into a character array.
//				 - Utilize proper loop to iterate through the character array.
//				 - Use an if condition to compare each character with the target character and increment the
//				count accordingly.
		
		String input="TestLeaf";
		int count=0;
		char[] characters = input.toCharArray();
		for(int i=0;i<characters.length;i++)
		{
			if(characters[i]=='e')
			{
				count=count+1;
			}
		}
		System.out.println("count of e in TestLeaf: "+count);
		}

}
