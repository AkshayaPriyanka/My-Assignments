package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Declare an array {3, 2, 11, 4, 6, 7}.
//- Pick the 2nd element from the last and print it.
//Hints to Solve:
//- Arrange the collection in ascending order
//- Use the get method to print the second largest number
public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array= {3,2,11,4,6,7};
		List <Integer> list1=new ArrayList<>();
		for(int num:array) {
			list1.add(num);
		}
		System.out.println("Actual list: "+list1);
		
        Collections.sort(list1);
        System.out.println("sorted list: "+list1);
       // list1.get(list1.size()-1);
        
        System.out.print("The second largest number in the list is: "+list1.get(list1.size()-2));
	}

}
