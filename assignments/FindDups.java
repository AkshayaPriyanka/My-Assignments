package week2.monday.assignments;

import java.util.Arrays;

public class FindDups {
  
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int[] num= {2,5,7,7,5,9,2,3};
 Arrays.sort(num);
 System.out.println("The sorted Array values are "+Arrays.toString(num));//to print array nicely
 System.out.println("The duplicate values are "); 
 for(int i=0;i<num.length-1;i++) 
 {
	 
	 if(num[i]==num[i+1])
    {
	 System.out.println(num[i]);
	 }
 }
}
}


