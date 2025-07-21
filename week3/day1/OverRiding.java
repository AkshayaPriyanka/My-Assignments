package week3.day1;
//Create a SuperClass, inside this class create takeSnap, reportStep method.
//- Create a SubClass and Override that takeSnap method in the sub class.
//- Demonstrate the concept by creating objects for Sub classes and calling their methods.
//Hints to Solve:
//- Use appropriate keyword for inheritance.
//- Use proper annotation before overriding in the sub class.
//- Initialize objects and test the functionality by calling methods.


public class OverRiding extends OverLoading {
	
	
	public void takeSnap()
	{
		System.out.println("Overriding class takesnap method");
	}
public void reportStep(String msg,String status,boolean snap) {
	System.out.println("overiding class with 3 parameters  "+msg+" "+status+" "+snap);
}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		OverRiding obj1=new OverRiding();
		obj1.reportStep("priyanka","fail",false);
		obj1.takeSnap();
	}

}
