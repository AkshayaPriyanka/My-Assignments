package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Find the missing element from the list of integers
//Assignment Requirements:
//- Declare an array {1, 2, 3, 4, 10, 6, 8}.
//- Do a comparison check if there is a gap in the sequence of numbers.
//- Print the numbers that are missing.
//Hints to Solve:
//- Arrange the collection in ascending order
//- Inside the loop, check the current element + 1 is not equal to the next element. This comparison checks if
//there is a gap in the sequence of numbers
//- Use the get() method to get an element from the list
//- Print the number if a gap is detected.

public class Assignment_MissingNoInList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[] num= {1,2,3,4,10,6,8};
     List<Integer> numberList=new ArrayList<Integer>();
     
     for(int num1:num) 
     {
    	numberList.add(num1);
    	
     }
     System.out.println("current list "+numberList);
     
     Collections.sort(numberList);
     System.out.println("sorted list "+numberList);
     
     int size = numberList.size();
     
     System.out.println("Missing numbers ");
     
     for(int i=0;i<size-1;i++) {
    	 int current=numberList.get(i);
    	 int next=numberList.get(i+1);
    	 if(next!=current+1) {
    		 for(int j=current+1;j<next;j++) {
    			 System.out.println(j);
    		 }
    	 }
    	 
     }
     
	}

}
