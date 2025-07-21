package week3.day1;

public class SubSclass extends OverRiding{

	public void takeSnap()
	{
		super.takeSnap();
		System.out.println("takeSnap() of OverRiding class in SubSclass ");
	}
	public void reportStep(String msg,String status) 
	{
//		msg="test";
//		status="pass";
		super.reportStep("Aks", "pass");
		System.out.println("SubSclass class: reportSteps() with 2 arguments  "+msg+" "+status);
	}
	public void reportStep(String msg,String status,boolean snap) {
		super.reportStep("dad", "true", false);
		System.out.println("SubSclass class with 3 parameters  "+msg+" "+status+" "+snap);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubSclass obj2=new SubSclass();
		 obj2.takeSnap();
		 obj2.reportStep("testleaf", "ongoing");
		 obj2.reportStep("dad1", "true1", false);
	}

}
