package week3.day1;

public class Safari extends Browser {
//readerMode() and fullScreenMode()
	public void readerMode()
	{
	System.out.println("Safari reader mode");	
	}
	public void fullScreenMode() 
     {
		System.out.println("Safari full screen mode");
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Safari safariObj=new Safari();
		 safariObj.readerMode();
		 safariObj.fullScreenMode();
		 safariObj.navigateBack();

	}

}
