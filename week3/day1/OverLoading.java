package week3.day1;

public class OverLoading {

	public void reportStep(String msg,String status) 
	{
//		msg="test";
//		status="pass";
		System.out.println("Overloading class:report steps with 2 arguments  "+msg+" "+status);
	}
	public void reportStep(String msg,String status,boolean snap) 
	{
//		msg="test1";
//		status="pass1";
//		snap=true;
		System.out.println("Overloading class:report steps with 3 arguments  "+msg+" "+status+" "+snap);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverLoading obj=new OverLoading();
		obj.reportStep("test1","pass1", true);
		obj.reportStep("test","pass");
	}

}
