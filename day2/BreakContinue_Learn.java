package week1.day2;

public class BreakContinue_Learn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=6;i++)
		{
			if(i==3) {
				break;
			}
		System.out.println(i);
		}
		System.out.println("....................");
		for(int i=1;i<=6;i++)
		{
			if(i==4) {
				continue;
			}
		System.out.println(i);
		}

	}

}
