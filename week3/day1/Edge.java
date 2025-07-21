package week3.day1;

public class Edge extends Browser{
//takeSnap() and clearCookies()
	
	public void takeSnap()
	{
	 System.out.println("Edge taking Snap");
	 
	}
	public void clearCookies() 
	{
		System.out.println("Edge clearing cookies");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Edge edgeObj=new Edge();
       edgeObj.takeSnap();
       edgeObj.clearCookies();
       edgeObj.openURL();

	}

}
