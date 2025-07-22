package week3.day2;

import java.util.ArrayList;
import java.util.List;

//Find intersection of numbers using list interface
//Assignment Requirements:
//- Declare an array for {3, 2, 11, 4, 6, 7}
//- Declare another array for {1, 2, 8, 4, 9, 7}
//- Compare both the arrays
//- Print the values if they are equal
//Hints to Solve:
//- Add array elements to a list
//- Iterate the values through the length of the list
//- Use an appropriate conditional statement to compare the values

public class Intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declare arrays
		int [] array1= {3,2,11,4,6,7};
		int []array2= {1,2,8,4,9,7};
		
		//convert arrays to lists
		
		List <Integer> list1=new ArrayList<>();
		List <Integer> list2=new ArrayList<>();
		
		//add array to list
		for(int num:array1) {
			list1.add(num);
			
		}
		for(int num1:array2) {
			list2.add(num1);
			
		}
		//compare and find common numbers
		
		for(int i=0;i<list1.size();i++) {
			
			//Integer value = list1.get(i);
			
			if(list2.contains(list1.get(i)))
			{
				System.out.println(list1.get(i));
			}
		}

	}

}
