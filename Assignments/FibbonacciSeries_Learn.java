package week1.Assignments;

public class FibbonacciSeries_Learn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbersToPrint=8;
		int first=0,second=1;
		System.out.println("Fibonnaci series upto " + numbersToPrint + " terms:");
		for(int i=0;i<numbersToPrint;i++) 
		{
			System.out.println(first);
		
		    int next=first+second;
		        first=second;
		        second=next;
		}
		

	}

}
