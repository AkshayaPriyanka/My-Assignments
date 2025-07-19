package week2.tuesday;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		- An anagram is a word or phrase formed by rearranging the letters of another word or phrase, typically using all
//		the original letters exactly once.
//		- Input two strings: 
//		 text1 = “stops”;
//		 text2 = “potss”
//		Requirements:
//		- Define two input strings.
//		- Check if the lengths of the two strings are equal:
//		- If equal, continue; otherwise, print "Lengths mismatch, therefore the strings are not an Anagram" and
//		exit.
//		- Convert both the strings to character arrays
//		- Sort both the character arrays
//		- Check if the sorted arrays are equal
//		- If equal, print "The given strings are Anagram."
//		- Otherwise, print "The given strings are not an Anagram."
		
		String text1="stops";
		String text2="posts";
		if(text1.length()==text2.length())
		{
		  char[] charArray1 = text1.toCharArray();
		  char[] charArray2 = text2.toCharArray();
		 Arrays.sort(charArray1);
		 Arrays.sort(charArray2);
		 
		String one=new String(charArray1);
		String two=new String(charArray2);
		
		if(one.equals(two))
		   {
			  
			System.out.println("the given strings are anagram");
			
		   }
		
	    }
		else
			System.out.println("the given strings are not an anagram");

	}

}
